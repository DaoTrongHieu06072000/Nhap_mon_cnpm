package services.DAO.IMPL;

import services.DAO.IPhiVeSinhDAO;
import services.Mapper.PhiVeSinhMapper;

import java.util.List;
import model.PhiVeSinhModel;
import model.ThanhVienCuaHoModel;

public class PhiVeSinhDAO extends AbstractDAO<PhiVeSinhModel> implements IPhiVeSinhDAO {

    @Override
    public List<PhiVeSinhModel> findAll() {
        String sql = "SELECT * FROM phi_ve_sinh";
        return query(sql, new PhiVeSinhMapper());
    }

    @Override
    public Long save(PhiVeSinhModel phiVeSinhModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO phi_ve_sinh (idHoKhau, phiVeSinh, ");
        sql.append("ngayNop, Da_thu, SoNhanKhau, Thang, Nam");
        sql.append(" VALUES (?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(), phiVeSinhModel.getIdHoKhau(), phiVeSinhModel.getPhiVeSinh(), phiVeSinhModel.getNgayNop(),
                phiVeSinhModel.getDaThu(), phiVeSinhModel.getSoNhanKhau(), phiVeSinhModel.getThang(), phiVeSinhModel.getNam());
    }

    @Override
    public void update(PhiVeSinhModel updatePhiVeSinh) {
        StringBuilder sql = new StringBuilder("UPDATE phi_ve_sinh SET idHoKhau = ?, phiVeSinh = ?");
        sql.append(", ngayNop = ?, Da_thu = ?, SoNhanKhau = ?, Thang = ?, Nam = ? WHERE idphi_ve_sinh = ?");
        update(sql.toString(), updatePhiVeSinh.getIdHoKhau(), updatePhiVeSinh.getPhiVeSinh(), updatePhiVeSinh.getNgayNop(), updatePhiVeSinh.getDaThu(),
                updatePhiVeSinh.getSoNhanKhau(), updatePhiVeSinh.getThang(), updatePhiVeSinh.getNam(), updatePhiVeSinh.getIdPhiVeSinh());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM phi_ve_sinh";
        return count(sql);

    }

    public List<PhiVeSinhModel> getAllYear() {
        //List<Integer> listNam;
        String sql = " SELECT * FROM phi_ve_sinh GROUP BY Nam";
        return query(sql, new PhiVeSinhMapper());

    }

    @Override
    public List<PhiVeSinhModel> findByYear(String year) {
       String sql = "SELECT * FROM phi_ve_sinh WHERE Nam = ?";
       return query(sql, new PhiVeSinhMapper(), year);
    }

    @Override
    public PhiVeSinhModel findById(String id) {
        String sql = "SELECT * FROM phi_ve_sinh WHERE idphi_ve_sinh = ?";
        List<PhiVeSinhModel> phiVeSinhModels = query(sql, new PhiVeSinhMapper(), id);
        return phiVeSinhModels.isEmpty()? null: phiVeSinhModels.get(0);
    }

    @Override
    public PhiVeSinhModel findByIDHK(int idHK) {
        String sql = "SELECT * FROM phi_ve_sinh WHERE idHoKhau = ?";
        List<PhiVeSinhModel> phiVeSinhModels = query(sql, new PhiVeSinhMapper(), idHK);
        return phiVeSinhModels.isEmpty()? null: phiVeSinhModels.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void taoListMoi(int nam) {
        PhiVeSinhModel phiVeSinhModel = new PhiVeSinhModel();
        phiVeSinhModel.setNam(nam);
        ThanhVienCuaHoDAO listThanhVienDAO = new ThanhVienCuaHoDAO();
        List<ThanhVienCuaHoModel> listThanhVien = listThanhVienDAO.findAll();
        for (ThanhVienCuaHoModel thanhVienCuaHoModel : listThanhVien) {
            if (thanhVienCuaHoModel.getQuanHeVoiChuHo().equals("Chủ hộ")) {
                phiVeSinhModel.setIdHoKhau(thanhVienCuaHoModel.getIdHoKhau());
                phiVeSinhModel.setSoNhanKhau(listThanhVienDAO.DemThanhVien(thanhVienCuaHoModel.getIdHoKhau()));
                phiVeSinhModel.setPhiVeSinh(phiVeSinhModel.getSoNhanKhau()*72000);
                phiVeSinhModel.setDaThu(0);
                save(phiVeSinhModel);
            }
            
           
        }
    }
    
}

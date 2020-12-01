package services.DAO.IMPL;

import services.DAO.IPhiVeSinhDAO;
import services.Mapper.PhiVeSinhMapper;

import java.util.List;
import model.PhiVeSinhModel;

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
}

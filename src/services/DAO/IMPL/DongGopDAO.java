package services.DAO.IMPL;

import services.DAO.IDongGopDAO;
import services.Mapper.DongGopMapper;

import java.util.List;
import model.DongGopModel;

public class DongGopDAO extends AbstractDAO<DongGopModel> implements IDongGopDAO {

    @Override
    public List<DongGopModel> findAll(String nam) {
        String sql = "SELECT * FROM phi_dong_gop Where ngayDong LIKE ?";
        String s = "%" + nam + "%";
        return query(sql, new DongGopMapper(), s);
    }

    @Override
    public Long save(DongGopModel dongGopModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO phi_dong_gop (idHoKhau, idsu_kien,");
        sql.append(" ngayDong, so_tien)");
        sql.append(" VALUES (?, ?, ?, ?)");
        return insert(sql.toString(), dongGopModel.getIdHoKhau(), dongGopModel.getIdSuKien(),
            dongGopModel.getNgayDong(), dongGopModel.getSoTien());
    }

    @Override
    public void update(DongGopModel updateDonggop) {
        StringBuilder sql = new StringBuilder("UPDATE phi_dong_gop SET idHoKhau = ?, idsu_kien = ?");
        sql.append(", ngayDong = ?, so_tien = ? WHERE iddong_gop = ?");
        update(sql.toString(), updateDonggop.getIdHoKhau(), updateDonggop.getIdSuKien(),
                updateDonggop.getNgayDong(), updateDonggop.getSoTien(), updateDonggop.getIdDongGop());
    }

    @Override
    public int getTotalItem() {
        String sql = "SELECT COUNT(*) FROM phi_dong_gop";
        return count(sql);
    }

    @Override
    public List<DongGopModel> findAllYear() {
        String sql = "SELECT * FROM phi_dong_gop GROUP BY year(ngayDong)";
        return query(sql, new DongGopMapper());
    }

    @Override
    public List<DongGopModel> findByIdSk(int idSk) {
        String sql = "SELECT * FROM phi_dong_gop WHERE idsu_kien = ?";
        return query(sql, new DongGopMapper(), idSk);
    }

}

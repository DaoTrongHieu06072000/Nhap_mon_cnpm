package services.DAO.IMPL;

import services.DAO.IThanhVienCuaHoDAO;
import services.Mapper.ThanhVienCuaHoMapper;

import java.util.List;
import model.ThanhVienCuaHoModel;

public class ThanhVienCuaHoDAO extends AbstractDAO<ThanhVienCuaHoModel> implements IThanhVienCuaHoDAO {

    @Override
    public List<ThanhVienCuaHoModel> findAll() {
        String sql = "SELECT * FROM thanh_vien_cua_ho";
        return query(sql, new ThanhVienCuaHoMapper());
    }

    @Override
    public int DemThanhVien(int idHoKhau) {
        String sql = "SELECT COUNT(*) FROM thanh_vien_cua_ho WHERE idHoKhau = ?";
        return count(sql, idHoKhau);
    }
}

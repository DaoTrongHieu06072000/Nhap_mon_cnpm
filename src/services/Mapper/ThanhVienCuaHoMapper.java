package services.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.ThanhVienCuaHoModel;

public class ThanhVienCuaHoMapper implements RowMapper<ThanhVienCuaHoModel>{
    @Override
    public ThanhVienCuaHoModel mapRow(ResultSet rs) {
        ThanhVienCuaHoModel thanhVienCuaHo = new ThanhVienCuaHoModel();
        try {
            thanhVienCuaHo.setIdHoKhau(rs.getInt("idHoKhau"));
            thanhVienCuaHo.setIdNhanKhau(rs.getInt("idNhanKhau"));
            thanhVienCuaHo.setQuanHeVoiChuHo(rs.getString("quanHeVoiChuHo"));
            return thanhVienCuaHo;
        } catch (SQLException e) {
            return null;
        }
    }
}

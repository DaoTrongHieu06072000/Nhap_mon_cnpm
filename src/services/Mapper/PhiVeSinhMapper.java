package services.Mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import model.PhiVeSinhModel;

public class PhiVeSinhMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs) {
        try {
            PhiVeSinhModel phiVeSinh = new PhiVeSinhModel();
            phiVeSinh.setIdHoKhau(rs.getInt("idHoKhau"));
            phiVeSinh.setIdPhiVeSinh(rs.getInt("idphi_ve_sinh"));
            phiVeSinh.setDaThu(rs.getInt("Da_thu"));
            phiVeSinh.setNam(rs.getInt("Nam"));
            phiVeSinh.setPhiVeSinh(rs.getInt("phiVeSinh"));
            phiVeSinh.setThang(rs.getInt("Thang"));
            phiVeSinh.setSoNhanKhau(rs.getInt("SoNhanKhau"));
            phiVeSinh.setNgayNop(rs.getTimestamp("ngayNop"));
            return phiVeSinh;
        } catch (SQLException e) {
            return null;
        }
    }

}

package mapper;

import models.PhiVeSinhModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhiDongGopMappper implements RowMapper<PhiVeSinhModel> {
    @Override
    public PhiVeSinhModel mapRow(ResultSet rs) {
        try {
            PhiVeSinhModel phiVeSinh = new PhiVeSinhModel();
            phiVeSinh.setIdPhiVeSinh(rs.getInt("idphi_ve_sinh"));
            phiVeSinh.setIdHoKhau(rs.getInt("idHoKhau"));
            phiVeSinh.setPhiVeSinh(rs.getInt("phiVeSinh"));
            phiVeSinh.setNgayNop(rs.getTimestamp("ngayNop"));
            phiVeSinh.setDaThu(rs.getInt("Da_thu"));
            phiVeSinh.setSoNhanKhau(rs.getInt("SoNhanKhau"));
            phiVeSinh.setThang(rs.getInt("Thang"));
            phiVeSinh.setNam(rs.getInt("Nam"));
            return phiVeSinh;
        } catch (SQLException e) {
            return null;
        }
    }
}

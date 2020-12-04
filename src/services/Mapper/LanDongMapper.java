package services.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.LanDongModel;

public class LanDongMapper implements RowMapper<LanDongModel> {

    @Override
    public LanDongModel mapRow(ResultSet rs) {
        LanDongModel lanDong = new LanDongModel();
        try {
            lanDong.setIdLanDong(rs.getInt("idlan_dong"));
            lanDong.setLanThu(rs.getInt("lan_thu"));
            lanDong.setNgayBD(rs.getDate("ngay_bat_dau"));
            lanDong.setNgayKT(rs.getDate("ngay_ket_thuc"));
            return lanDong;
    } catch (SQLException e) {
            return null;
        }
    }
}

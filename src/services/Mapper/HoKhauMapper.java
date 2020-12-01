package services.Mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import model.HoKhauModel;

public class HoKhauMapper implements RowMapper<HoKhauModel> {
    @Override
    public HoKhauModel mapRow(ResultSet rs) {
        HoKhauModel hoKhau = new HoKhauModel();
        try {
            hoKhau.setID(rs.getInt("ID"));
            hoKhau.setMaHoKhau(rs.getString("maHoKhau"));
            hoKhau.setIdChuHo(rs.getInt("idChuHo"));
            hoKhau.setMaKhuVuc(rs.getString("maKhuVuc"));
            hoKhau.setDiaChi(rs.getString("diaChi"));
            hoKhau.setNgayLap(rs.getDate("ngayLap"));
            hoKhau.setNgayChuyenDi(rs.getDate("ngayChuyenDi"));
            hoKhau.setLyDoChuyen(rs.getString("lyDoChuyen"));
            hoKhau.setNguoiThucHien(rs.getInt("nguoiThucHien"));
            return hoKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

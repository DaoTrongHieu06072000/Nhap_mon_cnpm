package services.Mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import model.NhanKhauModel;

public class NhanKhauMapper implements RowMapper<NhanKhauModel> {
    @Override
    public NhanKhauModel mapRow(ResultSet rs) {
        NhanKhauModel nhanKhau = new NhanKhauModel();
        try {
            nhanKhau.setID(rs.getInt("ID"));
            nhanKhau.setMaNhanKhau(rs.getString("maNhanKhau"));
            nhanKhau.setHoTen(rs.getString("hoTen"));
            nhanKhau.setBietDanh(rs.getString("bietDanh"));
            nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
            nhanKhau.setNoiSinh(rs.getString("noiSinh"));
            nhanKhau.setNguyenQuan(rs.getString("nguyenQuan"));
            nhanKhau.setDanToc(rs.getString("danToc"));
            nhanKhau.setTonGiao(rs.getString("tonGiao"));
            nhanKhau.setQuocTich(rs.getString("quocTich"));
            nhanKhau.setSoHoChieu(rs.getString("soHoChieu"));
            nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
            nhanKhau.setDiaChiHienNay(rs.getString("diaChiHienNay"));
            nhanKhau.setTrinhDoHocVan(rs.getString("trinhDoHocVan"));
            nhanKhau.setTrinhDoChuyenMon(rs.getString("TrinhDoChuyenMon"));
            nhanKhau.setBietTiengDanToc(rs.getString("bietTiengDanToc"));
            nhanKhau.setTrinhDoNgoaiNgu(rs.getString("trinhDoNgoaiNgu"));
            nhanKhau.setNgheNghiep(rs.getString("ngheNghiep"));
            nhanKhau.setNoiLamViec(rs.getString("noiLamViec"));
            nhanKhau.setTienAn(rs.getString("tienAn"));
            nhanKhau.setLyDoChuyenDen(rs.getString("lyDoChuyenDen"));
            nhanKhau.setLyDoChuyenDi(rs.getString("lyDoChuyenDi"));
            nhanKhau.setDiaChiMoi(rs.getString("diaChiMoi"));
            nhanKhau.setLyDoXoa(rs.getString("lyDoXoa"));
            nhanKhau.setGhiChu(rs.getString("ghiChu"));
            nhanKhau.setNamSinh(rs.getDate("namSinh"));
            nhanKhau.setNgayChuyenDen(rs.getDate("ngayChuyenDen"));
            nhanKhau.setNgayChuyenDi(rs.getDate("ngayChuyenDi"));
            nhanKhau.setNgayTao(rs.getDate("ngayTao"));
            nhanKhau.setIdNguoiTao(rs.getInt("idNguoiTao"));
            nhanKhau.setIdNguoiXoa(rs.getInt("idNguoiXoa"));
            return nhanKhau;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}

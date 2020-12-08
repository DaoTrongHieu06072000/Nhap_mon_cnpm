package services.Mapper;



import java.sql.ResultSet;
import java.sql.SQLException;
import model.DongGopModel;

public class DongGopMapper implements RowMapper<DongGopModel> {
    @Override
    public DongGopModel mapRow(ResultSet rs) {

        try {
            DongGopModel dongGopModel = new DongGopModel();
            dongGopModel.setIdDongGop(rs.getInt("iddong_gop"));
            dongGopModel.setIdHoKhau(rs.getInt("idHoKhau"));
            dongGopModel.setIdSuKien(rs.getInt("idsu_kien"));
            //dongGopModel.setIdLanDong(rs.getInt("idLanDong"));
            dongGopModel.setNgayDong(rs.getTimestamp("ngayDong"));
            dongGopModel.setSoTien(rs.getInt("so_tien"));
            return dongGopModel;
        } catch (SQLException e) {
            return null;
        }
    }
}

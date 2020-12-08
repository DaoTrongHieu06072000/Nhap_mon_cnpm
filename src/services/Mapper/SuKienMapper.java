package services.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.SuKienModel;

public class SuKienMapper implements RowMapper {

    @Override
    public SuKienModel mapRow(ResultSet rs) {
        try {

            SuKienModel suKienModel = new SuKienModel();
            suKienModel.setCode(rs.getString("code"));
            suKienModel.setIdSuKien(rs.getInt("id"));
            suKienModel.setName(rs.getString("name"));
            suKienModel.setNgayBatDau(rs.getDate("ngay_bat_dau"));
            suKienModel.setNgayKetThuc(rs.getDate("ngay_ket_thuc"));
            return suKienModel;
        }catch (SQLException e){
            return null;
        }
    }
}

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
            suKienModel.setNgayBatDau(rs.getString("ngay_bat_dau"));
            suKienModel.setNgayKetThuc(rs.getString("ngay_ket_thuc"));
            suKienModel.setNam(rs.getString("nam"));
            return suKienModel;
        }catch (SQLException e){
            return null;
        }
    }
}

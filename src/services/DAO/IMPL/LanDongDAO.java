/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.LanDongModel;
import services.DAO.ILanDong;
import services.Mapper.LanDongMapper;

/**
 *
 * @author banba
 */
public class LanDongDAO extends AbstractDAO<LanDongModel> implements ILanDong{

    @Override
    public LanDongModel findbyLanDongAndNam(int lan, int nam) {
         String sql = "SELECT * FROM lan_dong WHERE lan_thu = ? AND ngay_dong Like ?";
         String namS = "%" + nam + "%";
         List<LanDongModel> lanDongModels = query(sql, new LanDongMapper(), lan, namS);
         return lanDongModels.isEmpty()? null: lanDongModels.get(0);
    }

    @Override
    public List<LanDongModel> findAll() {
        String sql = "SELECT * FROM lan_dong";
        return query(sql, new LanDongMapper());
    }

    @Override
    public Long save(LanDongModel lanDongModel) {
         String sql = "INSERT INTO lan_dong (lan_thu, ngay_dong, han_dong)  VALUES (?, ?, ?)";
        return insert(sql, lanDongModel.getLanThu(), lanDongModel.getNgayDong(), lanDongModel.getHanDong());
    }
    
}

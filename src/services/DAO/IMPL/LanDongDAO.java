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
         String sql = "SELECT * FROM lan_dong WHERE lan_thu = ? AND ngay_ket_thuc Like ?";
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
         String sql = "INSERT INTO lan_dong (lan_thu, ngay_bat_dau, ngay_ket_thuc)  VALUES (?, ?, ?)";
        return insert(sql, lanDongModel.getLanThu(), lanDongModel.getNgayBD(), lanDongModel.getNgayKT());
    }

    @Override
    public int getTotalItem(String nam) {
        String sql = "SELECT COUNT(*) FROM lan_dong WHERE ngay_ket_thuc LIKE ?";
        String namS = "%" + nam + "%";
        return count(sql, namS);
    }

    @Override
    public List<LanDongModel> findAllDot(String nam) {
        String sql = "SELECT * FROM lan_dong WHERE ngay_ket_thuc LIKE ? GROUP BY lan_thu";
        String namS = "%" + nam + "%";
        return query(sql, new LanDongMapper(), namS);
    }

    @Override
    public List<LanDongModel> findByNamAndLanThu(String nam, String lanThu) {
        String sql = "SELECT * FROM lan_dong WHERE ngay_ket_thuc LIKE ? AND lan_thu = ?";
        String namS = "%" + nam + "%";
        return query(sql, new LanDongMapper(), namS, lanThu);
    }
    
    public static void main(String[] args) {
        LanDongDAO lanDongDAO = new LanDongDAO();
        LanDongModel lanDongModel = new LanDongModel();
        lanDongModel = lanDongDAO.findbyLanDongAndNam(1, 2020);
        System.out.println(lanDongModel.getNgayBD());
    }
    
}

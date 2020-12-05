/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO;

import java.util.List;
import model.LanDongModel;

/**
 *
 * @author banba
 */
public interface ILanDong extends GenericDAO<LanDongModel> {
    LanDongModel findbyLanDongAndNam(int lan, int nam);
    List<LanDongModel> findAll();
    Long save(LanDongModel lanDongModel);
    int getTotalItem(String nam);
    List<LanDongModel> findAllDot(String nam);
    List<LanDongModel> findByNamAndLanThu(String nam, String lanThu);

}

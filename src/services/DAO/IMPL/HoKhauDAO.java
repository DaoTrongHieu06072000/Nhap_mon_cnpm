/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.HoKhauModel;
import services.DAO.IHoKhauDAO;
import services.Mapper.HoKhauMapper;

/**
 *
 * @author banba
 */
public class HoKhauDAO extends AbstractDAO<HoKhauModel> implements IHoKhauDAO {
    
    @Override
    public List<HoKhauModel> findAll() {
        String sql = "SELECT * FROM ho_khau";
        return query(sql, new HoKhauMapper());
    }
    
    @Override
    public HoKhauModel findByIdHoKhau(int idHoKhau) {
        String sql = "SELECT * FROM ho_khau WHERE ID = ?";
        List<HoKhauModel> hoKhauModels = query(sql, new HoKhauMapper(), idHoKhau);
        return hoKhauModels.isEmpty() ? null : hoKhauModels.get(0);
    }
    
    @Override
    public HoKhauModel findByIDChuHo(int IDChuHo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM ho_khau WHERE idChuHo = ?";
        List<HoKhauModel> listhk = query(sql, new HoKhauMapper(), IDChuHo);
        return listhk.isEmpty() ? null : listhk.get(0);
    }
    
}

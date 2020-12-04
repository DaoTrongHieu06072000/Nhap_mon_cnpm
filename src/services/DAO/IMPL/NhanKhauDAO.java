/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.NhanKhauModel;
import services.DAO.INhanKhauDAO;
import services.Mapper.NhanKhauMapper;

/**
 *
 * @author banba
 */
public class NhanKhauDAO extends AbstractDAO<NhanKhauModel> implements INhanKhauDAO {

    @Override
    public List<NhanKhauModel> findAll() {
        String sql = "SELECT * FROM nhan_khau";
        return query(sql, new NhanKhauMapper());
    }

    @Override
    public NhanKhauModel findById(int id) {
        String sql = "SELECT * FROM nhan_khau WHERE ID = ?";
        List<NhanKhauModel> nhanKhauModels = query(sql, new NhanKhauMapper(), id);
        return nhanKhauModels.isEmpty() ? null : nhanKhauModels.get(0);
    }

    @Override
    public  List<NhanKhauModel> findByName(String hoten) {
        String sql = "SELECT * FROM nhan_khau WHERE hoTen LIKE ?";
        String bien = "%" + hoten +"%";
        return query(sql, new NhanKhauMapper(), bien);
        //return listnhanKhauModels;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.LoaiDongGopModel;
import services.DAO.ILoaiDongGopDAO;
import services.Mapper.LoaiDongGopMapper;

/**
 *
 * @author banbaa
 */
public class LoaiDongGopDAO extends AbstractDAO<LoaiDongGopModel> implements ILoaiDongGopDAO {

    @Override
    public LoaiDongGopModel findByCode(String code) {
        String sql = "SELECT * FROM loai_dong_gop WHERE code = ?";
        List<LoaiDongGopModel> loaiDongGopModels = query(sql, new LoaiDongGopMapper(), code);
        return loaiDongGopModels.isEmpty()? null:loaiDongGopModels.get(0);
    }

    @Override
    public List<LoaiDongGopModel> findByName(String name) {
        String sql = "SELECT * FROM loai_dong_gop WHERE name LIKE ?";
        String bien = "%" + name + "%";
        return query(sql, new LoaiDongGopMapper(), bien);
    }

    @Override
    public LoaiDongGopModel findByID(int id) {
        String sql = "SELECT * FROM loai_dong_gop WHERE id = ?";
        List<LoaiDongGopModel> loaiDongGopModels = query(sql, new LoaiDongGopMapper(), id);
        return loaiDongGopModels.isEmpty()? null : loaiDongGopModels.get(0);
    }

    @Override
    public List<LoaiDongGopModel> findAll() {
        String sql = "SELECT * FROM loai_dong_gop";
        return query(sql, new LoaiDongGopMapper());
    }

    @Override
    public Long save(LoaiDongGopModel loaiDongGopModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(LoaiDongGopModel updateLoaiDongGop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

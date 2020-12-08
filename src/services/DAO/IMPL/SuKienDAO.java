/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.SuKienModel;
import services.DAO.ILoaiDongGopDAO;
import services.Mapper.SuKienMapper;

/**
 *
 * @author banbaa
 */
public class SuKienDAO extends AbstractDAO<SuKienModel> implements ILoaiDongGopDAO {

    @Override
    public SuKienModel findByCode(String code) {
        String sql = "SELECT * FROM loai_dong_gop WHERE code = ?";
        List<SuKienModel> loaiDongGopModels = query(sql, new SuKienMapper(), code);
        return loaiDongGopModels.isEmpty()? null:loaiDongGopModels.get(0);
    }

    @Override
    public List<SuKienModel> findByName(String name) {
        String sql = "SELECT * FROM loai_dong_gop WHERE name LIKE ?";
        String bien = "%" + name + "%";
        return query(sql, new SuKienMapper(), bien);
    }

    @Override
    public SuKienModel findByID(int id) {
        String sql = "SELECT * FROM loai_dong_gop WHERE id = ?";
        List<SuKienModel> loaiDongGopModels = query(sql, new SuKienMapper(), id);
        return loaiDongGopModels.isEmpty()? null : loaiDongGopModels.get(0);
    }

    @Override
    public List<SuKienModel> findAll() {
        String sql = "SELECT * FROM loai_dong_gop";
        return query(sql, new SuKienMapper());
    }

    @Override
    public Long save(SuKienModel loaiDongGopModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SuKienModel updateLoaiDongGop) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.DAO.IMPL;

import java.util.List;
import model.SuKienModel;
import services.Mapper.SuKienMapper;
import services.DAO.ISuKienDAO;

/**
 *
 * @author banbaa
 */
public class SuKienDAO extends AbstractDAO<SuKienModel> implements ISuKienDAO {

    @Override
    public SuKienModel findByCode(String code) {
        String sql = "SELECT * FROM su_kien WHERE code = ?";
        List<SuKienModel> loaiDongGopModels = query(sql, new SuKienMapper(), code);
        return loaiDongGopModels.isEmpty() ? null : loaiDongGopModels.get(0);
    }

    @Override
    public List<SuKienModel> findByName(String name) {
        String sql = "SELECT * FROM su_kien WHERE name LIKE ?";
        String bien = "%" + name + "%";
        return query(sql, new SuKienMapper(), bien);
    }

    @Override
    public SuKienModel findByID(int id) {
        String sql = "SELECT * FROM su_kien WHERE id = ?";
        List<SuKienModel> loaiDongGopModels = query(sql, new SuKienMapper(), id);
        return loaiDongGopModels.isEmpty() ? null : loaiDongGopModels.get(0);
    }

    @Override
    public List<SuKienModel> findAll(String nam) {
        String sql = "SELECT * FROM su_kien where nam = ?";
        return query(sql, new SuKienMapper(), nam);
    }

    @Override
    public Long save(SuKienModel sk) {
        String sql = "INSERT INTO su_kien ( name,code, ngay_bat_dau,ngay_ket_thuc, nam) VALUES (?,?,?,?,?)";
        return insert(sql, sk.getName(), sk.getCode(), sk.getNgayBatDau(), sk.getNgayKetThuc(), sk.getNam());
    }

    @Override
    public void update(SuKienModel updateSuKien) {
        String sql = "UPDATE su_kien SET name = ?,code=?,ngay_bat_dau=?,ngay_ket_thuc = ? , nam = ? WHERE id = ? ";
        update(sql, updateSuKien.getName(), updateSuKien.getCode(), updateSuKien.getNgayBatDau(),
                updateSuKien.getNgayKetThuc(), updateSuKien.getNam(), updateSuKien.getIdSuKien());
    }

    @Override
    public SuKienModel findByNameAndNam(String name, String nam) {
        String sql = "SELECT * FROM su_kien WHERE name LIKE ? and nam = ?";
        String bien = "%" + name + "%";
        List<SuKienModel> suKienModels = query(sql, new SuKienMapper(), bien, nam);
        return suKienModels.isEmpty() ? null : suKienModels.get(0);
    }

    @Override
    public void delete(String IDSK) {
        String sql = "DELETE FROM su_kien WHERE id = ?";
        update(sql, IDSK);
    }
}

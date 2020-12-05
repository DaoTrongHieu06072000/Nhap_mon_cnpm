package services.DAO;

import java.util.List;
import model.DongGopModel;
import model.LoaiDongGopModel;

public interface ILoaiDongGopDAO extends GenericDAO<LoaiDongGopModel> {
    LoaiDongGopModel findByCode( String code);
    List<LoaiDongGopModel> findByName(String name);
    LoaiDongGopModel findByID(int id);
    List<LoaiDongGopModel> findAll();
    Long save(LoaiDongGopModel loaiDongGopModel);
    void update(LoaiDongGopModel updateLoaiDongGop);
    
}

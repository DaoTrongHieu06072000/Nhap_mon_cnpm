package services.DAO;

import java.util.List;
import model.DongGopModel;
import model.SuKienModel;

public interface ILoaiDongGopDAO extends GenericDAO<SuKienModel> {
    SuKienModel findByCode( String code);
    List<SuKienModel> findByName(String name);
    SuKienModel findByID(int id);
    List<SuKienModel> findAll();
    Long save(SuKienModel loaiDongGopModel);
    void update(SuKienModel updateLoaiDongGop);
    
}

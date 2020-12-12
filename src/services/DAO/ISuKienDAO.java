package services.DAO;

import java.util.List;
import model.SuKienModel;

public interface ISuKienDAO extends GenericDAO<SuKienModel> {
    SuKienModel findByCode( String code);
    List<SuKienModel> findByName(String name);
    SuKienModel findByID(int id);
    List<SuKienModel> findAll(String nam);
    Long save(SuKienModel loaiDongGopModel);
    void update(SuKienModel updateLoaiDongGop);
    void delete (String IDSK);
    SuKienModel findByNameAndNam(String name,String nam);
    
}

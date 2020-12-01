package services.DAO;


import java.util.List;
import model.PhiVeSinhModel;

public interface IPhiVeSinhDAO extends GenericDAO<PhiVeSinhModel> {
    List<PhiVeSinhModel> findAll();
    List<PhiVeSinhModel> findByYear(String year);
    Long save(PhiVeSinhModel phiVeSinhModel);
    void update(PhiVeSinhModel updatePhiVeSinh);
    PhiVeSinhModel findById(String id);
    int getTotalItem();
    PhiVeSinhModel findByIDHK(int idHK);
}

package services.DAO;


import java.util.List;
import model.PhiVeSinhModel;

public interface IPhiVeSinhDAO extends GenericDAO<PhiVeSinhModel> {
    List<PhiVeSinhModel> findAll();
    Long save(PhiVeSinhModel phiVeSinhModel);
    void update(PhiVeSinhModel updatePhiVeSinh);
    int getTotalItem();
}

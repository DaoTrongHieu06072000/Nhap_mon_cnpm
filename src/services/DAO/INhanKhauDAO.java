package services.DAO;


import java.util.List;
import model.NhanKhauModel;

public interface INhanKhauDAO extends GenericDAO<NhanKhauModel> {
    List<NhanKhauModel> findAll();
}

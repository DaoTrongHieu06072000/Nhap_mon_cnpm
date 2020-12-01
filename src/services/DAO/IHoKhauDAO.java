package services.DAO;


import java.util.List;
import model.HoKhauModel;

public interface IHoKhauDAO extends GenericDAO<HoKhauModel> {
    List<HoKhauModel> findAll();
    HoKhauModel findByIdHoKhau(int idHoKhau);
    HoKhauModel findByIDChuHo (int IDChuHo);
}

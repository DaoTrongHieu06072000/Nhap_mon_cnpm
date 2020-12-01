package services.DAO;


import java.util.List;
import model.ThanhVienCuaHoModel;

public interface IThanhVienCuaHoDAO extends GenericDAO<ThanhVienCuaHoModel> {
    List<ThanhVienCuaHoModel> findAll();
    int DemThanhVien(int idHoKhau);
}

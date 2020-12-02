package services.DAO;


import java.util.List;
import model.ThanhVienCuaHoModel;

public interface IThanhVienCuaHoDAO extends GenericDAO<ThanhVienCuaHoModel> {
    List<ThanhVienCuaHoModel> findAll();
    ThanhVienCuaHoModel findByIdNhanKhau(int idNhanKhau);
    int DemThanhVien(int idHoKhau);
}

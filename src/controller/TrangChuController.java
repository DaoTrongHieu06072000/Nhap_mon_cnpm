/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JLabel;
import model.PhiVeSinhModel;
import services.DAO.IMPL.DongGopDAO;
import services.DAO.IMPL.PhiVeSinhDAO;
import services.DAO.IMPL.ThanhVienCuaHoDAO;
import services.StringService;

/**
 *
 * @author sonso
 */
public class TrangChuController {
    StringService stringService = new StringService();
    PhiVeSinhDAO phiVeSinhDAO = new PhiVeSinhDAO();
    DongGopDAO dongGopDAO = new DongGopDAO();
    ThanhVienCuaHoDAO thanhVienCuaHoDAO = new ThanhVienCuaHoDAO();

    private JLabel soHoDaThuJLabel;
    private JLabel TongTienPhiVSJLabel;
    private JLabel TongtienPhiDGJLabel;
    private JLabel tongSoDotMoJLabel;
    private JLabel tongSoSKjJLabel;
    private int a, b;

    public TrangChuController(JLabel soHoDaThuJLabel, JLabel TongTienPhiVSJLabel,
            JLabel TongtienPhiDGJLabel, JLabel tongSoDotMoJLabel, JLabel tongSoSKjJLabel) {
        this.TongTienPhiVSJLabel = TongTienPhiVSJLabel;
        this.TongtienPhiDGJLabel = TongtienPhiDGJLabel;
        this.soHoDaThuJLabel = soHoDaThuJLabel;
        this.tongSoDotMoJLabel = tongSoDotMoJLabel;
        this.tongSoSKjJLabel = tongSoSKjJLabel;
    }

    public void setData() {
        List<PhiVeSinhModel> listPhiVS = phiVeSinhDAO.findAll();
        int soHoDaThu = 0, tongPhiVS = 0, tongsoho = 0;
        for (PhiVeSinhModel phiVeSinhModel : listPhiVS) {
            if (phiVeSinhModel.getDaThu() == 1) {
                soHoDaThu++;
            }
            tongsoho++;
            tongPhiVS += phiVeSinhModel.getPhiVeSinh();
        }
        soHoDaThuJLabel.setText(String.valueOf(soHoDaThu) + "/" + String.valueOf(tongsoho) + " hộ");
        TongTienPhiVSJLabel.setText(String.format("%,.0f",(double)tongPhiVS));

    }
}

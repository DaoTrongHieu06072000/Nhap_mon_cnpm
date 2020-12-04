/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author NgoQuang
 */
public class LanDongModel {

    private Integer idLanDong;
    private Integer lanThu;
    private Date ngayBD;
    private Date ngayKT;

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public Integer getIdLanDong() {
        return idLanDong;
    }

    public void setIdLanDong(Integer idLanDong) {
        this.idLanDong = idLanDong;
    }

    public Integer getLanThu() {
        return lanThu;
    }

    public void setLanThu(Integer lanThu) {
        this.lanThu = lanThu;
    }

}

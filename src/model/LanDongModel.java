/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author NgoQuang
 */
public class LanDongModel {

    private Integer idLanDong;
    private Integer lanThu;
    private Timestamp ngayDong;

    public Timestamp getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(Timestamp ngayDong) {
        this.ngayDong = ngayDong;
    }

    public Timestamp getHanDong() {
        return hanDong;
    }

    public void setHanDong(Timestamp hanDong) {
        this.hanDong = hanDong;
    }
    private Timestamp hanDong;

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

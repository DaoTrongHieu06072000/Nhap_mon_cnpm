/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author NgoQuang
 */
public class LanDongModel {
    private Integer idLanDong;
    private Integer lanThu;
    private Timestamp ngay;

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

    public Timestamp getNgay() {
        return ngay;
    }

    public void setNgay(Timestamp ngay) {
        this.ngay = ngay;
    }
}

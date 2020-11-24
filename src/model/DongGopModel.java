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
public class DongGopModel {
    private Integer idDongGop;
    private Integer idHoKhau;
    private Integer idLoaiDonggop;
    private Integer idLanDong;
    private Timestamp ngayDong;
    private Integer soTien;

    public Integer getIdDongGop() {
        return idDongGop;
    }

    public void setIdDongGop(Integer idDongGop) {
        this.idDongGop = idDongGop;
    }

    public Integer getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(Integer idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public Integer getIdLoaiDonggop() {
        return idLoaiDonggop;
    }

    public void setIdLoaiDonggop(Integer idLoaiDonggop) {
        this.idLoaiDonggop = idLoaiDonggop;
    }

    public Integer getIdLanDong() {
        return idLanDong;
    }

    public void setIdLanDong(Integer idLanDong) {
        this.idLanDong = idLanDong;
    }

    public Timestamp getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(Timestamp ngayDong) {
        this.ngayDong = ngayDong;
    }

    public Integer getSoTien() {
        return soTien;
    }

    public void setSoTien(Integer soTien) {
        this.soTien = soTien;
    }
}

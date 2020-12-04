/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author NgoQuang
 */
public class PhiVeSinhModel {
    private Integer idPhiVeSinh;
    private Integer idHoKhau;
    private Integer SoNhanKhau;
    private Integer phiVeSinh;
    private Date ngayNop;
    private Integer daThu;
    private Integer Thang;
    private Integer Nam;

    public Integer getIdPhiVeSinh() {
        return idPhiVeSinh;
    }

    public void setIdPhiVeSinh(Integer idPhiVeSinh) {
        this.idPhiVeSinh = idPhiVeSinh;
    }

    public Integer getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(Integer idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public Integer getSoNhanKhau() {
        return SoNhanKhau;
    }

    public void setSoNhanKhau(Integer soNhanKhau) {
        SoNhanKhau = soNhanKhau;
    }

    public Integer getPhiVeSinh() {
        return phiVeSinh;
    }

    public void setPhiVeSinh(Integer phiVeSinh) {
        this.phiVeSinh = phiVeSinh;
    }

    public Date getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(Timestamp ngayNop) {
        this.ngayNop = ngayNop;
    }

    public Integer getDaThu() {
        return daThu;
    }

    public void setDaThu(Integer daThu) {
        this.daThu = daThu;
    }

    public Integer getThang() {
        return Thang;
    }

    public void setThang(Integer thang) {
        Thang = thang;
    }

    public Integer getNam() {
        return Nam;
    }

    public void setNam(Integer nam) {
        Nam = nam;
    }
}

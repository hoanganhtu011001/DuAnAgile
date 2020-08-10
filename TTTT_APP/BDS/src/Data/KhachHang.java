/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author shiro
 */
public class KhachHang implements Serializable {

    private String ma;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String sodt;
    private String cmnd;
    private String email;

    public KhachHang() {
    }

    public KhachHang(String ma, String hoten, String ngaysinh, String gioitinh, String sodt, String cmnd, String email) {
        this.ma = ma;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodt = sodt;
        this.cmnd = cmnd;
        this.email = email;
    }

    public String getMakh() {
        return ma;
    }

    public void setMakh(String makh) {
        this.ma = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ma=" + ma + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", sodt=" + sodt + ", cmnd=" + cmnd + ", email=" + email + '}';
    }
    
    
    
}

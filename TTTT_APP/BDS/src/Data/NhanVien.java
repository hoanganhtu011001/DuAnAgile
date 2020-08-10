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
public class NhanVien implements Serializable {

    private String ma;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String sodt;
    private String cmnd;
    private String email;
    private String chucvu;
    private double luong;
    private String username;
    private String password;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoten, String ngaysinh, String gioitinh, String sodt, String cmnd, String email, String chucvu, double luong, String username, String password) {
        this.ma = ma;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodt = sodt;
        this.cmnd = cmnd;
        this.email = email;
        this.chucvu = chucvu;
        this.luong = luong;
        this.username = username;
        this.password = password;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", sodt=" + sodt + ", cmnd=" + cmnd + ", email=" + email + ", chucvu=" + chucvu + ", luong=" + luong + ", username=" + username + ", password=" + password + '}';
    }

}

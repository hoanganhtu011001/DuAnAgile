/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author shiro
 */
public class ThongKe {

    private String ma, ten, gia, diachi, loai, mota, trangthai;

    public ThongKe() {
    }

    public ThongKe(String ma, String ten, String gia, String diachi, String loai, String mota, String trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.diachi = diachi;
        this.loai = loai;
        this.mota = mota;
        this.trangthai = trangthai;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", diachi=" + diachi + ", loai=" + loai + ", mota=" + mota + ", trangthai=" + trangthai + '}';
    }

}

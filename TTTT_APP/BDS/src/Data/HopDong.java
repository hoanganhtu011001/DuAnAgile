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
public class HopDong {
    private String ma;
    private String ten;
    private String manv;
    private String makh;
    private String mabds;
    private String ngaytao;

    public HopDong() {
    }

    public HopDong(String ma, String ten, String manv, String makh, String mabds, String ngaytao) {
        this.ma = ma;
        this.ten = ten;
        this.manv = manv;
        this.makh = makh;
        this.mabds = mabds;
        this.ngaytao = ngaytao;
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

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMabds() {
        return mabds;
    }

    public void setMabds(String mabds) {
        this.mabds = mabds;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    @Override
    public String toString() {
        return "HopDong{" + "ma=" + ma + ", ten=" + ten + ", manv=" + manv + ", makh=" + makh + ", mabds=" + mabds + ", ngaytao=" + ngaytao + '}';
    }
    
}

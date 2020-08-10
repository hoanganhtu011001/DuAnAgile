/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import Data.HopDong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shiro
 */
public class HopDongModify {

    public static KetNoi ketNoi;

    public static List<Data.HopDong> filltoTable() {
        List<Data.HopDong> hdlist = new ArrayList<>();

        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            Statement statement = ketNoi.con.createStatement();
            String sql = "select * from HopDong";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Data.HopDong hopDong = new Data.HopDong(resultSet.getString("MaHD"),
                        resultSet.getString("TenHD"),
                        resultSet.getString("MaNV"),
                        resultSet.getString("MaKH"),
                        resultSet.getString("MaBDS"),
                        resultSet.getString("NgayTaoHD"));
                hdlist.add(hopDong);
            }
            ketNoi.con.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(HopDongModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hdlist;
    }
    
    public static void insert(Data.HopDong hd) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "insert into HopDong values (?, ?, ?, ?, ? ,?)";
            PreparedStatement statement = ketNoi.con.prepareCall(sql);
            statement.setString(1, hd.getMa());
            statement.setString(2, hd.getTen());
            statement.setString(3, hd.getManv());
            statement.setString(4, hd.getMakh());
            statement.setString(5, hd.getMabds());
            statement.setString(6, hd.getNgaytao());
            statement.executeUpdate();
            String query = "Update BatDongSan Set TrangThai = N'Đã bán' Where MaBDS ='"+hd.getMabds()+"'";
            Statement stt = ketNoi.con.createStatement();
            int update = stt.executeUpdate(query);
            ketNoi.con.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void update(HopDong hd, String ma) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "update HopDong set TenHD = ?, MaNV = ?, MaKH = ?, NgayTaoHD = ? where MaHD = ?";
            try (PreparedStatement statement = ketNoi.con.prepareCall(sql)) {
                statement.setString(1, hd.getTen());
                statement.setString(2, hd.getManv());
                statement.setString(3, hd.getMakh());
                statement.setString(4, hd.getNgaytao());
                statement.setString(5, ma);
                statement.executeUpdate();
                ketNoi.con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Loi ngay tao");
        }
    }

    public static void delete(String ma) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "delete from HopDong where MaHD = ?";
            try (PreparedStatement statement = ketNoi.con.prepareCall(sql)) {
                statement.setString(1, ma);
                statement.executeUpdate();
                ketNoi.con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(HopDongModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

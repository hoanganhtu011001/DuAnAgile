/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import Data.BatDongSan;
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
public class BatDongSanModify {

    public static KetNoi ketNoi;

    public static List<BatDongSan> filltoTable() {

        List<Data.BatDongSan> bdslist = new ArrayList<>();
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            try (Statement statement = ketNoi.con.createStatement()) {
                String sql = "select * from BatDongSan";
                ResultSet resultSet = statement.executeQuery(sql);
                
                while (resultSet.next()) {
                    Data.BatDongSan batDongSan = new Data.BatDongSan(resultSet.getString("MaBDS"),
                            resultSet.getString("TenBDS"),
                            resultSet.getString("GiaBDS"),
                            resultSet.getString("DiaChiBDS"),
                            resultSet.getString("LoaiBDS"),
                            resultSet.getString("MotaBDS"),
                            resultSet.getString("TrangThai"));
                    bdslist.add(batDongSan);
                }
                ketNoi.con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BatDongSanModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bdslist;
    }

    public static void insert(BatDongSan bds) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "insert into batDongSan values (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = ketNoi.con.prepareCall(sql)) {
                statement.setString(1, bds.getMa());
                statement.setString(2, bds.getTen());
                statement.setString(3, String.valueOf(bds.getGia()));
                statement.setString(4, bds.getDiachi());
                statement.setString(5, bds.getLoai());
                statement.setString(6, bds.getMota());
                statement.setString(7, bds.getTrangthai());
                statement.execute();
                ketNoi.con.close();
            }
        } catch (SQLException ex) {
//            System.out.println("Loi chuyen doi gia: " + ex);
        }
    }

    public static void update(BatDongSan bds, String bds1) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "update BatDongSan set MaBDS = ?, TenBDS = ?, GiaBDS = ?, DiaChiBDS = ?, LoaiBDS = ?, MotaBDS = ?, TrangThai = ? where MaBDS = ?";
            try (PreparedStatement statement = ketNoi.con.prepareStatement(sql)) {
                statement.setString(1, bds.getMa());
                statement.setString(2, bds.getTen());
                statement.setString(3, String.valueOf(bds.getGia()));
                statement.setString(4, bds.getDiachi());
                statement.setString(5, bds.getLoai());
                statement.setString(6, bds.getMota());
                statement.setString(7, bds.getTrangthai());
                statement.setString(8, bds1);
                statement.executeUpdate();
                ketNoi.con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BatDongSanModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean delete(String ma) {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
        try {
            String sql = "delete from BatDongSan where MaBDS = ?";
            try (PreparedStatement statement = ketNoi.con.prepareCall(sql)) {
                statement.setString(1, ma);
                statement.execute();
                ketNoi.con.close();
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Loi Khoa ngoai");
            return false;
        }
    }

}

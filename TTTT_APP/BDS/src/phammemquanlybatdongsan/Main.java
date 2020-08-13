/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phammemquanlybatdongsan;

import Data.Account;
import Data.NhanVien;
import Data.ThongKe;
import Modify.KetNoi;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    DangNhap loginview;

    /**
     * Creates new form MainView
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Phần Mềm Quản Lý Bất Động Sản");
        menuNV.setEnabled(false);
        menuBDS.setEnabled(false);
        menuTK.setEnabled(false);
        menuKH.setEnabled(false);
        menuHD.setEnabled(false);
        dangxuat.setEnabled(false);
        doiMK.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        dangnhap = new javax.swing.JMenuItem();
        dangxuat = new javax.swing.JMenuItem();
        doiMK = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuNV = new javax.swing.JMenuItem();
        menuKH = new javax.swing.JMenuItem();
        menuBDS = new javax.swing.JMenuItem();
        menuHD = new javax.swing.JMenuItem();
        menuTK = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout destopLayout = new javax.swing.GroupLayout(destop);
        destop.setLayout(destopLayout);
        destopLayout.setHorizontalGroup(
            destopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        destopLayout.setVerticalGroup(
            destopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jMenu1.setText("Đăng Nhập");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        dangnhap.setText("Đăng nhập");
        dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangnhapActionPerformed(evt);
            }
        });
        jMenu1.add(dangnhap);

        dangxuat.setText("Đăng xuất");
        dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(dangxuat);

        doiMK.setText("Đổi mật khẩu");
        doiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doiMKActionPerformed(evt);
            }
        });
        jMenu1.add(doiMK);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        menuNV.setText("Quản Lý Nhân Viên");
        menuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNVActionPerformed(evt);
            }
        });
        jMenu2.add(menuNV);

        menuKH.setText("Quản Lý Khách Hàng");
        menuKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKHActionPerformed(evt);
            }
        });
        jMenu2.add(menuKH);

        menuBDS.setText("Quản Lý Bất Động Sản");
        menuBDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBDSActionPerformed(evt);
            }
        });
        jMenu2.add(menuBDS);

        menuHD.setText("Quản Lý Hợp Đồng");
        menuHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHDActionPerformed(evt);
            }
        });
        jMenu2.add(menuHD);

        menuTK.setText("Thống Kê");
        menuTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTKActionPerformed(evt);
            }
        });
        jMenu2.add(menuTK);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKHActionPerformed
        destop.removeAll();
        QuanLyKhachHang khachhangview = new QuanLyKhachHang();
        khachhangview.setVisible(true);
        destop.add(khachhangview);
    }//GEN-LAST:event_menuKHActionPerformed

    private void menuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNVActionPerformed
        destop.removeAll();
        QuanLyNhanVien nhanvienview = new QuanLyNhanVien();
        nhanvienview.setVisible(true);
        destop.add(nhanvienview);
    }//GEN-LAST:event_menuNVActionPerformed

    private void menuBDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBDSActionPerformed
        destop.removeAll();
        QuanLyBatDongSan batdongsanview = new QuanLyBatDongSan();
        batdongsanview.setVisible(true);
        destop.add(batdongsanview);
    }//GEN-LAST:event_menuBDSActionPerformed

    private void menuHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHDActionPerformed
        destop.removeAll();
        QuanLyHopDong hopdongview = new QuanLyHopDong();
        hopdongview.setVisible(true);
        destop.add(hopdongview);
    }//GEN-LAST:event_menuHDActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

    private void menuTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTKActionPerformed
        // TODO add your handling code here:
        destop.removeAll();
        ThongKe1 thongke = new ThongKe1();
        thongke.setVisible(true);
        destop.add(thongke);
    }//GEN-LAST:event_menuTKActionPerformed

    private void dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangnhapActionPerformed
        destop.removeAll();
        loginview = new DangNhap();
        loginview.setVisible(true);
        destop.add(loginview);

        loginview.jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
    }//GEN-LAST:event_dangnhapActionPerformed

    private void dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangxuatActionPerformed
        destop.removeAll();
        loginview = new DangNhap();
        loginview.setVisible(true);
        destop.add(loginview);
        loginview.jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        dangnhap.setEnabled(true);
        dangxuat.setEnabled(false);
        menuBDS.setEnabled(false);
        menuHD.setEnabled(false);
        menuKH.setEnabled(false);
        menuNV.setEnabled(false);
        menuTK.setEnabled(false);
        doiMK.setEnabled(false);
    }//GEN-LAST:event_dangxuatActionPerformed

    private void doiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doiMKActionPerformed
        doimatkhau();
    }//GEN-LAST:event_doiMKActionPerformed

    public ArrayList<Account> list = new ArrayList<>();
    KetNoi ketnoi;
    int index;
    String oldpass;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        list.removeAll(list);
        ketnoi = new KetNoi();
        ketnoi.ketnoi();
        try {
            String sql = "Select * from NhanVien";
            Statement stt = ketnoi.con.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                String usernameNV = rs.getString("UsernameNV");
                String passwordNV = rs.getString("PasswordNV");
                String chucvuNV = rs.getString("ChucVuNV");
                list.add(new Account(usernameNV, passwordNV, chucvuNV));
            }
            int dem = 0;
            for (Account x : list) {
                if (loginview.txtUsername_DangNhap.getText().equalsIgnoreCase(x.getUsernameNV()) && loginview.pwdPassword_DangNhap.getText().equalsIgnoreCase(x.getPasswordNV())) {
                    index = list.indexOf(x);
                    oldpass = x.getPasswordNV();
                    dem++;
                    if (x.getChucvuNV().equalsIgnoreCase("Quản Lý")) {
                        destop.removeAll();
                        QuanLyNhanVien nhanvienview = new QuanLyNhanVien();
                        nhanvienview.setVisible(true);
                        destop.add(nhanvienview);

                        menuNV.setEnabled(true);
                        menuBDS.setEnabled(true);
                        menuTK.setEnabled(true);
                        menuKH.setEnabled(false);
                        menuHD.setEnabled(false);
                    } else {
                        destop.removeAll();
                        QuanLyKhachHang khachhangview = new QuanLyKhachHang();
                        khachhangview.setVisible(true);
                        destop.add(khachhangview);

                        menuNV.setEnabled(false);
                        menuBDS.setEnabled(false);
                        menuTK.setEnabled(false);
                        menuKH.setEnabled(true);
                        menuHD.setEnabled(true);
                    }
                    dangnhap.setEnabled(false);
                    dangxuat.setEnabled(true);
                    doiMK.setEnabled(true);
                }
            }
            if (dem == 0) {
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu");
            } else {
                JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void doimatkhau() {
        try {
            String oldpasscheck = JOptionPane.showInputDialog(this, "Nhập mật khẩu cũ");
            if (oldpasscheck.equals(oldpass)) {
                String newpass = JOptionPane.showInputDialog(this, "Nhập mật khẩu mới");
                String query = "UPDATE NHANVIEN SET PasswordNV = N'" + newpass.trim() + "' WHERE UsernameNV = '" + list.get(index).getUsernameNV() + "'";
                ketnoi = new KetNoi();
                ketnoi.ketnoi();
                int chon = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đổi mật khẩu thành " + newpass);
                if (chon == 0) {
                    try {
                        Statement stt = ketnoi.con.createStatement();
                        int update = stt.executeUpdate(query);
                        oldpass = newpass;
                        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
                    } catch (Exception e) {
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu không chính xác");
            }
        } catch (Exception e) {
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem dangnhap;
    private javax.swing.JMenuItem dangxuat;
    private javax.swing.JDesktopPane destop;
    private javax.swing.JMenuItem doiMK;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBDS;
    private javax.swing.JMenuItem menuHD;
    private javax.swing.JMenuItem menuKH;
    public javax.swing.JMenuItem menuNV;
    private javax.swing.JMenuItem menuTK;
    // End of variables declaration//GEN-END:variables

}

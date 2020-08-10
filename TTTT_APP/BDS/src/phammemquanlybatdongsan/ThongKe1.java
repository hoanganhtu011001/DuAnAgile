/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phammemquanlybatdongsan;

import Data.BatDongSan;
import Modify.KetNoi;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ThongKe1 extends javax.swing.JInternalFrame {
    List<BatDongSan> list = new ArrayList<>();
    KetNoi ketNoi;
    
    public ThongKe1() {
        initComponents();
        FillToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        cboLoaiBDS = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        cboTrangThaibds = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        lblSoLuongBDS = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Giá", "Địa chỉ", "Mô tả"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        jToolBar2.setRollover(true);

        cboLoaiBDS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đất nền", "Căn hộ", "Biệt thự" }));
        cboLoaiBDS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiBDSItemStateChanged(evt);
            }
        });
        jToolBar2.add(cboLoaiBDS);
        jToolBar2.add(jSeparator1);

        cboTrangThaibds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã bán", "Chưa bán" }));
        cboTrangThaibds.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaibdsItemStateChanged(evt);
            }
        });
        jToolBar2.add(cboTrangThaibds);
        jToolBar2.add(jSeparator2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        lblSoLuongBDS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSoLuongBDS.setText("Số Lượng:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSoLuongBDS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblSoLuongBDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLoaiBDSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiBDSItemStateChanged
        change();
    }//GEN-LAST:event_cboLoaiBDSItemStateChanged

    private void cboTrangThaibdsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaibdsItemStateChanged
        change();
    }//GEN-LAST:event_cboTrangThaibdsItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboLoaiBDS;
    private javax.swing.JComboBox<String> cboTrangThaibds;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblSoLuongBDS;
    // End of variables declaration//GEN-END:variables

    public void ketnoi() {
        ketNoi = new KetNoi();
        ketNoi.ketnoi();
    }
    DefaultTableModel model;
    public void FillToTable(){
        try {
        ketnoi();
        String query = "Select * From BatDongSan";
        Statement stt = ketNoi.con.createStatement();
        ResultSet rs = stt.executeQuery(query);
        list.removeAll(list);
        while (rs.next()) {
            String maBds = rs.getString("MaBDS");
            String TenBDS = rs.getString("TenBDS");
            String GiaBDS = rs.getString("GiaBDS");
            String DiaChiBDS = rs.getString("DiaChiBDS");
            String LoaiBDS = rs.getString("LoaiBDS");
            String MotaBDS = rs.getString("MotaBDS");
            String TrangThai = rs.getString("TrangThai");
            list.add(new BatDongSan(maBds, TenBDS, GiaBDS, DiaChiBDS, LoaiBDS, MotaBDS, TrangThai));
        }
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(BatDongSan x : list) {
            model.addRow(new Object[]{x.getMa(), x.getTen(),x.getGia()+"",x.getDiachi(), x.getMota()});
        }
        lblSoLuongBDS.setText("Số lượng : " + list.size());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void change() {
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(BatDongSan x : list) {
            if(x.getLoai().equalsIgnoreCase(cboLoaiBDS.getSelectedItem() + "") && x.getTrangthai().equalsIgnoreCase(cboTrangThaibds.getSelectedItem()+""))
            {
                model.addRow(new Object[]{x.getMa(), x.getTen(),x.getGia()+"",x.getDiachi(), x.getMota()});
            }  
        }
        lblSoLuongBDS.setText("Số lượng : " + model.getRowCount());
    }
}

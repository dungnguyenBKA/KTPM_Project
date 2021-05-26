/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.CachLyManagerFrame;

import Bean.CachLyBean;
import Bean.NhanKhauBean;
import controllers.CachLyManagerController.ThemMoiCachLyController;
import controllers.CachLyManagerPanelController;

import javax.swing.*;

import views.TestManagerFrame.ChooseNhanKhau;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Dung
 */
public class ThemMoiCachLyJFrame extends javax.swing.JFrame {
    private NhanKhauBean nguoiCachLy = new NhanKhauBean();
    private CachLyManagerPanelController parentController;
    private JFrame parentFrame;
    private CachLyBean cachLyBean;
    private ThemMoiCachLyController controller;

    /**
     * Creates new form ThemMoiTest
     */
    public ThemMoiCachLyJFrame() {
        initComponents();
    }
    public ThemMoiCachLyJFrame(CachLyManagerPanelController parentController, JFrame parentFrame){
        this.parentController = parentController;
        this.parentFrame = parentFrame;
        this.parentFrame.setEnabled(false);
        this.cachLyBean = new CachLyBean();
        initComponents();
        setTitle("Thêm mới cách ly");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        controller = new ThemMoiCachLyController();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Warning!!", JOptionPane.YES_NO_OPTION) == 0) {
                    close();
                }
            }

        });
    }
    void close(){
        this.parentFrame.setEnabled(true);
        dispose();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        testTimeChooserStart = new com.toedter.calendar.JDateChooser();
        testTimeChooserDuKien = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        idNguoiCachLyJtf = new javax.swing.JTextField();
        jlbIdNhanKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Họ tên:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("ID cách ly:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nơi cách ly:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Thời gian bắt đầu:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Mức độ:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Thời gian dự kiến:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Test:");

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Hủy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Thêm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        selectBtn.setText("Chọn");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton1.setText("Đã test");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton2.setText("Chưa test");

        idNguoiCachLyJtf.setBackground(new java.awt.Color(240, 240, 240));
        idNguoiCachLyJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idNguoiCachLyJtf.setEnabled(false);

        jlbIdNhanKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbIdNhanKhau.setText("ID nhân khẩu:");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jlbIdNhanKhau))
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(testTimeChooserStart, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jTextField10)
                                                                                .addComponent(jTextField12)
                                                                                .addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(testTimeChooserDuKien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jRadioButton1)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jRadioButton2))
                                                                                .addComponent(idNguoiCachLyJtf))
                                                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 3, Short.MAX_VALUE))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2)
                                        .addComponent(selectBtn))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(selectBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idNguoiCachLyJtf, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbIdNhanKhau))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel5))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(testTimeChooserStart, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel7))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(testTimeChooserDuKien, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jRadioButton1)
                                                        .addComponent(jRadioButton2)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (this.jTextField4.getText().trim().isEmpty()
                ||this.jTextField10.getText().trim().isEmpty()
                ||this.jTextField15.getText().trim().isEmpty()
                ||this.jTextField12.getText().trim().isEmpty()
                ||this.idNguoiCachLyJtf.getText().trim().isEmpty()
                ||(!this.jRadioButton1.isSelected()
                &&!this.jRadioButton2.isSelected())) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập hết các thông tin", "Warning", JOptionPane.ERROR_MESSAGE );
        } else {
            this.cachLyBean.setNhanKhauModel(nguoiCachLy.getNhanKhauModel());
            this.cachLyBean.getCachLyModel().setNhankhau_id(Integer.parseInt(idNguoiCachLyJtf.getText()));
            this.cachLyBean.getCachLyModel().setCachly_id(Integer.parseInt(jTextField10.getText()));
            this.cachLyBean.getCachLyModel().setTgian_bat_dau(testTimeChooserStart.getDate());
            this.cachLyBean.getCachLyModel().setNoi_cach_ly(jTextField15.getText());
            this.cachLyBean.getCachLyModel().setMuc_do_cach_ly(jTextField12.getText());

            Boolean ht;
            String datest = "true";
            String chuatest = "false";
            if (jRadioButton1.isSelected()) ht = Boolean.valueOf(datest);
            else ht = Boolean.valueOf(chuatest);
            this.cachLyBean.getCachLyModel().setIs_tested(ht);

            System.out.println(this.cachLyBean.getCachLyModel().toString());
            try {
                if (this.controller.themMoiCachLy(this.cachLyBean)){
                    JOptionPane.showMessageDialog(null,"Thêm thành công!!");
                    close();
                    parentController.refreshData();
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra. Vui lòng kiểm tra lại!!", "Warning", JOptionPane.ERROR_MESSAGE );
            }
        }

    }

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        ChooseCachLy chooseCachLy = new ChooseCachLy(this.nguoiCachLy, this);
        chooseCachLy.setLocationRelativeTo(null);
        chooseCachLy.setResizable(false);
        chooseCachLy.setVisible(true);
    }//GEN-LAST:event_selectBtnActionPerformed

    public void setNguoiCachLy(){
        this.jTextField4.setText(this.nguoiCachLy.getNhanKhauModel().getHoTen());
        this.idNguoiCachLyJtf.setText(Integer.toString(this.nguoiCachLy.getNhanKhauModel().getID()));
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {

        if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Warning!!", JOptionPane.YES_NO_OPTION) == 0) {
            close();
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idNguoiCachLyJtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlbIdNhanKhau;
    private javax.swing.JButton selectBtn;
    private com.toedter.calendar.JDateChooser testTimeChooserDuKien;
    private com.toedter.calendar.JDateChooser testTimeChooserStart;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.TestManagerFrame;

import Bean.NhanKhauBean;
import controllers.TestManagerController.ChooseNhanKhauController;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ducnm
 */
public class ChooseNhanKhau extends javax.swing.JFrame {
    private NhanKhauBean nhanKhauBean;
    private NhanKhauBean nhanKhauBeanTemp;
    private JFrame parentJFrame;
    private ChooseNhanKhauController controller;
    /**
     * Creates new form ChooseNhanKhau
     */
    public ChooseNhanKhau() {
        initComponents();
    }

    public ChooseNhanKhau(NhanKhauBean nhanKhauBean, JFrame parentJFrame){
        initComponents();
        this.nhanKhauBean = nhanKhauBean;
        this.parentJFrame = parentJFrame;
        this.nhanKhauBeanTemp = new NhanKhauBean();
        parentJFrame.setEnabled(false);
        controller = new ChooseNhanKhauController(this.nhanKhauBeanTemp, searchJtf, selectedJtf, tableJpn);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                parentJFrame.setEnabled(true);
                Close();
            }

        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchJtf = new javax.swing.JTextField();
        tableJpn = new javax.swing.JPanel();
        selectedJtf = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchJtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        GroupLayout tableJpnLayout = new GroupLayout(tableJpn);
        tableJpn.setLayout(tableJpnLayout);
        tableJpnLayout.setHorizontalGroup(
            tableJpnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tableJpnLayout.setVerticalGroup(
            tableJpnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        selectedJtf.setEnabled(false);

        cancelBtn.setText("Hủy");
        cancelBtn.setToolTipText("");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        confirmBtn.setText("Xác nhận");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(tableJpn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchJtf, GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selectedJtf, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchJtf, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableJpn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn)
                    .addComponent(cancelBtn)
                    .addComponent(selectedJtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        Close();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        this.nhanKhauBean.setNhanKhauModel(this.nhanKhauBeanTemp.getNhanKhauModel());
        this.parentJFrame.setEnabled(true);
        ThemMoiTest themMoiTest = (ThemMoiTest)this.parentJFrame;
        themMoiTest.setNguoiTest();
        dispose();
    }//GEN-LAST:event_confirmBtnActionPerformed



    public void Close() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure to close??", "Confirm", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.parentJFrame.setEnabled(true);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField searchJtf;
    private javax.swing.JTextField selectedJtf;
    private javax.swing.JPanel tableJpn;
    // End of variables declaration//GEN-END:variables
}

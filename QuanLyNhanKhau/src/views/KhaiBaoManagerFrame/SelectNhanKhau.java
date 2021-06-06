package views.KhaiBaoManagerFrame;

import Bean.KhaiBaoBean;
import Bean.NhanKhauBean;
import controllers.TestManagerController.ChooseNhanKhauController;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SelectNhanKhau extends javax.swing.JFrame {
    private KhaiBaoBean khaiBaoBean;
    private NhanKhauBean nhanKhauBeanTemp;
    private JFrame parentJFrame;
    private ChooseNhanKhauController controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField searchJtf;
    private javax.swing.JTextField selectedJtf;
    private javax.swing.JPanel tableJpn;
    public KhaiBaoBean khaiBaoBean1;

    /**
     * Creates new form ChooseNhanKhau
     */
    public SelectNhanKhau() {
        initComponents();
    }

    public SelectNhanKhau(KhaiBaoBean khaiBaoBean, JFrame parentJFrame) {
        initComponents();
        this.khaiBaoBean = khaiBaoBean;
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



    public KhaiBaoBean getKhaiBaoBean() {
        return khaiBaoBean;
    }

    public void setKhaiBaoBean(KhaiBaoBean khaiBaoBean) {
        this.khaiBaoBean = khaiBaoBean;
    }

    public NhanKhauBean getNhanKhauBeanTemp() {
        return nhanKhauBeanTemp;
    }

    public void setNhanKhauBeanTemp(NhanKhauBean nhanKhauBeanTemp) {
        this.nhanKhauBeanTemp = nhanKhauBeanTemp;
    }

    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }

    public ChooseNhanKhauController getController() {
        return controller;
    }

    public void setController(ChooseNhanKhauController controller) {
        this.controller = controller;
    }

    public JButton getCancelBtn() {
        return cancelBtn;
    }

    public void setCancelBtn(JButton cancelBtn) {
        this.cancelBtn = cancelBtn;
    }

    public JButton getConfirmBtn() {
        return confirmBtn;
    }

    public void setConfirmBtn(JButton confirmBtn) {
        this.confirmBtn = confirmBtn;
    }

    public JTextField getSearchJtf() {
        return searchJtf;
    }

    public void setSearchJtf(JTextField searchJtf) {
        this.searchJtf = searchJtf;
    }

    public JTextField getSelectedJtf() {
        return selectedJtf;
    }

    public void setSelectedJtf(JTextField selectedJtf) {
        this.selectedJtf = selectedJtf;
    }

    public JPanel getTableJpn() {
        return tableJpn;
    }

    public void setTableJpn(JPanel tableJpn) {
        this.tableJpn = tableJpn;
    }

    private void initComponents() {

        searchJtf = new javax.swing.JTextField();
        tableJpn = new javax.swing.JPanel();
        selectedJtf = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        khaiBaoBean1 = new KhaiBaoBean();

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

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Close();
    }

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.khaiBaoBean1.setNhanKhauModel(this.nhanKhauBeanTemp.getNhanKhauModel());
        System.out.println(khaiBaoBean1.getNhanKhauModel().getMaNhanKhau());
        this.parentJFrame.setEnabled(true);
        ThemMoiKhaiBao themMoiKhaiBao = (ThemMoiKhaiBao) this.parentJFrame;
        themMoiKhaiBao.setDataTextField(khaiBaoBean1);
        dispose();
    }

    public void Close() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure to close??", "Confirm", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            this.parentJFrame.setEnabled(true);
            dispose();
        }
    }
}

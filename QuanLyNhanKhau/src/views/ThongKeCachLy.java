/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Bean.CachLyBean;
import models.CachLyModel;
import services.CachLyService;
import services.ThongKeCachLyService;
import utility.ClassTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hieppm
 */
public class ThongKeCachLy extends javax.swing.JPanel {
    private final String[] COLUMNS = {"Mã cách ly", "ID nhân khẩu", "Thời gian", "Mức độ", "Đã test?"};
    private CachLyService cachLyService;
    private List<CachLyBean> cachLyBeanList;
    private List<CachLyModel> cachLyList;
    private ClassTableModel classTableModel;
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> selectMucDo;
    private int stateButton;

    public ThongKeCachLy(LayoutManager layout, boolean isDoubleBuffered, CachLyService cachLyService, List<CachLyBean> cachLyBeanList, ClassTableModel classTableModel, JButton jButton1, JLabel jLabel1, JLabel jLabel2, JPanel jPanel1, JTextField jTextField1, JComboBox<String> selectMucDo) {
        super(layout, isDoubleBuffered);
        this.cachLyService = cachLyService;
        this.cachLyBeanList = cachLyBeanList;
        this.classTableModel = classTableModel;
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jPanel1 = jPanel1;
        this.jTextField1 = jTextField1;
        this.selectMucDo = selectMucDo;
        this.stateButton = 0;
    }

    /**
     * Creates new form ThongKeCachLy
     */
    public ThongKeCachLy() {
        initComponents();
        this.stateButton = 0;
        setData();
        //setDataTable();
    }

    public CachLyService getCachLyService() {
        return cachLyService;
    }

    public void setCachLyService(CachLyService cachLyService) {
        this.cachLyService = cachLyService;
    }

    public List<CachLyBean> getCachLyBeanList() {
        return cachLyBeanList;
    }

    public void setCachLyBeanList(List<CachLyBean> cachLyBeanList) {
        this.cachLyBeanList = cachLyBeanList;
    }

    public ClassTableModel getClassTableModel() {
        return classTableModel;
    }

    public void setClassTableModel(ClassTableModel classTableModel) {
        this.classTableModel = classTableModel;
    }

    public String[] getCOLUMNS() {
        return COLUMNS;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JComboBox<String> getSelectMucDo() {
        return selectMucDo;
    }

    public void setSelectMucDo(JComboBox<String> selectMucDo) {
        this.selectMucDo = selectMucDo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectMucDo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        classTableModel = new ClassTableModel();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 359, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 359, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mức độ:");

        selectMucDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"F0", "F1", "F2", "F3"}));
        selectMucDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMucDoActionPerformed(evt);
            }
        });

        jLabel2.setText("Thời gian bắt đầu cách ly : ");

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stateButton = 1;
                setData();
                setDataTable();
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(jLabel1)
                                                .addGap(1, 1, 1)
                                                .addComponent(selectMucDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel2)
                                                .addGap(73, 73, 73)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton1)))
                                .addContainerGap(76, Short.MAX_VALUE))
        );
 layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(selectMucDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(31, 31, 31)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void selectMucDoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void setData() {
        ThongKeCachLyService service = new ThongKeCachLyService();
        String mucDoGender = (String) selectMucDo.getSelectedItem();
        String tgian = jTextField1.getText();
        while (!service.validateJavaDate(tgian)) {
            JOptionPane.showMessageDialog(null, "Thời gian cần có định dạng yyyy-MM-dd!", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            tgian = jTextField1.getText();
        }
        List<CachLyModel> listItem = service.getALlListCachLy();
        try {
            if (mucDoGender == null) {
                JOptionPane.showMessageDialog(null, "Chưa chọn mức độ thống kê!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                if (stateButton == 1)
                    listItem = service.getListCachLy(mucDoGender, tgian);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng kiểu dữ liệu!!", "Warring", JOptionPane.ERROR_MESSAGE);
        }
        this.cachLyList = listItem;
        setDataTable();
    }


    public void setDataTable() {
        List<CachLyModel> listItem = new ArrayList<>();
        this.cachLyList.forEach(cachly -> {
            listItem.add(cachly);
        });
        DefaultTableModel model = classTableModel.setTableCachLyModel(listItem, COLUMNS);
        JTable table = new JTable(model);

        // thiet ke bang
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));

        table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.getColumnModel().getColumn(0).setMinWidth(40);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);

        table.getColumnModel().getColumn(1).setMaxWidth(200);
        table.getColumnModel().getColumn(1).setMinWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);

        table.getColumnModel().getColumn(2).setMaxWidth(200);
        table.getColumnModel().getColumn(2).setMinWidth(40);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);



        table.getColumnModel().getColumn(3).setMaxWidth(160);
        table.getColumnModel().getColumn(3).setMinWidth(40);
        table.getColumnModel().getColumn(3).setPreferredWidth(160);

        table.getColumnModel().getColumn(4).setMaxWidth(100);
        table.getColumnModel().getColumn(4).setMinWidth(40);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jPanel1.removeAll();
        jPanel1.setLayout(new CardLayout());
        jPanel1.add(scroll);
        jPanel1.validate();
        jPanel1.repaint();
    }
    // End of variables declaration
}

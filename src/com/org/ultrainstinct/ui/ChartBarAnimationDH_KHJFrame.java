/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.org.ultrainstinct.ui;

import com.org.ultrainstinct.chart.ModelChart;
import com.org.ultrainstinct.dao.impl.SanPhamDAOImpl;
import com.org.ultrainstinct.dao.impl.ThongKeDAOImpl;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author Minh Ngoc
 */
public class ChartBarAnimationDH_KHJFrame extends javax.swing.JPanel {
SanPhamDAOImpl SanPhamDao= new SanPhamDAOImpl();
ThongKeDAOImpl thongkeDao= new ThongKeDAOImpl();
    /**
     * Creates new form ChartBarAnimationJFrame
     */
    public ChartBarAnimationDH_KHJFrame() {
        initComponents();
        chart.addLegend("Số lượng khách hàng", new Color(245, 189, 135));
        chart.addLegend("Số đơn thành công", new Color(135, 189, 245));
        chart.addLegend("Số đơn hủy", new Color(189, 135, 245));
        chart.addLegend("Số sản phẩm bán được", new Color(139, 229, 222));
//        chart.addData(new ModelChart("Tháng 1", new double[]{500, 200, 80}));
//        chart.addData(new ModelChart("Tháng 2", new double[]{600, 750, 90}));
//        chart.addData(new ModelChart("Tháng 3", new double[]{200, 350, 460}));
//        chart.addData(new ModelChart("Tháng 4", new double[]{480, 150, 750}));
//        chart.addData(new ModelChart("Tháng 5", new double[]{350, 540, 300}));
//        chart.addData(new ModelChart("Tháng 6", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 7", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 8", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 9", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 10", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 11", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 12", new double[]{190, 280, 81}));
        addChartData();
        chart.start();
            
    }
    private void addChartData() {
        List<ModelChart> data = thongkeDao.fetchDataKH_DH();
        for (ModelChart model : data) {
            chart.addData(model);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        chart = new com.org.ultrainstinct.chart.Chart();

        jButton1.setText("Refresh And Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(764, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chart.clear();
//        chart.addData(new ModelChart("Tháng 1", new double[]{500, 200, 80}));
//        chart.addData(new ModelChart("Tháng 2", new double[]{600, 750, 90}));
//        chart.addData(new ModelChart("Tháng 3", new double[]{200, 350, 460}));
//        chart.addData(new ModelChart("Tháng 4", new double[]{480, 150, 750}));
//        chart.addData(new ModelChart("Tháng 5", new double[]{350, 540, 300}));
//        chart.addData(new ModelChart("Tháng 6", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 7", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 8", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 9", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 10", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 11", new double[]{190, 280, 81}));
//        chart.addData(new ModelChart("Tháng 12", new double[]{190, 280, 81}));
         addChartData();
         chart.start();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.org.ultrainstinct.chart.Chart chart;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

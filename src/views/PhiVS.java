/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author sonso
 */
public class PhiVS extends javax.swing.JPanel {

    /**
     * Creates new form PhiVS
     */
    private JFrame parentFrame;
    public PhiVS(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        JFreeChart pieChart = createChart(createDataset());
        ChartPanel chartPanel = new ChartPanel(pieChart);
        GraphjPanel1.add(chartPanel);
        GraphjPanel1.setSize(600, 400);
        GraphjPanel1.setVisible(true);
    }

    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "CƠ CẤU DÂN SỐ THEO NHÓM TUỔI NĂM 2020", dataset, true, true, true);
        return chart;
    }

    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Nhóm 0 - 14", new Double(50.0));
        dataset.setValue("Nhóm 15 - 59", new Double(41.0));
        dataset.setValue("Nhóm trên 60", new Double(9.0));
        return dataset;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GraphjPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 102));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Quản Lý Phí Vệ Sinh", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setPreferredSize(new java.awt.Dimension(703, 542));

        javax.swing.GroupLayout GraphjPanel1Layout = new javax.swing.GroupLayout(GraphjPanel1);
        GraphjPanel1.setLayout(GraphjPanel1Layout);
        GraphjPanel1Layout.setHorizontalGroup(
            GraphjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        GraphjPanel1Layout.setVerticalGroup(
            GraphjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(GraphjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(GraphjPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphjPanel1;
    // End of variables declaration//GEN-END:variables
}

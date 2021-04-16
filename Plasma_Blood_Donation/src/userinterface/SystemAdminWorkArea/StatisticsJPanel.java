/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 *
 * @author Akshay
 */
public class StatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StatisticsJPanel
     */
    public StatisticsJPanel() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GRAPHS AND STATISTICS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1631, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pie-chart.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/line-chart.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 70, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("LINE CHART");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("PIE CHART");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("BAR CHART");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 70, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Plasma Donor", new Integer(10));
        pieDataset.setValue("Plasma Patient(Receiver)", new Integer(20));
       // pieDataset.setValue("Three", new Integer(30));
       // pieDataset.setValue("Four", new Integer(40));
        JFreeChart piechart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
        PiePlot piechrt = (PiePlot)piechart.getPlot();
        //piechrt.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame chrtframe = new ChartFrame("Pie Chart", piechart);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        chrtframe.setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset linechartdata = new DefaultCategoryDataset();
        linechartdata.setValue(10, "No. Of Work Request","Day1");
        linechartdata.setValue(20, "No. Of Work Request","Day2");
        linechartdata.setValue(7, "No. Of Work Request","Day3");
        JFreeChart linechart = ChartFactory.createLineChart3D("Request per day", "Daily", "No. Of Work Request", linechartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot linechrt = linechart.getCategoryPlot();
        linechrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", linechart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        barchartdata.setValue(10, "No. Of Work Request","Day1");
        barchartdata.setValue(20, "No. Of Work Request","Day2");
        barchartdata.setValue(7, "No. Of Work Request","Day3");
        JFreeChart barchart = ChartFactory.createBarChart3D("Request per day", "Daily", "No. Of Work Request", barchartdata, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barchart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame chrtframe = new ChartFrame("Contribution", barchart, true);
        chrtframe.setVisible(true);
        chrtframe.setSize(1200,850);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        chrtframe.setLocation(dim.width/2-this.getSize().width/2, dim.height/2- this.getSize().height/2);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

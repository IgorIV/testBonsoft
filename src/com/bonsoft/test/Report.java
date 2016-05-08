/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonsoft.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author igor
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        personalPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("personalPU").createEntityManager();
        orgsQuery = java.beans.Beans.isDesignTime() ? null : personalPUEntityManager.createQuery("SELECT o FROM Orgs o");
        orgsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : orgsQuery.getResultList();
        storesQuery = java.beans.Beans.isDesignTime() ? null : personalPUEntityManager.createQuery("SELECT s FROM Stores s");
        storesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : storesQuery.getResultList();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, orgsList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel1.setText("Организация");

        jLabel2.setText("Объект");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, storesList, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel3.setText("Дата");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField1.setText((new SimpleDateFormat("dd.MM.yyyy")).format(Calendar.getInstance().getTime()));

        jButton1.setText("Создать отчет");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Закрыть");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<ReportLine> lines = new ArrayList<>();
        try {                                         
            Orgs org = (Orgs) jComboBox1.getSelectedItem();
            Stores store = (Stores) jComboBox2.getSelectedItem();
            Calendar period = Calendar.getInstance();
            try {
                period.setTime((new SimpleDateFormat("dd.MM.yyyy")).parse(jFormattedTextField1.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://88.201.248.46:5432/personal", "vitaly", "m127rqu4");
            } catch (SQLException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "select operations.descr, date_part('hour', mhr_period) as hr, sum(mhr_qty) as cnt from mhr, operations " + 
                    "where mhr.operation_id = operations.id and mhR_qty > 0 and mhr.org_id = " + org.getId() + " and store_id = " + store.getId() + 
                    " and " + 
                    "date_part('day', mhr_period) = " + period.get(Calendar.DAY_OF_MONTH) + " and date_part('month', mhr_period) = " + 
                    (period.get(Calendar.MONTH) + 1) + " and date_part('year', mhr_period) = " + period.get(Calendar.YEAR) +  
                    " and mhr.operation_id in (select id from operations) group by operations.descr, hr having count(mhr_qty) > 0 order by " + 
                    "operations.descr, hr";
            try {
                result = statement.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Организация: " + org.getName() + ", id = " + org.getId());
            System.out.println("Объект: " + store.getDescr() + ", id = " + store.getId());
            System.out.println("День: " + period.get(Calendar.DAY_OF_MONTH));
            System.out.println("Месяц: " + (period.get(Calendar.MONTH) + 1));
            System.out.println("Год: " + period.get(Calendar.YEAR));         
            String oldDescr = "";
            ReportLine line = null;
            while ( result.next() ) {
                String  descr = result.getString("descr");
                double hr  = result.getDouble("hr");
                double cnt  = result.getDouble("cnt");
                cnt = Math.ceil(cnt);
                if (oldDescr.equals(descr)) {
                    line.add(hr, cnt);
                } else {
                    oldDescr = descr;
                    line = new ReportLine();
                    line.setName(descr);
                    line.add(hr, cnt);
                    lines.add(line);
                }
            }
            result.close();
            statement.close();
            connection.close();           
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Отчет");
        Row title = sheet.createRow(0);
        Cell cell = title.createCell(0);
        cell.setCellValue("Операция");
        Row row = null;
        int x = 0, y = 0;           
        for (ReportLine line : lines) {
            row = sheet.createRow(++y);
            cell = row.createCell(0);
            cell.setCellValue(line.getName());
            for(int i = 0; i < line.getLen(); i++) {
                x = line.getHours().get(i) - ReportLine.getMinH() + 1;
                cell = title.createCell(x);
                cell.setCellValue(line.getHours().get(i) + ":00");
                cell = row.createCell(x);
                cell.setCellValue(line.getCounts().get(i));
            }
        }
        sheet.autoSizeColumn(0);
        try (FileOutputStream fileExcel = new FileOutputStream("Report.xlsx")) {
            workbook.write(fileExcel);
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.util.List<com.bonsoft.test.Orgs> orgsList;
    private javax.persistence.Query orgsQuery;
    private javax.persistence.EntityManager personalPUEntityManager;
    private java.util.List<com.bonsoft.test.Stores> storesList;
    private javax.persistence.Query storesQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
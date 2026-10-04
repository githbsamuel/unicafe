/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package windows.admin;

import java.awt.Color;

/**
 *
 * @author samuel_fd
 */
public class JPanel_Inicio extends javax.swing.JPanel {
    
    
    public JPanel_Inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        adminTxt = new javax.swing.JLabel();
        titleTxt = new javax.swing.JLabel();
        holaTxt = new javax.swing.JLabel();
        resumenTxt = new javax.swing.JLabel();
        t_producosTxt = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        t_productosTxt = new javax.swing.JLabel();
        entradasPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        h_entradasTxt = new javax.swing.JLabel();
        salidasPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        h_salidasTxt = new javax.swing.JLabel();
        stock_bPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        stockTxt = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        movimientosTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        stockTable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(830, 830));
        setPreferredSize(new java.awt.Dimension(830, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminPanel.setBackground(new java.awt.Color(204, 204, 204));

        adminTxt.setBackground(new java.awt.Color(0, 0, 0));
        adminTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminTxt.setText("Administrador");
        adminTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(0, 693, Short.MAX_VALUE)
                .addComponent(adminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(adminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        titleTxt.setFont(new java.awt.Font("Adwaita Sans", 1, 24)); // NOI18N
        titleTxt.setText("Inicio");
        add(titleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 50));

        holaTxt.setFont(new java.awt.Font("Adwaita Sans", 0, 20)); // NOI18N
        holaTxt.setText("Hola, Administrador");
        add(holaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 40));

        resumenTxt.setBackground(new java.awt.Color(204, 204, 204));
        resumenTxt.setForeground(new java.awt.Color(153, 153, 153));
        resumenTxt.setText("Aqui tienes un resumen del estado del inventario.");
        add(resumenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel13.setText("Total de productos");

        t_productosTxt.setText("X");

        javax.swing.GroupLayout t_producosTxtLayout = new javax.swing.GroupLayout(t_producosTxt);
        t_producosTxt.setLayout(t_producosTxtLayout);
        t_producosTxtLayout.setHorizontalGroup(
            t_producosTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t_producosTxtLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(t_producosTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_productosTxt)
                    .addComponent(jLabel13))
                .addGap(16, 16, 16))
        );
        t_producosTxtLayout.setVerticalGroup(
            t_producosTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_producosTxtLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(t_productosTxt)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(t_producosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setText("Entradas (Hoy)");

        h_entradasTxt.setText("X");

        javax.swing.GroupLayout entradasPanelLayout = new javax.swing.GroupLayout(entradasPanel);
        entradasPanel.setLayout(entradasPanelLayout);
        entradasPanelLayout.setHorizontalGroup(
            entradasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entradasPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(h_entradasTxt)
                .addGap(111, 111, 111))
            .addGroup(entradasPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        entradasPanelLayout.setVerticalGroup(
            entradasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entradasPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(h_entradasTxt)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(entradasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 170, -1));

        jLabel15.setText("Salidas (Hoy)");

        h_salidasTxt.setText("X");

        javax.swing.GroupLayout salidasPanelLayout = new javax.swing.GroupLayout(salidasPanel);
        salidasPanel.setLayout(salidasPanelLayout);
        salidasPanelLayout.setHorizontalGroup(
            salidasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salidasPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(salidasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salidasPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(h_salidasTxt))
                    .addComponent(jLabel15))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        salidasPanelLayout.setVerticalGroup(
            salidasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salidasPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(h_salidasTxt)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(salidasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 170, -1));

        jLabel17.setText("Stock bajo");

        stockTxt.setText("X");

        javax.swing.GroupLayout stock_bPanelLayout = new javax.swing.GroupLayout(stock_bPanel);
        stock_bPanel.setLayout(stock_bPanelLayout);
        stock_bPanelLayout.setHorizontalGroup(
            stock_bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stock_bPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(stock_bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockTxt)
                    .addComponent(jLabel17))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        stock_bPanelLayout.setVerticalGroup(
            stock_bPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stock_bPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(stockTxt)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(stock_bPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 160, -1));

        jLabel19.setFont(new java.awt.Font("Adwaita Sans", 1, 18)); // NOI18N
        jLabel19.setText("Movimientos recientes");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Adwaita Sans", 1, 18)); // NOI18N
        jLabel5.setText("Stock por categoria");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        movimientosTable.setViewportView(jTable1);

        add(movimientosTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 400, 240));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        stockTable.setViewportView(jTable2);

        add(stockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 290, 240));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel adminTxt;
    private javax.swing.JPanel entradasPanel;
    private javax.swing.JLabel h_entradasTxt;
    private javax.swing.JLabel h_salidasTxt;
    private javax.swing.JLabel holaTxt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane movimientosTable;
    private javax.swing.JLabel resumenTxt;
    private javax.swing.JPanel salidasPanel;
    private javax.swing.JScrollPane stockTable;
    private javax.swing.JLabel stockTxt;
    private javax.swing.JPanel stock_bPanel;
    private javax.swing.JPanel t_producosTxt;
    private javax.swing.JLabel t_productosTxt;
    private javax.swing.JLabel titleTxt;
    // End of variables declaration//GEN-END:variables
}

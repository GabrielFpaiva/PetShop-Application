package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author bielf
 */
public class TiposDeServiço extends JPanel {

    NovoServiço cadastrarservico = new NovoServiço();

    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,0 ); // setlocation 0 p ser no meio da tela
        serviceTypePanel.add(p);
        serviceTypePanel.revalidate();
        serviceTypePanel.repaint();
    }

    public TiposDeServiço() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        serviceTypePanel = new javax.swing.JPanel();
        novoServicoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setPreferredSize(new Dimension(1024, 1060));
        setLayout(new FlowLayout());

        serviceTypePanel.setBackground(new Color(255, 255, 255));
        serviceTypePanel.setPreferredSize(new Dimension(1024, 1060));

        novoServicoButton.setText("Novo Serviço");
        novoServicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoServicoButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Id", "Serviço", "Preço"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tipos de Tipos");

        jFormattedTextField1.setText("Serviços");

        javax.swing.GroupLayout serviceTypePanelLayout = new javax.swing.GroupLayout(serviceTypePanel);
        serviceTypePanel.setLayout(serviceTypePanelLayout);
        serviceTypePanelLayout.setHorizontalGroup(
                serviceTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(serviceTypePanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(serviceTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(serviceTypePanelLayout.createSequentialGroup()
                                                .addGroup(serviceTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(serviceTypePanelLayout.createSequentialGroup()
                                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(novoServicoButton)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(editarButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(excluirButton)))
                                .addContainerGap(164, Short.MAX_VALUE))
        );
        serviceTypePanelLayout.setVerticalGroup(
                serviceTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(serviceTypePanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addGroup(serviceTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(novoServicoButton)
                                        .addComponent(editarButton)
                                        .addComponent(excluirButton)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(serviceTypePanel);
    }// </editor-fold>                        

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void novoServicoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        serviceTypePanel.removeAll();
        setconfpanel(cadastrarservico);
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel serviceTypePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton novoServicoButton;
    // End of variables declaration                   
}

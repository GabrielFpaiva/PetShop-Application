
package com.AnormaisEBruna.petshop.gui.views;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author bielf
 */
public class EditarProduto extends JPanel {

    public void setconfpanel(JPanel p){
        p.setSize(1024,1024);
        p.setLocation(0,10 ); // setlocation 0 p ser no meio da tela
        editarProduto.add(p);
        editarProduto.revalidate();
        editarProduto.repaint();
    }

    public EditarProduto() {
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

        editarProduto = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JFormattedTextField();
        labelPreço = new javax.swing.JLabel();
        textFieldPreço = new javax.swing.JFormattedTextField();
        editarButton = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setPreferredSize(new Dimension(1024, 1024));
        setLayout(new FlowLayout());

        editarProduto.setBackground(new java.awt.Color(255, 255, 255));
        editarProduto.setPreferredSize(new Dimension(1024, 1024));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setText("Produto");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        labelPreço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPreço.setText("Preço");

        textFieldPreço.setActionCommand("<Not Set>");
        textFieldPreço.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editarButton.setBackground(new java.awt.Color(51, 102, 255));
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitulo.setText("Editar Produto");

        javax.swing.GroupLayout editarProdutoLayout = new javax.swing.GroupLayout(editarProduto);
        editarProduto.setLayout(editarProdutoLayout);
        editarProdutoLayout.setHorizontalGroup(
                editarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarProdutoLayout.createSequentialGroup()
                                .addContainerGap(1127, Short.MAX_VALUE)
                                .addGroup(editarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelNome)
                                                .addComponent(labelPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(editarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(textFieldPreço, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textFieldNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editarProdutoLayout.createSequentialGroup()
                                                .addComponent(editarButton)
                                                .addGap(117, 117, 117)))
                                .addGap(302, 302, 302))
        );
        editarProdutoLayout.setVerticalGroup(
                editarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editarProdutoLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(labelTitulo)
                                .addGap(36, 36, 36)
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(labelPreço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(editarButton)
                                .addContainerGap(365, Short.MAX_VALUE))
        );

        add(editarProduto);
    }// </editor-fold>

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(textFieldNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Nome do produto Invalido!");
        }else if(textFieldPreço.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preço do produto Invalido!");
        }else{
            Vendas vendas = new Vendas();
            JOptionPane.showMessageDialog(null,"Editado com Sucesso!");
            vendas.setPreço(textFieldPreço.getText());
            vendas.setProduto(textFieldNome.getText());
            vendas.refreshtable();
            editarProduto.removeAll();
            setconfpanel(vendas);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton editarButton;
    private javax.swing.JPanel editarProduto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreço;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JFormattedTextField textFieldNome;
    private javax.swing.JFormattedTextField textFieldPreço;
    // End of variables declaration
}

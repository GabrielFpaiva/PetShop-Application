package com.AnormaisEBruna.petshop.gui.views;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

public class NovoUsuario extends JPanel {
    @Autowired
    private UserService service;

        public void setconfpanel(JPanel p){
            p.setSize(1024,1024);
            p.setLocation(0,0 ); // setlocation 0 p ser no meio da tela
            CadastroUsuarioPanel.add(p);
            CadastroUsuarioPanel.revalidate();
            CadastroUsuarioPanel.repaint();
        }
        
        public NovoUsuario(){
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
    
            jScrollBar1 = new JScrollBar();
            CadastroUsuarioPanel = new JPanel();
            jLabel3 = new JLabel();
            jLabel4 = new JLabel();
            jLabel5 = new JLabel();
            senhacadastrousuario = new JPasswordField();
            jLabel1 = new JLabel();
            cadastronomeusuario = new JFormattedTextField();
            emailcadastrousuario = new JFormattedTextField();
            cadastrarusuariobutton = new JButton();
    
            CadastroUsuarioPanel.setBackground(new java.awt.Color(255, 255, 255));
            CadastroUsuarioPanel.setPreferredSize(new java.awt.Dimension(1024, 1024));
    
            jLabel3.setText("Nome");
    
            jLabel4.setText("Senha");
    
            jLabel5.setText("E-mail");
    

    
            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            jLabel1.setText("Cadastrar Novo Usuário");

    
            cadastrarusuariobutton.setBackground(new java.awt.Color(0, 102, 204));
            cadastrarusuariobutton.setForeground(new java.awt.Color(255, 255, 255));
            cadastrarusuariobutton.setText("Cadastrar");
            cadastrarusuariobutton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cadastrarusuariobuttonActionPerformed(evt);
                }
            });
    
            GroupLayout CadastroUsuarioPanelLayout = new GroupLayout(CadastroUsuarioPanel);
            CadastroUsuarioPanel.setLayout(CadastroUsuarioPanelLayout);
            CadastroUsuarioPanelLayout.setHorizontalGroup(
                CadastroUsuarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, CadastroUsuarioPanelLayout.createSequentialGroup()
                    .addContainerGap(386, Short.MAX_VALUE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
                    .addGap(279, 279, 279))
                .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addGroup(CadastroUsuarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(CadastroUsuarioPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                        .addComponent(senhacadastrousuario, GroupLayout.Alignment.TRAILING)
                        .addComponent(cadastronomeusuario)
                        .addComponent(emailcadastrousuario, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addComponent(cadastrarusuariobutton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            CadastroUsuarioPanelLayout.setVerticalGroup(
                CadastroUsuarioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(CadastroUsuarioPanelLayout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cadastronomeusuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(emailcadastrousuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(senhacadastrousuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addComponent(cadastrarusuariobutton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(407, Short.MAX_VALUE))
            );
    
            GroupLayout layout = new GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CadastroUsuarioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(CadastroUsuarioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
        }// </editor-fold>                        
        

        private void cadastrarusuariobuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
            // TODO add your handling code here:
            if(cadastronomeusuario.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Nome Invalido!");
            }else if(emailcadastrousuario.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Email Invalido!");
            }else if(senhacadastrousuario.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Senha Invalido!");
            }else{
                Usuarios layoutusuario = new Usuarios();
                JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
                layoutusuario.setEmail(emailcadastrousuario.getText()); 
                layoutusuario.setNome(cadastronomeusuario.getText());
                layoutusuario.refreshtable();
                CadastroUsuarioPanel.removeAll();
                setconfpanel(layoutusuario);   
            }
        }                                                      
        
        // Variables declaration - do not modify                     
        private JPanel CadastroUsuarioPanel;
        public JButton cadastrarusuariobutton;
        public JFormattedTextField cadastronomeusuario;
        public JFormattedTextField emailcadastrousuario;
        private JLabel jLabel1;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JLabel jLabel5;
        private JScrollBar jScrollBar1;
        private JPasswordField senhacadastrousuario;
        // End of variables declaration                   

   /* ConfigurableBootstrapContext ctx = new SpringApplicationBuilder(NovoUsuario.class){
        NovoUsuario users = ctx.get(NovoUsuario.class);
        users.setVisible(true);
    };*/

}

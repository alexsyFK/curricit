/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design;

import classes.Nsa;
import static classes.Nsa.ctr;
import static classes.Nsa.key;
import static design.TelaCadastro.imx;
import static design.TelaCadastro.nn;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author admin
 */
public class AtualizarCad extends javax.swing.JFrame {

int z=0;
 String path=TelaCadastro.anon.toString();

    /**
     * Creates new form AtualizarCad
     */
    public AtualizarCad() {
        initComponents();
    }

    
    //limpar dados
    void clsData(){
nome_Atua.setText(null);
senha_Atua.setText(null);
email_Atua.setText(null);
idade_Atua.setText(null);

}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salvar_Cadastral1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nome_Atua = new javax.swing.JTextField();
        idade_Atua = new javax.swing.JTextField();
        email_Atua = new javax.swing.JTextField();
        senha_Atua = new javax.swing.JPasswordField();
        habilidade_Atua = new javax.swing.JComboBox();
        cargo_Atua = new javax.swing.JComboBox();
        jL_img3 = new javax.swing.JLabel();
        bnt_img = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Idade");

        jLabel3.setText("email");

        jLabel4.setText("experiencia");

        jLabel5.setText("cargo");

        salvar_Cadastral1.setText("Atualizar");
        salvar_Cadastral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_Cadastral1ActionPerformed(evt);
            }
        });

        jLabel8.setText("nome");

        jLabel12.setText("senha");

        idade_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_AtuaActionPerformed(evt);
            }
        });
        idade_Atua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idade_AtuaKeyPressed(evt);
            }
        });

        email_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_AtuaActionPerformed(evt);
            }
        });
        email_Atua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_AtuaKeyPressed(evt);
            }
        });

        habilidade_Atua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "c", "delphi", "assembly", "php", "perl", "python", "sql" }));
        habilidade_Atua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilidade_AtuaActionPerformed(evt);
            }
        });

        cargo_Atua.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analista", "DBA", "programador", "estudante" }));

        bnt_img.setText("escolher imagem");
        bnt_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_imgActionPerformed(evt);
            }
        });

        jButton1.setText("sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jL_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bnt_img)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargo_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habilidade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salvar_Cadastral1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_Atua, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(senha_Atua))))))
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(senha_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(nome_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(idade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(email_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cargo_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(habilidade_Atua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jL_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_Cadastral1)
                    .addComponent(bnt_img))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
  
  //setar combobx
  void item(){
      TelaCadastro tlc = new TelaCadastro();
//if(TelaCadastro.imx[DadosCadastrais.k]==null)
  //  jL_img3.setIcon(tlc.anon);
//else{
//jL_img3.setIcon(new ImageIcon(TelaCadastro.imx[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
//}  
      




// jL_img3.setIcon(tlc.anon);
//TelaCadastro.pa=TelaCadastro.imx[DadosCadastrais.k].toString();
    //  TelaCadastro.imx2[DadosCadastrais.k]=TelaCadastro.imx[DadosCadastrais.k];
      jL_img3.setIcon(new ImageIcon(TelaCadastro.imx[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
       habilidade_Atua.setSelectedItem(Nsa.prtc[DadosCadastrais.k].getHabilidade());
cargo_Atua.setSelectedItem(Nsa.prtc[DadosCadastrais.k].getCargo());

  }
  
 
    private void salvar_Cadastral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_Cadastral1ActionPerformed
 DadosCadastrais dads = new DadosCadastrais();
        TelaCadastro tlCad = new TelaCadastro();

imging2();
  dads.Edit(new String(senha_Atua.getPassword()),nome_Atua.getText(),idade_Atua.getText(),email_Atua.getText(),cargo_Atua.getSelectedItem().toString(),habilidade_Atua.getSelectedItem().toString());
  clsData();
      dispose();
      
      
    }//GEN-LAST:event_salvar_Cadastral1ActionPerformed

    private void email_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_AtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_AtuaActionPerformed
    
    
    private void email_AtuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_AtuaKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 DadosCadastrais dads = new DadosCadastrais();
  
  
  TelaCadastro tlCad = new TelaCadastro();
  dads.Edit(new String(senha_Atua.getPassword()),nome_Atua.getText(),idade_Atua.getText(),email_Atua.getText(),cargo_Atua.getSelectedItem().toString(),habilidade_Atua.getSelectedItem().toString());
      clsData();
      dispose();
      
      
      
      
// TODO add your handling code here:
      }
    }//GEN-LAST:event_email_AtuaKeyPressed

    private void idade_AtuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idade_AtuaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_AtuaKeyPressed

    private void idade_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_AtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_AtuaActionPerformed

    private void habilidade_AtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilidade_AtuaActionPerformed

              // TODO add your handling code here:
    }//GEN-LAST:event_habilidade_AtuaActionPerformed

    private void bnt_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_imgActionPerformed
//z=0;
        
        img2();
imging2();
//jL_img3.setIcon(new ImageIcon(TelaCadastro.imx2[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
//TelaCadastro.imx[DadosCadastrais.k]=TelaCadastro.imx2[DadosCadastrais.k];
//if(z==0){
//TelaCadastro.imx[DadosCadastrais.k]=TelaCadastro.imx2[DadosCadastrais.k];
//}
//else{
//imging2();
//}
// TODO add your handling code here:
    }//GEN-LAST:event_bnt_imgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      TelaCadastro tlc = new TelaCadastro();
  int resp=0;
  if(tlc.anons.toString().equals(path)){
      resp=1;
      System.out.println(resp);
      }
      
      
    switch(resp){
      case 1:{
      if((tlc.anons.toString().equals(path))){
TelaCadastro.imx[DadosCadastrais.k]=TelaCadastro.anon;
          jL_img3.setIcon(TelaCadastro.imx[DadosCadastrais.k]);
dispose();          

//  System.out.println("aloha");
  break;
      }
break;
      }
      
      case 0:
      {
 jL_img3.setIcon(new ImageIcon(TelaCadastro.imx2[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
TelaCadastro.imx[DadosCadastrais.k]=TelaCadastro.imx2[DadosCadastrais.k];

          break;
      }
      
      

      }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
      
      /*
      kk=0;
  }
  else{
  kk=1;
  }
      
  
  switch(kk){
      case 0:{
      if((tlc.anons.toString().equals(path))){
 
dispose();          

//  System.out.println("aloha");
  break;
      }
break;
      }
      
      case 1:
      {
 jL_img3.setIcon(new ImageIcon(TelaCadastro.imx2[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
TelaCadastro.imx[DadosCadastrais.k]=TelaCadastro.imx2[DadosCadastrais.k];

          break;
      }
      
      

      }
  
*/  
  
  
  
  
  
  


//dispose();
//if(TelaCadastro.imx[DadosCadastrais.k].){
//jL_img3.setIcon(new ImageIcon(TelaCadastro.imx[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
//}
//String path=imx[DadosCadastrais.k].toString();
//if((imx[DadosCadastrais.k].toString().equals(path))){
//jL_img3.setIcon(TelaCadastro.imx3[DadosCadastrais.k]));
 //jL_img3.setIcon(new ImageIcon(TelaCadastro.imx3[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
//System.out.println("igual");
//}
//else if(!(imx[DadosCadastrais.k].toString().equals(path))){
//System.out.println("dff");        
  //      }

     
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
  void img2(){
      TelaCadastro tlCad = new TelaCadastro();
         JFileChooser arq = new JFileChooser();
arq.setDialogTitle("escolha uma imagem");
arq.setFileSelectionMode(JFileChooser.FILES_ONLY);

int opt =arq.showOpenDialog(this);
// TODO add your handling code here:
 TelaCadastro.imx2[DadosCadastrais.k]=TelaCadastro.imx[DadosCadastrais.k];
    
if(opt==JFileChooser.APPROVE_OPTION)
    {
    File file = new File("caminho");
    file=arq.getSelectedFile();
    String path=file.getAbsolutePath();
    TelaCadastro.nn=path;
    ImageIcon img = new ImageIcon(file.getPath());
    TelaCadastro.imx[DadosCadastrais.k]= new ImageIcon(file.getPath());
        TelaCadastro.fi=file;
    
    }
  }  
    
  void imging2(){

        jL_img3.setIcon(new ImageIcon(TelaCadastro.imx[DadosCadastrais.k].getImage().getScaledInstance(jL_img3.getWidth(), jL_img3.getHeight(), Image.SCALE_DEFAULT)));    
  
  }
  
  
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
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_img;
    private javax.swing.JComboBox cargo_Atua;
    private javax.swing.JTextField email_Atua;
    private javax.swing.JComboBox habilidade_Atua;
    private javax.swing.JTextField idade_Atua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jL_img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nome_Atua;
    private javax.swing.JButton salvar_Cadastral1;
    private javax.swing.JPasswordField senha_Atua;
    // End of variables declaration//GEN-END:variables
}

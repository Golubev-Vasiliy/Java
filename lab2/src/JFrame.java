import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pathField = new javax.swing.JTextField();
        welcome = new javax.swing.JLabel();
        labelChoose = new javax.swing.JLabel();
        chooseFile = new javax.swing.JButton();
        labelForText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lenghtText = new javax.swing.JButton();
        symbol3 = new javax.swing.JButton();
        changeB_A = new javax.swing.JButton();
        labelLenght = new javax.swing.JLabel();
        labelSym3 = new javax.swing.JLabel();
        labelChange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chooser");

        pathField.setText("Путь://");
        pathField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFieldActionPerformed(evt);
            }
        });

        welcome.setText("Добро пожаловать в программу для считывания txt файлов");

        labelChoose.setText("Выберете файл:");

        chooseFile.setText("Выберети файл");
        chooseFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseFileMouseClicked(evt);
            }
        });

        labelForText.setVisible(false);
        labelForText.setText("Считанный текст:");

        jScrollPane1.setVisible(false);

        textField.setColumns(20);
        textField.setRows(5);
        jScrollPane1.setViewportView(textField);

        jLabel4.setVisible(false);
        jLabel4.setText("Что с ним сделать:");

        lenghtText.setText("Подсчитать длину");
        lenghtText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lenghtTextMouseClicked(evt);
            }
        });

        symbol3.setText("Выделить первые 3 символа");
        symbol3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                symbol3MouseClicked(evt);
            }
        });

        changeB_A.setText("Сменить b на a");
        changeB_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeB_AMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pathField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelChoose)
                            .addComponent(labelForText)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lenghtText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(symbol3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeB_A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSym3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLenght, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelForText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lenghtText)
                    .addComponent(labelLenght, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbol3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSym3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeB_A)
                    .addComponent(labelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pathFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathFieldActionPerformed

    
    private void chooseFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFileMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(chooser);
        filename = chooser.getSelectedFile().getName();
        file = chooser.getSelectedFile();
        try {
            fileReader();
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        pathField.setText(filename);
        labelForText.setVisible(true);
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_chooseFileMouseClicked

    private void lenghtTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lenghtTextMouseClicked
        fileReader = textField.getText();
        labelLenght.setText(Integer.toString(fileReader.length()));
    }//GEN-LAST:event_lenghtTextMouseClicked

    private void symbol3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_symbol3MouseClicked
        fileReader = textField.getText();
        labelSym3.setText(fileReader.substring(0, 3));
    }//GEN-LAST:event_symbol3MouseClicked

    private void changeB_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeB_AMouseClicked
        fileReader = textField.getText();    
        labelChange.setText(fileReader.replace('b', 'a'));
    }//GEN-LAST:event_changeB_AMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeB_A;
    private javax.swing.JButton chooseFile;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelChoose;
    private javax.swing.JLabel labelForText;
    private javax.swing.JLabel labelLenght;
    private javax.swing.JLabel labelSym3;
    private javax.swing.JButton lenghtText;
    private javax.swing.JTextField pathField;
    private javax.swing.JButton symbol3;
    private javax.swing.JTextArea textField;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
    private String filename;
    private File file;
    String fileReader;
            
    public void fileReader() throws IOException {
        
        Scanner text = new Scanner(file, "UTF-8");
        String s = text.nextLine();
        textField.setText(s);
    } 
}

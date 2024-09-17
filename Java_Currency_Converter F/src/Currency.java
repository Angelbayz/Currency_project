
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Currency extends javax.swing.JFrame {

    /**
     * Creates new form Currency
     */
    public Currency() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Convert = new javax.swing.JButton();
        txtFrom = new javax.swing.JComboBox<>();
        txtTo = new javax.swing.JComboBox<>();
        txtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnview = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("CURRENCY"); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 523));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 523));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AMOUNT :");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FROM :");

        txtAmount.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO :");

        Convert.setBackground(new java.awt.Color(255, 255, 0));
        Convert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Convert.setText("CONVERT");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        txtFrom.setBackground(new java.awt.Color(0, 0, 0));
        txtFrom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(255, 255, 255));
        txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "CAD", "PESO", "INDIAN RUPEES", "BD TK" }));
        txtFrom.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtTo.setBackground(new java.awt.Color(0, 0, 0));
        txtTo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTo.setForeground(new java.awt.Color(255, 255, 255));
        txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BD TK", "Indian Rupees", "Peso", "JPY", "CAD", "EUR", "USD" }));
        txtTo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtField.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RESULT :");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESET(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("COLLEGE OF INFORMATION IN COMMUNICATION AND TECHNOLOGY");

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CURRENCY CONVERTER");

        btnview.setBackground(new java.awt.Color(255, 255, 0));
        btnview.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnview.setText("VIEW");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_canadian_dollar_50px_3.png"))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_euro_64px.png"))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_japanese_yen_40px.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_peso_symbol_64px_1.png"))); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_rupee_64px.png"))); // NOI18N

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_us_dollar_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Convert)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnview))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Convert)
                    .addComponent(jButton3)
                    .addComponent(btnview))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 780, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
       
      ImageIcon iconic = new ImageIcon("money.jpg");
        double total = 0;
        
 try{
     
 
        double amount = Double.parseDouble(txtAmount.getText());
        String from = txtFrom.getSelectedItem().toString();
        String to = txtTo.getSelectedItem().toString();
        
    
 
        
        if(from == "USD" && to == "BD TK"){
            total = amount * 117.21;
            txtField.setText("" + total);
        }
        else if(from == "USD" && to == "Indian Rupees"){
            total = amount * 79.54;
            txtField.setText("" + total);
        }
        else if(from == "USD" && to == "Peso"){
            total = amount * 58.09;
            txtField.setText("" + total);
        }

        else if(from == "USD" && to == "CAD"){
            total = amount * 1.37;
            txtField.setText("" + total);
        }
        else if(from == "USD" && to == "EUR"){
            total = amount * 0.92;
            txtField.setText("" + total);
        }
        else if(from == "USD" && to == "JPY"){
            total = amount * 156.50;
            txtField.setText("" + total);
        }

       
        else if(from == "EUR" && to == "BD TK"){
            total = amount * 127.02;
            txtField.setText("" + total);
        }
        else if(from == "EUR" && to == "Indian Rupees"){
            total = amount * 83.93;
            txtField.setText("" + total);
        }
        else if(from == "EUR" && to == "Peso"){
            total = amount * 56.98;
            txtField.setText("" + total);
        }
        else if(from == "EUR" && to == "CAD"){
            total = amount * 1.48;
            txtField.setText("" + total);
        }
        else if(from == "EUR" && to == "JPY"){
            total = amount * 169.55;
            txtField.setText("" + total);
        }
        else if(from == "EUR" && to == "USD"){
            total = amount * 1.08;
            txtField.setText("" + total);
        }
        // FROM JPY TO BD TK, PESO, INDIAN RUPEES,CAD
        else if(from == "JPY" && to == "BD TK"){
            total = amount * 0.75;
            txtField.setText("" + total);
        }
        else if(from == "JPY" && to == "Indian Rupees"){
            total = amount * 0.59;
            txtField.setText("" + total);
        }

        else if(from == "JPY" && to == "Peso"){
            total = amount * 0.38;
            txtField.setText("" + total);
        }
        else if(from == "JPY" && to == "CAD"){
            total = amount * 0.0087;
            txtField.setText("" + total);
        }
        else if(from == "JPY" && to == "EUR"){
            total = amount * 0.0059;
            txtField.setText("" + total);
        }
        else if(from == "JPY" && to == "USD"){
            total = amount * 0.0064;
            txtField.setText("" + total);
        }

        
        else if(from == "CAD" && to == "Peso"){
            total = amount * 42.48;
            txtField.setText("" + total);
        }
        else if(from == "CAD" && to == "JPY"){
            total = amount * 114.44;
            txtField.setText("" + total);
        }
        else if(from == "CAD" && to == "Indian Rupees"){
            total = amount * 60.92;
            txtField.setText("" + total);
        }
        else if(from == "CAD" && to == "BD TK"){
            total = amount * 85.75;
            txtField.setText("" + total);
        }
        else if(from == "CAD" && to == "EUR"){
            total = amount * 0.67;
            txtField.setText("" + total);
        }
        else if(from == "CAD" && to == "USD"){
            total = amount * 0.73;
            txtField.setText("" + total);
        }
        
        else if(from == "PESO" && to == "EUR"){
            total = amount * 0.016;
            txtField.setText("" + total);
        }
        else if(from == "PESO" && to == "USD"){
            total = amount * 0.017;
            txtField.setText("" + total);
        }
        else if(from == "PESO" && to == "CAD"){
            total = amount * 0.024;
            txtField.setText("" + total);
        }
        else if(from == "PESO" && to == "BD TK"){
            total = amount * 2.02;
            txtField.setText("" + total);
        }
        else if(from == "PESO" && to == "INDIAN RUPEES"){
            total = amount * 1.43;
            txtField.setText("" + total);
        }
        else if(from == "PESO" && to == "JPY"){
            total = amount * 2.70;
            txtField.setText("" + total);
        }
        
        else if(from == "BD TK" && to == "EUR"){
            total = amount * 0.0079;
            txtField.setText("" + total);
        }
        else if(from == "BD TK" && to == "CAD"){
            total = amount * 0.012;
            txtField.setText("" + total);
        }
        else if(from == "BD TK" && to == "USD"){
            total = amount * 0.0085;
            txtField.setText("" + total);
        }
        else if(from == "BD TK" && to == "PESO"){
            total = amount * 0.50;
            txtField.setText("" + total);
        }
        else if(from == "BD TK" && to == "JPY"){
            total = amount * 1.34;
            txtField.setText("" + total);
        }
        else if(from == "BD TK" && to == "INDIAN RUPEES"){
            total = amount * 0.71;
            txtField.setText("" + total);
        }
       
        else if(from == "INDIAN RUPEES" && to == "CAD"){
            total = amount * 0.016;
            txtField.setText("" + total);
        }
        else if(from == "INDIAN RUPEES" && to == "EUR"){
            total = amount * 0.011;
            txtField.setText("" + total);
        }
        else if(from == "INDIAN RUPEES" && to == "PESO"){
            total = amount * 0.70;
            txtField.setText("" + total);
        }
        else if(from == "INDIAN RUPEES" && to == "USD"){
            total = amount * 0.012;
            txtField.setText("" + total);
        }
        else if(from == "INDIAN RUPEES" && to == "BD TK"){
            total = amount * 1.41;
            txtField.setText("" + total);
        }
        else if(from == "INDIAN RUPEES" && to == "JPY"){
            total = amount * 1.88;
            txtField.setText("" + total);
        }
        appendToFile("currency_conversion.txt", "Amount: " + amount + ", From: " + from + ", To: " + to + ", Result: " + total);
      
            }catch (NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, " Invalid input! Please enter valid amount. ","Error",JOptionPane.ERROR_MESSAGE, iconic);
            }
    }

        private void appendToFile(String fileName, String content) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
                bw.write(content);
                bw.newLine();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_ConvertActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void RESET(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESET
        // TODO add your handling code here:
        
        txtField.setText("");
        txtAmount.setText("");
    }//GEN-LAST:event_RESET

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
         ImageIcon iconic = new ImageIcon("money.jpg")   ;                               
   try (BufferedReader br = new BufferedReader(new FileReader("currency_conversion.txt"))) {
    String line;
    StringBuilder content = new StringBuilder(); 
    while ((line = br.readLine()) != null) {
        content.append(line).append("\n");
    }
    
    // Display the content in a dialog
    JOptionPane.showMessageDialog(this, content.toString(), "Conversion History", JOptionPane.INFORMATION_MESSAGE, iconic);

} catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnviewActionPerformed

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
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtField;
    private javax.swing.JComboBox<String> txtFrom;
    private javax.swing.JComboBox<String> txtTo;
    // End of variables declaration//GEN-END:variables

    private void textfield1(Currency aThis, String toString, String conversion_History, int INFORMATION_MESSAGE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
MEMBERS AND CONTRIBUTIONS

EARL ANDRI P. PARANDAS- TEAM LEADER 
GYLDINE GUMBAN - MEMBER 2
JEROME SEGURA - MEMBER 3
ANGEL BAY PIO - MEMBER 4
*/


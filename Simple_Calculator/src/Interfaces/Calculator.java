/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author kkawa
 */
public class Calculator extends javax.swing.JFrame {
double num1, num2, result; 
    String op; 
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        Jtxtresults.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Jtxtresults = new javax.swing.JLabel();
        Jbenac = new javax.swing.JButton();
        JbtnDigit7 = new javax.swing.JButton();
        JbtnDigit8 = new javax.swing.JButton();
        JbtnDigit9 = new javax.swing.JButton();
        JbtnDigit00 = new javax.swing.JButton();
        JbtnDigit6 = new javax.swing.JButton();
        JbtnDigit5 = new javax.swing.JButton();
        JbtnDigit4 = new javax.swing.JButton();
        JbtnDigit1 = new javax.swing.JButton();
        JbtnDigit2 = new javax.swing.JButton();
        JbtnDigit3 = new javax.swing.JButton();
        JbtnDot = new javax.swing.JButton();
        JbtnDigit0 = new javax.swing.JButton();
        Jbtndivid = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        Jbtnminus = new javax.swing.JButton();
        Jbtnplus = new javax.swing.JButton();
        JbtnDel = new javax.swing.JButton();
        Jbtnequals = new javax.swing.JButton();

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setText("00");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Jtxtresults.setBackground(new java.awt.Color(255, 255, 255));
        Jtxtresults.setFont(new java.awt.Font("STXinwei", 1, 48)); // NOI18N
        Jtxtresults.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Jtxtresults.setText("0");
        Jtxtresults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Jtxtresults.setOpaque(true);

        Jbenac.setBackground(new java.awt.Color(204, 204, 204));
        Jbenac.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbenac.setText("AC");
        Jbenac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Jbenac.setOpaque(true);
        Jbenac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbenacActionPerformed(evt);
            }
        });

        JbtnDigit7.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit7.setText("7");
        JbtnDigit7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit7ActionPerformed(evt);
            }
        });

        JbtnDigit8.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit8.setText("8");
        JbtnDigit8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit8ActionPerformed(evt);
            }
        });

        JbtnDigit9.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit9.setText("9");
        JbtnDigit9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit9ActionPerformed(evt);
            }
        });

        JbtnDigit00.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit00.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit00.setText("00");
        JbtnDigit00.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit00ActionPerformed(evt);
            }
        });

        JbtnDigit6.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit6.setText("6");
        JbtnDigit6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit6ActionPerformed(evt);
            }
        });

        JbtnDigit5.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit5.setText("5");
        JbtnDigit5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit5ActionPerformed(evt);
            }
        });

        JbtnDigit4.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit4.setText("4");
        JbtnDigit4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit4ActionPerformed(evt);
            }
        });

        JbtnDigit1.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit1.setText("1");
        JbtnDigit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit1ActionPerformed(evt);
            }
        });

        JbtnDigit2.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit2.setText("2");
        JbtnDigit2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit2ActionPerformed(evt);
            }
        });

        JbtnDigit3.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit3.setText("3");
        JbtnDigit3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit3ActionPerformed(evt);
            }
        });

        JbtnDot.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDot.setText(".");
        JbtnDot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDotActionPerformed(evt);
            }
        });

        JbtnDigit0.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDigit0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDigit0.setText("0");
        JbtnDigit0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDigit0ActionPerformed(evt);
            }
        });

        Jbtndivid.setBackground(new java.awt.Color(204, 204, 204));
        Jbtndivid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtndivid.setText("/");
        Jbtndivid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Jbtndivid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtndividActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton16.setText("*");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        Jbtnminus.setBackground(new java.awt.Color(204, 204, 204));
        Jbtnminus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtnminus.setText("-");
        Jbtnminus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnminusActionPerformed(evt);
            }
        });

        Jbtnplus.setBackground(new java.awt.Color(204, 204, 204));
        Jbtnplus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtnplus.setText("+");
        Jbtnplus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnplusActionPerformed(evt);
            }
        });

        JbtnDel.setBackground(new java.awt.Color(204, 204, 204));
        JbtnDel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JbtnDel.setText("DEL");
        JbtnDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        JbtnDel.setOpaque(true);
        JbtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDelActionPerformed(evt);
            }
        });

        Jbtnequals.setBackground(new java.awt.Color(204, 204, 204));
        Jbtnequals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtnequals.setText("=");
        Jbtnequals.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Jbtnequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnequalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jtxtresults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JbtnDigit00, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jbtnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JbtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Jbenac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jbtndivid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jtxtresults, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbenac)
                    .addComponent(JbtnDel)
                    .addComponent(Jbtndivid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbtnDigit00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtnequals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers (String q)
    {
        String nums = Jtxtresults.getText() + q ;
            Jtxtresults.setText(nums);
    }
    
    
    private void JbenacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbenacActionPerformed
         Jtxtresults.setText("");
         
         String Fn ,Sn;
         Fn = String.valueOf(num1);
         Sn = String.valueOf(num2);
         
         Sn = "";
         Fn = "";
    }//GEN-LAST:event_JbenacActionPerformed

    private void JbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit5ActionPerformed
       String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit5.getText()));    
      
            //EnterNumbers("5");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void JbtnDigit00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit00ActionPerformed
      String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit00.getText()));

        //  EnterNumbers("00");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit00ActionPerformed

    private void JbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit0ActionPerformed
        String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit0.getText()));  

        // EnterNumbers("0");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit0ActionPerformed

    private void JbtndividActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtndividActionPerformed
            num1 = Double.parseDouble(Jtxtresults.getText());
            Jtxtresults.setText("");
            op = "/";
           
    }//GEN-LAST:event_JbtndividActionPerformed

    private void JbtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDelActionPerformed
             
        String be = null;
        if(Jtxtresults.getText().length() > 0 )
        {
            StringBuilder sb = new StringBuilder(Jtxtresults.getText());
            sb.deleteCharAt(Jtxtresults.getText().length() - 1);
            be = sb.toString();
            Jtxtresults.setText(be);
        }
    }//GEN-LAST:event_JbtnDelActionPerformed

    private void JbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit7ActionPerformed
      String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit7.getText()));
     // EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit7ActionPerformed

    private void JbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit8ActionPerformed
    String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit8.getText()));       
        //EnterNumbers("8");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit8ActionPerformed

    private void JbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit9ActionPerformed
     //String s =  Jtxtresults.getText();
     //Jtxtresults.setText(s.concat(JbtnDigit9.getText()));


   EnterNumbers("9");     }//GEN-LAST:event_JbtnDigit9ActionPerformed

    private void JbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit4ActionPerformed
          String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit4.getText()));
//EnterNumbes("4");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit4ActionPerformed

    private void JbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit6ActionPerformed
          String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit6.getText()));
           //EnterNumbers("6");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit6ActionPerformed

    private void JbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit1ActionPerformed
         String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit1.getText()));
     //EnterNumbers("1");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit1ActionPerformed

    private void JbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit2ActionPerformed
         String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit2.getText()));
// EnterNumbers("2");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit2ActionPerformed

    private void JbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDigit3ActionPerformed
String s =  Jtxtresults.getText();
     Jtxtresults.setText(s.concat(JbtnDigit3.getText()));        

        //EnterNumbers("3");        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnDigit3ActionPerformed

    private void JbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDotActionPerformed
                 if(! Jtxtresults.getText().contains(".") )
                 {
                     Jtxtresults.setText(Jtxtresults.getText() + JbtnDot.getText());
                 }
    }//GEN-LAST:event_JbtnDotActionPerformed
   
    private void JbtnequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnequalsActionPerformed
        num2 = Double.parseDouble(Jtxtresults.getText());
        if(op =="+")
        {
            result = num1 + num2;
            Jtxtresults.setText(String.valueOf(result));
        }
        else if(op =="-")
        {
            result = num1 - num2;
            Jtxtresults.setText(String.valueOf(result));
        }
         else if(op =="*")
        {
            result = num1 * num2;
            Jtxtresults.setText(String.valueOf(result));
        }
         else if(op =="/")
        {
            result = num1 / num2;
            Jtxtresults.setText(String.valueOf(result));
        }
        
        
    }//GEN-LAST:event_JbtnequalsActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
             num1 = Double.parseDouble(Jtxtresults.getText());
            Jtxtresults.setText("");
            op = "*";        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void JbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnminusActionPerformed
         num1 = Double.parseDouble(Jtxtresults.getText());
            Jtxtresults.setText("");
            op = "-";        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnminusActionPerformed

    private void JbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnplusActionPerformed
             num1 = Double.parseDouble(Jtxtresults.getText());
            Jtxtresults.setText("");
            op = "+";        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnplusActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbenac;
    private javax.swing.JButton JbtnDel;
    private javax.swing.JButton JbtnDigit0;
    private javax.swing.JButton JbtnDigit00;
    private javax.swing.JButton JbtnDigit1;
    private javax.swing.JButton JbtnDigit2;
    private javax.swing.JButton JbtnDigit3;
    private javax.swing.JButton JbtnDigit4;
    private javax.swing.JButton JbtnDigit5;
    private javax.swing.JButton JbtnDigit6;
    private javax.swing.JButton JbtnDigit7;
    private javax.swing.JButton JbtnDigit8;
    private javax.swing.JButton JbtnDigit9;
    private javax.swing.JButton JbtnDot;
    private javax.swing.JButton Jbtndivid;
    private javax.swing.JButton Jbtnequals;
    private javax.swing.JButton Jbtnminus;
    private javax.swing.JButton Jbtnplus;
    private javax.swing.JLabel Jtxtresults;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
} 

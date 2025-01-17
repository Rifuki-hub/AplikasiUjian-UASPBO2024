/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.main;

import controller.NavigationController;
import controller.RegistrationController;
import model.Mahasiswa;

/**
 *
 * @author rifky
 */
public class RegistFrame extends javax.swing.JFrame {

    private RegistrationController registrationController;
    int xx, xy;

    /**
     * Creates new form LoginFrame
     */
    public RegistFrame() {
        registrationController = new RegistrationController();
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

        bgPanel = new javax.swing.JPanel();
        registPanel = new javax.swing.JPanel();
        nimPanel = new javax.swing.JPanel();
        nimField = new javax.swing.JTextField();
        nimIcon = new javax.swing.JLabel();
        namaPanel = new javax.swing.JPanel();
        namaField = new javax.swing.JTextField();
        nimIcon3 = new javax.swing.JLabel();
        kelasPanel = new javax.swing.JPanel();
        kelasField = new javax.swing.JTextField();
        nimIcon4 = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JTextField();
        nimIcon5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setBackground(new java.awt.Color(0, 0, 51));

        registPanel.setBackground(new java.awt.Color(255, 255, 255));
        registPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        nimPanel.setBackground(new java.awt.Color(0, 0, 51));
        nimPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nimField.setBackground(new java.awt.Color(255, 255, 255));
        nimField.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        nimField.setForeground(new java.awt.Color(0, 0, 153));
        nimField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nimField.setText("NIM");
        nimField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nimFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nimFieldFocusLost(evt);
            }
        });

        nimIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserIcon.png"))); // NOI18N

        javax.swing.GroupLayout nimPanelLayout = new javax.swing.GroupLayout(nimPanel);
        nimPanel.setLayout(nimPanelLayout);
        nimPanelLayout.setHorizontalGroup(
            nimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nimPanelLayout.createSequentialGroup()
                .addComponent(nimIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nimField))
        );
        nimPanelLayout.setVerticalGroup(
            nimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nimField)
            .addComponent(nimIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        namaPanel.setBackground(new java.awt.Color(0, 0, 51));
        namaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        namaField.setBackground(new java.awt.Color(255, 255, 255));
        namaField.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        namaField.setForeground(new java.awt.Color(0, 0, 153));
        namaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namaField.setText("NAMA");
        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });

        nimIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserIcon.png"))); // NOI18N

        javax.swing.GroupLayout namaPanelLayout = new javax.swing.GroupLayout(namaPanel);
        namaPanel.setLayout(namaPanelLayout);
        namaPanelLayout.setHorizontalGroup(
            namaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namaPanelLayout.createSequentialGroup()
                .addComponent(nimIcon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaField))
        );
        namaPanelLayout.setVerticalGroup(
            namaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namaField)
            .addComponent(nimIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kelasPanel.setBackground(new java.awt.Color(0, 0, 51));
        kelasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        kelasField.setBackground(new java.awt.Color(255, 255, 255));
        kelasField.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        kelasField.setForeground(new java.awt.Color(0, 0, 153));
        kelasField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kelasField.setText("KELAS");
        kelasField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kelasFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kelasFieldFocusLost(evt);
            }
        });

        nimIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserIcon.png"))); // NOI18N

        javax.swing.GroupLayout kelasPanelLayout = new javax.swing.GroupLayout(kelasPanel);
        kelasPanel.setLayout(kelasPanelLayout);
        kelasPanelLayout.setHorizontalGroup(
            kelasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kelasPanelLayout.createSequentialGroup()
                .addComponent(nimIcon4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kelasField))
        );
        kelasPanelLayout.setVerticalGroup(
            kelasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kelasField)
            .addComponent(nimIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        passwordPanel.setBackground(new java.awt.Color(0, 0, 51));
        passwordPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 153));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("PASSWORD");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        nimIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserIcon.png"))); // NOI18N

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addComponent(nimIcon5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField)
            .addComponent(nimIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MASUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><body>DAFTAR AKUN UAS MAHASISWA POLSTAT STIS</body></html>");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Creator @Muhammad Rifky Hidayatullah_2KS4");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Sudah Punya Akun?");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registPanelLayout = new javax.swing.GroupLayout(registPanel);
        registPanel.setLayout(registPanelLayout);
        registPanelLayout.setHorizontalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(namaPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kelasPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        registPanelLayout.setVerticalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kelasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseIcon.png"))); // NOI18N
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(registPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonClose)
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(registPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void buttonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_buttonCloseMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Mahasiswa mhs = new Mahasiswa();
    mhs.setNim(nimField.getText()); 
    mhs.setNama(namaField.getText()); 
    mhs.setKelas(kelasField.getText()); 
    mhs.setPassword(passwordField.getText());

    registrationController.registerMahasiswa(mhs, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nimFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimFieldFocusGained
        String pass = nimField.getText();
        if (pass.equals("NIM")) {
            nimField.setText("");
        }
    }//GEN-LAST:event_nimFieldFocusGained

    private void nimFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nimFieldFocusLost
        String pass = nimField.getText();
        if (pass.equals("") || pass.equals("NIM")) {
            nimField.setText("NIM");
        }
    }//GEN-LAST:event_nimFieldFocusLost

    private void namaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusGained
        String pass = namaField.getText();
        if (pass.equals("NAMA")) {
            namaField.setText("");
        }
    }//GEN-LAST:event_namaFieldFocusGained

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        String pass = namaField.getText();
        if (pass.equals("") || pass.equals("NAMA")) {
            namaField.setText("NAMA");
        }
    }//GEN-LAST:event_namaFieldFocusLost

    private void kelasFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelasFieldFocusGained
        String pass = kelasField.getText();
        if (pass.equals("KELAS")) {
            kelasField.setText("");
        }
    }//GEN-LAST:event_kelasFieldFocusGained

    private void kelasFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kelasFieldFocusLost
        String pass = kelasField.getText();
        if (pass.equals("") || pass.equals("KELAS")) {
            kelasField.setText("KELAS");
        }
    }//GEN-LAST:event_kelasFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        String pass = passwordField.getText();
        if (pass.equals("PASSWORD")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        String pass = passwordField.getText();
        if (pass.equals("") || pass.equals("PASSWORD")) {
            passwordField.setText("PASSWORD");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        NavigationController.getInstance().showLoginFrame(this);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel buttonClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kelasField;
    private javax.swing.JPanel kelasPanel;
    private javax.swing.JTextField namaField;
    private javax.swing.JPanel namaPanel;
    private javax.swing.JTextField nimField;
    private javax.swing.JLabel nimIcon;
    private javax.swing.JLabel nimIcon3;
    private javax.swing.JLabel nimIcon4;
    private javax.swing.JLabel nimIcon5;
    private javax.swing.JPanel nimPanel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel registPanel;
    // End of variables declaration//GEN-END:variables
}

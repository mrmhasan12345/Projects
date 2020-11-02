/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.convertor.view;

/**
 *
 * @author Pesan
 */
public class Area extends javax.swing.JFrame {

    /**
     * Creates new form Area
     */
    public Area() {
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

        input = new javax.swing.JTextField();
        menu = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        inUnit = new javax.swing.JComboBox<>();
        outUnit = new javax.swing.JComboBox<>();
        output = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Area Converter");
        setLocation(new java.awt.Point(275, 200));
        setMaximizedBounds(new java.awt.Rectangle(275, 200, 275, 200));
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 95, 35));

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        getContentPane().add(convert, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 95, 35));

        title.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Area");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, -1));

        inUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Input Unit", "Square Meters", "Squre Kilometers", "Squre Feet", "Square Miles", "Hectare", "Acres" }));
        getContentPane().add(inUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        outUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Output Unit", "Square Meters", "Squre Kilometers", "Squre Feet", "Square Miles", "Hectare", "Acres" }));
        getContentPane().add(outUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        output.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unit/convertor/view/area.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        // TODO add your handling code here:
        String sInput = input.getText();
        String sInUnit = inUnit.getSelectedItem().toString();
        String sOutUnit = outUnit.getSelectedItem().toString();

        if (sInput.equals("")){
            output.setText("Please Enter a Value to Convert");
        }
        else {
            if (sInUnit=="Square Centimeters"){
                if (sOutUnit=="Square Centimeters"){
                    double sqcm2sqcm = Double.parseDouble(sInput);
                    output.setText(Double.toString(sqcm2sqcm));
                }
                else if (sOutUnit=="Squre Meters"){
                    double sqcm2sqm = Double.parseDouble(sInput)/10000;
                    output.setText(Double.toString(sqcm2sqm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double sqcm2sqkm = Double.parseDouble(sInput)/10000/1000000;
                    output.setText(Double.toString(sqcm2sqkm));
                }
                else if (sOutUnit=="Square Feet"){
                    double sqcm2sqft = Double.parseDouble(sInput)/900;
                    output.setText(Double.toString(sqcm2sqft));

                }
                else if (sOutUnit=="Square Miles"){
                    double sqcm2sqmi = Double.parseDouble(sInput)*0.000000000038610;
                    output.setText(Double.toString(sqcm2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double sqcm2ha = Double.parseDouble(sInput)/100000000;
                    output.setText(Double.toString(sqcm2ha));
                }
                else if (sOutUnit=="Acres"){
                    double sqcm2ac = Double.parseDouble(sInput)*0.000000024711;
                    output.setText(Double.toString(sqcm2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Square Meters"){
                if (sOutUnit=="Square Centimeters"){
                    double sqm2sqcm = Double.parseDouble(sInput)*10000;
                    output.setText(Double.toString(sqm2sqcm));
                }
                else if (sOutUnit=="Squre Meters"){
                    double sqm2sqm = Double.parseDouble(sInput);
                    output.setText(Double.toString(sqm2sqm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double sqm2sqkm = Double.parseDouble(sInput)/1000000;
                    output.setText(Double.toString(sqm2sqkm));
                }
                else if (sOutUnit=="Square Feet"){
                    double sqm2sqft = Double.parseDouble(sInput)*10000/900;
                    output.setText(Double.toString(sqm2sqft));

                }
                else if (sOutUnit=="Square Miles"){
                    double sqm2sqmi = Double.parseDouble(sInput)*0.00000038610;
                    output.setText(Double.toString(sqm2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double sqm2ha = Double.parseDouble(sInput)/10000;
                    output.setText(Double.toString(sqm2ha));
                }
                else if (sOutUnit=="Acres"){
                    double sqm2ac = Double.parseDouble(sInput)*0.00024711;
                    output.setText(Double.toString(sqm2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Square Kilometers"){
                if (sOutUnit=="Square Centimeters"){
                    double sqkm2sqcm = Double.parseDouble(sInput)*100000*100000;
                    output.setText(Double.toString(sqkm2sqcm));
                }
                else if (sOutUnit=="Square Meters"){
                    double sqkm2sqm = Double.parseDouble(sInput)*1000000;
                    output.setText(Double.toString(sqkm2sqm));
                }
                else if (sOutUnit=="Square Meters"){
                    double sqkm2sqkm = Double.parseDouble(sInput);
                    output.setText(Double.toString(sqkm2sqkm));

                }
                else if (sOutUnit=="Square Feet"){
                    double sqkm2sqft = Double.parseDouble(sInput)*100000*100000/30/30;
                    output.setText(Double.toString(sqkm2sqft));
                }
                else if (sOutUnit=="Square Miles"){
                    double sqkm2sqmi = Double.parseDouble(sInput)*0.38610;
                    output.setText(Double.toString(sqkm2sqmi));
                }
                else if (sOutUnit=="Hectare"){
                    double sqkm2ha = Double.parseDouble(sInput)*100;
                    output.setText(Double.toString(sqkm2ha));
                }
                else if (sOutUnit=="Acres") {
                    double sqkm2ac = Double.parseDouble(sInput)*247.105;
                    output.setText(Double.toString(sqkm2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Square Feet"){
                if (sOutUnit=="Square Centimeters"){
                    double sqft2sqcm = Double.parseDouble(sInput)*900;
                    output.setText(Double.toString(sqft2sqcm));
                }
                else if (sOutUnit=="Square Meters"){
                    double sqft2sqm = Double.parseDouble(sInput)*0.092903;
                    output.setText(Double.toString(sqft2sqm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double sqft2sqkm = Double.parseDouble(sInput)/10764000;
                    output.setText(Double.toString(sqft2sqkm));

                }
                else if (sOutUnit=="Square Feet"){
                    double sqft2sqft = Double.parseDouble(sInput);
                    output.setText(Double.toString(sqft2sqft));
                }
                else if (sOutUnit=="Square Miles"){
                    double sqft2sqmi = Double.parseDouble(sInput)*0.000000035870;
                    output.setText(Double.toString(sqft2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double sqft2ha = Double.parseDouble(sInput)/107640;
                    output.setText(Double.toString(sqft2ha));
                }
                else if (sOutUnit=="Acres"){
                    double sqft2ac = Double.parseDouble(sInput)*0.000022957;
                    output.setText(Double.toString(sqft2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Square Miles"){
                if (sOutUnit=="Square Centimeters"){
                    double sqmi2sqcm = Double.parseDouble(sInput)/0.000000000038610;
                    output.setText(Double.toString(sqmi2sqcm));
                }
                else if (sOutUnit=="Square Meters"){
                    double sqmi2sqm = Double.parseDouble(sInput)/0.00000038610;
                    output.setText(Double.toString(sqmi2sqm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double sqmi2sqkm = Double.parseDouble(sInput)*2.58999;
                    output.setText(Double.toString(sqmi2sqkm));

                }
                else if (sOutUnit=="Square Feet"){
                    double sqmi2sqft = Double.parseDouble(sInput)*27878000;
                    output.setText(Double.toString(sqmi2sqft));
                }
                else if (sOutUnit=="Square Miles"){
                    double sqmi2sqmi = Double.parseDouble(sInput);
                    output.setText(Double.toString(sqmi2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double sqmi2ha = Double.parseDouble(sInput)/0.0038610;
                    output.setText(Double.toString(sqmi2ha));
                }
                else if (sOutUnit=="Acres"){
                    double sqmi2ac = Double.parseDouble(sInput)*640;
                    output.setText(Double.toString(sqmi2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Hectares"){
                if (sOutUnit=="Square Centimeters"){
                    double ha2sqcm = Double.parseDouble(sInput)*100000000;
                    output.setText(Double.toString(ha2sqcm));
                }
                else if (sOutUnit=="Square Meters"){
                    double ha2sqm = Double.parseDouble(sInput)*10000;
                    output.setText(Double.toString(ha2sqm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double ha2sqkm = Double.parseDouble(sInput)/100;
                    output.setText(Double.toString(ha2sqkm));

                }
                else if (sOutUnit=="Square Feet"){
                    double ha2sqft = Double.parseDouble(sInput)*107639;
                    output.setText(Double.toString(ha2sqft));
                }
                else if (sOutUnit=="Square Miles"){
                    double ha2sqmi = Double.parseDouble(sInput)*0.00386102;
                    output.setText(Double.toString(ha2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double ha2ha = Double.parseDouble(sInput);
                    output.setText(Double.toString(ha2ha));
                }
                else if (sOutUnit=="Acres"){
                    double ha2ac = Double.parseDouble(sInput)*2.47105;
                    output.setText(Double.toString(ha2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }

            else if (sInUnit=="Acres"){
                if (sOutUnit=="Square Centimeters"){
                    double ac2sqcm = Double.parseDouble(sInput)*40470000;
                    output.setText(Double.toString(ac2sqcm));
                }
                else if (sOutUnit=="Square Meters"){
                    double ac2sqcm = Double.parseDouble(sInput)*4046.86;
                    output.setText(Double.toString(ac2sqcm));
                }
                else if (sOutUnit=="Square Kilometers"){
                    double ac2sqkm = Double.parseDouble(sInput)*0.00404686;
                    output.setText(Double.toString(ac2sqkm));

                }
                else if (sOutUnit=="Square Feet"){
                    double ac2sqft = Double.parseDouble(sInput)*43560;
                    output.setText(Double.toString(ac2sqft));
                }
                else if (sOutUnit=="Square Miles"){
                    double ac2sqmi = Double.parseDouble(sInput)*0.0015625;
                    output.setText(Double.toString(ac2sqmi));
                }
                else if (sOutUnit=="Hectares"){
                    double ac2ha = Double.parseDouble(sInput)*0.404686;
                    output.setText(Double.toString(ac2ha));
                }
                else if (sOutUnit=="Acres"){
                    double ac2ac = Double.parseDouble(sInput);
                    output.setText(Double.toString(ac2ac));
                }

                else {
                    output.setText("Please Select an Output Unit");
                }
            }
            else {
                output.setText("Please Select an Input Unit");
            }
        }
    }//GEN-LAST:event_convertActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> inUnit;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu;
    private javax.swing.JComboBox<String> outUnit;
    private javax.swing.JLabel output;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
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
public class Weight extends javax.swing.JFrame {

    /**
     * Creates new form Weight
     */
    public Weight() {
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

        Woutput = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        menu = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        inUnit = new javax.swing.JComboBox<>();
        outUnit = new javax.swing.JComboBox<>();
        output = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weight Converter");
        setLocation(new java.awt.Point(275, 200));
        setMaximizedBounds(new java.awt.Rectangle(275, 200, 275, 200));
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Woutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 251, -1, -1));
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 148, 120, -1));

        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 340, 95, 35));

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        getContentPane().add(convert, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 223, 95, 35));

        title.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Weight");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, -1));

        inUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Input Unit", "Milligrams", "Grams", "Kilograms", "Tonnes", "Pounds", "Ounces" }));
        getContentPane().add(inUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 148, -1, -1));

        outUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Output Unit", "Milligrams", "Grams", "Kilograms", "Tonnes", "Pounds", "Ounces" }));
        getContentPane().add(outUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        output.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        output.setForeground(new java.awt.Color(255, 255, 255));
        output.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(output, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unit/convertor/view/weight.jpg"))); // NOI18N
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

        if (sInUnit=="Milligrams"){
            if (sOutUnit=="Milligrams"){
                double mg2mg = Double.parseDouble(sInput);
                output.setText(Double.toString(mg2mg));
            }
            else if (sOutUnit=="Grams"){
                double mg2g = Double.parseDouble(sInput)/1000;
                output.setText(Double.toString(mg2g));
            }
            else if (sOutUnit=="Kilograms"){
                double mg2kg = Double.parseDouble(sInput)/1000000;
                output.setText(Double.toString(mg2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double mg2t = Double.parseDouble(sInput)/1000000000;
                output.setText(Double.toString(mg2t));
            }
            else if (sOutUnit=="Pounds"){
                double mg2p = Double.parseDouble(sInput)*0.0000022046;
                output.setText(Double.toString(mg2p));
            }
            else if (sOutUnit=="Ounces"){
                double mg2o = Double.parseDouble(sInput)*0.000035274;
                output.setText(Double.toString(mg2o));
            }
                      
           
            else {
                output.setText("Please Select an Output Unit");
            }
        }
        
        else if (sInUnit=="Grams"){
            if (sOutUnit=="Milligrams"){
                double g2mg = Double.parseDouble(sInput)*1000;
                output.setText(Double.toString(g2mg));
            }
            else if (sOutUnit=="Grams"){
                double g2g = Double.parseDouble(sInput);
                output.setText(Double.toString(g2g));
            }
            else if (sOutUnit=="Kilograms"){
                double g2kg = Double.parseDouble(sInput)/1000;
                output.setText(Double.toString(g2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double g2t = Double.parseDouble(sInput)/1000000;
                output.setText(Double.toString(g2t));
            }
            else if (sOutUnit=="Pounds"){
                double g2p = Double.parseDouble(sInput)*0.0022046;
                output.setText(Double.toString(g2p));
            }
            else if (sOutUnit=="Ounces"){
                double g2o = Double.parseDouble(sInput)*0.035274;
                output.setText(Double.toString(g2o));
            }
                      
           
            else {
                output.setText("Please Select an Output Unit");
            }
        }
        
        else if (sInUnit=="Kilograms"){
            if (sOutUnit=="Milligrams"){
                double kg2mg = Double.parseDouble(sInput)*1000000;
                output.setText(Double.toString(kg2mg));
            }
            else if (sOutUnit=="Grams"){
                double kg2g = Double.parseDouble(sInput)*1000;
                output.setText(Double.toString(kg2g));
            }
            else if (sOutUnit=="Kilograms"){
                double kg2kg = Double.parseDouble(sInput);
                output.setText(Double.toString(kg2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double kg2t = Double.parseDouble(sInput)/1000;
                output.setText(Double.toString(kg2t));
            }
            else if (sOutUnit=="Pounds"){
                double kg2p = Double.parseDouble(sInput)*2.2046;
                output.setText(Double.toString(kg2p));
            }
            else if (sOutUnit=="Ounces"){
                double kg2o = Double.parseDouble(sInput)*35.274;
                output.setText(Double.toString(kg2o));
            }
                      
            else {
                output.setText("Please Select an Output Unit");
            }
        }
        
        else if (sInUnit=="Tonnes"){
            if (sOutUnit=="Milligrams"){
                double t2mg = Double.parseDouble(sInput)*1000000000;
                output.setText(Double.toString(t2mg));
            }
            else if (sOutUnit=="Grams"){
                double t2g = Double.parseDouble(sInput)*1000000;
                output.setText(Double.toString(t2g));
            }
            else if (sOutUnit=="Kilograms"){
                double t2kg = Double.parseDouble(sInput)*1000;
                output.setText(Double.toString(t2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double t2t = Double.parseDouble(sInput);
                output.setText(Double.toString(t2t));
            }
            else if (sOutUnit=="Pounds"){
                double t2p = Double.parseDouble(sInput)*2204.6;
                output.setText(Double.toString(t2p));
            }
            else if (sOutUnit=="Ounces"){
                double t2o = Double.parseDouble(sInput)*35274;
                output.setText(Double.toString(t2o));
            }
                      
            else {
                output.setText("Please Select an Output Unit");
            }
        }
        
        else if (sInUnit=="Pounds"){
            if (sOutUnit=="Milligrams"){
                double p2mg = Double.parseDouble(sInput)/0.0000022046;
                output.setText(Double.toString(p2mg));
            }
            else if (sOutUnit=="Grams"){
                double p2g = Double.parseDouble(sInput)/0.0022046;
                output.setText(Double.toString(p2g));
            }
            else if (sOutUnit=="Kilograms"){
                double p2kg = Double.parseDouble(sInput)/2.2046;
                output.setText(Double.toString(p2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double p2t = Double.parseDouble(sInput)/2204.6;
                output.setText(Double.toString(p2t));
            }
            else if (sOutUnit=="Pounds"){
                double p2p = Double.parseDouble(sInput);
                output.setText(Double.toString(p2p));
            }
            else if (sOutUnit=="Ounces"){
                double p2o = Double.parseDouble(sInput)*16;
                output.setText(Double.toString(p2o));
            }
                      
            else {
                output.setText("Please Select an Output Unit");
            }
        }
        
        else if (sInUnit=="Ounces"){
            if (sOutUnit=="Milligrams"){
                double o2mg = Double.parseDouble(sInput)/0.000035274;
                output.setText(Double.toString(o2mg));
            }
            else if (sOutUnit=="Grams"){
                double o2g = Double.parseDouble(sInput)/0.035274;
                output.setText(Double.toString(o2g));
            }
            else if (sOutUnit=="Kilograms"){
                double o2kg = Double.parseDouble(sInput)/35.274;
                output.setText(Double.toString(o2kg));

            }
            else if (sOutUnit=="Tonnes"){
                double o2t = Double.parseDouble(sInput)/35274;
                output.setText(Double.toString(o2t));
            }
            else if (sOutUnit=="Pounds"){
                double p2p = Double.parseDouble(sInput)*0.062500;
                output.setText(Double.toString(p2p));
            }
            else if (sOutUnit=="Ounces"){
                double o2o = Double.parseDouble(sInput);
                output.setText(Double.toString(o2o));
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
            java.util.logging.Logger.getLogger(Weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Woutput;
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

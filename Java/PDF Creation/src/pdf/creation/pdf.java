/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf.creation;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RFSSSFH
 */
public class pdf extends javax.swing.JFrame {
    
    Statement stm;
    Connection con;
    ResultSet RS;

    /**
     * Creates new form pdf
     */
    public pdf() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy?useSSL=false","root","");
            stm=con.createStatement();
            
            
            
            initComponents();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl_name = new javax.swing.JComboBox<>();
        btn_pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_pdf.setText("Generate PDF");
        btn_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pdf)
                    .addComponent(tbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(tbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btn_pdf)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ResultSet filcell() throws SQLException{
        
        ResultSet R = null;
        
        String sql="SELECT * FROM genetic";
        R=stm.executeQuery(sql);        
      return R;  
    }
    
    
    private void btn_pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pdfActionPerformed
        
        
        try { 
            
            String sql="SELECT * FROM genetic";
            RS=stm.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Document hasan= new Document(PageSize.A4,56.6929f,28.3465f,28.3465f,28.3465f);
        try {
            try {
                PdfWriter hspdf=PdfWriter.getInstance(hasan, new FileOutputStream("hasan.pdf"));
                hasan.open();
                
         //       hasan.setPageSize();
                hasan.setMargins(200,100,100,150);
                
                hasan.add(new Paragraph("Alahamdhulilla did it.............."));
                
                PdfPTable tbl=new PdfPTable(3);
                
                tbl.setWidthPercentage(105);
                tbl.setSpacingBefore(11f);
                tbl.setSpacingAfter(11f);
                float[] clWidth={2f,2f,2f};
                tbl.setWidths(clWidth);
                
                PdfPCell c1=new PdfPCell();
                PdfPCell c2=new PdfPCell();
                
                while(RS.next()){
                c1.addElement(new Paragraph(""+RS.getString("Genetic_Name")+""));
                c2.addElement(new Paragraph(""+RS.getString("Genetic_Id")+""));
                }
                RS.close();
                
                PdfPCell c3=new PdfPCell(new Paragraph("Sajidha"));
                PdfPCell c4=new PdfPCell(new Paragraph("Shakira"));
                PdfPCell c5=new PdfPCell(new Paragraph("Shafira"));
                PdfPCell c6=new PdfPCell(new Paragraph("Fathima"));
                PdfPCell c7=new PdfPCell(new Paragraph("Hasan"));
                
                tbl.addCell(c1);
                tbl.addCell(c2);
                tbl.addCell(c3);
                tbl.addCell(c4);
                tbl.addCell(c5);
                tbl.addCell(c6);
                tbl.addCell(c7);
               
                hasan.add(tbl);
                
                hasan.close();
                
                
            } catch (FileNotFoundException | SQLException ex) {
                Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (DocumentException ex) {
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_pdfActionPerformed

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
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pdf;
    private javax.swing.JComboBox<String> tbl_name;
    // End of variables declaration//GEN-END:variables
}

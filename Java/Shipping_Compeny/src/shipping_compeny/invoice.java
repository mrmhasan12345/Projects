/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipping_compeny;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author RFSSSFH
 */
public class invoice {
    
   
    
    public void createINV(int id) throws DocumentException, ClassNotFoundException, SQLException, BadElementException{
        
        try {
            
               Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/thasneema?useSSL=false","root","");
                Statement stm=con.createStatement();
                String slc="SELECT ord.O_Id,staff.Staff_Name,customer.C_Name,item.I_Name,item.I_Selling_Price,ord.O_Qnty,ord.O_amount FROM staff,customer,item,ord WHERE customer.C_Id=ord.C_Id AND staff.Staff_Id=ord.Staff_Id AND item.I_Id=ord.I_Id AND ord.O_Id='"+id+"'";
                ResultSet RS=stm.executeQuery(slc);
                RS.next();
                
                String invid="INV"+getDate()+RS.getString("O_Id");
                
            Document thas= new Document(PageSize.A4,56.6929f,28.3465f,28.3465f,28.3465f);
            
            PdfWriter hspdf=PdfWriter.getInstance(thas, new FileOutputStream(invid+".pdf"));
            

            thas.open();
            
                        
            Paragraph title=new Paragraph("Auto Parts....",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.BOLDITALIC,BaseColor.DARK_GRAY));
            title.setAlignment(Element.ALIGN_CENTER);
            thas.add(title);
            
            
            Paragraph address=new Paragraph();
            address.add("\nThasneema");
            address.add("\nthasnim1304@gmail.com");
            address.add("\n0772566547");
            address.setAlignment(Element.ALIGN_RIGHT);
            thas.add(address);
            
            
            
            Paragraph date=new Paragraph();
            date.add("Date\t\t:"+new Date().toString()+"\n");
            date.add("Order Id\t\t:"+id+"\n");
            date.add("Invoice Id\t\t:INV"+getDate()+id+"\n");
            date.add("Customer Name\t\t:"+RS.getString("C_Name")+"\n");
            date.add("\nSeller Name\t\t:"+RS.getString("Staff_Name")+"\n\n\n");
            date.setAlignment(Element.ALIGN_LEFT);
            thas.add(date);   
                  
            
            PdfPTable tbl=new PdfPTable(3);
            
            tbl.setWidths(new float[] { 3, 1 ,1});
            
            tbl.setSpacingBefore(11f);
            tbl.setSpacingAfter(11f);
            
            
            PdfPCell tbl_tit=new PdfPCell(new Paragraph("Orders",FontFactory.getFont(FontFactory.TIMES_ROMAN,16,Font.ITALIC,BaseColor.DARK_GRAY)));
            tbl_tit.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl_tit.setBackgroundColor(BaseColor.LIGHT_GRAY);
            tbl_tit.setColspan(3);
            tbl.addCell(tbl_tit);
            
            PdfPCell c1=new PdfPCell();
            c1.setFixedHeight(100f);
            PdfPCell c2=new PdfPCell();
            c2.setFixedHeight(100f);
            PdfPCell c3=new PdfPCell();
            c2.setFixedHeight(100f);
          
          PdfPCell c4=new PdfPCell(new Paragraph("Item Name"));
          PdfPCell c5=new PdfPCell(new Paragraph("Quantity"));
          PdfPCell c6=new PdfPCell(new Paragraph("Price per Item"));
          PdfPCell c7=new PdfPCell(new Paragraph("Total amount"));
          PdfPCell c8=new PdfPCell(new Paragraph(""+RS.getString("O_amount")+""));
          c8.setColspan(2);
          
         RS.previous();
            while(RS.next()){
            c1.addElement(new Paragraph(""+RS.getString("I_Name")+""));
            c2.addElement(new Paragraph(""+RS.getString("O_Qnty")+""));
            c3.addElement(new Paragraph(""+RS.getString("I_Selling_Price")+""));
            }        
            
     
            
            tbl.addCell(c4);
            tbl.addCell(c5);
            tbl.addCell(c6);
            tbl.addCell(c1);
            tbl.addCell(c2);
            tbl.addCell(c3);
            tbl.addCell(c7);
            tbl.addCell(c8);
            
            thas.add(tbl);
            
                      
            
            Paragraph sign=new Paragraph();
            sign.add("\n--------------------");
            sign.add("\nSignature");
            sign.setAlignment(Element.ALIGN_RIGHT);
            thas.add(sign);
            
            
            thas.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Your Invoice "+invid+".pdf has been created");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(invoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
               

}
        public String getDate(){
    
        Date tdy=new Date();
        SimpleDateFormat dtformat=new SimpleDateFormat("yymmdd");
        return dtformat.format(tdy);

    }
   
}

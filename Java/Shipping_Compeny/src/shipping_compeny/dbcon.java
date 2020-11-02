/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipping_compeny;

/**
 *
 * @author RFSSSFH
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class dbcon {
    
    /**
     *
     */
    Connection con;
    Statement stm;
    ResultSet res;
    
    public dbcon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/thasneema?useSSL=false","root","");
        stm = con.createStatement();
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
            
            }
} 
    
    /**
     *
     * @param Table
     * @param name
     * @param address
     * @param mobile
     * @param email
     * @param f_name
     * @param f_address
     * @param f_mobile
     * @param f_email
     * @throws SQLException
     */
    public void add_staff_cust_sup(String Table,String name,String address,String mobile,String email,String f_name,String f_address,String f_mobile,String f_email) throws SQLException{
        
        String thas="INSERT INTO "+Table+"("+f_name+","+f_address+","+f_mobile+","+f_email+") VALUES('"+name+"','"+address+"','"+mobile+"','"+email+"')";
        stm.executeUpdate(thas);
        JOptionPane.showMessageDialog(null,"Data's were added Succesfully");
        
    }
    
    public void del_staff_cust_sup(String Table,String f_id,String id) throws SQLException{
    
        int y=JOptionPane.showConfirmDialog(null,"Do you want to delete?","Conform delete",JOptionPane.YES_NO_OPTION);
        
     //   System.out.println("Value is="+y);
        
        if(y==0){
        String del="DELETE FROM "+Table+" WHERE "+f_id+"='"+id+"'";
        stm.executeUpdate(del);
        
        }
    }
    
        public void upd_staff_cust_sup(String Table,String id,String name,String address,String mobile,String email,String f_id,String f_name,String f_address,String f_mobile,String f_email) throws SQLException{
    
        
        String upd="UPDATE "+Table+" SET "+f_name+"='"+name+"',"+f_address+"='"+address+"',"+f_mobile+"='"+mobile+"', "+f_email+"='"+email+"' WHERE "+f_id+"='"+id+"'";
        stm.executeUpdate(upd);
       
        
    }

    
}

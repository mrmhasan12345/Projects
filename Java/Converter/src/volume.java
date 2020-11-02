import java.awt.*;
import javax.swing.*;

public class volume{
Double n1, r;
final int r1=1000;
String n2;



public volume(JTextField txt1, JTextField txt2, String x, String y){
 n1= Double.parseDouble(txt1.getText());
 
	 if(x.equals(y)){
			 n2=Double.toString(n1);
			 txt2.setText(n2);
			 
	 
	 }else if (x.equals("cubic meter")&& y.equals("cubic decimeter")){
			 r=n1*r1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
	  
	 }else if (x.equals("cubic meter") && y.equals("liter")){
			 r=n1*r1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
	 
	 }else if (x.equals("liter")&& y.equals("cubic meter")){
			 r=n1/r1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
			  
	 }else if (x.equals("liter") && y.equals("cubic decimeter")){
			 r=n1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
	 
	 }else if (x.equals("cubic decimeter") && y.equals("liter")){
			 r=n1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
			 
	 
	  
	 }else{
	 
			 r=n1/r1;
			 n2=Double.toString(r);
			 txt2.setText(n2);
			  
	 
	 
	 
	 }
	 
	 
	 }

}


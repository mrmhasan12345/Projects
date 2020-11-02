import java.awt.*;
import javax.swing.*;

public class weight{
Double n1, r;
final float r1=0.454f;
final int r2=16;
final float r3=35.274f; 
final float  r4= 0.0625f;
final float r5= 0.0283f;
String n2;

public weight(JTextField txt1, JTextField txt2, String x, String y){
 n1= Double.parseDouble(txt1.getText());
 
	 if(x.equals(y)){
		 n2=Double.toString(n1);
		 txt2.setText(n2);
	 
	 
	 }else if (x.equals("pound")&& y.equals("kilogram")){
		 r=n1*r1;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else if (x.equals("pound") && y.equals("ounce")){
		 r=n1*r2;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("kilogram")&& y.equals("pounds")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
		  
	 }else if (x.equals("kilogram") && y.equals("ounce")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
		 
	 }else if (x.equals("ounce")&& y.equals("pounds")){
		 r=n1*r4;
		 n2=Double.toString(r);
		 txt2.setText(n2);
		  
	 }else{
	 
		 r=n1*r5;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 
	 
	 
	 }
	 }

}


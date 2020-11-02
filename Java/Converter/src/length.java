import java.awt.*;
import javax.swing.*;

public class length{
Double n1, r;
final float r1=0.001f;
final float r2=0.000621f;
String n2;
final int r3=1000; 

public length(JTextField txt1, JTextField txt2, String x, String y){
	 n1= Double.parseDouble(txt1.getText());
	 
	 if(x.equals(y)){
		 n2=Double.toString(n1);
		 txt2.setText(n2);
		 
	 
	 }else if (x.equals("meter")&& y.equals("kilometer")){
		 r=n1*r1;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else if (x.equals("meter") && y.equals("miles")){
		 r=n1*r2;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("kilometer")&& y.equals("meter")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else if (x.equals("kilometer") && y.equals("miles")){
		 r=n1*r2*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("mile")&& y.equals("meter")){
		 r=n1/r2;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else{
	 
		 r=n1/(r2*r3);
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 }
}

}


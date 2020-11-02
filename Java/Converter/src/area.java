import java.awt.*;
import javax.swing.*;

public class area{
Double n1, r;
final float r1=0.00253f;
final float r2=39.9999997786f; 
final float r3= 0.00625f;
final float r4= 2.471f;
final float r5=0.10117141f;
final float r6=395.369f;
int r7=160;
final float r8=0.405f;
final float r9=159.999359335f;
final float r10=1.27272727273f;
final float r11=0.00253f;
String n2;


public area(JTextField txt1, JTextField txt2, String x, String y){
 n1= Double.parseDouble(txt1.getText());
 
	 if(x.equals(y)){
		 n2=Double.toString(n1);
		 txt2.setText(n2);
		 
	 
	 }else if (x.equals("perch")&& y.equals("hectare")){
		 r=n1*r1;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else if (x.equals("perch") && y.equals("rood")){
		 r=n1*r10;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("perch")&& y.equals("acre")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  
	 }else if (x.equals("hectare") && y.equals("perch")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("hectare") && y.equals("rood")){
		 r=n1/r5;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	  }else if (x.equals("hectare") && y.equals("acre")){
		 r=n1*r4;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("rood")&& y.equals("perch")){
		 r=n1/r10;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	  }else if (x.equals("rood") && y.equals("hectare")){
		 r=n1*r11;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("rood")&& y.equals("acre")){
		 r=n1*r3;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	  }else if (x.equals("acre") && y.equals("perch")){
		 r=n1*r7;
		 n2=Double.toString(r);
		 txt2.setText(n2);
	 
	 }else if (x.equals("acre")&& y.equals("hectare")){
		 r=n1*r8;
		 n2=Double.toString(r);
		 txt2.setText(n2);
		 
	  
	 }else{
	 
		 r=n1*r10;
		 n2=Double.toString(r);
		 txt2.setText(n2);
		  }
 }

}


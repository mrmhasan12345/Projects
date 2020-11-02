import java.awt.*;
import javax.swing.*;

public class temperature {

	Double n1,r;
	final float K = 273.15f;
	String n2;
	
	public temperature(JTextField txt1, JTextField txt2, String x,String y){
		
		n1= Double.parseDouble(txt1.getText());
		
		if(x.equals(y)){
			n2 = Double.toString(n1);
			txt2.setText(n2);
			
		}else if(x.equals("Fahrenheit") && y.equals("Celcius")){
			
			r = (n1-32)*(5/9);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}else if(x.equals("Fahrenheit") && y.equals("Kelvin")){
			
			r = ((n1-32)*(5/9)+K);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}else if(x.equals("Celcius") && y.equals("Fahrenheit")){
			
			r = ((9/5)*n1+32);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}else if(x.equals("Celcius") && y.equals("Kelvin")){
			
			r = (n1+K);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}else if(x.equals("Kelvin") && y.equals("Fahrenheit")){
			
			r = ((9/5)*(n1-K)+32);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}else{
			
			r = (n1-K);
			n2 = Double.toString(r);
			txt2.setText(n2);
			
		}
		
	}
}

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class aboutpro extends JFrame{

	private JFrame fr;
	private JPanel pn;
	private JLabel lbl;
	private JButton btn;
	
	public aboutpro(){
		
		fr = new JFrame();
		fr.setLayout(new FlowLayout());
		fr.setVisible(true);
		fr.setSize(500,300);
		fr.setResizable(false);
		fr.setTitle("About Project");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("ti.PNG"));
		fr.setIconImage(img7);
		
		pn= new JPanel(new GridBagLayout());
		fr.add(pn);
		pn.setSize(400, 400);
		
		lbl = new JLabel("<HTML>Our group number is 05<br>we did this project as our first year final project.<br>we learnt so many things about graphical user interface.<br>To finish this project we spent about 3 weeks and we hope we did our maximum.<br>Madam thank you very much from your lectures we learnt lot of things about java.<br>At the begining of this course we don't know anythig about java now we know<br> somthing about java.<br>We all never forget you madam thank you so much.</HTML>");
		
		GridBagConstraints d3 = new GridBagConstraints();
		d3.insets = new Insets(10,10,10,10);
		
		d3.gridx=2;
		d3.gridy=0;
		pn.add(lbl,d3);
		lbl.setSize(200, 200);
		
		d3.gridx=2;
		d3.gridy=1;
		btn = new JButton("Back");
		pn.add(btn,d3);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				fr.dispose();
				new frame();
			
			}
		});
		
	}
	

}

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class group extends JFrame{

	private JFrame fr;
	private JPanel pn;
	private JLabel lbl;
	private JButton btn;
	
	public group(){
		
		fr = new JFrame();
		fr.setLayout(new FlowLayout());
		fr.setVisible(true);
		fr.setSize(300,300);
		fr.setResizable(false);
		fr.setTitle("Group Members");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("ti.PNG"));
		fr.setIconImage(img7);
		
		pn= new JPanel(new GridBagLayout());
		fr.add(pn);
		pn.setSize(400, 400);
		
		lbl = new JLabel("<Html>Group Members : <br><&#09<&#09 Group number:05 <br><&#09<&#09 01)Name - M.A.M Fazmina. <br><&#160<&#160<&#160 Index no- 12754 <br>02)Name - A.F Aroosiya. <br><&#160<&#160<&#160 Index no- 12854 <br> 03)Name - M.M.F Shafna. <br><&#160<&#160<&#160 Index no- 12823 <br>04)Name - S.H.F Rafa. <br><&#160<&#160<&#160 Index no- 12806 </html>");
		
		GridBagConstraints d3 = new GridBagConstraints();
		d3.insets = new Insets(10,10,10,10);
		
		d3.gridx=2;
		d3.gridy=0;
		pn.add(lbl,d3);
		lbl.setSize(400, 400);
		
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

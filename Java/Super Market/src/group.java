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
		fr.setSize(300,350);
		fr.setResizable(false);
		fr.setTitle("Group Members");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		pn= new JPanel(new GridBagLayout());
		fr.add(pn);
		pn.setSize(300, 400);
		
		lbl = new JLabel("<Html><br>Group Members : <br><br><br> Group number :  <br><br><br> 01)Name - M.R Mohammed Hasan. <br><&#160<&#160<&#160 Index no- 13068 <br><br>02)Name - M.H.F.M Haflal. <br><&#160<&#160<&#160 Index no-12990  <br><br> 03)Name -M.J.M Jafris . <br><&#160<&#160<&#160 Index no-13177</html>");
		lbl.setSize(new Dimension(400,300));
		
		btn = new JButton("Back");
		
		GridBagConstraints d3 = new GridBagConstraints();
		d3.insets = new Insets(10,10,10,10);
		
		d3.gridx=0;
		d3.gridy=0;
		pn.add(lbl,d3);
		
		d3.gridx=0;
		d3.gridy=1;
		pn.add(btn,d3);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				fr.dispose();
				}
		});
		
	}
	

}

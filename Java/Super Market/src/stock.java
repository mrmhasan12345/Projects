import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class stock extends JFrame {

	private JFrame frm;
	private JTable tbl;
	private JTextField txt1,txt2,txt3,txt4,txt5;
	private JPanel pn1,pn2,pn3,pn4;
	private JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
	private JButton bt1,bt2,bt3;
	private DefaultTableModel dtm;
	private int row;
	
	public stock(){
	try{
		if(frame.a.length!=0){
			tbl_fill();
		}
	}catch(Exception ex){
		JOptionPane.showMessageDialog(null,ex);
		
	}
	
		frm = new JFrame();
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(800,300);
		frm.setResizable(false);
		frm.setTitle("Stock");
	//	frm.setBackground(new Color(0,0,0,0));
		
		pn1 = new JPanel();
		
		frm.add(pn1);		
		
		pn2 = new JPanel();
		pn3 = new JPanel();
		pn4 = new JPanel();
		 
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		txt3 = new JTextField(10);
		txt4 = new JTextField(10);
		txt5 = new JTextField(10);
		
		lbl1 = new JLabel("Item cord");
		lbl2 = new JLabel("Item Name");
		lbl3 = new JLabel("Cost price");
		lbl4 = new JLabel("Retail price");
		lbl5 = new JLabel("Amount");
		
		bt1 = new JButton(" Add ");
		bt2 = new JButton("Remove");
		bt3 = new JButton("Back");
				
		pn3.setLayout(new FlowLayout());
		
		
		dtm = new DefaultTableModel();
	
		
		tbl =new JTable(dtm);
		tbl.setPreferredScrollableViewportSize(new Dimension(500,200));
		tbl.setFillsViewportHeight(true);
		pn3.add(tbl);
		
		JScrollPane scrollPane = new JScrollPane(tbl);
		pn3.add(scrollPane);
				
		pn1.add(pn3);
		
		dtm.addColumn("Item code");
		dtm.addColumn("Item Name");
		dtm.addColumn("Cost price");
		dtm.addColumn("Retail price");
		dtm.addColumn("Amount");
		

	
	bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
		try{	
			Integer.parseInt(txt1.getText());
			Integer.parseInt(txt3.getText());
			Integer.parseInt(txt4.getText());
			Integer.parseInt(txt5.getText());
					
				tbl_fill();
				
			}
			
			catch(NumberFormatException error){
				JOptionPane.showMessageDialog(null,"Enter numbers for Item code , Prices and Amount");
			}
			}
		});
	
	bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			row = tbl.getSelectedRow();
			dtm.removeRow(row);
			for(int j=0;j<5;j++)
				frame.a[row][j] = null ;		
		} 
	});
		
		
		pn1.add(pn2);
		
		GroupLayout grp2 = new GroupLayout(pn2);
		pn2.setLayout(grp2);
		
		grp2.setAutoCreateContainerGaps(true);
		grp2.setAutoCreateGaps(true);
		
		grp2.setHorizontalGroup(
		grp2.createSequentialGroup()
			.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lbl1)			
						.addComponent(lbl2)	
						.addComponent(lbl3)	
						.addComponent(lbl4)	
						.addComponent(lbl5)
						.addComponent(bt1))
						.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(txt1)			
								.addComponent(txt2)	
								.addComponent(txt3)	
								.addComponent(txt4)	
								.addComponent(txt5)
								.addComponent(bt2)));
		
		grp2.setVerticalGroup(grp2.createSequentialGroup()
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lbl1)			
						.addComponent(txt1)	) 
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(lbl2)			
								.addComponent(txt2)	) 
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(lbl3)			
										.addComponent(txt3)	) 
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(lbl4)			
											.addComponent(txt4)	) 
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(lbl5)			
											.addComponent(txt5)	) 
				.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
											.addComponent(bt1)			
											.addComponent(bt2)	) 
												
										
				);
	
		
		pn4.add(bt3);
		
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frm.dispose();
				new frame();
				
			}
		});
		
		frm.add(pn4,BorderLayout.SOUTH);	
	
	}
	
	public void tbl_fill(){
		
		
		String[] rowdata = {txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText()};
		dtm.addRow(rowdata);
		for(int j=0;j<frame.a[0].length;j++){
			frame.a[frame.i][j] = rowdata[j];
			System.out.println(frame.a[frame.i][j]);
		}
		frame.i++;
		System.out.println("Stock finished");
				
	}
	
}

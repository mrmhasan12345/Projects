import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class frame extends JFrame{
	
	private JFrame frm;	
	private JList<String> l1;
	private JTextField txt1,txt2,txt3,txt4;
	private JButton bt1,bt2,bt3,bt4;
	private JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
	private JPanel pn1,pn2,pn3;
	private JMenuBar mbar;
	private JMenu F,V,A;
	private JMenuItem ex,ab,grp,prof,stc;
	private DefaultListModel<String> dlm;
	public static int i=0,val;
	public static String[][] a = new String[10][5];
	private String name[];
	private float[] uni = new float[10];
	private float[] pri = new float[10];
	private int count=0,sel;
	private float tot=0,bal=0,cash=0;

	public frame(){
		start();
		if(a.length!=0 && i!=0){
			for(int k=0;k<i;k++){
				for(int j=0;j<a[0].length;j++){
				System.out.println(a[k][j]);
				}
			}
			System.out.println("next print");
				}
		
	}
	
	public void start(){
		
		frm = new JFrame();
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(350, 658);
		frm.setResizable(false);
		frm.setTitle("Super Marcket Billing");
		
		pn1 = new JPanel();
		
		frm.add(pn1);
		
		pn2 = new JPanel();
		pn3 = new JPanel();
		
		mbar = new JMenuBar();
		frm.add(mbar,BorderLayout.PAGE_START);
		
		F = new JMenu("File");
		mbar.add(F);
		
		V = new JMenu("View");
		mbar.add(V);
		
		stc = new JMenuItem("Stock");
		V.add(stc);
		stc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frm.dispose();
				new stock();
			}
		});
		
		prof = new JMenuItem("Profit");
		V.add(prof);
		prof.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				//new group();
			}
		});
		
		
		
		A = new JMenu("About");
		mbar.add(A);
		
		grp = new JMenuItem("Group Members");
		F.add(grp);
		grp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frm.dispose();
				new group();
			}
		});
		
		ex = new JMenuItem("Exit");
		F.add(ex);
		ex.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		
		ab = new JMenuItem("About");
		A.add(ab);
		ab.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new aboutpro();
			}
		});
		
		
		
		dlm = new DefaultListModel<String>();
		l1 = new JList<String>();
		l1.setModel(dlm);
		dlm.addElement("                                                                        ");
		
		l1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		l1.setLayoutOrientation(JList.VERTICAL_WRAP);
		l1.setVisibleRowCount(-1);
		l1.setSize(new Dimension(300,350));
		
        
        JScrollPane listScroller = new JScrollPane(l1);
        listScroller.setPreferredSize(new Dimension(250, 300));
        
		txt1 = new JTextField(10);
		txt2 = new JTextField(5);
		txt3 = new JTextField(5);
		txt4 = new JTextField(5);
		txt4.setEditable(false);
		
		bt1 = new JButton(" Add ");
		bt2 = new JButton("Remove");
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sel = l1.getSelectedIndex();
				dlm.remove(l1.getSelectedIndex());
				name[sel] = null ;
				uni[sel] = (Float) null;
				pri[sel] = (Float) null;
				count--;
			}
		});
		
		bt3 = new JButton("Print");
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int t=0;t<pri.length;t++){
					tot = tot + uni[i]*pri[i];
					System.out.println(tot);
				}
				cash = Float.parseFloat(txt3.getText());
				
				bal = (cash - tot) ;
				
				txt4.setText(Float.toString(bal));
				
			}
		});
		
		bt4 = new JButton("Next Customer");
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(txt1.getText()== null || txt1.getText().trim().isEmpty())
					JOptionPane.showMessageDialog(null,"Please enter the item code");
				else if (txt2.getText()== null || txt2.getText().trim().isEmpty())
					JOptionPane.showMessageDialog(null,"Please enter the units of the item");
				else{	

				
					String x = txt1.getText();
					for(int r=0;r<a.length;r++){
						if(x.equals(a[r][0])){
							val = r;
							
						dlm.addElement(a[val][1]);
						name[count] = a[val][1];
						uni[count] = Float.parseFloat(txt2.getText());
						pri[count] = Float.parseFloat(a[val][3]);
						count++;
						
						System.out.println(pri[count]);
						
						}
						else{
						JOptionPane.showMessageDialog(null,"Invalid Item code");
						}
					}
				}	
		}
			
		});
		
		lbl1 = new JLabel("Items : ");
		lbl2 = new JLabel("Item code  :");
		lbl3 = new JLabel("Units           :");
		lbl4 = new JLabel("Cash           :");
		lbl5 = new JLabel("Balance     : ");
		
		
		pn1.add(pn2);
		

		GroupLayout grp2 = new GroupLayout(pn2);
		pn2.setLayout(grp2);
		
		grp2.setAutoCreateContainerGaps(true);
		grp2.setAutoCreateGaps(true);
		
		grp2.setHorizontalGroup(
		grp2.createSequentialGroup()
			.addGroup(grp2.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lbl1)			
						.addComponent(l1)
						.addComponent(pn3)
						.addComponent(bt4))		);
		
		grp2.setVerticalGroup(grp2.createSequentialGroup()
				.addComponent(lbl1)
				.addComponent(l1)
				.addComponent(pn3)
				.addComponent(bt4));
		
		
		
		
		GroupLayout grp3 = new GroupLayout(pn3);
		pn3.setLayout(grp3);
		
		grp3.setAutoCreateContainerGaps(true);
		grp3.setAutoCreateGaps(true);
		
		grp3.setHorizontalGroup(
		grp3.createSequentialGroup()
			.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(lbl2)			
						.addComponent(lbl3)
						.addComponent(bt1)
						.addComponent(lbl4)
						.addComponent(bt3)
						.addComponent(lbl5))		
			.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(txt1)			
					.addComponent(txt2)
					.addComponent(txt3)	
					.addComponent(txt4)	
					.addComponent(bt2)));
		
		grp3.setVerticalGroup(grp3.createSequentialGroup()
				.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lbl2)
						.addComponent(txt1) )
				.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lbl3)
						.addComponent(txt2) )
				.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bt1)
						.addComponent(bt2) )
				.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lbl4)
						.addComponent(txt3) )
						.addComponent(bt3)	
				.addGroup(grp3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lbl5)
						.addComponent(txt4) )
		);
		
		
	}
	
}


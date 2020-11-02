import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class frame extends JFrame {

	private JFrame frm;
	private ImageIcon img1,img2,img3,img4,img5,img6;
	private JButton bt1,bt2,bt3,bt4,bt5;
	private JPanel pn1,pn2;
	private JTextField txt1,txt2;
	private JComboBox cb1,cb2;
	private JLabel lbl1,lbl2,lbl3;
	private JMenuBar mbar;
	private JMenu F,V,A;
	private JMenuItem ex,ab,grp;
	int t1=0,l1=0,a1=0,v1=0,w1=0;
	String x,y;


public frame(){
	gui();
}


public void gui(){
	
	setLayout(new GridLayout(1,2));
	frm = new JFrame();
	frm.setVisible(true);
	frm.setSize(800,400);
	frm.setResizable(false);
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setTitle("Convertor");
	
	Image img7 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("ti.PNG"));
	frm.setIconImage(img7);
	
	pn1 = new JPanel(new GridBagLayout());
	pn2 = new JPanel(new GridBagLayout());
	
	
	img1 = new ImageIcon(getClass().getResource("t.PNG"));
	ImageIcon rimg1 = fiximg(img1);
	
	img2 = new ImageIcon(getClass().getResource("l.PNG"));
	ImageIcon rimg2 = fiximg(img2);
	
	img3 = new ImageIcon(getClass().getResource("a.PNG"));
	ImageIcon rimg3 = fiximg(img3);
	
	img4 = new ImageIcon(getClass().getResource("v.PNG"));
	ImageIcon rimg4 = fiximg(img4);
	
	img5 = new ImageIcon(getClass().getResource("w.PNG"));
	ImageIcon rimg5 = fiximg(img5);
	
	img6 = new ImageIcon(getClass().getResource("c.PNG"));
	Image img = img6.getImage();
	Image newimg = img.getScaledInstance(64, 64, java.awt.Image.SCALE_SMOOTH);
	img6 = new ImageIcon(newimg);
	
	
	bt1 = new JButton("Temperature");
	bt1.setIcon(rimg1);
	bt1.setIconTextGap(10);
	abt1 acbt1 = new abt1();
	bt1.addActionListener(acbt1);
	
	bt2 = new JButton("Length");
	bt2.setIcon(rimg2);
	bt2.setIconTextGap(43);
	abt2 acbt2 = new abt2();
	bt2.addActionListener(acbt2);
	
	
	bt3 = new JButton("Area");
	bt3.setIcon(rimg3);
	bt3.setIconTextGap(53);
	abt3 acbt3 = new abt3();
	bt3.addActionListener(acbt3);
	
	bt4 = new JButton("Volume");
	bt4.setIcon(rimg4);
	bt4.setIconTextGap(40);
	abt4 acbt4 = new abt4();
	bt4.addActionListener(acbt4);
	
	bt5 = new JButton("Weight");
	bt5.setIcon(rimg5);
	bt5.setIconTextGap(40);
	abt5 acbt5 = new abt5();
	bt5.addActionListener(acbt5);
	
	txt1 = new JTextField(20);
	txt2 = new JTextField(20);
	
	lbl1 = new JLabel();
	lbl1.setFont(new Font("Algerian",Font.BOLD,20));
	lbl2 = new JLabel("Convert");
	lbl2.setFont(new Font("Algerian",Font.ITALIC,20));
	lbl2.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			try{
				if(t1==1)
					new temperature(txt1,txt2,x,y);
				else if(l1==1)
					new length(txt1,txt2,x,y);
				else if(a1==1)
					new area(txt1,txt2,x,y);
				else if(v1==1)
					new volume(txt1,txt2,x,y);
				else if(w1==1)
					new weight(txt1,txt2,x,y);
					
				
			}catch(Exception error){
				
			}
			
		}
	});
	
	lbl3 = new JLabel("Equals to -");
	lbl2.setIcon(img6);
	lbl2.setIconTextGap(20);
	
	mbar = new JMenuBar();
	frm.add(mbar,BorderLayout.PAGE_START);
	
	F = new JMenu("File");
	mbar.add(F);
	
	V = new JMenu("View");
	mbar.add(V);
	
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
			frm.dispose();
			new aboutpro();
		}
	});
	
	cb1 = new JComboBox();
	cb1.addItem("Choose Unit");
	cb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			x = (String)cb1.getSelectedItem();
		}
	});
	cb2 = new JComboBox();
	cb2.addItem("Choose Unit");
	cb2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			y = (String)cb2.getSelectedItem();
		}
	});
	
	
	
	GridBagConstraints d1 = new GridBagConstraints();
	d1.insets = new Insets(10,10,10,10);
	
	frm.add(pn1,BorderLayout.WEST);
	
	d1.gridx = 0;
	d1.gridy = 0;
	pn1.add(bt1,d1);
	
	d1.gridy = 1;
	pn1.add(bt2,d1);
	
	d1.gridy = 2;
	pn1.add(bt3,d1);
	
	d1.gridy = 3;
	pn1.add(bt4,d1);
	
	d1.gridy = 4;
	pn1.add(bt5,d1);
	
	
	GridBagConstraints d2 = new GridBagConstraints();
	d2.insets = new Insets(10,10,10,10);
	
	frm.add(pn2,BorderLayout.CENTER);
	
	
	d2.gridx = 1;
	d2.gridy = 0;
	pn2.add(lbl1,d2);
	
	d2.gridx = 0;
	d2.gridy = 2;
	pn2.add(txt1,d2);
	
	d2.gridy = 4;
	pn2.add(txt2,d2);
	
	d2.gridx = 1;
	d2.gridy = 8;
	pn2.add(lbl2,d2);
	
	d2.gridx = 0;
	d2.gridy = 3;
	pn2.add(lbl3,d2);
	
	d2.gridy = 2;
	d2.gridx = 2;
	pn2.add(cb1,d2);
	
	d2.gridy = 4;
	pn2.add(cb2,d2);
	
}
public ImageIcon fiximg(ImageIcon x){
	
	Image img = x.getImage();
	Image newimg = img.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH);
	x = new ImageIcon(newimg);
	
	return x;
	
	}


public class abt1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		lbl1.setText("TEMPERATURE");
		DefaultComboBoxModel H1 = new DefaultComboBoxModel(new String[]{"Fahrenheit","Celcius","Kelvin"});
		DefaultComboBoxModel H2 = new DefaultComboBoxModel(new String[]{"Fahrenheit","Celcius","Kelvin"});
		cb1.setModel(H1);
		cb2.setModel(H2);
		t1=1;
		l1=0;
		a1=0;
		v1=0;
		w1=0;
	}
	}

public class abt2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		lbl1.setText("LENGTH");
		DefaultComboBoxModel H1 = new DefaultComboBoxModel(new String[]{"meter","kilometer","miles"});
		DefaultComboBoxModel H2 = new DefaultComboBoxModel(new String[]{"meter","kilometer","miles"});
		cb1.setModel(H1);
		cb2.setModel(H2);
		t1=0;
		l1=1;
		a1=0;
		v1=0;
		w1=0;
	}
	}

public class abt3 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		lbl1.setText("AREA");
		DefaultComboBoxModel H1 = new DefaultComboBoxModel(new String[]{"perch","rood","acre","hectare"});
		DefaultComboBoxModel H2 = new DefaultComboBoxModel(new String[]{"perch","rood","acre","hectare"});
		cb1.setModel(H1);
		cb2.setModel(H2);
		t1=0;
		l1=0;
		a1=1;
		v1=0;
		w1=0;
	}
	}

public class abt4 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		lbl1.setText("VOLUME");
		DefaultComboBoxModel H1 = new DefaultComboBoxModel(new String[]{"cubic decimeter","cubic meter","liter"});
		DefaultComboBoxModel H2 = new DefaultComboBoxModel(new String[]{"cubic decimeter","cubic meter","liter"});
		cb1.setModel(H1);
		cb2.setModel(H2);
		t1=0;
		l1=0;
		a1=0;
		v1=1;
		w1=0;
	}
	}

public class abt5 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		lbl1.setText("WEIGHT");
		DefaultComboBoxModel H1 = new DefaultComboBoxModel(new String[]{"pound","ounce","kilogram"});
		DefaultComboBoxModel H2 = new DefaultComboBoxModel(new String[]{"pound","ounce","kilogram"});
		cb1.setModel(H1);
		cb2.setModel(H2);
		t1=0;
		l1=0;
		a1=0;
		v1=0;
		w1=1;
	}
	}


}

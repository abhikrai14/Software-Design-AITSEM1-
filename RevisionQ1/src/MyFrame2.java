
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Name  Application  ");
	private JLabel l1 = new JLabel("First ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Surname ");
	private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("Update First");private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Update Surname");private JTextField t4=new JTextField("0",8);
	private JLabel l3 = new JLabel("Spare ");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	private JButton b5=new JButton("print Full Name");
	private JButton b6=new JButton("Spare");
	private Name n =new Name("John",   "Smith");
	
	public MyFrame2(String s){
		super(s);
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setBounds(38, 43, 339, 135);
		l0.setBounds(50, 5, 174, 27);
		l0.setFont(f);  l1.setBounds(0, 0, 113, 27);
  l1.setFont(f);
		getContentPane().setLayout(null);
		content.add(l0);
		p1.setLayout(null);
		p1.add(l1); t1.setBounds(113, 0, 113, 27);
 p1.add(t1);
		l2.setBounds(0, 27, 113, 27);
		p1.add(l2); t2.setBounds(113, 27, 113, 27);
 p1.add(t2);
		b1.setBounds(0, 54, 113, 27);
		p1.add(b1); t3.setBounds(113, 81, 113, 27);
 p1.add(t3);
		b2.setBounds(0, 81, 113, 27);
		p1.add(b2); t4.setBounds(113, 54, 113, 27);
 p1.add(t4);
		l3.setBounds(0, 108, 113, 27);
		p1.add(l3);
		b6.setBounds(226, 108, 113, 27);
		p1.add(b6);
		content.add(p1);
		t5.setBounds(113, 108, 113, 27);
		p1.add(t5);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b6.addActionListener(this);
        b5.setBounds(145, 197, 144, 23);
        content.add(b5);b5.addActionListener(this);  
		refresh();
		setSize(416,270);    setVisible(true);}
	
	public void  refresh(){
	     t1.setText(""+n.readFirst());
	     t2.setText(""+n.readSurname());}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	//t5.setText("");
	 	if (target==b1){

	          		n.updateFirst(t3.getText());
	             	refresh();
	             }
	 	if (target==b2){

      		n.updateSurname(t4.getText());
         	refresh();
         }
	 	if (target==b5){

      		n.printFullName();
         }
	 	if (target==b6){

      		n.updateFullName(t5.getText());
      		refresh();
         }
	 }

}
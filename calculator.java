import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener
{
	Label L1,L2,L3,L4,L5;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4,b5;
	calculator()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
		L1=new Label("CALCULATOR");
		L2=new Label("Enter First number:",Label.RIGHT);
	    L3=new Label("Enter Second number:",Label.RIGHT);
		L4=new Label("Result:",Label.RIGHT);
		L5=new Label("Develope by:copyright @ vjtech Software Pvt Ltd,Pune");
		tf1=new TextField(30);
		tf2=new TextField(30);
		tf3=new TextField(30);
		b1=new Button("ADD");
		b2=new Button("sub");
		b3=new Button("DIV");
		b4=new Button("MUL");
		b5=new Button("CLEAR");
		Font f1=new Font("Times new Roman",Font.BOLD|Font.ITALIC,30);
		L1.setFont(f1);
		
		L1.setBounds(200,60,500,30);
		L2.setBounds(30,150,120,30);
		tf1.setBounds(155,150,100,30);
		L3.setBounds(290,150,100,30);
		tf2.setBounds(400,150,100,30);
		L4.setBounds(520,150,80,30);
		tf3.setBounds(610,150,100,30);
		b1.setBounds(130,300,100,30);
		b2.setBounds(250,300,100,30);
		b3.setBounds(370,300,100,30);
		b4.setBounds(490,300,100,30);
		b5.setBounds(610,300,100,30);
		L5.setBounds(250,420,400,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		add(L1);
		add(L2);add(tf1);
	    add(L3);add(tf2);
		add(L4);add(tf3);
		add(b1);add(b2);add(b3);add(b4);add(b5);
		add(L5);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x=Integer.parseInt(tf1.getText());
		int y=Integer.parseInt(tf2.getText());
		if(ae.getSource()==b1)
		{
			int z=x+y;
			tf3.setText(z+"");
		}
		else if(ae.getSource()==b2)
		{
			int z=x-y;
			tf3.setText(z+"");
		}
		else if(ae.getSource()==b3)
		{
			int z=x/y;
		    tf3.setText(z+"");
		}
		else if(ae.getSource()==b4)
		{
			int z=x*y;
			tf3.setText(z+"");
		}
		else if(ae.getSource()==b5)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
		
	public static void main(String args[])
	{
		calculator c1=new calculator();
		c1.setVisible(true);
		c1.setSize(800,500);
		c1.setTitle("CALCULATOR");
	}
}
		
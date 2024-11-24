import java.awt.*;
import java.awt.event.*;
class AwtApplication1 extends Frame implements ActionListener
{
TextField tf1,tf2,tf3;
Button b1,b2,b3,b4;
AwtApplication1()
{
setLayout(new BorderLayout());
setSize(300,300);
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();

Label l1=new Label("First No");
Label l2=new Label("Second No");
Label l3=new Label("Result");

tf1=new TextField(20);
tf2=new TextField(20);
tf3=new TextField(20);

b1=new Button("SUM");
b2=new Button("DIFF");
b3=new Button("MULT");
b4=new Button("EXIT");



p1.add(l1);p1.add(tf1);
p1.add(l2);p1.add(tf2);

p2.add(l3);p2.add(tf3);

p3.add(b1);p3.add(b2);p3.add(b3);p3.add(b4);

add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setVisible(true);
}

public static void main(String args[])
{
AwtApplication1 f=new AwtApplication1();
}
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
int c=0;
if(ae.getSource()==b1)
{
c=a+b;
}
if(ae.getSource()==b2)
{
c=a-b;
}
if(ae.getSource()==b3)
{
c=a*b;
}
if(ae.getSource()==b4)
{
System.exit(0);
}
tf3.setText(String.valueOf(c));
}
}
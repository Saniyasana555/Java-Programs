import java.awt.*;
import java.applet.*;
/*
<applet code="flag" width=360 height=480>
</applet>
*/
public class myapplet extends Applet{
  public void paint(Graphics g){
public static void main(String[] args){

    g.drawOval(40,40,120,150);
    g.drawOval(57,75,30,20);
    g.drawOval(110,75,30,20);
    g.fillOval(68,81,10,10);
    g.fillOval(121,81,10,10);
    g.drawOval(85,100,30,30);
    g.fillArc(60,125,80,40,180,180);
    g.drawOval(25,92,15,30);
    g.drawOval(160,92,15,30);
}
  }
}
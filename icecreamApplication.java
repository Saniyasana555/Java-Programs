import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class icecreamApplication{
public static void main(String[]args)
{
JFrame f=new JFrame("Icecream Flavours");

f.setLayout(new FlowLayout());
f.setSize(400,400);
String[]flavours={"Vanilla","Butterscotch","Chocolate","blackCurrent"};
JComboBox<String> flavorChoiceBox = new JComboBox<>(flavours);
JLabel selectedFlavorLabel = new JLabel("Selected Flavor: None");
 
   flavorChoiceBox.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e){
 String selectedFlavor = (String) flavorChoiceBox.getSelectedItem();
 selectedFlavorLabel.setText("Selected Flavor: " + selectedFlavor);
}
});
f.add(new JLabel("Choose Your Favorite Ice Cream Flavor:"));
f.add(flavorChoiceBox);
f.add(selectedFlavorLabel);
f.setVisible(true);
}
}
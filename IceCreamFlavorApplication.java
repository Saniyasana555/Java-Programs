import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IceCreamFlavorApplication {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Ice Cream Flavor Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 150);

        // Initialize the combo box with popular ice cream flavors
        String[] flavors = { "Vanilla", "Chocolate", "Strawberry", "Mint Chocolate Chip", "Cookies and Cream", "Rocky Road", "Butter Pecan", "Pistachio" };
        JComboBox<String> flavorChoiceBox = new JComboBox<>(flavors);

        // Initialize the label to display the selected flavor
        JLabel selectedFlavorLabel = new JLabel("Selected Flavor: None");

        // Add action listener to update the label when a flavor is selected
        flavorChoiceBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFlavor = (String) flavorChoiceBox.getSelectedItem();
                selectedFlavorLabel.setText("Selected Flavor: " + selectedFlavor);
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Choose Your Favorite Ice Cream Flavor:"));
        frame.add(flavorChoiceBox);
        frame.add(selectedFlavorLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}

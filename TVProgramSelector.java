import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TVProgramSelector extends JFrame {

    // Constructor to setup the GUI components
    public TVProgramSelector() {
        // Set the title of the window
        super("TV Program Selector");

        // Create a label
        JLabel label = new JLabel("Select Your Favorite TV Program:");
        
        // Create an array of popular TV programs
        String[] tvPrograms = {
            "Breaking Bad",
            "Game of Thrones",
            "Stranger Things",
            "The Office",
            "Friends",
            "The Mandalorian",
            "The Crown",
            "The Witcher",
            "The Big Bang Theory",
            "Sherlock"
        };

        // Create a JComboBox with the TV programs
        JComboBox<String> tvProgramsComboBox = new JComboBox<>(tvPrograms);

        // Create a label to display the selected program
        JLabel selectedProgramLabel = new JLabel("Your selection: None");

        // Add an ActionListener to handle selection events
        tvProgramsComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProgram = (String) tvProgramsComboBox.getSelectedItem();
                selectedProgramLabel.setText("Your selection: " + selectedProgram);
            }
        });

        // Set the layout manager
        setLayout(new GridLayout(14, 10, 20, 20));

        // Add components to the frame
        add(label);
        add(tvProgramsComboBox);
        add(selectedProgramLabel);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(600, 600);

        // Center the window
        setLocationRelativeTo(null);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TVProgramSelector frame = new TVProgramSelector();
                frame.setVisible(true);
            }
        });
    }
}

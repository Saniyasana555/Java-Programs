import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class NumberImageButtons extends JFrame {

    public NumberImageButtons() {
        // Set the title of the window
        super("Number and Image Buttons");

        // Set layout manager
        setLayout(new GridLayout(3, 5, 10, 10)); // 3 rows, 5 columns, 10px gaps

        // Create and add 13 buttons
        for (int i = 1; i <= 13; i++) {
            JButton button = createButtonWithImage(i);
            add(button);
        }

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(600, 400);

        // Center the window on the screen
        setLocationRelativeTo(null);
    }

    // Helper method to create a button with a number and an image
    private JButton createButtonWithImage(int number) {
        // Create a button with the number as text
        JButton button = new JButton(String.valueOf(number));
        
        // Create an image icon with a placeholder image
        ImageIcon icon = createPlaceholderImageIcon(number);
        
        // Set the icon for the button
        button.setIcon(icon);
        
        // Set the text position relative to the icon
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        return button;
    }

    // Helper method to create a placeholder image icon with a number
    private ImageIcon createPlaceholderImageIcon(int number) {
        int width = 50, height = 50; // Image size
        // Create an image
        Image image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        
        // Set the background color
        g2.setColor(new Color(0, 100, 200));
        g2.fillRect(0, 0, width, height);
        
        // Draw the number in the center
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 20));
        FontMetrics fm = g2.getFontMetrics();
        int x = (width - fm.stringWidth(String.valueOf(number))) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2.drawString(String.valueOf(number), x, y);
        
        // Dispose of the graphics context and create the ImageIcon
        g2.dispose();
        return new ImageIcon(image);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                NumberImageButtons frame = new NumberImageButtons();
                frame.setVisible(true);
            }
        });
    }
}

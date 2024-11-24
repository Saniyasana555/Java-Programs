import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelMenuApplet extends JApplet {

    private static final String[] menuItems = {
        "Margherita Pizza - A classic delight with 100% Real mozzarella cheese",
        "Spaghetti Carbonara - Rich and creamy with pancetta and parmesan",
        "Caesar Salad - Crisp romaine lettuce with Caesar dressing",
        "Grilled Salmon - Freshly grilled salmon with a lemon butter sauce",
        "Cheeseburger - Juicy beef patty with cheddar cheese and pickles",
        "Vegetable Stir Fry - Mixed vegetables in a savory sauce",
        "Chicken Tikka Masala - Tender chicken in a spicy tomato sauce",
        "Beef Tacos - Soft tortillas filled with seasoned beef and toppings",
        "Clam Chowder - Creamy soup with clams and potatoes",
        "Chocolate Lava Cake - Warm, gooey chocolate cake"
    };

    private static final double[] prices = {
        12.99, 14.99, 9.99, 18.99, 10.99, 11.99, 15.99, 8.99, 7.99, 6.99
    };

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.err.println("GUI initialization failed");
        }
    }

    private void createGUI() {
        // Set layout manager
        setLayout(new BorderLayout(10, 10));

        // Create a title label
        JLabel titleLabel = new JLabel("Hotel Menu", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // Create a panel to hold menu items
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(menuItems.length, 1, 5, 5));

        // Add menu items to the panel
        for (int i = 0; i < menuItems.length; i++) {
            menuPanel.add(createMenuItemComponent(i));
        }

        // Add the menu panel to the center of the applet
        add(new JScrollPane(menuPanel), BorderLayout.CENTER);
    }

    private JPanel createMenuItemComponent(final int index) {
        // Create a panel for each menu item
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a label for the menu item name and description
        JLabel itemLabel = new JLabel(menuItems[index]);
        itemLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(itemLabel, BorderLayout.CENTER);

        // Create a label for the price
        JLabel priceLabel = new JLabel(String.format("$%.2f", prices[index]), JLabel.RIGHT);
        priceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(priceLabel, BorderLayout.EAST);

        // Create a button to "order" the item
        JButton orderButton = new JButton("Order");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null, 
                    "You ordered: " + menuItems[index].split(" - ")[0] + "\nPrice: $" + prices[index],
                    "Order Confirmation",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        panel.add(orderButton, BorderLayout.SOUTH);

        // Add a border around the panel
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        return panel;
    }

    // Main method to run as a standalone application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hotel Menu Applet");
        HotelMenuApplet applet = new HotelMenuApplet();
        
        // Initialize the applet
        applet.init();
        applet.start();

        // Add the applet to the frame
        frame.add(applet, BorderLayout.CENTER);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}

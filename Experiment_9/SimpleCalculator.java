import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    private JTextField display;
    private StringBuilder input;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        input = new StringBuilder();

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial Black", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "C", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("=")) {
            try {
                double result = eval(input.toString());
                display.setText(String.valueOf(result));
                input.setLength(0);
                input.append(result);
            } catch (Exception ex) {
                display.setText("Error");
                input.setLength(0);
            }
        } else if (command.equals("C")) {
            input.setLength(0);
            display.setText("");
        } else {
            input.append(command);
            display.setText(input.toString());
        }
    }

    // Very basic expression evaluator (no operator precedence)
    public double eval(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double number = Double.parseDouble(tokens[i + 1]);
            switch (operator) {
                case "+": result += number; break;
                case "-": result -= number; break;
                case "*": result *= number; break;
                case "/": result /= number; break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}

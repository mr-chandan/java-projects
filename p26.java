// 26. Develop a GUI application that receives an integer and computes its factorial.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        JLabel label1 = new JLabel("Enter a number:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Compute");
        JLabel resultLabel = new JLabel("Result:");

        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                resultLabel.setText("Result: " + fact);
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
/* 
Output:
The GUI application computes the factorial of the entered number and displays the result.
*/

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    public static void main(String[] args){
        Color bg = new Color(1, 50, 32);
        Color bg1 = new Color(100, 100, 100);

        JFrame frame = new JFrame("Number Table");

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(bg);

        JLabel labelForInput = new JLabel("Enter the number");
        labelForInput.setBackground(bg);
        labelForInput.setOpaque(true);
        labelForInput.setForeground(Color.WHITE);
        labelForInput.setHorizontalAlignment(SwingConstants.CENTER);
        labelForInput.setFont(new Font("Times new Roman",Font.BOLD, 18));
        labelForInput.setBounds(10, 10, 200, 20);
        panel.add(labelForInput);

        JTextField tf = new JTextField();
        tf.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1, true));
        tf.setBounds(10, 40, 200, 30);
        tf.setBackground(bg1);
        tf.setForeground(Color.BLACK);
        tf.setFont(new Font("Times new Roman",Font.BOLD, 15));
        panel.add(tf);

        JTextArea ta = new JTextArea();
        ta.setBackground(bg);
        ta.setOpaque(true);
        ta.setForeground(Color.WHITE);
        ta.setFont(new Font("Times new Roman",Font.BOLD, 17));
        ta.setBorder(new LineBorder(Color.WHITE, 1));
        ta.setEditable(false);
        ta.setBounds(230, 6, 250, 250);
        panel.add(ta);

        JButton button = new JButton("Generate");
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button.setBounds(10, 79, 100, 25);
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Times new Roman",Font.BOLD, 17));
        panel.add(button);
        frame.getRootPane().setDefaultButton(button);

        JButton clearButton = new JButton("Clear");
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        clearButton.setBounds(115, 79, 95, 25);
        clearButton.setBackground(Color.YELLOW);
        clearButton.setForeground(Color.BLACK);
        clearButton.setFont(new Font("Times new Roman",Font.BOLD, 17));
        panel.add(clearButton);

        JLabel line = new JLabel();
        line.setBorder(new LineBorder(Color.WHITE, 1));
        line.setBounds(220, 0, 1, 265);
        panel.add(line);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int text = Integer.parseInt(tf.getText());
                    String multiplicationTable = Main.numberTable(text);
                    ta.setText(multiplicationTable);
                    tf.setText("");
                }
                catch(Exception ep){
                    ta.setText("Insert a valid number");
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }
        });

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setLocation(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

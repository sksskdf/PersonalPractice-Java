package swing;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        super("Border Layout Example");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 1000);

        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.add(new JButton("one"));
        panel1.add(new JButton("two"));

        add(panel1, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
        int time = LocalTime.of(0, 0, 2).plusSeconds(6078).getSecond();
        System.out.println(time);
    }
}

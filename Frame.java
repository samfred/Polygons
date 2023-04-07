import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private JFrame frame = new JFrame();
    
    public Frame(int width, int height, JPanel panel){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}

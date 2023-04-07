import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel{
    
    private MouseInputs mouseInputs;
    
    int width;
    int height;

    public Panel(int width, int height){

        this.width = width;
        this.height = height;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        

        this.repaint();
    }
}

import javax.swing.JFrame;

public class FraMain extends JFrame {

    
    public FraMain() {
        setSize(1200, 700);
        setTitle("Animation Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new PanUI());
    }
}
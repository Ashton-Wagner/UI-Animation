
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanUI extends JPanel {

    ImageIcon imgiTime = new ImageIcon("Time.jpg");
    ImageIcon imgiScore = new ImageIcon("Score.jpg");
    ImageIcon imgiLives = new ImageIcon("Lives.jpg");
    ImageIcon imgiCoins = new ImageIcon("Coins.jpg");
    ImageIcon img0 = new ImageIcon("img0.jpg");
    ImageIcon img1 = new ImageIcon("img1.jpg");
    ImageIcon img2 = new ImageIcon("img2.jpg");
    ImageIcon img3 = new ImageIcon("img3.jpg");
    ImageIcon img4 = new ImageIcon("img4.jpg");
    ImageIcon img5 = new ImageIcon("img5.jpg");
    ImageIcon img6 = new ImageIcon("img6.jpg");
    ImageIcon img7 = new ImageIcon("img7.jpg");
    ImageIcon img8 = new ImageIcon("img8.jpg");
    ImageIcon img9 = new ImageIcon("img9.jpg");
    public Image ariNumbers[] = new Image[9];
    public Image imgTime;
    public Image imgScore;
    public Image imgLives;
    public Image imgCoins;
    Image img;
    Timer timer;
    int nScore = 0;
    int nTime = 0;
    int nLife = 0;
    int nCoins = 0;

    public PanUI() {
        ariNumbers[0] = img0.getImage();
        ariNumbers[1] = img1.getImage();
        ariNumbers[2] = img2.getImage();
        ariNumbers[3] = img3.getImage();
        ariNumbers[4] = img4.getImage();
        ariNumbers[5] = img5.getImage();
        ariNumbers[6] = img6.getImage();
        ariNumbers[7] = img7.getImage();
        ariNumbers[8] = img8.getImage();
        ////
        imgTime = imgiTime.getImage();
        imgScore = imgiScore.getImage();
        imgLives = imgiLives.getImage();
        imgCoins = imgiCoins.getImage();
        ////
        timer = new Timer(1000, updateImage);
        timer.start();
    }

    public void AnimationMutator(int _nScore, int _nTime, int _nLife, int _nCoins) {
        nScore = _nScore;
        nTime = _nTime;
        nLife = _nLife;
        nCoins = _nCoins;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.drawImage(imgLives, 0, 0, null);
        g.drawImage(imgScore, 0, 75, null);
        g.drawImage(imgTime, 200, 0, null);
        g.drawImage(imgCoins, 200, 75, null);
        repaint();

    }
    ActionListener updateImage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            repaint();
        }
    };
}
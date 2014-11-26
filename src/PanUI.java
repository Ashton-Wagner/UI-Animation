
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanUI extends JPanel {

    ImageIcon imgiTime = new ImageIcon("Time.png");
    ImageIcon imgiScore = new ImageIcon("Score.png");
    ImageIcon imgiLives = new ImageIcon("Lives.png");
    ImageIcon imgiCoins = new ImageIcon("Coins.png");
    ImageIcon img0 = new ImageIcon("img0.png");
    ImageIcon img1 = new ImageIcon("img1.png");
    ImageIcon img2 = new ImageIcon("img2.png");
    ImageIcon img3 = new ImageIcon("img3.png");
    ImageIcon img4 = new ImageIcon("img4.png");
    ImageIcon img5 = new ImageIcon("img5.png");
    ImageIcon img6 = new ImageIcon("img6.png");
    ImageIcon img7 = new ImageIcon("img7.png");
    ImageIcon img8 = new ImageIcon("img8.png");
    ImageIcon img9 = new ImageIcon("img9.png");
    public Image ariNumbers[] = new Image[10];
    public Image imgTime;
    public Image imgScore;
    public Image imgLives;
    public Image imgCoins;
    ////
    public Image imgScoreCount1;
    public Image imgScoreCount2;
    public Image imgScoreCount3;
    public int nScore1;
    public int nScore2;
    public int nScore3;
    ////
    public Image imgTimeCount1;
    public Image imgTimeCount2;
    public Image imgTimeCount3;
    public int Time1 = 0;
    public int Time2 = 2;
    public int Time3 = 0;
    public Boolean bTimeChanged1;
    public Boolean bTimeChanged2 = false;
    ////       
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
        ariNumbers[9] = img9.getImage();
        ////
        imgTime = imgiTime.getImage();
        imgScore = imgiScore.getImage();
        imgLives = imgiLives.getImage();
        imgCoins = imgiCoins.getImage();
        ////
        timer = new Timer(1000, updateImage);
        timer.start();
        if (Time1 == 0 && Time2 == 0 && Time3 == 0) {
            System.out.println("Didit");
            timer.stop();
        }
    }

    public void AnimationMutator(int _nScore, int _nTime, int _nLife, int _nCoins) {
        nScore = _nScore;
        nTime = _nTime;
        nLife = _nLife;
        nCoins = _nCoins;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.drawImage(imgTime, 950, 0, null);
        g.drawImage(imgLives, 0, 475, null);
        g.drawImage(imgScore, 0, 475 + (imgLives.getHeight(this)), null);
        g.drawImage(imgCoins, 0, 475 + imgScore.getHeight(this) + (imgLives.getHeight(this)), null);




        g.drawImage(ariNumbers[(Time1)], 950 + imgTime.getWidth(this), 0, null);
        g.drawImage(ariNumbers[(Time2)], 950 + imgTime.getWidth(this) + 30, 0, null);
        g.drawImage(ariNumbers[(Time3)], 950 + imgTime.getWidth(this) + 60, 0, null);
        repaint();

    }
    ActionListener updateImage = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            System.out.println(Time1 + "/" + Time2 + "/" + Time3);
            bTimeChanged1 = false;
            ////
            if (Time1 == 0 && Time3 == 0) {
                bTimeChanged2 = true;
            }
            ////
            if (Time3 == 0 && bTimeChanged1 != true) {
                Time2 -= 1;
                Time3 += 10;
                bTimeChanged1 = true;
            }
            ////
            if (Time2 == 0 && bTimeChanged2 != true) {
                Time1 -= 1;
                Time2 += 9;
                bTimeChanged1 = true;
            }
            Time3 -= 1;
            repaint();
        }
    };
}
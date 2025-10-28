import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class chaos extends JFrame {

    static final int WIDTH = 1000;
    static final int HEIGHT = 500;
    JLabel label = new JLabel("MAY CHAOS TAKE THIS WORLD");


    chaos(){

        label.setFont(new Font("Arial",Font.PLAIN,22));
        label.setForeground(new Color(0,0,0));
        label.setBounds(315,100,500,250);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(WIDTH,HEIGHT));
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(20,100,180));
        this.add(label);
        this.setVisible(true);

    }


    /*ΜΑΥ CHAOS TAKE OVER THIS WORLD*/

    public void m_move() throws AWTException {

        Robot r = new Robot();
        Random random = new Random();

       /* try{
            while (true){
                r.mouseMove(random.nextInt(),random.nextInt());
                r.delay(10);
            }
         */
            try{
                int i = 0;
                while (i<100){
                    r.mouseMove(random.nextInt(),random.nextInt());
                    r.delay(10);
                    i++;
                }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

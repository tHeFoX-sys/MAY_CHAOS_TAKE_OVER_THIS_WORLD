import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        chaos my_chaos = new chaos();
        try {
            my_chaos.m_move();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
}
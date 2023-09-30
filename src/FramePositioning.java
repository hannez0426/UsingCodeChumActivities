import javax.swing.*;

public class FramePositioning extends JFrame{
    private JPanel panelMain;

    public static void main(String[] args) {
        FramePositioning frame = new FramePositioning();
        frame.setTitle("Frame With Position");
        frame.setBounds(750,300,600,500);
        frame.setVisible(true);
    }
}

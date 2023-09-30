import javax.swing.*;

public class FramePositioning extends JFrame{
    private JPanel panelMain;

    public static void main(String[] args) {
        FramePositioning frame = new FramePositioning();
        frame.setTitle("Frame");
        frame.setSize(500,400);
        frame.setVisible(true);
    }
}

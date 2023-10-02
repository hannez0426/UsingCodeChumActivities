import javax.swing.*;

class FramePositioning extends JFrame{
    public JPanel panelMain;

    public static void main(String[] args) {
        FramePositioning frame = new FramePositioning();
        JPanel panelSubA = new JPanel();
        JPanel panelSubB = new JPanel();

        panelSubA.setLocation(10,10);
        panelSubB.setLocation(200, 90);

        frame.setTitle("Frame");
        frame.setSize(500,400);
        frame.setVisible(true);



    }
}

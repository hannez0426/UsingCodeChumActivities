import javax.swing.*;

class FramePositioning extends JFrame{
    private JPanel mainPanel;
    private JPanel subPanelA;
    private JPanel subPanelB;

    FramePositioning() {
    }

    public static void main(String[] args) {
        FramePositioning frame = new FramePositioning();

        frame.setTitle("Frame");
        frame.setSize(500,400);
        frame.setVisible(true);



    }
}

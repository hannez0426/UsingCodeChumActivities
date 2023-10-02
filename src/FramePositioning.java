import javax.swing.*;
import java.awt.*;

class FramePositioning extends JFrame{
    private JPanel mainPanel;
    private JPanel subPanelA;
    private JPanel subPanelB;

    FramePositioning() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null); // Set the layout manager of the main panel

        JPanel subPanelA = new JPanel();
        JPanel subPanelB = new JPanel();

        subPanelA.setBounds(10, 10, 100, 100);
        subPanelB.setBounds(200, 90, 100, 100);

        mainPanel.add(subPanelA); // Add subPanelA to the main panel
        mainPanel.add(subPanelB); // Add subPanelB to the main panel

        add(mainPanel); // Add the main panel to the JFrame
    }


    public static void main(String[] args) {
        FramePositioning frame = new FramePositioning();

        frame.setTitle("Frame");
        frame.setSize(500,400);
        frame.setVisible(true);



    }
}

package magicEightBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MagicEightBall {

    private JFrame mainFrame;
    private JLabel label;
    private Raffle randomSentence = new Raffle();

    public MagicEightBall() {
        initialize();
    }


    public static void main(String[] args) {
        MagicEightBall magicEightBall = new MagicEightBall();
        magicEightBall.showGui();
    }

    private void initialize() {
        mainFrame = new JFrame("Magic 8 Ball");
        mainFrame.setSize(200, 200);
        mainFrame.setLayout(new GridLayout(3, 1));

        label = new JLabel("", JLabel.CENTER);
        label.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.add(label);
        mainFrame.setVisible(true);

    }

    private void showGui() {
        JButton newSentence = new JButton("Ask me a question");
        newSentence.addActionListener(new ButtonClickListener());

        mainFrame.add(newSentence);
        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = randomSentence.eightBall();
            label.setText(message);
        }
    }
}

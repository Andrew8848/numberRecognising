package org.example.gui.contents;

import org.example.gui.contents.childContent.recognisingChildPanels.MainNN;

import javax.swing.*;
import java.awt.*;

public class RecognitionPanel extends JPanel {


    public RecognitionPanel() {
        setBackground(Color.DARK_GRAY);
        setLayout(new BorderLayout());

        JTabbedPane tab = new JTabbedPane();

        MainNN nn = new MainNN("Simple NN");
        tab.add("Main", nn);

        add(tab, BorderLayout.CENTER);
    }

}

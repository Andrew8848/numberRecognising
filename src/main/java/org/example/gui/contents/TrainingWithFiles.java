package org.example.gui.contents;

import org.example.gui.contents.childContent.recognisingChildPanels.MainNN;

import javax.swing.*;
import java.awt.*;

public class TrainingWithFiles extends JPanel {
    public TrainingWithFiles() {
        setBackground(Color.DARK_GRAY);
        setLayout(new BorderLayout());

        JTabbedPane tab = new JTabbedPane();

        MainNN nn = new MainNN("Training Neural Network with files");
        tab.add("Main", nn);

        add(tab, BorderLayout.CENTER);
    }
}

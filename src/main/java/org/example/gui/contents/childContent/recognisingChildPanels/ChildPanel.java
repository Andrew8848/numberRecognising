package org.example.gui.contents.childContent.recognisingChildPanels;

import javax.swing.*;
import java.awt.*;

public abstract class ChildPanel extends JPanel{

    private final JLabel panelName;
    private final JPanel contentPanel;

    public ChildPanel(String panelName) {
        super(new BorderLayout());
        this.panelName = new JLabel(panelName, SwingConstants.CENTER);
        this.contentPanel = new JPanel();
        init();
    }

    private void init() {
        add(panelName, BorderLayout.NORTH);
        this.contentPanel.setBackground(Color.BLUE);
        add(contentPanel, BorderLayout.CENTER);
    }

}

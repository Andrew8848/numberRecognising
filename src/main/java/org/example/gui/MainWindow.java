package org.example.gui;

import org.example.gui.contents.RecognitionPanel;
import org.example.gui.contents.TrainingWithFiles;
import org.example.gui.contents.components.RootMenuBar;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {
        super.frameInit();
        setIconImage(new ImageIcon("src/main/resources/ico/A9.png").getImage());
        setContentPane(panelInit());
        setJMenuBar(menuBarInit());

        setComponent(new TrainingWithFiles());
    }

    public void open(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 600);
//        setResizable(false);
        setVisible(true);
    }

    public void setComponent(JComponent component){
        super.getContentPane().removeAll();
        super.getContentPane().add(component);
        super.revalidate();
        super.repaint();
    }

    @Override
    public Container getContentPane() {
        return super.getContentPane();
    }

    private JPanel panelInit(){
        return new RecognitionPanel();
    }
    private JMenuBar menuBarInit() {
        return new RootMenuBar();
    }


}

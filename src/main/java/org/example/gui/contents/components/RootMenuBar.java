package org.example.gui.contents.components;

import javax.swing.*;

public class RootMenuBar extends JMenuBar {

    private final JMenu navigate, subMenuTraining, more;
    
    private final JMenuItem recognition, trainingWithFile, handTraining;

    private final JMenuItem author, contacts, help;

    
    public RootMenuBar() {
        this.navigate = new JMenu("Navigate");
        this.subMenuTraining = new JMenu("Training");
        this.more = new JMenu("More");
        
        
        this.trainingWithFile = new JMenuItem("Training with files");
        this.handTraining = new JMenuItem("Hand training");
        this.recognition = new JMenuItem("Recognition");
        
        
        this.author = new JMenuItem("Author");
        this.contacts = new JMenuItem("Contacts");
        this.help = new JMenuItem("Help");

        menuInit();
    }

    private void menuInit() {
        this.navigate.add(this.recognition);

        this.subMenuTraining.add(this.trainingWithFile);
        this.subMenuTraining.add(this.handTraining);
        this.navigate.add(this.subMenuTraining);


        this.more.add(this.author);
        this.more.add(this.contacts);
        this.more.add(this.help);


        add(this.navigate);
        add(more);
    }
}

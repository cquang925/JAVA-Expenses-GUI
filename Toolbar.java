package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton addEntry;
    private JButton viewPrevious;
    private JButton save;
    private StringListener textListener;

    public Toolbar(){
        addEntry = new JButton("Add");
        viewPrevious = new JButton("View Previous");
        save = new JButton(("Save"));

        addEntry.addActionListener(this);
        viewPrevious.addActionListener(this);
        save.addActionListener(this);

        setLayout((new FlowLayout(FlowLayout.LEFT)));

        add(addEntry);
        add(viewPrevious);
        add(save);
    }

    public void setStringListener(StringListener listener){
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if (clicked == addEntry){
            if(textListener != null){
                textListener.textEmitted("Hello\n");
            }
            //textPanel.appendText("Hello\n");
        }
        else if (clicked == viewPrevious){
            if(textListener != null){
                textListener.textEmitted("Goodbye\n");
            //textPanel.appendText("Goodbye\n");
            }
        }
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TextPanel textPanel;
    private Toolbar toolbar;
    private EntryForm entryForm;

    public MainFrame(){
        super ("Expenses");
        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new TextPanel();
        entryForm = new EntryForm();


        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        add(textPanel, BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);
        add(entryForm, BorderLayout.WEST);


        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

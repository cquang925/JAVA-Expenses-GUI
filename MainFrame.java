// Mainframe is the controller. Communicates between all classes. 
// Classes will send information to Mainframe and Mainframe will decide what to do with information

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
        
        entryForm.setFormListener(new EntryFormListener() {
            public void formEventOccurred(EventEntryForm ev) {
                String store = ev.getStore();
                String address = ev.getAddress();
                String date = ev.getDate();
                String amount = ev.getAmount();

                textPanel.appendText("On " + date + " you went to " + store + " located at " + address + " and spent $"
                        + amount + ". Spend less money!");
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

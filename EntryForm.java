package com.company;

import javax.swing.*;
import java.awt.*;

public class EntryForm extends JPanel {

    private JLabel storeLabel;
    private JLabel addressLabel;
    private JLabel dateLabel;
    private JLabel amountLabel;
    private JTextField storeField, addressField, dateField, amountField;
    private JButton submit;
    private JButton clear;
    final static boolean shouldfill = true;

    public EntryForm(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        Border innerBorder = BorderFactory.createTitledBorder("Add Store Information");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        if (shouldfill) {
            c.fill = GridBagConstraints.NORTH;
        }
        
        submit = new JButton("Submit");
        clear = new JButton("Clear Entries");

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String store = storeField.getText();
                String address = addressField.getText();
                String date = dateField.getText();
                String amount = amountField.getText();

                EventEntryForm ev = new EventEntryForm(this, store, address, date, amount);

                if(formListener != null) {
                    formListener.formEventOccurred(ev);
                }
            }
        });

                // 1st row //
        c.weightx = 0;
        c.weighty = 0.01;

        storeLabel = new JLabel("Store Name:");
        storeLabel.setPreferredSize(new Dimension(150, 25));
        c.gridx = 0;
        c.gridy = 0;
        add(storeLabel, c);

        storeField = new JTextField();
        storeField.setPreferredSize(new Dimension(200, 25));
        c.gridx = 1;
        c.gridy = 0;
        add(storeField, c);

        // 2nd row //
        c.weightx = 0;
        c.weighty = 0.01;

        addressLabel = new JLabel("Store Address:");
        addressLabel.setPreferredSize(new Dimension(150, 25));
        c.gridx = 0;
        c.gridy = 1;
        add(addressLabel, c);

        addressField = new JTextField();
        addressField.setPreferredSize(new Dimension(200, 25));
        c.gridx = 1;
        c.gridy = 1;
        add(addressField, c);

        //3rd row //
        c.weightx = 0;
        c.weighty = 0.01;

        dateLabel = new JLabel("Date of Purchase:");
        dateLabel.setPreferredSize(new Dimension(150, 25));
        c.gridx = 0;
        c.gridy = 2;
        add(dateLabel, c);

        dateField = new JTextField();
        dateField.setPreferredSize(new Dimension(200, 25));
        c.gridx = 1;
        c.gridy = 2;
        add(dateField, c);


        // 4th row //
        c.weightx = 0;
        c.weighty = 0.01;

        amountLabel = new JLabel("Amount Spent:");
        amountLabel.setPreferredSize(new Dimension(150, 25));
        c.gridx = 0;
        c.gridy = 3;
        add(amountLabel, c);

        amountField = new JTextField();
        amountField.setPreferredSize(new Dimension(200, 25));
        c.gridx = 1;
        c.gridy = 3;
        add(amountField, c);

        // 5th row//
        c.weightx = 0.5;
        c.weighty = 0.5;

        submit.setPreferredSize(new Dimension(150, 25));
        c.gridx = 0;
        c.gridy = 4;
        c.anchor = GridBagConstraints.LAST_LINE_START;
        add(submit, c);

        clear.setPreferredSize(new Dimension(150, 25));
        c.gridx = 1;
        c.gridy = 4;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        add(clear, c);
    }

    public void setFormListener (EntryFormListener listener) {
        this.formListener = listener;
    }
}

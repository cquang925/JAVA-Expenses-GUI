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

        if (shouldfill) {
            c.fill = GridBagConstraints.NORTH;
        }

        // 1st row //
        storeLabel = new JLabel("Store Name:");
        storeLabel.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 0;
        c.gridy = 0;
        add(storeLabel, c);

        storeField = new JTextField();
        storeField.setPreferredSize(new Dimension(200, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 1;
        c.gridy = 0;
        add(storeField, c);

        // 2nd row //
        addressLabel = new JLabel("Store Address:");
        addressLabel.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 0;
        c.gridy = 1;
        add(addressLabel, c);

        addressField = new JTextField();
        addressField.setPreferredSize(new Dimension(200, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 1;
        c.gridy = 1;
        add(addressField, c);

        //3rd row //
        dateLabel = new JLabel("Date of Purchase:");
        dateLabel.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 0;
        c.gridy = 2;
        add(dateLabel, c);

        dateField = new JTextField();
        dateField.setPreferredSize(new Dimension(200, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 1;
        c.gridy = 2;
        add(dateField, c);


        // 4th row //
        amountLabel = new JLabel("Amount Spent:");
        amountLabel.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 0;
        c.gridy = 3;
        add(amountLabel, c);

        amountField = new JTextField();
        amountField.setPreferredSize(new Dimension(200, 25));
        c.weightx = 0;
        c.weighty = 0.01;
        c.gridx = 1;
        c.gridy = 3;
        add(amountField, c);

        // 5th row//
        submit = new JButton("Submit");
        submit.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        add(submit, c);

        clear = new JButton(("Clear Entries"));
        clear.setPreferredSize(new Dimension(150, 25));
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        add(clear, c);
    }
}

package hanoitower;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {
    Canvas canvas = new Canvas();
    JPanel controlPanel = new JPanel();

    JEditorPane panel = new JEditorPane();

    JButton loadButton = new JButton("Load");
    JButton startButton = new JButton("Start");

    public Frame() throws HeadlessException {
        super("Tower of Hanoi");


        panel.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {

            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPanelActionPerfom(e);
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startActionPerfom(e);
            }
        });

        controlPanel.add(panel);
        controlPanel.add(loadButton);
        controlPanel.add(startButton);


        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);


        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }

    private void loadPanelActionPerfom(ActionEvent e) {
        //TODO: input the disks count and add the disks

    }

    private void startActionPerfom(ActionEvent e) {
       //TODO: on start button click, disks must be moved in given algorithm
    }

    public static void main(String[] args) {
        new Frame();
    }


}


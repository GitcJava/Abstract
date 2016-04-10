package hanoitower;

import figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Canvas extends JPanel implements Runnable {


    public Canvas() {
        super();


     //TODO: add MouseListener and MouseMotionListener
    }


    public void moveDiscs(int number, Peg first, Peg middle, Peg end) {
//TODO: move disks by given algorithm
    }

    private void move(Peg first, Peg end) {

    }


    private void add(int disksCount) {
/*TODO: enter disks count and write algorithm for add disks.
   TODO:for example if you have 4 disks they must be lessen by one every time,until  it will be equals  one
         *
        * *
       * * *
      * * * *
 */



    }

    private void cleanDisks() {
//TODO: remove the disks
    }

    public void load(int disksCount) {
//TODO: call cleanDisks and add methods
    }

    public void start() {

    }

    @Override
    public void update(Graphics g) {
        super.update(g);
    }

    @Override
    public void paint(Graphics g) {
//TODO: print towers and disks
    }

    @Override
    public void run() {

    }

    public Figure getSelected() {
        return null;
    }

    private void select(int x, int y) {

    }

    private void mousePress(MouseEvent e) {

    }

    private void mouseDraget(MouseEvent e) {

    }
}

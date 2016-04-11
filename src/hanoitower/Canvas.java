package hanoitower;

import figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Canvas extends JPanel implements Runnable {
    private boolean isSelected;
    private int mX;
    private int mY;

    public Canvas() {
        super();

        setBackground(Color.lightGray);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                mousePress(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseDraget(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
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
        mX = e.getX();
        mY = e.getY();
        select(mX, mY);
        update(getGraphics());
    }

    private void mouseDraget(MouseEvent e) {
        if (isSelected) {
            getSelected().move(e.getX() - mX, e.getY() - mY);
            repaint();
        }
        mX = e.getX();
        mY = e.getY();
    }
}

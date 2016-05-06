package hanoitower;

import figures.Figure;
import figureui.FigureCanvas;
import  figures.Rectangle;
import java.awt.*;
import java.util.ArrayList;

public class Peg  {

    private Rectangle horizontalTower;
    private Rectangle verticalTower;

    private final int horizontalWidth = 210;
    private final int horizontalHeight = 10;
    private final int vertcalWidth = 10;
    private final int verticalHeight = 310;
    private int x;
    private int y;
    private Color color;
    int[] xs;
    int[] ys;
    private FigureCanvas canvas;

    private ArrayList<Disks> disksList = new ArrayList<>();


    public Peg(int x, int y, FigureCanvas canvas, Color color) {
        this.canvas = canvas;
        this.x = x;
        this.y = y;
        this.color = color;

        xs = new int[8];
        ys = new int[8];
        setPegsCordinate();


    }

    private void setPegsCordinate() {
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    xs[0] = x;
                    ys[0] = y + verticalHeight;
                    break;
                case 1:
                    xs[1] = x + (horizontalWidth - vertcalWidth) / 2;
                    ys[1] = y + verticalHeight;
                    break;
                case 2:
                    xs[2] = x + (horizontalWidth - vertcalWidth) / 2;
                    ys[2] = y;
                    break;
                case 3:
                    xs[3] = x + (horizontalWidth - vertcalWidth) / 2 + vertcalWidth;
                    ys[3] = y;
                    break;
                case 4:
                    xs[4] = x + (horizontalWidth - vertcalWidth) / 2 + vertcalWidth;
                    ys[4] = y + verticalHeight;
                    break;
                case 5:
                    xs[5] = x + horizontalWidth;
                    ys[5] = y + verticalHeight;
                    break;
                case 6:
                    xs[6] = x + horizontalWidth;
                    ys[6] = y + verticalHeight + horizontalHeight;
                    break;
                case 7:
                    xs[7] = x;
                    ys[7] = y + verticalHeight + horizontalHeight;
                    break;
            }
        }

    }


    public void add(int towersNum) {
        int multiplier =getHorizontalWidth()/towersNum;
        for (int j = 1; j <= towersNum; j++) {
            disksList.add(new Disks(x + (j*multiplier/4), y + getVerticalHeight() - (j * 10),
                    getHorizontalWidth() - (j * multiplier/2), 8, canvas));

        }
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getVerticalHeight() {
        return verticalHeight;
    }

    public int getHorizontalWidth() {
        return horizontalWidth;
    }

    public ArrayList<Disks> getDisksList() {
        return disksList;
    }

    public int getDisksCount(){
        return disksList.size();
    }

    public void add (Disks disks){
        disksList.add(disks);
    }

    public void remove (Disks disks){
        disksList.remove(disks);
    }

    public void draw (Graphics g){
        g.fillPolygon(xs, ys, 8);
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        setPegsCordinate();

        int i = 1;
        for (; i <= getDisksCount(); i++) {

            disksList.get(i - 1).setX(this.x + (horizontalWidth - disksList.get(i - 1).getWidth()) / 2);
            disksList.get(i - 1).setY(this.y + getVerticalHeight() - (i * 10));

        }
    }

    public boolean isBelong(int x, int y) {
        return x >= xs[0] && x <= xs[5] && y >= ys[0] && y <= ys[7] || x >= xs[1] && x <= xs[4] && y >= ys[2] && y <= ys[1];

    }

}

package hanoitower;

import figures.Figure;
import figures.FigureCanvas;
import  figures.Rectangle;
import java.awt.*;
import java.awt.Canvas;
import java.util.ArrayList;

public class Peg extends Figure {

    private Rectangle horizontalTower;
    private Rectangle verticalTower;

    private final int horizontalWidth = 210;
    private final int horizontalHeight = 10;
    private final int vertcalWidth = 10;
    private final int verticalHeight = 310;
    private int x;
    private int y;

    private Canvas canvas;

    private ArrayList<Figure> towers = new ArrayList<>();


    public Peg(int x, int y, int width, int height, FigureCanvas canvas) {
        super(x, y, width, height, canvas);


       //TODO: draw the towers
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

    public ArrayList<Figure> getTowers() {
        return towers;
    }

    public int getTowerSize (){
        return towers.size();
    }

    public void add (Figure figur){
        towers.add(figur);
    }

    public void remove (Figure firstFigure){
        towers.remove(firstFigure);
    }

    public void draw (Graphics g){
        horizontalTower.draw(g);
        verticalTower.draw(g);

    }

    @Override
    public boolean isBelong(int x, int y) {
        //TODO return true if mouse click belong tower area
        return false;
    }

}

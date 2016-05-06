package hanoitower;

import figure.Figure;
import figureui.FigureCanvas;

import java.awt.*;

/**
 * Created by levon on 4/11/16.
 */
public class Disks extends Figure {
    public Disks(int x, int y, int width, int height, FigureCanvas canvas,Color color ) {
        super(x, y, width, height, canvas ,color);
    }

    public Disks(int x, int y, int width, int height, FigureCanvas canvas) {
        this(x, y, width, height,canvas ,Color.darkGray );
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {

        return x >= getX() && x <= getX()+ getWidth() && y >= getY() && y <= getY() + getHeight();
    }
}

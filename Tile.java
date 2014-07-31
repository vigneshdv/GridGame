/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trainingday4;
/**
 *
 * @author vidv
 */
public class Tile {
    public static final long COLOR_BLACK = 1;
    public static final long COLOR_WHITE = 2;
    
    
    private long color;
    private long x;
    private long y;
    

    public Tile(long color, long x, long y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
        
    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }
}

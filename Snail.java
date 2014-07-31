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
public class Snail {
    public static final long DIRECTION_NORTH = 0;
    public static final long DIRECTION_EAST = 1;
    public static final long DIRECTION_SOUTH = 2;
    public static final long DIRECTION_WEST = 3;
    
    private Tile currentTile;
    private long currentDirection;
    
    public Snail(Tile tile, long direction) {
        this.currentTile = tile;
        this.currentDirection = direction;
    }
    
    public void toggleColor() {
        if (currentTile.getColor() == Tile.COLOR_WHITE) {
            currentTile.setColor(Tile.COLOR_BLACK);
        } else {
            currentTile.setColor(Tile.COLOR_WHITE);
        }
    }
    
    public void moveForward() {
       if (this.currentDirection == Snail.DIRECTION_NORTH) {
           this.currentTile.setY(this.currentTile.getY() - 1L);
       } else if (this.currentDirection == Snail.DIRECTION_SOUTH) {
           this.currentTile.setY(this.currentTile.getY() + 1L);
       } else if (this.currentDirection == Snail.DIRECTION_EAST) {
           this.currentTile.setX(this.currentTile.getX() + 1L);
       } else if (this.currentDirection == Snail.DIRECTION_WEST) {
           this.currentTile.setX(this.currentTile.getX() - 1L);
       }
        
    }
    
    public void turnRight() {
       this.currentDirection = ( this.currentDirection + 1L) % 4L; 
    }
    
    public void turnLeft() {
        this.currentDirection = ( this.currentDirection - 1L) % 4L; 
    }
    
}

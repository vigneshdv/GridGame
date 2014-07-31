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
    
    private Tile currentTile;
    
    
    public void toggleColor() {
        if (currentTile.getColor() == Tile.COLOR_WHITE) {
            currentTile.setColor(Tile.COLOR_BLACK);
        } else {
            currentTile.setColor(Tile.COLOR_WHITE);
        }
    }
    
    public void moveForward() {
        
        
    }
    
    public void turnRight() {
        
    }
    
    public void turnLeft() {
        
    }
    
}

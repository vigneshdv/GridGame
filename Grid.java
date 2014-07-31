/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trainingday4;

import java.util.ArrayList;

/**
 *
 * @author vidv
 */
public class Grid {
    private ArrayList<Tile> blackTiles;
    
    public Grid() {
        blackTiles = new ArrayList<Tile>();
    }
    
    public void addBlackTile(Tile tile) {
        blackTiles.add(tile);
    }
    
    public void removeBlackTile(Tile tile) {
        blackTiles.remove(tile);
    }

    public ArrayList<Tile> getBlackTiles() {
        return blackTiles;
    }

    public void setBlackTiles(ArrayList<Tile> blackTiles) {
        this.blackTiles = blackTiles;
    }
    
    
    
}

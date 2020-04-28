package com.interrupt.dungeoneer.editor.selection;

import com.interrupt.dungeoneer.tiles.Tile;

public class TileSelectionInfo {
    public int x;
    public int y;
    public Tile tile;

    public TileSelectionInfo() {}

    public TileSelectionInfo(int x, int y, Tile tile) {
        this.x = x;
        this.y = y;
        this.tile = tile;
    }
}

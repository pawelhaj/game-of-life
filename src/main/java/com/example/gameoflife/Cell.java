package com.example.gameoflife;

public class Cell {

    private int x;
    private int y;

    public Cell(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public static Cell of(int x, int y) {
        return new Cell(x,y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return x == cell.x && y == cell.y;
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(x, y);
    }
}

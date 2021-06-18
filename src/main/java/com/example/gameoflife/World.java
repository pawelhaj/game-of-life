package com.example.gameoflife;

import java.util.Set;

public class World {

    private final static int MAX_SIZE = 10;

    private Set<Cell> aliveCells;

    public World(Set<Cell> aliveCells) {
        this.aliveCells = aliveCells;
    }

    public void print() {

        for (int x = 0; x < MAX_SIZE; x++) {
            for (int y = 0; y < MAX_SIZE; y++) {
                if (aliveCells.contains(Cell.of(x,y)))
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.print("\n");
        }
    }

    public void nextDay () {

    }

    public int neighbours(Cell currentCell) {
        int x = currentCell.getX();
        int y = currentCell.getY();

        int aliveNeighbours = 0;
        for (int i = x-1; i < 2; i++) {
            for (int j = y-1; j < 2; j++) {
                if (i >= 0 && i < MAX_SIZE && j >= 0 && j < MAX_SIZE) {
                    if (aliveCells.contains(Cell.of(i,j))) {
                        aliveNeighbours++;
                    }
                }
            }
        }
        return aliveNeighbours;
    }
}

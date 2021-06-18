package com.example.gameoflife;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GameOfLifeApplicationTests {

    @Test
    void initWorld() {

        int[][] board = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        World world = new World(getActiveCells(board));
        world.print();
    }

    @Test
    public void zero_neighbours_for_0_0_in_empty_world() {
        Set<Cell> cells = new HashSet<>();
        World world = new World(cells);

        int neighbours = world.neighbours(Cell.of(0, 0));

        assertThat(neighbours).isEqualTo(0);
    }

    private Set<Cell> getActiveCells(int[][] cells) {
        Set<Cell> aliveCells = new HashSet<>();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                int isActive = cells[i][j];
                if (isActive == 1) {
                    aliveCells.add(Cell.of(i, j));
                }
            }
        }
        return aliveCells;
    }
}

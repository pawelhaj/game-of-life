package com.example.gameoflife;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GameOfLifeApplicationTests {

    @Test
    void initWorld() {

        Set<Cell> cells = new HashSet<>();
        cells.add(Cell.of(0, 1));
        cells.add(Cell.of(0, 9));
        cells.add(Cell.of(1, 0));

        World world = new World(cells);

        world.print();
    }

    @Test
    public void zero_neighbours_for_0_0_in_empty_world() {
        Set<Cell> cells = new HashSet<>();
        World world = new World(cells);

        int neighbours = world.neighbours(Cell.of(0, 0));

        assertThat(neighbours).isEqualTo(0);
    }
}

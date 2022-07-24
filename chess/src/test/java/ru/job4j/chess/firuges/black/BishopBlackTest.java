package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
        assertEquals(new BishopBlack(Cell.A1).position(), Cell.A1);
    }

    @Test
    public void testCopy() {
        Cell cell = new BishopBlack(Cell.A2).copy(Cell.A3).position();
        assertEquals(cell, Cell.A3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWay() {
        Cell[] expected = new Cell[]{
                new BishopBlack(Cell.D2).position(),
                new BishopBlack(Cell.E3).position(),
                new BishopBlack(Cell.F4).position(),
                new BishopBlack(Cell.G5).position(),
        };
        Assert.assertArrayEquals(new BishopBlack(Cell.C1).way(Cell.G5), expected);
    }
}
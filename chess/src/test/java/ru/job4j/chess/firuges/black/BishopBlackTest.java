package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Assert.assertEquals(new BishopBlack(Cell.A1).position(), Cell.A1);
    }

    @Test
    public void testCopy() {
        Assert.assertEquals(new BishopBlack(Cell.A2).copy(Cell.A3).position(), Cell.A3);
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
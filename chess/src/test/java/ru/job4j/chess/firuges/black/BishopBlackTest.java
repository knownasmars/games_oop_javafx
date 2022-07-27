package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
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

    @Test
    public void testWay() {
        new BishopBlack(Cell.C1).way(Cell.G5);
    }
}
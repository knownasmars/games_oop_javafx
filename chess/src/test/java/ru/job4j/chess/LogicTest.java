package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.RookBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void moveWhenFigureIsNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.A3);
    }

    @Test(expected = OccupiedCellException.class)
    public void moveWhenCellIsOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new RookBlack(Cell.A3));
        logic.move(Cell.C1, Cell.A3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void moveWhenMoveIsImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C2);
    }
}
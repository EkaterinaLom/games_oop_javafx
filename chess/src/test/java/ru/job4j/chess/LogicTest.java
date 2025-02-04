package ru.job4j.chess;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void testMoveOccupiedCellEx() throws OccupiedCellException, FigureNotFoundException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.D2));
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.D2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void testMoveFigNotFoundEx() throws OccupiedCellException, FigureNotFoundException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.D2);

    }

    @Test(expected = ImpossibleMoveException.class)
    public void testMoveImpossibleMoveException() throws OccupiedCellException,
            FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.D1);
    }
}
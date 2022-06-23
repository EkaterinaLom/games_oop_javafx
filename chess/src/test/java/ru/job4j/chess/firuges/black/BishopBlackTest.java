package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell rsl = bishopBlack.position();
        assertEquals(rsl, Cell.A1);
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell dest = Cell.findBy(6, 3);
        Cell[] bishop = bishopBlack.way(dest);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, bishop);

    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.findBy(1, 6);
        Figure rsl = bishopBlack.copy(Cell.findBy(1, 6));
        assertEquals(rsl.position(), dest);
    }
}
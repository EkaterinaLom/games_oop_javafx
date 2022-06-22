package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell rsl = bishopBlack.position();
        assertEquals(rsl, Cell.A1);
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell dest = Cell.findBy(6, 3);
        Cell[] bishop = bishopBlack.way(dest);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, bishop);

    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.findBy(1, 6);
        Figure rsl = bishopBlack.copy(Cell.findBy(1, 6));
        assertEquals(rsl.position(), dest);
    }
}
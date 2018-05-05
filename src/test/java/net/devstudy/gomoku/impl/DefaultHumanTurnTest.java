package net.devstudy.gomoku.impl;

import net.devstudy.gomoku.Cell;
import net.devstudy.gomoku.CellValue;
import net.devstudy.gomoku.GameTable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DefaultHumanTurnTest {

    private DefaultHumanTurn turn = new DefaultHumanTurn();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void setGameTableSuccess() {
        turn.setGameTable(mock(GameTable.class));
    }

    @Test
    public void setGameTableFailed() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Game table can't be null");
        turn.setGameTable(null);
    }

    @Test
    public void makeTurn() {
        GameTable gameTable = mock(GameTable.class);
        turn.setGameTable(gameTable);
        Cell cell = turn.makeTurn(0, 2);
        assertEquals(0, cell.getRowIndex());
        assertEquals(2, cell.getColIndex());
        verify(gameTable).setValue(0, 2, CellValue.HUMAN);
    }
}
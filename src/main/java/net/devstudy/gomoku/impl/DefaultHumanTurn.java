package net.devstudy.gomoku.impl;

import net.devstudy.gomoku.Cell;
import net.devstudy.gomoku.CellValue;
import net.devstudy.gomoku.GameTable;
import net.devstudy.gomoku.HumanTurn;

import java.util.Objects;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class DefaultHumanTurn implements HumanTurn {
	private GameTable gameTable;
	
	@Override
	public void setGameTable(GameTable gameTable) {
		Objects.requireNonNull(gameTable, "Game table can't be null");
		this.gameTable = gameTable;
	}

	@Override
	public Cell makeTurn(int row, int col) {
		gameTable.setValue(row, col, CellValue.HUMAN);
		return new Cell(row, col);
	}
}

package net.devstudy.gomoku;

import java.util.List;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface WinnerResult {

    boolean winnerExists();

    List<Cell> getWinnerCells();
}

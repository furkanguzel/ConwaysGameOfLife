package furkanguzel.conways;

import static ch.lambdaj.Lambda.*;
import static com.google.common.collect.Iterables.*;
import static furkanguzel.conways.Pattern.*;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		forEach(newGameOfLife(CELL, BLINKER.from(-2, 0), BLINKER.from(2, 0), BLINKER.nextFrom(0, 2), BLINKER.nextFrom(0, -2))).printBoard();
	}

	private static GameOfLife newGameOfLife(Iterable<Cell>... cellGroups) {
		return new GameOfLife(concat(cellGroups));
	}
}
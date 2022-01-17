package com.perficient.techbootcampJoshSalame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
@SpringBootTest
class SudokuBoardTests {

	@Test
	void checkFirstValue() {
		int[][] boardValues = new int[9][9];
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				boardValues[row][col] = 1;
			}
		}
		
		SudokuBoard sb = new SudokuBoard(boardValues);
		Assertions.assertEquals(boardValues[0][0], sb.getBoard()[0][0]);
	}

}

package com.perficient.techbootcampJoshSalame;

public class SudokuBoard {
	private int[][] startBoard;
	
	public SudokuBoard() {
		startBoard = new int[9][9];
	}
	public SudokuBoard(int[][] startBoard) {
		this.startBoard = startBoard;
	}
	
	public void printBoard() {
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				System.out.print(" | " + startBoard[row][col]);
			}
			System.out.println(" | ");
		}
	}
	
	public int[][] getBoard() {
		return startBoard;
	}
	
}

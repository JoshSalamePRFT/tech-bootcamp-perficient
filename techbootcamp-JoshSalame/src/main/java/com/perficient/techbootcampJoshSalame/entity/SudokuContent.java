package com.perficient.techbootcampJoshSalame.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sudoku_Content")
public class SudokuContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long content_id;
	
	@Column (name = "sudoku_id")
	private long sudoku_id;
	
	@Column (name = "row_value")
	private int row;
	
	@Column (name = "column_value")
	private int column;
	
	@Column (name = "start_value")
	private int startValue;
	
	@Column (name = "solved_value")
	private int solvedValue;

	public long getContent_id() {
		return content_id;
	}

	public void setContent_id(long content_id) {
		this.content_id = content_id;
	}

	public long getSudoku_id() {
		return sudoku_id;
	}

	public void setSudoku_id(long sudoku_id) {
		this.sudoku_id = sudoku_id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getStartValue() {
		return startValue;
	}

	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}

	public int getSolvedValue() {
		return solvedValue;
	}

	public void setSolvedValue(int solvedValue) {
		this.solvedValue = solvedValue;
	}
}
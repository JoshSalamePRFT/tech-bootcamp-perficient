package com.perficient.techbootcampJoshSalame.entity;

import javax.persistence.*;

@Entity
@Table (name = "Sudoku_MetaData")
public class SudokuMetaData {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long sudoku_id;
	
	@Column(name = "puzzle_name")
	private String puzzleName;
	
	@Column(name = "creator")
	private String creator;
	
	@Column(name = "puzzle_rules")
	private String puzzleRules;
	
	@Column
	private String username;
	
	//google this to make it a Time or Date value in the table
	@Column
	private int completionTime;


	public long getSudoku_id() {
		return sudoku_id;
	}

	public void setSudoku_id(long sudoku_id) {
		this.sudoku_id = sudoku_id;
	}

	public String getPuzzleName() {
		return puzzleName;
	}

	public void setPuzzleName(String puzzleName) {
		this.puzzleName = puzzleName;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPuzzleRules() {
		return puzzleRules;
	}

	public void setPuzzleRules(String puzzleRules) {
		this.puzzleRules = puzzleRules;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(int completionTime) {
		this.completionTime = completionTime;
	}
	
}

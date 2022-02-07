package com.perficient.techbootcampJoshSalame.service;

import java.util.List;

import com.perficient.techbootcampJoshSalame.entity.SudokuContent;

public interface SudokuContentService {
	SudokuContent createSudokuContent(SudokuContent sudoku);
	SudokuContent readSudokuContent(long id);
	List<SudokuContent> readAllSudokuContent();
	SudokuContent updateSudokuContent(long id, SudokuContent updatedSudokuContent);
	void deleteSudokuContent(long id);
}

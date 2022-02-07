package com.perficient.techbootcampJoshSalame.service;

import java.util.List;

import com.perficient.techbootcampJoshSalame.entity.SudokuMetaData;

public interface SudokuMetaDataService  {
	SudokuMetaData createSudokuMetaData(SudokuMetaData sudokuMetaData);
	SudokuMetaData readSudokuMetaData(long id);
	List<SudokuMetaData> readAllSudokuMetaData();
	SudokuMetaData updateSudokuMetaData(long id, SudokuMetaData sudokuMetaData);
	void deleteSudokuMetaData(long id);
}

package com.perficient.techbootcampJoshSalame.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.perficient.techbootcampJoshSalame.entity.SudokuMetaData;
import com.perficient.techbootcampJoshSalame.repository.SudokuMetaDataRepository;

@Service
public class SudokuMetaDataServiceImpl implements SudokuMetaDataService {

	private SudokuMetaDataRepository sudokuMetaDataRepository;
	
	public SudokuMetaDataServiceImpl(SudokuMetaDataRepository sudokuMetaDataRepository) {
		super();
		this.sudokuMetaDataRepository = sudokuMetaDataRepository;
	}

	@Override
	public SudokuMetaData createSudokuMetaData(SudokuMetaData sudokuMetaData) {
		return sudokuMetaDataRepository.save(sudokuMetaData);
	}

	@Override
	public SudokuMetaData readSudokuMetaData(long id) {
		return sudokuMetaDataRepository.findById(id).orElseThrow();
	}
	
	@Override
	public List<SudokuMetaData> readAllSudokuMetaData() {
		return sudokuMetaDataRepository.findAll();
	}

	@Override
	public SudokuMetaData updateSudokuMetaData(long id, SudokuMetaData updatedSudokuMetaData) {
		SudokuMetaData existingSudokuMetaData = sudokuMetaDataRepository.findById(id).orElseThrow();
		
		existingSudokuMetaData.setCompletionTime(updatedSudokuMetaData.getCompletionTime());
		existingSudokuMetaData.setCreator(updatedSudokuMetaData.getCreator());
		existingSudokuMetaData.setPuzzleName(updatedSudokuMetaData.getPuzzleName());
		existingSudokuMetaData.setPuzzleRules(updatedSudokuMetaData.getPuzzleRules());
		existingSudokuMetaData.setUsername(updatedSudokuMetaData.getUsername());
		
		sudokuMetaDataRepository.save(existingSudokuMetaData);
		return existingSudokuMetaData;
	}

	@Override
	public void deleteSudokuMetaData(long id) {
		sudokuMetaDataRepository.findById(id).orElseThrow();
		sudokuMetaDataRepository.deleteById(id);
	}	
}
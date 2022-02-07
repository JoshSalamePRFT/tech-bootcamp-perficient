package com.perficient.techbootcampJoshSalame.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampJoshSalame.entity.SudokuContent;
import com.perficient.techbootcampJoshSalame.repository.SudokuContentRepository;

@Service
public class SudokuContentServiceImpl implements SudokuContentService {

	private SudokuContentRepository sudokuContentRepository;
	
	public SudokuContentServiceImpl(SudokuContentRepository sudokuContentRepository) {
		super();
		this.sudokuContentRepository = sudokuContentRepository;
	}

	@Override
	public SudokuContent createSudokuContent(SudokuContent sudokuContent) {
		return sudokuContentRepository.save(sudokuContent);
	}

	@Override
	public SudokuContent readSudokuContent(long id) {
		return sudokuContentRepository.findById(id).orElseThrow();
	}

	@Override
	public List<SudokuContent> readAllSudokuContent() {
		return sudokuContentRepository.findAll();
	}
	
	@Override
	public SudokuContent updateSudokuContent(long id, SudokuContent updatedSudokuContent) {
		SudokuContent existingSudokuContent = sudokuContentRepository.findById(id).orElseThrow();
		existingSudokuContent.setColumn(updatedSudokuContent.getColumn());
		existingSudokuContent.setRow(updatedSudokuContent.getRow());
		existingSudokuContent.setStartValue(updatedSudokuContent.getStartValue());
		existingSudokuContent.setSolvedValue(updatedSudokuContent.getSolvedValue());
		existingSudokuContent.setSudoku_id(updatedSudokuContent.getSudoku_id());
		
		sudokuContentRepository.save(existingSudokuContent);
		return existingSudokuContent;
	}

	@Override
	public void deleteSudokuContent(long id) {
		sudokuContentRepository.findById(id).orElseThrow();
		sudokuContentRepository.deleteById(id);
	}
}
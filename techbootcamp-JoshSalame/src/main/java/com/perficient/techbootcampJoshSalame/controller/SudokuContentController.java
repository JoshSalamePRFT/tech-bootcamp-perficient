package com.perficient.techbootcampJoshSalame.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampJoshSalame.entity.SudokuContent;
import com.perficient.techbootcampJoshSalame.service.SudokuContentService;

@RestController
@RequestMapping("/sudoku-content")
public class SudokuContentController {

	private SudokuContentService sudokuContentService;
	
	public SudokuContentController(SudokuContentService sudokuContentService) {
		super();
		this.sudokuContentService = sudokuContentService;
	}
	
	//Implement CRUD methods get, post, put, delete.

	@GetMapping("/get/{id}")
	public SudokuContent getSudokuContent(@PathVariable("id") long id) {
		return sudokuContentService.readSudokuContent(id);
	}
	
	@GetMapping("/get/all")
	public List<SudokuContent> getAllSudokuContent() {
		return sudokuContentService.readAllSudokuContent();
	}
	
	@PostMapping("/post")
	public ResponseEntity<SudokuContent> postSudokuContent(@RequestBody SudokuContent sudokuContent) {
		return new ResponseEntity<SudokuContent>(sudokuContentService.createSudokuContent(sudokuContent), HttpStatus.CREATED);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<SudokuContent> putSudokuContent(@PathVariable("id") long id, @RequestBody SudokuContent sudokuContent) {
		return new ResponseEntity<SudokuContent>(sudokuContentService.updateSudokuContent(id, sudokuContent), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSudokuContent(@PathVariable("id") long id) {
		sudokuContentService.deleteSudokuContent(id);
		return new ResponseEntity<String>("Content deleted successfully.", HttpStatus.OK);
	}
}

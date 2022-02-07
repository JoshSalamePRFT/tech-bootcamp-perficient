package com.perficient.techbootcampJoshSalame.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.perficient.techbootcampJoshSalame.entity.SudokuMetaData;
import com.perficient.techbootcampJoshSalame.service.SudokuMetaDataService;
//import com.perficient.techbootcampJoshSalame.service.SudokuMetaDataServiceImpl;

@RestController
@RequestMapping("/sudoku-metadata")
public class SudokuMetaDataController {

	private SudokuMetaDataService sudokuMetaDataService;
	
	public SudokuMetaDataController(SudokuMetaDataService sudokuMetaDataService) {
		super();
		this.sudokuMetaDataService = sudokuMetaDataService;
	}

	//Implement CRUD methods get, post, put, delete. 
	
	@GetMapping("/get/{id}")
	public ResponseEntity<SudokuMetaData> getSudokuMetaData(@PathVariable("id") long id) {
		return new ResponseEntity<SudokuMetaData>(sudokuMetaDataService.readSudokuMetaData(id), HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public List<SudokuMetaData> getAllSudokuMetaData() {
		return sudokuMetaDataService.readAllSudokuMetaData();
	}
	
	@PostMapping("/post")
	public ResponseEntity<SudokuMetaData> postSudokuMetaData(@RequestBody SudokuMetaData sudokuMetaData) {
		return new ResponseEntity<SudokuMetaData>(sudokuMetaDataService.createSudokuMetaData(sudokuMetaData), HttpStatus.CREATED);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<SudokuMetaData> putSudokuMetaData(@PathVariable("id") long id, @RequestBody SudokuMetaData sudokuMetaData) {
		return new ResponseEntity<SudokuMetaData>(sudokuMetaDataService.updateSudokuMetaData(id, sudokuMetaData), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSudokuMetaData(@PathVariable("id") long id) {
		sudokuMetaDataService.deleteSudokuMetaData(id);
		return new ResponseEntity<String>("MetaData deleted successfully.", HttpStatus.OK);
	}
	
	@GetMapping("/")
	public String viewSudokuMetaDataHomePage(Model model) {
		model.addAttribute("listSudokuMetaData", sudokuMetaDataService.readAllSudokuMetaData());
		return "index";
	}
	
	/*@GetMapping("/showNewSudokuMetaDataForm")
	public String showNewSudokuMetaDataForm(Model model) {
		SudokuMetaData sudokuMetaData = new SudokuMetaData();
		model.addAttribute("sudokuMetaData", sudokuMetaData);
		return "addSudokuMetaData";
	}
	
	@PostMapping("/saveSudokuMetaData")
	public String saveSudokuMetaData(@ModelAttribute("sudokuMetaData") SudokuMetaData sudokuMetaData) {
		sudokuMetaDataService.createSudokuMetaData(sudokuMetaData);
		return "redirect:/";
	}*/
	
}
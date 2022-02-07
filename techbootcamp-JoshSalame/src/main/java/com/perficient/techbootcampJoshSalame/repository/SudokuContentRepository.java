package com.perficient.techbootcampJoshSalame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perficient.techbootcampJoshSalame.entity.SudokuContent;


public interface SudokuContentRepository extends JpaRepository<SudokuContent, Long> {
	//JPARepo implements CRUD + Paging/Sorting
}

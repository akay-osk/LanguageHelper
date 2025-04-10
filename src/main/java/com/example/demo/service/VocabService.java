package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vocab;

public interface VocabService {
	
	//Search All Items
	List<Vocab> findAllVocabs();
	
	//Serach a word selected by ID
	Vocab findByIdVocab(Integer id);
	
	//Resister a new word
	void insertVocab(Vocab vocab);
	
	//Update a word
	void updateVocab(Vocab vocab);
	
	//Delete a word selected by ID
	void deleteVocab(Integer id);

}

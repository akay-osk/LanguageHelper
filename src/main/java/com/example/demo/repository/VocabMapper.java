package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Vocab;

@Mapper
public interface VocabMapper {
	//Get the Words List
	List<Vocab> selectAll();
	
	//Get a word selected by ID
	Vocab selectById(@Param("id") Integer id);
	
	//Resister a new word
	void insert(Vocab foreignWord);
	
	//Update a word
	void update(Vocab foreignWord);
	
	//Delete a word selected by ID
	void delete(@Param("id") Integer id);

}

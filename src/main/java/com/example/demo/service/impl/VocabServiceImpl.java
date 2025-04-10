package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Vocab;
import com.example.demo.repository.VocabMapper;
import com.example.demo.service.VocabService;

import lombok.RequiredArgsConstructor;

//Service実装クラス
@Service
@Transactional
@RequiredArgsConstructor
public class VocabServiceImpl implements VocabService {
	
	//DI
	private final VocabMapper vocabMapper;

	@Override
	public List<Vocab> findAllVocabs() {
		
		return vocabMapper.selectAll();
	}

	//このメソッド要らんかも！
	@Override
	public Vocab findByIdVocab(Integer id) {
		
		return vocabMapper.selectById(id);
	}

	@Override
	public void insertVocab(Vocab vocab) {
		vocabMapper.insert(vocab);

	}

	@Override
	public void updateVocab(Vocab vocab) {
		vocabMapper.update(vocab);

	}

	@Override
	public void deleteVocab(Integer id) {
		vocabMapper.delete(id);
	}

}

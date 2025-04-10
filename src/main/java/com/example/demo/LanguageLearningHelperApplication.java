package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Vocab;
import com.example.demo.service.VocabService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class LanguageLearningHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageLearningHelperApplication.class, args)
		.getBean(LanguageLearningHelperApplication.class).exe();
	}
	
	//DI
	private final VocabService service;
	
	public void exe() {
		//Search All Items
		System.out.println("=== SEARCH ALL ITEMS ===");
		for(Vocab row : service.findAllVocabs()) {
			System.out.println(row);
		}
		//Search One Item
		System.out.println("=== SEARCH ONE ITEM ===");
		System.out.println(service.findByIdVocab(1));
		
		//Resister
		//Create a data
		Vocab word= new Vocab();
		word.setWord("Service Test: étoile");
		word.setPronunciation("Service Test: etwal");
		word.setPartOfSpeech("Service Test: noun (feminine)");
		word.setTranslation("Service Test: star");
		word.setCreatedAt(LocalDateTime.now());
		service.insertVocab(word);
		System.out.println("=== Resistered Successfully ===");
		System.out.println(service.findByIdVocab(2));
		
//		//Update
//		Vocab target= service.findByIdVocab(1);
//		target.setPartOfSpeech("Service Test: phr");
//		service.updateVocab(target);
//		System.out.println("Updated Successfully");
//		System.out.println(service.findByIdVocab(1));
//		
//		//Delete
//		service.deleteVocab(2);
//		System.out.println("Deleted Successfully");
//		for(Vocab row : service.findAllVocabs()) {
//			System.out.println(row);
//		}
		
	}

}

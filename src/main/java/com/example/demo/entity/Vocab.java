package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vocab {
	private Integer id;
	
	private String word;
	private String pronunciation;
	private String partOfSpeech;
	private String translation;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}

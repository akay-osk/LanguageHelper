package com.example.demo.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VocabForm {
	private Integer id;
	private String word;
	private String pronunciation;
	private String partOfSpeech;
	private String translation;
	private Boolean isNew;

}

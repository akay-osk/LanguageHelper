package com.example.demo.helper;

import com.example.demo.entity.Vocab;
import com.example.demo.form.VocabForm;

public class VocabAppHelper {
	
	public static Vocab convertVocab(VocabForm form) {
		Vocab vocab= new Vocab();
		vocab.setId(form.getId());
	}

}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Vocab;
import com.example.demo.service.VocabService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/vocabs")
@RequiredArgsConstructor
public class VocabController {
	
	//DI
	private final VocabService vocabService;
	
	//Display the list of vocabs
	@GetMapping
	public String list(Model model) {
		model.addAttribute("vocabs", vocabService.findAllVocabs());
		return "vocab/list";
	}
	
	//Display Details
	@GetMapping("/{id}")
	public String detail(@PathVariable Integer id, Model model, RedirectAttributes attributes) {
		//IDに対する単語の詳細を取得
		Vocab vocab= vocabService.findByIdVocab(id);
		if(vocab != null) {
			model.addAttribute("vacab", vocabService.findByIdVocab(id));
			return "vocab/detail";
		}else {
			attributes.addFlashAttribute("errorMessage", "No Target Data Available");
			return "redirect:/vocabs";
		}
	}
}

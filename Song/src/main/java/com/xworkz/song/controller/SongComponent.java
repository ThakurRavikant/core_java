package com.xworkz.song.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.song.dto.SongDTO;
import com.xworkz.song.service.SongService;

@Controller
@RequestMapping("/")
public class SongComponent {
	
	@Autowired
	private SongService service;
	
	public SongComponent() {
		System.out.println("Creating Bean SongComponent");
	}
	
	@PostMapping("/save")
	public String result(@Valid SongDTO dto, BindingResult error, Model model) {
		System.out.println("Running result method in SongComponent.. ");
		System.out.println("Running Song dto from data:"+dto);
		System.out.println("Is Song dto is in valid:"+error.hasErrors());
		
		if(error.hasErrors()) {
			System.out.println(dto);
			System.out.println("error");
			List<ObjectError>objError=error.getAllErrors();
			objError.forEach(errs->System.err.println(errs.getObjectName()+"message" +errs.getDefaultMessage()));
			model.addAttribute("dto",dto);
			model.addAttribute("error",objError);
			return "Song";
		}else {
		  boolean res=service.saveAndValidation(dto);
			System.out.println("Message Added");
			model.addAttribute("msg","Song Information Details sent sccessfully.....");

		}
		
		return "SongSuccess";

	}
}

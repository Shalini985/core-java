package com.xworkz.toy.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.toy.dto.ToyDto;
import com.xworkz.toy.service.ToyService;

@Controller
@RequestMapping("/")
public class ToysController {

	@Autowired
	public ToyService aeroplaneService;

	public ToysController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	private List<String> type = Arrays.asList("doll", "teddy", "Sour");

	private List<String> color = Arrays.asList("Brown", "Orange", "Pink");

	@GetMapping("/rese")
	public String onAeroplane(Model model) {
		System.out.println("Running onAeroplane on getmapping");
		model.addAttribute("type", type);
		model.addAttribute("color", color);
		return "Register";
	}

	@PostMapping("/rese")
	public String onAeroplane(ToyDto dto, Model model) {
		Set<ConstraintViolation<ToyDto>> constraintViolations = this.aeroplaneService.saveAndValidate(dto);
		if (constraintViolations.isEmpty()) {
			System.out.println("Data Entered Sucessfully");
			System.out.println(dto);
			return "Register";
		}
		model.addAttribute("type", type);
		model.addAttribute("color", color);

		model.addAttribute("constraintViolations", constraintViolations);
		System.out.println(dto);

		System.err.println("violations in controller");
		model.addAttribute("error", constraintViolations);

		return "Register";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {

		System.out.println("Running on search for id " + id);

		ToyDto dto = this.aeroplaneService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "ToySearch";
	}
	@GetMapping("/searchcompany")
	public String onSearchByCompany(@RequestParam String company,Model model) {
		System.out.println("running onsearchByCompany controller"+company);
		List<ToyDto> list=this.aeroplaneService.findByCompany(company);
		model.addAttribute("list",list);
		return "findbyname";
	}
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
ToyDto dto=this.aeroplaneService.findById(id);
		System.out.println("Running on search for id " + id);
		model.addAttribute("type", type);
		model.addAttribute("color", color);
		model.addAttribute("t", dto);

		return "UpdateToy";
	}
	
	@PostMapping("/update")
	public String onUpdate(ToyDto dto,Model model) {
		System.out.println("running onupdate"+dto);
		Set<ConstraintViolation<ToyDto>> constraintViolations=this.aeroplaneService.validateAndUpdate(dto);
		if(constraintViolations.size()>0) {
			model.addAttribute("error",constraintViolations);
		}
		else {
			model.addAttribute("message","toy upadate success....");
		}
		return "UpdateToy";
		
	}
}
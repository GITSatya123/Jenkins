package com.st.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	/*@RequestMapping("/data")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		model.addAttribute("sid", 101);
		model.addAttribute("sname", "satya");
		model.addAttribute("age", "35");
		model.addAttribute("gender", "male");
		return "studentData";
	}*/
	
	//send list data
	@RequestMapping("/data")
	public String viewData(Model model) {
	List<String> list= new ArrayList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	Map<String, String> map=new LinkedHashMap<>();
	//map.put("sno", 101);
	map.put("sname", "anuu");
	//map.put("age", 21);
	map.put("gender","female");
	
	model.addAttribute("list", list);
	model.addAttribute("map	", map);
	return "studentData";
	}
}

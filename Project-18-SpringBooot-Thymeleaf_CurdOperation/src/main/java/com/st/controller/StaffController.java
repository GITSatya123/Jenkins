package com.st.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.st.model.Staff;
import com.st.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffService service;
	
	//1.show page
	@GetMapping("/show")
	public String showStaffPage(Model model) {
		model.addAttribute("staff", new Staff());
		return "staffdetails";
	}
	
	//2.save data
	@PostMapping("/save")
	public String saveStaffData(@ModelAttribute Staff staff,Model model ) {
	 Integer id=service.saveStaff(staff);
	 model.addAttribute("message", "staff Data '"+id+"' saved!");
	 model.addAttribute("staff", new Staff());
	 return "staffdetails";
	}
	
	//3.Fetch data to UI
	@GetMapping("/all")
	public String showData(Model model ) {
		List<Staff> list=service.getAllStaff();
		model.addAttribute("list", list);
		return "staffdata";
	}
	
	//4.delete data
	@GetMapping("/delete")
	public String deleteData(@RequestParam Integer id,Model model) {
		service.deleteStaff(id);
		List<Staff> list=service.getAllStaff();
		model.addAttribute("list", list);
		model.addAttribute("message", "Staff data'"+id+"'deleted");
		return "staffdata";
	}
	//5.show edit page
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model) {
		Optional<Staff> opt=service.getOneStaff(id);
		model.addAttribute("staff", opt.get());
		return "staffedit";
	}
	
	//6.update data
	@PostMapping("/update")
	public String updateData(@ModelAttribute Staff staff,Model model) {
		service.updateStaff(staff);
		List<Staff> list=service.getAllStaff();
		model.addAttribute("list", list);
		model.addAttribute("message", "Staff '"+staff.getStaffId()+"' updated");
		return "staffedit";
	}
}
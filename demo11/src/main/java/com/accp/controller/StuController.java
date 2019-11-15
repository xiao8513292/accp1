package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Student;
import com.accp.service.StudentService;

@Controller
public class StuController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/show")
	public String toShow(Model model) {
		List<Student> list = service.queryAll();
		model.addAttribute("list",list);
		return "show";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		service.delete(id);
		return "redirect:show";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "add";
	}
	
	@RequestMapping("/add")
	public String add(Student stu) {
		service.add(stu);
		return "redirect:show";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model,Integer id){
		Student stu = service.queryById(id);
		model.addAttribute("stu",stu);
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(Student stu) {
		service.update(stu);
		return "redirect:show";
	}
}

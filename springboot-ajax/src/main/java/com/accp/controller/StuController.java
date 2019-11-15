package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Student;
import com.accp.service.StuService;

@Controller
@RequestMapping("/shang")
public class StuController {
	
	@Autowired
	StuService service;
	
	@RequestMapping("/show")
	public String toShow() {
		return "show";
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Student> queryAll(){
		return service.queryAll();		
	}
	
	@RequestMapping("/files")
	@ResponseBody
	public String files() {
		return "redirect:/shang/show";
	}
}

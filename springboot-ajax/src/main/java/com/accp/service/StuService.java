package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Student;
import com.accp.mapper.StudentMapper;

@Service
@Transactional
public class StuService {
	
	@Autowired
	StudentMapper mapper;
	
	public List<Student> queryAll(){
		return mapper.selectByExample(null);
	}
}

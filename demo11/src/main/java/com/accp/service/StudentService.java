package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Student;
import com.accp.mapper.StudentMapper;

import ch.qos.logback.classic.spi.STEUtil;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentMapper studentMapper;
	
	public List<Student> queryAll(){
		return studentMapper.selectByExample(null);
	}
	
	public String delete(Integer id) {
		studentMapper.deleteByPrimaryKey(id);
		return "000";
	}
	
	public String add(Student stu) {
		studentMapper.insert(stu);
		return "00";
	}
	
	public Student queryById(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}
	
	public String update(Student stu) {
		studentMapper.updateByPrimaryKey(stu);
		return "0000";
	}
}

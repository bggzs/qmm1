package com.db.student;

import java.io.IOException;
import java.util.List;

public interface studentMapping {	
	public List<student> findAll ()throws IOException;
	public List<student> findByname()throws IOException;
	public student findById(String id)throws IOException;
	public List<student> findByClass()throws IOException;
	public void updatePassword(student student)throws IOException;
}

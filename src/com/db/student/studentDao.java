package com.db.student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class studentDao implements studentMapping{
	SqlSessionFactory factory;
	public studentDao() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Override
	public List<student> findAll() throws IOException {
		// TODO Auto-generated method stub
		SqlSession session = factory.openSession();
		List<student> students=session.selectList("com.db.student.findall");
		session.close();
		return students;
	}

	@Override
	public List<student> findByname() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public student findById(String id) throws IOException {

		SqlSession session = factory.openSession();
		student res=session.selectOne("com.db.student.findById",id);
		session.close();
		return res;
	}

	@Override
	public List<student> findByClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassword(student student) throws IOException {

		SqlSession session = factory.openSession();
		session.update("com.db.student.updatePassword", student);
		session.commit();
		session.close();
	}
	

}

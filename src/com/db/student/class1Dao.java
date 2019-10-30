package com.db.student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.db.column.class1Column;
import com.db.column.classwork;

public class class1Dao implements chass1Mapping{

	@Override
	public List<class1> findallcalss() throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<class1> class1=session.selectList("com.db.student.findallcalss");
		session.close();
		return class1;
	}
	public List<class1Column> findclasscolumn() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<class1Column> res=session.selectList("com.db.student.findclasscolumn");
		session.close();
		return res;
		
	}
	public List<class1> findclassS() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<class1> res=session.selectList("com.db.student.findallclassS");
		session.close();
		return res;
	}
	
	public List<qmm2> findclassqmm() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<qmm2> res=session.selectList("com.db.student.findclassqmm2");
		session.close();
		return res;
		
	}
	
	public List<qmm2> findclassG() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<qmm2> res=session.selectList("com.db.student.findclassG");
		session.close();
		return res;
		
	}
	
	public List<classCX> findclassCX() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<classCX> res=session.selectList("com.db.student.findcx0");
		session.close();
		return res;
		
	}
 
	public List<classCX> findclassById(int id) throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<classCX> res=session.selectList("com.db.student.findcxId", id);
		session.close();
		return res;
		
	}
	public List<classCX> findclassByName(String name) throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<classCX> res=session.selectList("com.db.student.findcxName", name);
		session.close();
		return res;
	}
	public List<classCX> findclassByStat(String stat) throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<classCX> res=session.selectList("com.db.student.findcxStat", stat);
		session.close();
		return res;
	}
	
	public List<classwork> findclasswork() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		List<classwork> res=session.selectList("com.db.student.findclasswork");
		session.close();
		return res;
		
	}
	
}

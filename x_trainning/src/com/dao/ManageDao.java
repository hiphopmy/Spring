package com.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.ManageMapper;

public class ManageDao {
	private SqlSessionFactory sqlSessionFactory;
	
	public ManageDao() {
		InputStream mybatisConfigInputStream = null;
		try {
			mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config.xml");
			this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(mybatisConfigInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Manage findManageByNo(Integer no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ManageMapper manageMapper = sqlSession.getMapper(ManageMapper.class);
		Manage manage = manageMapper.findManageByNo(no);
		sqlSession.close();
		return manage;		
	}
	
	public List<Manage> findManageAll(){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ManageMapper manageMapper = sqlSession.getMapper(ManageMapper.class);
		ArrayList manageList = (ArrayList)manageMapper.findManageAll();
		sqlSession.close();
		return manageList;
	}
	
	
	public int insert(Manage manage) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ManageMapper manageMapper = sqlSession.getMapper(ManageMapper.class);
		int insertRow = manageMapper.insertManage(manage);
		sqlSession.close();
		return insertRow;
	}
	
	public int delete(Integer no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ManageMapper manageMapper = sqlSession.getMapper(ManageMapper.class);
		int deleteRow = manageMapper.deleteManage(no);
		sqlSession.close();
		return deleteRow;
	}
	
	public int update(Manage manage) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		ManageMapper manageMapper = sqlSession.getMapper(ManageMapper.class);
		int updateRow = manageMapper.updateManage(manage);
		sqlSession.close();
		return updateRow;		
	}
	
	
	
	
}

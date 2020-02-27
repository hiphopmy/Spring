package com.dao;

import java.util.List;

public class ManageService {
	private ManageDao manageDao;
	
	public ManageService() {
		manageDao = new ManageDao();
	}
	
	public Manage findManageByNo(int no) {
		return manageDao.findManageByNo(no);
	}
	
	public List<Manage> findManageAll(){
		return manageDao.findManageAll();
	}
	
	public int insert(Manage manage) {
		return manageDao.insert(manage);
	}
	
	public int update(Manage manage) {
		return manageDao.update(manage);
	}
	
	public int delete(int no) {
		return manageDao.delete(no);
	}

}

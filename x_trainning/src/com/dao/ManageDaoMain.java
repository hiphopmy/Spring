package com.dao;

public class ManageDaoMain {
	public static void main(String[] args) {
		ManageDao manageDao = new ManageDao();
		
		System.out.println("1.findManageByNo");
		System.out.println(manageDao.findManageByNo(2));
		
		System.out.println("2.findManageAll");
		System.out.println(manageDao.findManageAll());
		
		System.out.println("3.insert");
		Manage insertManage = new Manage(10,"김십",20);
		System.out.println(manageDao.insert(insertManage));
		
		System.out.println("4.update");
		Manage updateManage = new Manage(2,"김이변경",22);
		System.out.println(manageDao.update(updateManage));
		
		System.out.println("5.delete");
		System.out.println(manageDao.delete(3));
		
		
	}

}

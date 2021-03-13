package model.dao;

import db.DB;
import model.dao.jdbc.DepartmentDaoJDBC;
import model.dao.jdbc.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}

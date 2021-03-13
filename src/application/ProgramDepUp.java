package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.Department;
import model.dao.DepartmentDao;

public class ProgramDepUp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("\n>> findById :\n");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);
		
		
		System.out.println("\n\n>>The ProgramDepUp has been finished in "+ sdf.format(new Date()));
		sc.close();
	}

}

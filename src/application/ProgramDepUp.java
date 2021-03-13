package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
		
		System.out.println("\n>> Insert :\n");
		Department newDep = new Department(null, "Painting");
		departmentDao.insert(newDep);;
		System.out.println("New department has been inserted:\n" + newDep);
		
		System.out.println("\n>> Update :\n");
		Department updatedep = departmentDao.findById(newDep.getId());
		updatedep.setName("Programming");
		departmentDao.update(updatedep);
		System.out.println("Updated department to:\n" + updatedep);
		
		System.out.println("\n>> findById :\n");
		Department dep = departmentDao.findById(7);
		System.out.println(dep);
		
		System.out.println("\n>> findAll :\n");
		List<Department> AllDep = departmentDao.findAll();
		for(Department dept : AllDep) {
			System.out.println(dept);			
		}
		
		System.out.println("\n>> Delete :\n");
		System.out.println(departmentDao.findById(newDep.getId()) + "\nThis Department has been removed.\n");
		departmentDao.deleteById(newDep.getId());
//		departmentDao.deleteById(11);
		
		
		System.out.println("\n\n>>The ProgramDepUp has been finished in "+ sdf.format(new Date()));
		sc.close();
	}

}

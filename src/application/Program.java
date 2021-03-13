package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.Department;
import model.dao.Seller;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department department = new Department(4,null);
		
		System.out.println("\n>> Insert :\n");
		Seller newSeller = new Seller(null, "Gui", "gui@email.com", new Date(), 3500.00, department);
		sellerDao.insert(newSeller);
		System.out.println("New seller has been inserted:\n" + newSeller);	
		
		System.out.println("\n>> Update :\n");
		
		Seller updateSeller = sellerDao.findById(newSeller.getId());
		updateSeller.setName("Guilherme Ribas");
		updateSeller.setBaseSalary(4500.0);
		sellerDao.update(updateSeller);
		System.out.println("Updated seller to:\n" + updateSeller);			
		
		System.out.println("\n>> findById :\n");
		Seller seller = sellerDao.findById(7);
		System.out.println(seller);
		
		System.out.println("\n>> findByDepartment :\n");
		List<Seller> sellerByDep = sellerDao.findByDepartment(department);
		for(Seller obj : sellerByDep) {
			System.out.println(obj);			
		}
		
		System.out.println("\n>> findAll :\n");
		List<Seller> sellerAll = sellerDao.findAll();
		for(Seller obj : sellerAll) {
			System.out.println(obj);			
		}
		
		System.out.println("\n>> Delete :\n");
		sellerDao.deleteById(newSeller.getId());
//		sellerDao.deleteById(12);
		System.out.println(newSeller + "\nThis Seller has been removed.\n");
		
		System.out.println("\n\n>>The application has been finished in "+ sdf.format(new Date()));
		sc.close();
	}

}

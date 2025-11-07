package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Department obj = new Department(1, "Books");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		//Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
		
		//SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findById ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list= sellerDao.findAll();
		list.forEach(System.out::println);
		
		/*
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller addSeller = new Seller(null, "Greg", "greg@gmail", LocalDate.now(), 4000.00, department);
		sellerDao.insert(addSeller);
		System.out.println("Inserted! New id = " + addSeller.getid());
		*/
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id to be deleted: ");
		Scanner sc = new Scanner(System.in);
		//seller.setid(sc.nextInt());
		sellerDao.deleteById(sc.nextInt());
		sc.close();
		System.out.println("Delete completed!");
	}

}

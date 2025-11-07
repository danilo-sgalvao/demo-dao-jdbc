package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
	}

}

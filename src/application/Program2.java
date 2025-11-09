package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Test 1: department findById ===");
		System.out.print("Enter department id:");
		int id = sc.nextInt();
		Department dep = depDao.findById(id);
		System.out.println(dep);
		System.out.println();
		
		/*	
		System.out.println("=== Test 1: department insert ===");
		System.out.println("Department name: ");
		String name = sc.nextLine();
		Department dep = new Department(null, name);
		depDao.insert(dep);
		System.out.println("Insertion succesfull! New id = " + dep.getId());
		System.out.println();
		*/
		
		System.out.println("=== Test 3: department findAll ===");
		List<Department> depList = depDao.findAll();
		depList.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("=== Test 4: department update ===");
		dep = depDao.findById(7);
		dep.setName("stuff");
		depDao.update(dep);
		System.out.println("Update completed!" + depDao.findById(6));
		System.out.println();
		
		System.out.println("=== Test 5: department deleteById ===");
		depDao.deleteById(6);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}

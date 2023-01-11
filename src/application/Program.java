package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		SellerDAO sellerDao = DaoFactory.createSellerDao();
		System.out.println("===Test 1: seller findbyId ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("===Test 2: seller findbyDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("===Test 3: seller findAll ====");
		list = sellerDao.findAll();
		for(Seller s:list) {
			System.out.println(s);
		}
	}

}

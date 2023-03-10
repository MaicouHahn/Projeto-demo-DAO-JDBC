package application;

import java.util.Date;
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
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("===Test 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("===Test 4: seller Insert ====");
		
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.00,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id : "+ newSeller.getId());
		
		System.out.println();

		System.out.println("===Test 5: seller Update ====");
		
		seller = sellerDao.findById(1);//pega os atributos do seller id 1
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("update completed");
		
		System.out.println();

		System.out.println("===Test 6: seller Delete ====");
		
		sellerDao.deleteById(12);
		sellerDao.deleteById(11);
		sellerDao.deleteById(10);
		System.out.println("user deleted");
	}

}

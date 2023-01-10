package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department d1 = new Department(1, "Books");

		Seller s1 = new Seller(21, "Bob","bob@gmail.com", new Date(), 3000.00, d1);
		
		System.out.println(s1);

	}

}

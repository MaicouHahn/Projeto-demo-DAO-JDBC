package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDAO  departmentDao = DaoFactory.createDepartmentDao();
		
		//insert
		//Department dp2 = new Department(5,"Tourism");
		//departmentDao.insert(dp2);
		
		//update && findbyId
		//Department dep = departmentDao.findById(3);
		//dep.setName("Metalurgy");
		//departmentDao.update(dep);
		
		//deleteById
		//departmentDao.deleteById(5);
		
		//findall
		List<Department>dep = departmentDao.findAll();
		
		for(Department d : dep) {
			System.out.println(d);
		}
		
	}

}

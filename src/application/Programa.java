package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.CreateSellerDao();

		System.out.println("-----------Teste 1: Seller findById-----------");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n-----------Teste 2: Seller findByDepartment-----------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

		}
		System.out.println("\n-----------Teste 3: Seller findByAll()-----------");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n-----------Teste 4: Seller Insert()-----------");
		Seller newSeller = new Seller(null, "Luke", "luke@hotmail", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Concluído! novo id: " + newSeller.getId());
		sellerDao.findById(9);
		System.out.println(newSeller);
	}

}
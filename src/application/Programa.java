package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.CreateSellerDao();

		System.out.println("\n-----------Teste 3: Seller findByAll()-----------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
	/*	System.out.println("-----------Teste 6: Seller DeleteById-----------");
		System.out.print("Informe o Id para deleção: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleção concluída!");
		
		sc.close();
		 
	/*	System.out.println("-----------Teste 1: Seller findById-----------");
		Seller seller = sellerDao.findById(9);
		System.out.println(seller);

		System.out.println("\n-----------Teste 2: Seller findByDepartment-----------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

		}
		
		
		/*System.out.println("\n-----------Teste 4: Seller Insert()-----------");
		Seller newSeller = new Seller(null, "Luke", "luke@hotmail", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Concluído! novo id: " + newSeller.getId());
		sellerDao.findById(9);
		System.out.println(newSeller);*/
		
		/*System.out.println("\n-----------Teste 5: Seller Upadate()-----------");
		sellerDao.findById(9);
		seller.setName("Nathan Cross");
		seller.setEmail("nathan@hotmail.com");
		sellerDao.update(seller);
		System.out.println("Concluído!");
		System.out.println(seller);*/
	}

}
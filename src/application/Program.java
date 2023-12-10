package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department dp = new Department(1, "Books");
        System.out.println(dp);

        Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.00, dp);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}

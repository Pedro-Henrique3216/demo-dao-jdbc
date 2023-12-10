package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department dp = new Department(1, "Books");
        System.out.println(dp);

        Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.00, dp);

        System.out.println(seller);

    }
}

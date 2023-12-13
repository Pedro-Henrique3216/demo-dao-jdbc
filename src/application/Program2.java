package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =======");
        Department department = departmentDao.findById(3);

        System.out.println(department);

        System.out.println();
        System.out.println("=== TEST 2: department findAll =======");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== TEST 3: department insert =======");
        Department newDepartment = new Department(null, "Limpeza");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id = " + newDepartment.getId());
    }
}

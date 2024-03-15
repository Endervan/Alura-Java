package db.apllication;

import db.model.dao.DaoFactory;
import db.model.dao.DepartmentDao;
import db.model.entities.Department;

public class Program2DepartamentInsert {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=========test 3 : seller insert =========");
//        Department department = new Department(null, "jonas");
//        departmentDao.insert(department);
//        System.out.println("insert Complete ");

        System.out.println("=========test 4 : department update =========");
        Department department = departmentDao.findById(2);
        department.setName("Toshiba");
        departmentDao.update(department);
        System.out.println("Uptade Complete ");

        System.out.println("=========test 4 : department delete =========");
        departmentDao.deleteById(7);
        System.out.println("deletado com sucesso ");


    }
}

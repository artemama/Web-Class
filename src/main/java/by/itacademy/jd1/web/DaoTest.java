package by.itacademy.jd1.web;

import java.sql.SQLException;
import java.util.List;

import by.itacademy.jd1.web.dao.IBrandDao;
import by.itacademy.jd1.web.dao.ICarDao;
import by.itacademy.jd1.web.dao.IModelDao;
import by.itacademy.jd1.web.dao.impl.BrandDaoImpl;
import by.itacademy.jd1.web.dao.impl.CarDaoImpl;
import by.itacademy.jd1.web.dao.impl.ModelDaoImpl;
import by.itacademy.jd1.web.model.Brand;
import by.itacademy.jd1.web.dao.IBaseDao;

public class DaoTest {

	public static void main(String[] args) throws SQLException {
	//	IBaseDao brandDao = new BrandDaoImpl();
	//	IModelDao modelDao = new ModelDaoImpl();
		//ICarDao carDao = new CarDaoImpl();

	//	printList(brandDao.getAll());
	//	printList(modelDao.getAll());

		Brand object = new Brand();
		object.setName("new brand 1");
		;
		/*
		 * Integer generatedId = brandDao.insert(object);
		 * System.out.println("latest generated brand id:" + generatedId);
		 * printList(brandDao.getAll());
		 */
	}

	private static void printList(List<? extends Object> all) {
		for (Object object : all) {
			System.out.println(object.toString());
		}
	}
}

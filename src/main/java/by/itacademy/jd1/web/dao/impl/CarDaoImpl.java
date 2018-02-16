package by.itacademy.jd1.web.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.itacademy.jd1.web.dao.ICarDao;
import by.itacademy.jd1.web.dao.IModelDao;
import by.itacademy.jd1.web.model.Car;
import by.itacademy.jd1.web.model.Model;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {

	public static final ICarDao INSTANCE = new CarDaoImpl();

	private CarDaoImpl() {
		super();
	}

	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		Car car = new Car();
		car.setModelId((Integer) resultSet.getObject("model_id"));
		car.setId(resultSet.getInt("id"));
		car.setEngineType(resultSet.getString("engyne_type"));
		car.setYear(resultSet.getInt("year"));
		return car;

	}

	@Override
	protected String getTableName() {
		return "car";
	}

	@Override
	public Integer insert(Car object) throws SQLException {
		throw new RuntimeException("not implemented");

	}
}

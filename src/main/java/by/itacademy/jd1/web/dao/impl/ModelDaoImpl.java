package by.itacademy.jd1.web.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.itacademy.jd1.web.dao.IBrandDao;
import by.itacademy.jd1.web.dao.IModelDao;
import by.itacademy.jd1.web.model.Car;
import by.itacademy.jd1.web.model.Model;

public class ModelDaoImpl extends AbstractDao<Model> implements IModelDao {
	
	public static final IModelDao INSTANCE = new ModelDaoImpl();
	
	private ModelDaoImpl() {
		super();
	}

	@Override
	protected Model handleRow(ResultSet resultSet) throws SQLException {
		Model model = new Model();
		model.setBrandId((Integer) resultSet.getObject("brand_id"));
		model.setId(resultSet.getInt("id"));
		model.setName(resultSet.getString("name"));
		return model;

	}
	
	
	@Override
	public Integer insert(Model object) throws SQLException {
		throw new RuntimeException("not implemented");
		
	}

	@Override
	protected String getTableName() {
		return "model";
	}
	

}

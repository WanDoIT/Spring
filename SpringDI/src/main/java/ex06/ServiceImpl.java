package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceImpl {
	
	@Autowired
	private DAO dao;

	public ServiceImpl() {
		
	}
	
	public String hello(){
		return dao.hello();
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	
}


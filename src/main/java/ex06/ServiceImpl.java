package ex06;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl {
	
	
	@Autowired
	private DAO dao;
	
	 
	public DAO getDao() {
		return dao;
	}

	/* 선생님 답안
	 *  public SerciveImpl(DAO dao) {
	 *   this.dao = dao;
	 *  }
	 * */


	public void setDao(DAO dao) {
		this.dao = dao;
	}



	public String hello() {
			
		return dao.hello();
		
	}

}

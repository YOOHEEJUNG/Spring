package ex03;

import java.util.List;
import java.util.Map;

public class Customer {
	
	// list or map의 의존성 주입 
	private List<String> lists;
	private List<Person> persons;
	private Map<String, Object>maps;
	

	// 문자열 list getter, setter
	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
	//person 객체에 대한 getter, setter
	public List<Person> getPersons() {
		return persons;
	}
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	//map에 대한 getter, setter
	public Map<String, Object> getMaps() {
		return maps;
	}
	
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
}

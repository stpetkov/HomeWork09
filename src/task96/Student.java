package task96;

import java.util.HashMap;
import java.util.Map;

public class Student {
public Student(String firstName, String lastName, int number, Map<String, Integer> subjects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.subjects = subjects;
	}
public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
private String firstName;
private String lastName;
private int number;
private Map<String,Integer>subjects=new HashMap<String,Integer>();
public void addSubjectMark(){
	Integer changeKey = subjects.remove("oldKey");
	subjects.put("newKey", changeKey);
}
public void calculateAvarageMark(){
	Integer changeKey = subjects.remove("oldKey");
	subjects.get("key");
}
}

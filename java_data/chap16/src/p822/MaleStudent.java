package p822;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	

	public void acuumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] acuumulate()");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student> getList() {
		return list;
	}
}

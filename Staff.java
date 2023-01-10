package collection3;

public class Staff {
	private String name;
	private int id;
	private int age;
	private int salary;
	private String gender;
	
	public Staff(String name, int id, int age, int salary, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	
	
	
	
	

}

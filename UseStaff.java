package collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStaff {

	public static void main(String[] args) {
	
		ArrayList<Staff> staffs = new ArrayList<>();
		staffs.add(new Staff("Jack", 2526, 25, 15000, "Male"));
		staffs.add(new Staff("Ana", 2566, 26, 40000, "Female"));
		staffs.add(new Staff("John", 6545, 22, 20000, "Male"));
		staffs.add(new Staff("Johnson", 7545, 32, 40000, "Male"));
		staffs.add(new Staff("williams", 5486, 28, 58963, "Male"));
		staffs.add(new Staff("Lisa", 8745, 40, 54100, "Female"));
		staffs.add(new Staff("Joe", 9874, 51, 7896, "Male"));
		staffs.add(new Staff("Renga", 9864, 55, 8896, "Male"));
		staffs.add(new Staff("Jay", 9864, 45, 78976, "Male"));
		staffs.add(new Staff("Durai", 9555, 25, 2896, "Male"));
		
		List<Staff> femaleStaffs = staffs.stream().filter(x -> x.getGender().equals("Female")).collect(Collectors.toList());
		for(Staff x : femaleStaffs) {
			System.out.println(x);
		}
		long femaleCount = femaleStaffs.stream().count();
		System.out.println("No of Female: " +femaleCount);
		
		/*List<Staff> maleStaffs = staffs.stream().filter(x -> x.getGender().equals("Male")).collect(Collectors.toList());

		for(Staff x : maleStaffs) {
			System.out.println(x);
		}*/
		
		long maleCount = staffs.stream().filter(x -> x.getGender().equals("Male")).count();
		System.out.println("No of Male: " + maleCount);
		
		List<Staff> salaryCount = staffs.stream().filter(x -> x.getSalary()>=25000 && x.getSalary()<=50000).collect(Collectors.toList());
		salaryCount.forEach(x -> System.out.println(x));
		
		
		long salaryCountno = staffs.stream().filter(x -> x.getSalary()>=25000 && x.getSalary()<=50000).count();
		System.out.println("Salary Count: " + salaryCountno);
		
		List<Integer> seniorStaffSalaryList = staffs.stream().filter(x -> x.getAge()>40).map(y -> y.getSalary()).collect(Collectors.toList());
		seniorStaffSalaryList.forEach(x -> System.out.println("Senior Salary: " + x));
		
		Map<Integer, Staff> highSalaryStaff = staffs.stream().filter(x -> x.getSalary()>40000).collect(Collectors.toMap(y -> y.getId(), z -> z));
		highSalaryStaff.forEach((x,y) -> System.out.println(x + ": " + y));
		
		
	}

}

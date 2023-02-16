package java_programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Mahesh",23, 40000));
		list.add(new Employee("Sachin", 28, 60000));
		list.add(new Employee("Swapnil",24, 45000));
		list.add(new Employee("Swaraj", 25, 70000));
		list.add(new Employee("Vikas",29, 50000));
		list.add(new Employee("Rohan", 26, 30000));
		
//		List<Employee> sortBySalary = list.stream().sorted(Comparator.comparing(Employee::getSalary))
//				.collect(Collectors.toList());
//		sortBySalary.forEach(System.out::println);
		
		List<Employee> sortByAge = list.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());
		sortByAge.forEach(System.out::println);
		
	}
	
	static class Employee {
		String name;
		int age;
		int salary;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		public Employee(String name, int age, int salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		
		
	}

}

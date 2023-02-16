package hc_practiceset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByList {

	public static void main(String[] args) {

		List<Employee> e = new ArrayList<Employee>();

		e.add(new Employee("Mahesh", 32, 50000));
		e.add(new Employee("Sachin", 30, 40000));
		e.add(new Employee("Ramesh", 40, 25000));
		e.add(new Employee("Bhikan", 27, 80000));

//		List<Employee> sortBySalary = e.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
//				.collect(Collectors.toList());
//
//		sortBySalary.forEach(System.out::println);
//
//		List<Employee> sortByAge = e.stream().sorted(Comparator.comparingInt(Employee::getAge))
//				.collect(Collectors.toList());
//		sortByAge.forEach(System.out::println);

		List<Employee> sortByName = e.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		sortByName.forEach(System.out::println);
		

	}

	static class Employee {
		String name;
		int age;
		int salary;

		public Employee(String name, int age, int salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
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

	}
}

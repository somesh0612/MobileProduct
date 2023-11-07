package xyz;
class Employee {
	String name;
	int id;
	double salary;
	Address add;
	
	public Employee(String name,int id,double salary,Address add) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.add=add;
	}
	public void display() {
		System.out.println("Name ="+name);
		System.out.println("Id ="+id);
		System.out.println("Salary ="+salary);
		
	}
}

class Address{
	String houseNo;
	String street;
	int pincode;
	String city;
	String state;
	public Address(String houseNo, String street, int pincode, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	public void display() {
		System.out.println("Address :-----");
		System.out.println(houseNo+" "+street+","+pincode+" "+city+","+state);
	}
}



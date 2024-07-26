package constructor;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	public Customer() {
		System.out.println("Default Constructor");
		}
	public Customer(String customerName,int customerId,String customerCity) {
		this();
		System.out.println("Perameterized Constructor");
		this.customerName=customerName;
		this.customerId=customerId;
		this.customerCity=customerCity;
	}
}

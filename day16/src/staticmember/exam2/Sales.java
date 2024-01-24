package staticmember.exam2;

public class Sales extends Department{
	private static int salesTotal;
	private String name;
	private int salary;
	private int extra;
	private int totalSalary;
	
	public Sales(String name, int salary, int extra) {
		this.name = name;
		this.salary = salary;
		this.extra = extra;
		totalSalary = salary + extra;
		salesTotal += totalSalary;
//		super.total += totalSalary;
	}
	
	public void printInfo() {
		System.out.printf("영업\t%s\t%d\t%d\t%d\n", name, salary, extra, totalSalary);
	}
	
	public static int getSalesTotal() {
		return salesTotal;
	}
}

package staticmember.exam2;

public class Planning extends Department{
	private static int planningTotal;
	private String name;
	private int salary;
	private int extra;
	private int totalSalary;
	
	public Planning(String name, int salary, int extra) {
		this.name = name;
		this.salary = salary;
		this.extra = extra;
		totalSalary = salary + extra;
		super.total += totalSalary;
		planningTotal += totalSalary;
	}
	
	public void printInfo() {
		System.out.printf("기획\t%s\t%d\t%d\t%d\n", name, salary, extra, totalSalary);
	}
	
	public static int getPlanningTotal() {
		return planningTotal;
	}
}

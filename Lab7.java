package lab1;

class Emp {
	private int empno;
	private String ename;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

class ContractEmp extends Emp {
	private  String contractcomp;
	private String contractperson;
	public String getContractcomp() {
		return contractcomp;
	}
	public void setContractcomp(String contractcomp) {
		this.contractcomp = contractcomp;
	}
	public String getContractperson() {
		return contractperson;
	}
	public void setContractperson(String contractperson) {
		this.contractperson = contractperson;
	}
	@Override
	public String toString() {
		return "ContractEmp [contractcomp=" + contractcomp + ", contractperson=" + contractperson + ", getEmpno()="
				+ getEmpno() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}

public class Lab7 {
	public static void main(String[] args) {
		
		Emp e1 = new Emp();
		e1.setEmpno(10);
		e1.setEname("AA");
		e1.setSalary(1010.10);
		System.out.println(e1);
		ContractEmp e2 = new ContractEmp();
		e2.setEmpno(20);
		e2.setEname("BB");
		e2.setSalary(2020.20);
		e2.setContractcomp("TCS");
		e2.setContractperson("Person1");
		System.out.println(e2);
		
	}
}
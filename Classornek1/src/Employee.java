
public class Employee {

	public String name;
	public double salary;
	public int workhours;
	public int hireyear;
	
	//Yapýcý fonksiyon
	  Employee(int hireyear,int workhours, double salary,String name){
		 this.name = name;
		 this.salary = salary;
		 this.hireyear =hireyear;
		 this.workhours = workhours;
		 }
	  
	public double tax(){
		if (this.salary<=1000.0) { return 0.0;
			
		}
		else return this.salary*0.03;
		

		}
	public int bonus() {
		
		if(this.workhours>40) {return ((this.workhours-40)*30);
		
		}
		else return 0;
	}
	public double raisesalary() {
		int kacseneoldu;
		kacseneoldu = 2015-this.hireyear;
		if(kacseneoldu<10) return salary*0.05;
		else if (kacseneoldu>=10 && (kacseneoldu<20)) return this.salary*0.1;
		else if (kacseneoldu>=20) return this.salary*0.15;
		else return 0.0;
	}
	public void toString(Employee emp) {
		System.out.println("tax  "+ this.tax());
		System.out.println("bonus  "+ this.bonus());
		System.out.println("raisesalary  "+ this.raisesalary());
			
	}
	public void employeetoStr() {
		System.out.println(this.name);
	}
}


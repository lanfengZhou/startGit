package text;
/////
import java.util.Date;

public class Employee {
	public static int i=0;
	public String name;
	private double salary;
	private Date brithday;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public Date getBirthday(){
		return brithday;
	}
	public void setBirthday(Date birthday){
		this.brithday=birthday;
	}
	public String getInfo(){
		return "父类，我是父类";
	}
}

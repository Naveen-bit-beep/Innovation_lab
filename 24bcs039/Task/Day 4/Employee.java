class Employee{
private int id;
private int salary;
private static final int min_salary=10000;
public Employee(int id,int salary) {
this.id=id;
if(salary>=min_salary) {
this.salary=salary;
}else {
System.out.println("low salary");
}
}
public int getSalary() {
return salary;
}
public void display() {
System.out.println("Emp id :"+id);
System.out.println("Emp salary:"+salary);
}
 }
public class Anime{
public static void main(String[] args) {
Employee obj=new Employee(7,12000);
obj.display();

}
}

 
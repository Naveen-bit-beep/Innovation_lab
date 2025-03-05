class Job{
static String companyName="zoro";
String employeeName;
public Job(String employeeName) {
this.employeeName=employeeName;
}
public void display() {
System.out.print("Comp Name:"+companyName);
System.out.print("Emp Name:"+employeeName);
}
}
public class Anime {
public static void main(String[] args) {
Job obj=new Job("sanji");
obj.display();
}
}

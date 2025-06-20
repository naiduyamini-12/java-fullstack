class Student
{

String name;
int age;
void greet(String msg)
{
System.out.println(msg+","+name);
}
}
public class Main
{
public static void main(String[] args)
{
Student s=new Student();
s.name="Vidya";
s.age=21;
s.greet("Hello");
}
}

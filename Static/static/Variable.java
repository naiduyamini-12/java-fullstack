/*variable
public class Variable {

    
    static String school = "ZPH School";
    static int count = 100;

    
    String name;
    int age;

   
    static void printSchool() {
        System.out.println("School: " + school);
    }

    
    static void printCount() {
        System.out.println("Total Students: " + count);
    }

   
    void printName() {
        System.out.println("Name: " + name);
    }

  
    void printAge() {
        System.out.println("Age: " + age);
    }

   
    public static void main(String[] args) {
        
       
        printSchool();
        printCount();

        
        Variable obj = new Variable();
        obj.name = "John";
        obj.age = 15;

       
        obj.printName();
        obj.printAge();
    }
}
*/
public class Variable {

         String name = "Vidya";
    int age = 15;
static void person()
{
Variable obj=new Variable();
System.out.println("Name:"+obj.name);
System.out.println("Age:"+obj.age);
}
public static void main(String[] args)
{
Person();
}
}





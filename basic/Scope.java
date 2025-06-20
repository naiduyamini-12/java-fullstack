public class Scope
{
    
    int number = 100;

    public void showNumbers() {
        
        int number = 50;

        System.out.println("Local variable: " + number);           
        System.out.println("Global variable: " + this.number);     
    }

    public static void main(String[] args) {
        Scope obj = new Scope();
        obj.showNumbers();
    }
}

class  Datatypes{    

    int number = 10;

    void showNumbers() {        

        int number = 20;

        System.out.println("Local variable: " + number);         

        System.out.println("Global variable: " + this.number);   

    }



    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.showNumbers();

    }

}

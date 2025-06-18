/*1
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
*/
output:

* * * * * *

* * * * * *

* * * * * *

* * * * * *

* * * * * *

 * * * * * *
/*2

import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+"");
}
System.out.println();
}
}
}
*/
    output:
1 1 1 1 1

2 2 2 2 2

3 3 3 3 3

4 4 4 4 4

 5 5 5 5 5
/*3
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j+"");
}
System.out.println();
}
}
}

*/
Output:
1 2 3 4 5

1 2 3 4 5

1 2 3 4 5

1 2 3 4 5

 1 2 3 4 5
/*4
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
}
*/
    output:

1 2 3 4 5

6 7 8 9 10

11 12 13 14 15

16 17 18 19 20

21 22 23 24 25

/*5
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}
*/
Output:
1 2 3 4 5

6 7 8 9 1

2 3 4 5 6

7 8 9 1 2

3 4 5 6 7
/*6
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num+=2;
}
System.out.println();
}
}
}
*/
Output:
1 3 5 7 9

11 13 15 17 19

21 23 25 27 29

31 33 35 37 39

41 43 45 47 49

/*7
import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int a =sc.nextInt();

int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j%2==1)
{
System.out.print("1");

}
else
{
System.out.print("0");
}
}
System.out.println();
}
}
}
*/
Output:
1 0 1 0 1

1 0 1 0 1

1 0 1 0 1

1 0 1 0 1

 1 0 1 0 1
/*8
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        for (int i = 1; i <= n; i++) {
           
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");  
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();  
        }
    }
}


*/
/*9
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        for (int i = 1; i <= n; i++) {
           
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");  
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j+" ");
            }

            System.out.println();  
        }
    }
}

*/
/*10
import java.util.Scanner;
class A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
       for(int i=0;i<word.length();i++)
       {
       for(int j=0;j<=i;j++)
       {
      System.out.print(word.charAt(j)+ " ");
      }
      System.out.println();
     }
     }
     }  
*/


import java.util.Scanner;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc= new Scanner(System.in);
int n =sc.nextInt();
for(int i=1;i<n;i++)
{
for(int j=1;j<n;j++)
{
for(int k=1;K<=(2*i-1);k++);
System.out.print("*");
}
System.out.println();
}
}
}


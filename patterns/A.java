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


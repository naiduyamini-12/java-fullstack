/*
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
for(int i=1;i<=10;i++)
{
System.out.println("Bright IT Career");
}
}
}
*/
/*2
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
*/
/*3
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
int a=10;
int b=10;
if(a==b)
{
System.out.println("a is equal to b");
}
else
{
System.out.println("a is not equal to b");
}
if(a!=b)
{
System.out.println("a is not equal to b");
}
else
{
System.out.println("a is equal to b");
}
}
}
*/
/*4
import java.util.Scanner;
class B
{
public static void main(String[] args)
{

System.out.println("Enter numbers:");
for(int i=1;i<=20;i++)
{
if(i%2==0)
{
System.out.println("The even numbers:" +i);
}
}
for(int i=1;i<=20;i++)
{
if(i%2!=0)
{
System.out.println("The Odd numbers:" +i);
}
}
}
}
*/
/*6
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for a");
int a=sc.nextInt();
System.out.println("Enter the value for b");
int b=sc.nextInt();
System.out.println("Enter the value for c");
int c=sc.nextInt();
if(a>=b && a>=c)
{
System.out.println("a is the larger value:"+a);
}
else if(b>=a && b>=c)
{
System.out.println("b is the larger value:"+b);
}
else
{
System.out.println("c is the larger value:"+c);
}
}
}
*/

/*6
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
int i=10;
System.out.println("Enter numbers for 10 and 100:");
while(i<=100)
{
if(i%2==0)
{
System.out.println("the even numbers:"+i);
}
i++;
}
}
}
 */

/*7
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
int i=1;
do
{
System.out.println("the 1 to 10 numbers are:"+i);
i++;
}while(i<=10);
}
}
*/
/*8
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int m=sc.nextInt();
int sum=0;
int n=m;
while(m>0)
{
int rem=0;
rem=rem+m%10;
sum=sum+(rem*rem*rem);
m=m/10;
}
if(n==sum)
{
System.out.println("The number is armstrong number:");
}
else
{
System.out.println("The number is not armstrong number:");
}
}
}
*/
/*9
import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
*/
/*10
import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reverse = reverse * 10 + digit; // Build reversed number
            num = num / 10;                
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
*/

/*11 even or odd

import java.util.Scanner;
public class B
 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
  int number = scanner.nextInt();
   int remainder = number % 2;
  switch (remainder)
 {
  case 0:
  System.out.println(number + " is EVEN.");
    break;
   case 1: 
   System.out.println(number + " is ODD.");
    break;
   default:
             System.out.println("Invalid input.");
    }
 scanner.close();
    }
}
*/
/*Female/male
import java.util.Scanner;

public class B
{
    public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in);
     System.out.print("Enter gender (M/F): ");
     char gender = scanner.next().toUpperCase().charAt(0); 
  switch (gender)
 {
      case 'M':
         System.out.println("Gender: Male");
          break;
      case 'F':
         System.out.println("Gender: Female");
           break;
            default:
                System.out.println("Invalid input. Please enter M or F.");
  }
  scanner.close();
    }
}
*/
/* largest number
public class B
 {
    public static void main(String[] args)
 {
     int a = 10;
     int b = 20;
     int c = 30;
        if (a > b && a > c)
 {
   System.out.println("Largest number is: " + a);
        } else if (b > a && b > c)
 {
  System.out.println("Largest number is: " + b);
        } else if (c > a && c > b)
 {
   System.out.println("Largest number is: " + c);
        } else 
{
  System.out.println("There is a tie.");
        }
    }
}
*/













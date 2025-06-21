/*sum1
class C
{
public static void main(String[] args)
{
int[] numbers={10,20,30,40,50};
int sum=0;
for(int i=0; i<numbers.length;i++)
{
sum=sum+numbers[i];
}
System.out.println("Sum of array elements:"+sum);
}
}
*/

/* Average2

class C
{
public static void main(String[] args)
{
int[] numbers={10,20,30,40,50};
int sum=0;
for(int i=0; i<numbers.length;i++)
{
sum=sum+numbers[i];
}
double average=(double)sum/numbers.length;

System.out.println("Average value:"+average);
}
}
*/




/*index3
class C
{
public static void main(String[] args)
{
int[] numbers={10,20,30,40,50};
int t=20;
int index=-1;
for(int i=0; i<numbers.length;i++)
{
if(numbers[i]==t)
{
index=i;
break;
}
}
if(index!=-1)
{
System.out.println("Element"+t+"found at index:"+index);
}
else
{
System.out.println("Element"+t+"not found in the array.");
}
}
}
*/
/*serach4
class C
{
public static void main(String[] args)
{
int[] numbers={10,20,30,40,50};
int target=40;
boolean found =false;
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==target)
{
found=true;
break;
}
}
if(found)
{
System.out.println("Array contains the value:"+target);
}
else
{
System.out.println("Array does notcontains the value:"+target);
}
}
}
*/
/*remove5
 class C {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int removeElement = 30;

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nArray after removing " + removeElement + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != removeElement) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
*/


/*6 copy
 class C {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};  
        int[] copy = new int[original.length];

      
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Printing copied array
        System.out.print("Copied array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
*/


/*7. Insert an element at a specific position*/
public class C {
    public static int[] insertAtPosition(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position!");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element; // insert the new element
            } else {
                newArr[i] = arr[j++];
            }
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40};
        int elementToInsert = 25;
        int position = 2;
        int[] updatedArray = insertAtPosition(originalArray, elementToInsert, position);
        System.out.print("Updated Array: ");
        for (int value : updatedArray) {
            System.out.print(value + " ");
        }
    }
}

/*8. Find the minimum and maximum value*/
public class C{
    public static void findMinMax(int[] arr) {
  if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    public static void main(String[] args) {
        int[] numbers = {34, 12, 67, 5, 89, 23};
        findMinMax(numbers);
    }
}*/
/*9. Reverse an array
public class C {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        reverseArray(myArray);
        System.out.print("\nReversed Array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}

/*10. Find duplicate values
import java.util.HashSet;
public class C {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num); 
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicate values: ");
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 10, 40, 50, 20};
        findDuplicates(myArray);
    }
}*/
/*common values 11
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        
        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements are:");
        
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break; 
                }
            }
        }
    }
}
*/

/*remove duplicate values 12
 class C {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

*/
/*second largest number 13
 class C {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 15};

        int largest = arr[0];
        int second = -1;

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest number is: " + second);
    }
}
*/
/*second largest number 14
 class C {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 15};

        int largest = arr[0];
        int second = -1;

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest number is: " + second);
    }
}
*/
/*using method for even or odd15
public class C {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10, 13};  

        countEvenOdd(arr);  
    
    }

    
    public static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
*/
/*difference between largest and smallest 16
 class C {
    public static void main(String[] args) {
        int[] arr = {4, 10, 2, 8, 1};  

        int largest = arr[0];
        int smallest = arr[0];

       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Difference: " + difference);
    }
}
*/
 class C {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 23, 9};  

        // Call the method
        if (contains12And23(arr)) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }
    }

  
    public static boolean contains12And23(int[] arr) {
        boolean found12 = false;
        boolean found23 = false;

        // Loop through array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 12) {
                found12 = true;
            }
            if (arr[i] == 23) {
                found23 = true;
            }
        }

        
        if (found12 && found23) {
            return true;
        } else {
            return false;
        }
    }
}



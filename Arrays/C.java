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
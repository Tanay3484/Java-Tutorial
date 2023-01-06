# Arrays in Java

- Array is defined as a collection of similar type of elements which has a contiguous memory location.

- In Java, an Array is an object which contains elements of a similar data type. Additionally, elements of an array are stored in a contiguous memory location.

- It is a data structure where we store similar elements.

- Size of an array needs to be defined before it can be used.

- Arrays in Java is index-based i.e. first element of the array is stored at index 0, second element at index 1 and so on ..

- In Java, the length of the array can be determined using the length member.

- Types of arrays in Java : 
    - Single Dimensional Array
    - Multidimensional Array

---

## Operations on Single Dimensional Arrays

# Traversal
- Traversal is the process of printing all elements of the array one by one

Method 1: 
```java
public class Test{
    public static void main(String[] args){
        int[] testArray = {2,3,4,5,6,7};
        System.out.println("Elements of the array are : ");
        for(int i = 0;i<testArray.length;i++){
            System.out.print(testArray[i]+" ");
        }
    }
}
```

Method 2:
```java
public class Test{
    public static void main(String[] args){
        int[] testArray = {2,3,4,5,6,7};
        System.out.println("Elements of the array are : ");
        for(int i : testArray){
            System.out.print(i+" ");
        }
    }
}
```

---

# Slicing of Array

- Slicing is the process to access a subarray of the given array.

- Three ways to perform slicing : 
    - By copying elements
    - By using the copyOfRange() Method
    - Using Java 8 Stream

1) Copying elements

    - Find the desired start and end index of the given array.
    - Create new empty array of size : endIndex-startIndex
    - From the original array, copy the elements (from startIndex) to the sliced array.

    Code : 

    ```java
    import java.utils.Arrays;
    public class ArraySlice{
        int[] array = {23,56,78,22,45,90};
        int startIndex = 2;
        int endIndex = 4;

        int[] slicedArray = new int[endIndex-startIndex];
        for(int i = 0;i<slicedArray.length;i++){
            slicedArray[i] = array[startIndex+i];
        }
        System.out.println("Sliced array is : ");
        for(int num:slicedArray){
            print(num+" ");
        }
    }
    ```

2) copyOfRange() method

    - Belongs to the Java Array class
    - Copies the specified range of the array to the newly created array and returns the newly created array.
    - Time complexity : O(n)
    - Space complexity : O(n)

    Code : 

    ```java
    import java.util.Arrays;
    public class ArraySlice2{
        public static void main(String[] args){
            int startIndex = 2, endIndex = 6;
            int[] array = {11, 23, 56, 90, 111, 901, 251, 800, 843};
            int[] slicedArray = Arrays.copyOfRange(array,startIndex,endIndex);
            System.out.println("Elements of the sliced array are : ");
            for(int num : slicedArray){
                System.out.print(num+" ");
            }
        }
    }
    ```

3) Using Java 8 Stream
    
    - Find the desired startIndex and endIndex of array.
    - Convert the elements into Primitive Stream using range() method.
    - Using the map() method map the specified elements from the specified array.
    - By invoking the toArray() method, convert the mapped array into an array.
    - Print the sliced array.

    Code : 

    ```java
    import java.util.Arrays;
    import java.util.stream.IntStream;
    public class ArraySlice3{
        public static void main(String[] args){
            int[] array = {12, 45, 90, 55, 34, 100, 345, 897, 67, 123, 0, 789};
            int startIndex = 5,endIndex = 10;
            int[] slcArray = IntStream.range(startIndex,endIndex).map(i->array[i]).toArray();
            System.out.println("The elements of the sliced array are : ");
            for(int num:slcArray){
                System.out.print(num+" ");
            }
        }
    } 

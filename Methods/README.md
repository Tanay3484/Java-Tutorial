# Methods in Java

- A method is a block of code which only runs when it is called.
- Data known as parameters can be passed into a method.

## Creating a method in Java
- Method must be declared within a class.
- Defined by the name of the method followed by parantheses ```()```.
- e.g. : 

    ```java
    public class MethodExample{
        static void myMethod(){
            //code to be executed
        }
    }
    ```

where,
- **myMethod** : is the name of the method
- **static** : means that the method belongs to the Main class and not an object of the Main class.
- **void** : means that there is no return type of the method.

## Calling a method in Java
- To call a method in Java, we write the method's name followed by two parantheses ```()``` and a semicolon ```;```.

- e.g:
    
    ```java
    public class MethodExample{
        static void myMethod(){
            System.out.println("I just got executed");
        }

        public static void main(String[] args){
            myMethod();
        }
    }
    ```

- A method can be called multiple times

- e.g. : 
```java
    public class MethodExample{
        static void myMethod(){
            System.out.println("I just got executed");
        }

        public static void main(String[] args){
            myMethod();
            myMethod();
            myMethod();
        }
    }
```

## Paramaters and Arguments
- Information can be passed to methods as parameters.
- Parameters are specified after the method name, inside the ```()```.
- Any number of parameters can be passed but they need to be seperated by a comma.
- e.g. Method that takes a String as an input and prints some message with the input string : 

```java
import java.util.Scanner;
public class ParameterExample{
    static void greetName(String fname){
        System.out.println("Hello "+fname);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String fname = input.nextLine();
        greetName(fname);
    }
}
```

- e.g. of multiple arguments
```java
import java.util.Scanner;
public class MultipleParameters{
    static void greetNameAndDisplayAge(String fname,int age){
        System.out.println("Hello "+fname);
        System.out.println("You have entered your age as : "+age);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first name : ");
        String fname = input.nextLine();

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        greetNameAndDisplayAge(fname,age);
    }
}
```

## Return Values
- ```void``` keyword indicates that the method returns no value.
- If we want the method to return some value, we can use any primitive data type in place of the void keyword and use the return keyword in the body of the method.

- e.g. of method that adds two numbers : 

```java
import java.util.Scanner;
public class SumOfTwoNumbersExample{
    static int sumOfTwoNumbers(int x1,int x2){
        return x1+x2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println("The sum of the two numbers is : "+sumOfTwoNumbers(num1,num2));
    }
}
```

## Method Overloading
- With **method overloading**, multiple methods can have the same name with different parameters.

- e.g. Method to add integers and double values.

```java
public class MethodOverloadingExample{
    static int plusMethod(int x,int y){
        return x+y;
    }

    static double plusMethod(double x,double y){
        return x+y;
    }

    public static void main(String[] args){
        int myNum1 = plusMethod(4,5);
        double myNum2 = plusMethod(4.3,5.4);
        System.out.println("int : "+myNum1);
        System.out.println("double : "+myNum2);
    }
}
```

## Scope of variables
- Scope is defined as the visibility of a variable in the program.
- Depending on where the variable is accessed, scope is divided into the following : 
    - Method scope :
        - Variables declared directly inside a method are available anywhere in the method but not outside it.

        - e.g. : 
        ```java
        public class MethodScope{
            static void tempMethod(){
                int x = 100; //x is accessible here
                //some operations
            }

            //x not accessible from this point

            public static void main(String[] args){
                System.out.println(x); // Throws an error since x cannot be accessed outside the method.
            }
        }

        ```

    - Block scope : 
        - Variables declared inside any block of code are only accessible by the code between the curly braces.

        - e.g. :
        ```java
        public class BlockScope{
            public static void main(String[] args){
                String name = "John";
                if(name.equals("John")){
                    int x = 100;
                    //some code
                }

                System.out.println(x); // x not accessible hence error
            }
        }

## Recursion in Java
- Recursion is the process of making the function call itself.
- This technique provides a way to break complicated problems down into simpler problems which are easier to solve.

- e.g. Recursive program to add all numbers upto 10

```java
public class Recursion{
    static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
    }
}
```

- e.g. Recursion to add all numbers between 5 and 10

```java
public class Recursion{
    static int sum(int start,int end){
        if(end>start){
            return end+sum(start,end-1);
        }
        else{
            return end;
        }
    }

    public static void main(String[] args){
        int result = sum(5,10);
        System.out.println(result);
    }
}
```
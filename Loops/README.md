# Loops in Java

- There are four types of loops in Java : 

1) <u>for Loop</u>

Similar to a simple for loop in `C/C++`. We can initialize the variable, check condition and increment/decrement values.

It consists of 4 parts : 
- **Initialization** : Initial condition which is executed when the loop starts. Variable can be initialized or an already initialized variable can be used. Optional condition.

- **Condition** : It is the second condition which is executed. Checked each time before the flow of the program enters into the loop. Execution continues till the condition becomes false. It must return a boolean value either true or false. It is an optional condition.

- **Increment/Decrement** : Increments or decrements a variable value. It is an optional condition.

- **Statement** : Statement is the inner part of the loop, which is executed until the condition part of the loop remains true.

Syntax : 
```java
for (initialization;condition;increment/decrement){
    //statement(s)
}
```

---

2) <u>for-each Loop</u>

Used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

Syntax : 
```java
for(datatype item : array) {
    //statement(s)
}
```

where, 
array : an array or a collection
item : each item of array/collection is assigned to this variable.
dataType : the data type of the array/collection

---

3) <u>while Loop</u>

While lpop is used to run a specific code until a certain condition is met.

Syntax : 
```java
while (testExpression) { 
    //body of loop 
}
```

where, 
testExpression : is the condition which is checked before the execution of the loop happens.

---

4) <u> do-while Loop</u>

do while loop is similar to the while loop, the only difference being that the body of the do while loop is executed atleast once, before the condition is checked.

Syntax : 
```java
do { 
    //body of the loop
} while(testExpression)
```
---
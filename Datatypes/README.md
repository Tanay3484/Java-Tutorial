# Datatypes in Java

Datatypes in Java are divided into two major groups : 
- Primitive data types : `byte`,`short`,`int`,`long`,`float`,`double`,`boolean` and `char`

- Non-primitive data types : `String`, `Arrays` and `Classes`


---

1. Primitive Data Types

    - Specifies size and type of variable values, and it has no additional methods.

    - 8 primitive data types in Java : 

    | Data Type   | Size        | Description                                                                       |
    | ----------- | ----------- | -----------                                                                       |
    | `byte`      | 1 byte      | Stores whole numbers from -128 to 127                                             |
    | `short`     | 2 bytes     | Stores whole numbers from -32,768 to 32,767                                       |
    | `int`       | 4 bytes     | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
    | `long`      | 8 bytes     | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
    | `float`     | 4 bytes     | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
    | `double`    | 8 bytes     | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
    | `boolean`   | 1 bit       | Stores true or false values                                                       |
    | `char`      | 2 bytes     | Stores a single character/letter or ASCII values                                  |


2. Non-Primitive Data Types
    
    - Called Reference Types because they refer to objects.
    - Differences between Primitive and Non-Primitive Data Types : 
        - Primitive types are predefined. Non-Primitive Data Types are user defined and not defined by Java (except `String`)
        - Non-Primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        - A primitive type always has a value, whereas a non-primitive type can be of type `null`
        - Primitive type always starts with a lowercase letter, whereas a Non-Primitive data type always starts with a capital letter.
        - Size of primitive type depends on the data type, but all the Non-Primitive types have the same size.

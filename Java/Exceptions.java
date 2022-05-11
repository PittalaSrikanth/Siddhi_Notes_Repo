What is Exception in Java?
Dictionary Meaning: Exception is an abnormal condition.

Types of Java Exceptions
There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:

Checked Exception
Unchecked Exception


Keyword	Description
try	The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
finally	The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
throw	The "throw" keyword is used to throw an exception.
throws	The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

int a=50/0;//ArithmeticException  

String s=null;  
System.out.println(s.length());//NullPointerException  

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  

Internal Working of Java try-catch block

Problem without exception handling

Solution by exception handling

Java Multi-catch block
Points to remember
At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.

public class MultipleCatchBlock3 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
                System.out.println(a[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  


Java Nested try block

Why use nested try block
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.

Java finally block
Java finally block is a block used to execute important code such as closing the connection, etc.

Why use Java finally block?
finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
The important statements to be printed can be placed in the finally block.

Java throw keyword
The Java throw keyword is used to throw an exception explicitly.

public class TestThrow1 {   
    //function to check if person is eligible to vote or not   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("rest of the code...");    
  }    
}    


Note: If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.

import java.io.*;  
  
public class TestThrow2 {   
  
    //function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {  
  
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        throw new FileNotFoundException();  
      
    }  
    //main method  
    public static void main(String args[]){  
        try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}  


Throwing User-defined Exception

// class represents user-defined exception  
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
// Class that uses above MyException  
public class TestThrow3  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}  


Java throws keyword
The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception.

Syntax of Java throws
return_type method_name() throws exception_class_name{  
//method code  
}  

Which exception should be declared?
Ans: Checked exception only, because:

Runchecked exception: under our control so we can correct our code.
The 10 most common examples of RuntimeExceptions in Java are:
ArithmeticException.
NullPointerException.
ClassCastException.
DateTimeException.
ArrayIndexOutOfBoundsException.
NegativeArraySizeException.
ArrayStoreException.
UnsupportedOperationException.



Exception Handling with Method Overriding in Java

If the superclass method does not declare an exception
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.

If the superclass method declares an exception
If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

Example in case subclass overridden method declares parent exception
Example in case subclass overridden method declares same exception
Example in case subclass overridden method declares subclass exception

Java Custom Exception


























































































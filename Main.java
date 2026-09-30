import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("It makes no sense to divide a number by zero!");
     // System.out.println(3/0);

         
   /*  9/28  */
   //declare a variable

   double myGradeAverage;

   //assign a value

   myGradeAverage = 95.0;

   //initialize a variable
   double myDreamGrade = 100.0;

   //we can format strings using concatenation (+)
   System.out.println("My current grade is: " + myGradeAverage);
   
   System.out.println("My dream grade is " + myDreamGrade + "!");

   // printing a quote using an escape sequence
   // escapse sequences always use \
   // \n gives a new line
   // we use \\ to actually print one \
   //System.out.println("My teacher always says,\n\"Study for your test!\"");

   // arithmetic operations (+ - * /)
   // working with only ints, output will be an int
   // int / int does TRUNCATING DIVISION removes the decimal, does not round
   //System.out.println(5*10);
   // if we want to divide and get a decimal, we need to divide with a double
   //System.out.println(19.0/10);
   // % gives us the remainder 
   //System.out.println(12%10);

   int myNum = 7;
   int newNum = myNum;
   newNum = 8;

   // System.out.println(myNum);
   // System.out.println(newNum);

   // incrementing variable
   myNum = myNum + 1;
   myNum = myNum + 1;

   // this handles the assingment and the addition at once
   myNum++;

   // decrementing
   myNum = myNum - 1;
   myNum--;

   System.out.println(myNum);
   // System.out.println(newNum);

   // working with Scanner class and text input
   System.out.print("Greetings human! What is your name?");
   Scanner scan = new Scanner(System.in);

   }
}

/* COMMENTS FOR NOTE TAKING!!! 
   9/18/26
   Algorithms: Step by step proccess to accomp a task
   Psuedocode: Simplified code to outline programs/algorithms (fake code)
   Sequencing: The order of steps


   JAVASCRIPT vs JAVA
   JAVA:
   - You can use Java to create complex applications like mobile apps and enterprise software
   

   JAVASCRIPT:
   - JavaScript helps front-end developers build interactive web pages
   
   9/22/26

   Object-oriented programming: programming built on classes and objects
   Classes: blueprint of an object (no memory)
   Object: actual implementation (stored in memory)
   Method: reusable chunk of code that accomplishes an action (verbs in code)
   |-- Main() entry point to our code
   We code in an IDE (intergrated Development Enviornment) with a compiler translate our java to binary 
   Every action in java ends with a semi-colon 
      

   9/23/26

   Primitive type - storing simple information/data
   Object (Reference) type - storing complex data/objects (ex. Creature cat = new Creature())

   Primitive Variable Types to Know:
   1. int - stores integers/positive or negative whole numbers
   2. double - store decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
   3. boolean - stores logic (only 2 options are true or false)

   Object Variable Types to Know:
   1. String - stores text between quotes (ex. "5.0", "Hello world!")

   Setting Up Variables in Code:
   Declaring and Assigning go together
   1. Declare Variable ---> int x; String name;
   2. Assign Variable ---> x = 5; name = "Nick"
   

   
   Or do it in one step
   3. Initialize Variable ---> int x = 5; String name = "Nick"


   9/28/26
   
   Initiallize a Variable - declare and assign in one statement
   Concatenate - the action of linking things together in a series or chain


*/





// --> line comment
/* bulk comment */
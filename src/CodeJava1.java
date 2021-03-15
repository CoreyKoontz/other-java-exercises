public class CodeJava1 {

    //TODO------------- Anatomy of a Java Program (Basic Structure) ----------------------------------------

    // Function:
    // - A function is a block of code that performs a task
    // - We start by specify a return type.
    // - Some functions don't return anything so the ReturnType would be "void"(a reserved keyword in java)
    // - The function layout is very similar to that of a javascript function.
    //   The difference is the ReturnType

//            ReturnType Name () {
//                ...
//            }

    // * Every Java program should have at least one function and that function is called main
    // - main is the entry point to our programs along with the "void" type name.
    // - Whenever we execute a java program, the "main" function gets called and the code inside is executed.

//           void main () {
//               ...
//           }

    // Class:
    // - These functions do not exist on their own, they should always belong to a class.
    // * A class is a container for one or more related functions. We use these to organize our code.
    // - Every java program should have at least one (main) class that contains the main function
    // - We define the main class by giving it the keyword of class and the name of Main and opening some curly brackets.

//            class Main {
//                void main() {
//                    ...
//                }
//            }

    // - Now the functions that are described between these curly braces belong to this class.
    // * More accurately, these functions (inside a class) are known as methods of that class.
    // - All these classes and method require a access modifier.
    // * An access modifier is a special keyword that determines if other classes and methods
    //   in this program can access these classes and methods.
    // - Most of the time we will be using the public access modifier, so that goes in front
    //   of our class and Method declarations.

//            public class Main {
//                public void main() {
//                    ...
//                }
//            }

    // So this is the basic structure of a java program, a main method wrapped within a main class.
    // CLasses are denoted with PascalCase (the "Main" class).
    // Methods are denoted in camelCase (the "main" method).

    // * Package are used to organize and group out classes.
    // - Some programs require thousands of classes and packages help us keep these organized.
    // - By convention, the base package name is your projects domain name in reverse. exp: com.google

    // Variables in Java:
    // We use variables to temporarily store data.




//TODO========================= Java II ================================================

    // Problem Solving:
    // - Process of defining a problem, identifying  and comparing different solutions, and
    //   picking onr that best solves the problem with respect to the context and constraints.

    // Benefits of OOP:
    // Reduced complexity by breaking things down into smaller chunks.
    // Easier maintenance. If an object is not working we dont have to rip the whole program apart, just fix the object.
    // Code Reuse. We can reuse a lot of the code we write.
    // Faster Development. Because of all the benefits listed above we can develop much faster.


}


// Java Program to Illustrate Abstract classes
// Can also have Final Methods

// Class 1
// Abstract class
abstract class Final {

    final void fun()
    {
        System.out.println("Final fun() called");
    }
}

// Class 2
class CNG extends Final {

}

// Class 3
// Main class
class Faria {

    // Main driver method
    public static void main(String args[])
    {
        {
            // Creating object of abstract class

            Final b = new CNG();
            // Calling method on object created above
            // inside main method

            b.fun();
        }
    }
}
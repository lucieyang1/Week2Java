package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"}; // string array object; array of strings
        // array is like a list, but it doesn't grow or shrink
	    Person p = new Person(name, "moogah"); // Person class
        Person s = new Student(name, "froogal", "132141546");
        // because we declared it as a person, it knows it is a superclass
        System.out.println(p); // out's type is print stream
        // toString annotation
        // Ctrl + Click for finding where the variable is defined
        // null is like None but its not even an object
        // ternary operator...
    }
}

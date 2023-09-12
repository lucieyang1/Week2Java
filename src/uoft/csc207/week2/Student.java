package uoft.csc207.week2;
// "don't type code, type stuff and make IntelliJ do everything!"
public class Student extends Person {
    private final String studentid; // wow! create field
    // need a type and variable name, but can add optional modifiers
    // "final says you can only assign to it once, it's its final value"
    // private is accessibility modifier - specifies where the name can be used in the program
    // only in the curly brackets of the class
    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid); // calls the parent's constructor
        this.studentid = studentid;
    }
}

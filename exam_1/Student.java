public class Student {
    
    String surname;
    String firstname;
    char middleInitial;
    int dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber(){
        System.out.println("Student Number: " + studentNumber);
    }
    public void sayMyEmailAddress(){
        System.out.println("Email Address: " + studentEmailAddress);
    }
    public void amIAwesome(){
        System.out.println("Am I Awesome: " + iAmAwesome);
    }
}

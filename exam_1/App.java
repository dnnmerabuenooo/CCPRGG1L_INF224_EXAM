public class App {
    public static void main(String[] args) {
        
        Student me = new Student();

        me.surname = "Merabueno";
        me.firstname = "Toni Dianne";
        me.middleInitial = 'G';
        me.dateOfBirth = 05/14/2003;
        me.studentNumber = 2022104992;
        me.studentEmailAddress = "merabuenotg@students.national-u.edu.ph";
        me.iAmAwesome = true;

        me.sayMyStudentNumber();
        me.sayMyEmailAddress();
        me.amIAwesome();

    }
}

package lab1;

public class Class {
    public static void main(String[] args) {
        Student Student1= new Student();
        Student1.studentName="Miguel";
        Student1.studentAge= 15;
        Student1.studentGrade= 'A';

        Student1.printStudentInfo();

        Student Student2= new Student();
        Student2.studentName= "Momo";
        Student2.studentAge= 16;
        Student2.studentGrade='B';

        Student2.printStudentInfo();




    }

}

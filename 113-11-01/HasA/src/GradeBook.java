public class GradeBook {
private  String courseName;
private  Student[] students;
private  double[] grades;
private  int numberOfStudents;

public  GradeBook(String courseName , Student[] students , int numberOfStudents){
    this.courseName = courseName;
    this.students =students;
    this.numberOfStudents = numberOfStudents;
    this.grades = new double[numberOfStudents];
    displayMessage();
}

public  void displayMessage(){
    System.out.printf("歡迎使用%s 成績系統\n", courseName);
}
public  void processsStudents(){
    for(Student student :students){
        student.printData();
    }
}

public  void processStudents(Student[] students){
    for (Student student : students){
        student.printData();
    }
}

}

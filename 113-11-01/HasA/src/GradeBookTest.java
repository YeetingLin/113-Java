public class GradeBookTest {

    public  static  void main (String[] args){
        final  int NUMBER_OF_STUDENTS =3;
        Student[] students = new  Student[3];
        students[0] =new Student( studentID:"A110223044",name:"吳奇隆");
        students[1] =new Student( studentID:"A110223045",name:"陳宏銘");
        students[2] =new Student( studentID:"A110223046",name:"林志玲");
        GradeBook gradeBook = new GradeBook( courseName:"Java程式設計",students,NUMBER_OF_STUDENTS);
        GradeBook.processStudentGrades();
        gradeBook.displayGradeReport();
    }
}
                              
public class Student {
    private  String studentID;
    private  String name;


    public  Student(){
        new Student(studentID:"00000000", name:"未知");

    }
    public  Student(String studentID , String name){
        new Student(studentID, name:"未知");

    }

    public  Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }
    public  String getStudentID(){
        return  studentID;
    }

    public  String getName(){
        return  name;
    }
    public  void setName(String name){
        System.out.printf("學號: %s ,姓名: %s",studentID,name);
    }
}

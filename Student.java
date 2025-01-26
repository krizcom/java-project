

public class Student {
       
    String firstname;
    String lastname;
    int studentid;
    int classno;
    char section;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname.toUpperCase();
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname.toUpperCase();
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public int getClassno() {
        return classno;
    }
    public void setClassno(int classno) {
        this.classno = classno;
    }
    public char getSection() {
        return section;
    }
    public void setSection(char section) {
        this.section = section;
    }

    public  void displayStudent(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("First Name : "+ getFirstname());
        System.out.println("Last Name : " + getLastname());
        System.out.println("Student ID : "+ getStudentid());
        System.out.println("Class : " + getClassno());
        System.out.println("Section : " + getSection());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
    
}
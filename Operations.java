import java.util.*;

public class Operations {

    public Map<Integer, Student> studentMap = new HashMap<>();

    Scanner sc = new Scanner(System.in);
    
    Random rand = new Random();

    public void enterstudentdetails(){
        Student st = new Student();

        int randomNumber = 10000000 + rand.nextInt(90000000);
            try{
            System.out.print("ENTER FIRST NAME : ");
            st.setFirstname(sc.nextLine());
            System.out.print("ENTER LAST NAME : ");
            st.setLastname(sc.nextLine());
            System.out.println("STUDENT ID : " + randomNumber );
            st.setStudentid(randomNumber);
            System.out.print("CLASS NO : ");
            st.setClassno(sc.nextInt());
            sc.nextLine();
            System.out.print("SECTION : ");
            st.setSection(sc.nextLine().toUpperCase().charAt(0));
            //System.out.println("+++++++++++++++++++++++++++++++++++");
            studentMap.put(st.getStudentid() , st);
            st.displayStudent();
            }catch(Exception e){
                System.err.println(e);
                System.out.println(e);
            }
    }

    public void displayallStudent(){
        if(studentMap.isEmpty()){
            System.out.println("No data present");
        }else{
            for(Student student : studentMap.values()){
               student.displayStudent();
            }
        }
    }

    public void displayStudentid(int studentid){
        Student st = studentMap.get(studentid);

        if(st != null){
            st.displayStudent();
        }else{
            System.out.println("Student ID : " + studentid + " not found.");
        }
    }
    

}

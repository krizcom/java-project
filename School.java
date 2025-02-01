import java.util.Scanner;

public class School {

    public static void main(String[] args) {
    
        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of student data : ");

        int numberofstudents = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=numberofstudents;i++){
        op.enterstudentdetails();
        }

        System.out.print("Display all records(Y/N) : ");
        char yesorno = sc.nextLine().charAt(0);

        if(yesorno == 'Y'){
            op.displayallStudent();
        }else if(yesorno == 'N'){
            System.out.println("You chose N");
        }else {System.out.println("Invalid Input");}
        
        System.out.print("Enter Student ID to display : ");
        int studentid = sc.nextInt();
        op.displayStudentid(studentid);

        sc.close();
    }
}


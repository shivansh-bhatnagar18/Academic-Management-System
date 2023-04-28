import java.util.*;
class Runfile
{
    public static void main(String args[])
    {
        Person Aaron=new Student("Aaron",18,'M',22124001,"Aaron01","12345");
        Person Ellyse=new Student("Ellyse",19,'F',22124002,"Ellyse02","12345");
        Person Faf=new Student("Faf",18,'M',22124003,"Faf03","12345");
        Person Gayle=new Student("Gayle",19,'M',22124004,"Gayle04","12345");
        Person Glenn=new Student("Glenn",18,'M',22124005,"Glenn05","12345");
        Person Karthik=new Student("Karthik",19,'M',22124006,"Karthik06","12345");
        Person Siraj=new Student("Siraj",20,'M',22124007,"Siraj07","12345");
        Person Smriti=new Student("Smriti",18,'F',22124008,"Smriti08","12345");
        Person Virat=new Student("Virat",19,'M',22124009,"Virat09","12345");
        Person Wanindu=new Student("Wanindu",18,'M',22124010,"Wanindu10","12345");
        /*initialised 10 students by default*/
        Person Sachin=new Professor("Sachin",57,'M',2210,"Mathematics","SachinP01","12345");
        Person Kallis=new Professor("Kallis",49,'M',2211,"Electronics","KallisP02","12345");
        Person Fleming=new Professor("Fleming",45,'M',2212,"Computer Science","FlemingP03","12345");
        /*initialised 3 professors by default*/
        Person Lallan=new Staff("Lallan",44,'M',9876,"LallanS01","12345");
        //and one staff member
        Person arr[]={Aaron,Ellyse,Faf,Gayle,Glenn,Karthik,Siraj,Smriti,Virat,Wanindu,Sachin,Kallis,Fleming,Lallan};
        outer:
        while(true)
        {
            
        Login obj=new Login();
        obj.Welcome();
        Scanner sc=new Scanner(System.in);
        System.out.println("USERNAME:");
        String username=sc.next();
        System.out.println("PASSWORD:");
        String password=sc.next();
        Person curr_Member=obj.checkCredentials(username,password,arr);
        if(curr_Member.age<=20)
            {
                while(true)
        {
            Student curr=(Student)curr_Member;
            System.out.println("What do you want to do?");
            System.out.println("1)Change your current password");
            System.out.println("2)Check your current scores");
            System.out.println("3)Check your Attendance");
            System.out.println("4)Check your hostel");
            System.out.println("5)Check your Allocated Professors");
            System.out.println("6)Return back to login page");
            System.out.println("7)exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your new Password");
                    String newPassword=sc.next();
                    curr.changePassword(newPassword);
                    break;
                case 2:
                    curr.viewMarks();
                    break;
                case 3:
                    curr.checkAttendance();
                    break;
                case 4:
                    curr.viewHostel();
                    break;
                case 5:
                    curr.viewSubjects();
                    break;
                case 6:
                    continue outer;
                case 7:
                    break outer;
                default:
                    System.out.println("Invalid input");
                    
            }
            
            }}  
        
        if(curr_Member.age>=45)
            {while(true)
        {
            Professor curr=(Professor)curr_Member;
            System.out.println("What do you want to do?");
            System.out.println("1)Update Attendance of the students");
            System.out.println("2)Upload Scores of students");
            System.out.println("3)Change Password");
            System.out.println("4)Back to login page");
            System.out.println("5)Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Roll Nuumber");
                    int roll1=sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        Student stu=(Student)arr[i];
                        if(stu.rollNo==roll1)    
                        curr.setAttendance(stu);                    
                    }
                    break;
                case 2:
                    System.out.println("Enter the Roll Number");
                    int roll2=sc.nextInt();
                    System.out.println("Enter the marks");
                    int score=sc.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        Student stu=(Student)arr[i];
                        if(stu.rollNo==roll2)
                        curr.assignScore(stu,score);
                    }
                    break;
                case 3:
                    System.out.println("Enter the new password");
                    String newPassword=sc.next();
                    curr.changePassword(newPassword);
                    break;
                case 4:
                    continue outer;
                case 5:
                    break outer;
                default:
                    System.out.println("Invalid input");
                    
            }
            
            } }
        
        if(curr_Member.age==44)
            {while(true)
        {
            Staff curr=(Staff)curr_Member;
            System.out.println("What do you want to do?");
            System.out.println("1)Update Hostel of the students");
            System.out.println("2)Change your password");
            System.out.println("3)Back to login page");
            System.out.println("4)Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the roll number");
                    int roll3=sc.nextInt();
                    System.out.println("Enter the Hostel Name");
                    String Hostel=sc.nextLine();
                    for(int i=0;i<10;i++)
                    {
                        Student stu=(Student)arr[i];
                        if(stu.rollNo==roll3)
                        curr.allocateHostel(stu,Hostel);

                    }
                    break;
                case 2:
                    System.out.println("Enter the new password");
                    String newPassword=sc.next();
                    curr.changePassword(newPassword);
                    break;
                case 3:
                    continue outer;
                case 4:
                    break outer;
                default:
                    System.out.println("Invalid input");
                    
            }
            
            }        
        }}}
}

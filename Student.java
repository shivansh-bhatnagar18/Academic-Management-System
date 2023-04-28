public class Student extends Person
{
    int rollNo;
    String subjects[]={"Mathematics","Electronics","Computer Science"};
    int attendance[]={0,0,0};
    int scores[]={0,0,0};
    String Prof[]={"Dr. Sachin","Dr. Kallis","Dr. Fleming"};
    String hostelName;
    Student(String name,int age,char sex,int rollNo, String Username, String Password)
    {
        super(name,age,sex,Username,Password);
        this.rollNo=rollNo;
    }
    void viewMarks()
    {
        System.out.println("Your Marks are as follows :");
        for(int i=0;i<3;i++)
        System.out.println(subjects[i]+" : "+scores[i]);   
    }
    void viewSubjects()
    {
        System.out.println("Your subjects and corresponding professors are :");
        for(int i=0;i<3;i++)
        System.out.println(subjects[i]+" : "+Prof[i]);
    }
    void checkAttendance()
    {
        System.out.println("The number of days you were present was :");
        for(int i=0;i<3;i++)
        System.out.println(subjects[i]+" : "+attendance[i]);
    }
    void viewHostel()
    {
        System.out.println("You have been alloted "+hostelName+" hostel");
    }
}

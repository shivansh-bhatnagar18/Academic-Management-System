public class Staff extends Person
{
    int staffID;
    Staff(String name,int age, char sex,int staffID, String Username,String Password)
    {
        super(name,age,sex,Username,Password);
        this.staffID=staffID;
    }
    
    void gracvalidity(Student stu , int valid){
        stu.gracevalid = valid;
    }
    
    void allocateHostel(Student stu, String Hostel)
    {
        stu.hostelName=Hostel;
    }
}

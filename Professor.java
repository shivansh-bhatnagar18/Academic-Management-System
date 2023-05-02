public class Professor extends Person
{
    int professorsID;
    String Subject;
    Professor(String name,int age,char sex, int professorsID,String Subject,String Username,String Password)
    {
        super(name,age,sex,Username,Password);
        this.professorsID=professorsID;
        this.Subject=Subject;
    }
    
    public int setmarks(Student stu, int marks) {
        if (stu.gracevalid ==1 && marks<95){
            marks += inc;
        }
        return marks;
    }
    
    void setAttendance(Student stu)
    {
        if(Subject=="Mathematics")
        stu.attendance[0]++;
        else if(Subject=="Electronics")
        stu.attendance[1]++;
        else if(Subject=="Computer Science")
        stu.attendance[2]++;
    }
    void assignScore(Student stu,int score)
    {
        if(Subject=="Mathematics")
            stu.scores[0]=setmarks(stu,score);
        else if(Subject=="Electronics")
            stu.scores[1]=setmarks(stu,score);
        else if(Subject=="Computer Science")
            stu.scores[2]=setmarks(stu,score);
    }
}

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
        stu.scores[0]=score;
        else if(Subject=="Electronics")
        stu.scores[1]=score;
        else if(Subject=="Computer Science")
        stu.scores[2]=score;
    }
}

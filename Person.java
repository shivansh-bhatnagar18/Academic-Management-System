public class Person
{
    String name;
    int age;
    char sex;
    String Username;
    String Password;
    Person(String name,int age,char sex,String Username,String Password)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.Username=Username;
        this.Password=Password;
    }
    void changePassword(String newPassword)
    {
        Password=newPassword;
    }
    void study()
    {
        System.out.println("Person is Studying");
    }
    void speak()
    {
        System.out.println("Person is Speaking Labo Labo La");
    }
}

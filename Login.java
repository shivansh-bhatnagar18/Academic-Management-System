public class Login
{
    void Welcome()
    {
        System.out.println("Welcome to the Academic Management Portal System");
        System.out.println("Please Enter Your Username and Password to Login");
    }
    Person checkCredentials(String username,String password,Person arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].Username.equals(username))
            {
                if(arr[i].Password.equals(password))
                return arr[i];
            }
        }
        System.out.println("Invalid Credentials");
        System.exit(0);
        return null;
    }
}

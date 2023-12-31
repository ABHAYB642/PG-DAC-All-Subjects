namespace BLL;
public class Userservice{
    
    public static User ValidateUser(string username, string password)
    {
        return DBManager.ValidateUser(username,password);
        
    }
}
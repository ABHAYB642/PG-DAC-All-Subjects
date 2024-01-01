namespace BLL;
using BOL;
using DAL.Connected;
public class Userservice{
    
    public static bool ValidateUser(string username, string password)
    {
        return DBManager.ValidateUser(username,password);
    }

    public static bool updatepass(string username, string password)
    {
        return DBManager.updatepass(username,password);
        
    }
    public static bool RegisterUser(string name,string email,string password)
    {
        return DBManager.RegisterUser(name,email,password);
    }
}
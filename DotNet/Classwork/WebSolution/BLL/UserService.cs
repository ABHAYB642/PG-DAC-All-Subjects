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


}
namespace DAL.Connected;
using MySql.Data.MySqlClient;
public class DBManager{

    public static string conString=@"server=localhost;port=3306;user=root;password=Sujitpawar;database=projectdb";

    public static bool updatepass(string username, string password)
    {
        Console.WriteLine(username+password);

        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "Update users set password=@pass where username=@user";
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
            cmd.Parameters.AddWithValue("@user",username);
            cmd.Parameters.AddWithValue("@pass",password);
            int n=cmd.ExecuteNonQuery();
            Console.WriteLine(n);
            if(n>0){
                return true;
            }
        }
        catch(Exception e){
                Console.WriteLine(e.Message);
        }
        finally{
            con.Close();
        }


        return false;
    }

    public static bool ValidateUser(string username, string password){
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "Select * from users where Email=@username and Password=@password";
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
            cmd.Parameters.AddWithValue("@username",username);
            cmd.Parameters.AddWithValue("@password",password);
            MySqlDataReader reader = cmd.ExecuteReader();
            if(reader.Read()){
                return true;
            }

        }
        catch(Exception e){
                Console.WriteLine(e.Message);
        }
        finally{
            con.Close();
        }

       return false;
       
    }
    public static bool RegisterUser(string name,string email,string password){
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "INSERT INTO Users (Username, Password, Email) VALUES (@name,@email,@password)";
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
            cmd.Parameters.AddWithValue("@name",name);
            cmd.Parameters.AddWithValue("@password",password);
            cmd.Parameters.AddWithValue("@email",email);   
                int n = cmd.ExecuteNonQuery();
            if(n>0){
                return true;
            }


    }catch(Exception e){
                Console.WriteLine(e.Message);
        }
        finally{
            con.Close();
        }
        return false;
    }
}

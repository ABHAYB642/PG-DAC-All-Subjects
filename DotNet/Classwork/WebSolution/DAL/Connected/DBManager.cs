namespace DAL.Connected;
public class DBManager{

    public static string conString=@"server=localhost;port=3306;user=root;password=Sujitpawar;database=projectdb";
    public static boolean ValidateUser(string username, string password){
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        Connected.open();
        string query = "Select * from user where Username=@username and Password=@password";
        try{
            MySqlCommand cmd = new MySqlCommand(query,conn);
            cmd.Parameters.AddWithValue("@username",username);
            cmd.Parameters.AddWithValue("@password",password);
            MySqlDataReader reader = cmd.ExecuteReader();
            if(reader.Read()){
                
            }

        }

       
        MySqlDataReader reader=cmd.ExecuteReader();
        if(reader.Read()){
               Console.WriteLine("ID: " + reader[0]);
               Console.WriteLine("Name: " + reader[1]);
               Console.WriteLine("Age: " + reader[2]);
            User u=new User{Id=1,Name="abhay"};
            return u;
        }}catch(Exception e){
            Console.WriteLine(e.Message);
        }
        finally{
            conn.Close();
        }
    return null;
    }
    }
}
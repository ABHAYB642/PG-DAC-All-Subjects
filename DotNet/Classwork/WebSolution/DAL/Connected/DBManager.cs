namespace DAL.Connected;
using MySql.Data.MySqlClient;
using BOL;
using System.ComponentModel.Design;
using Org.BouncyCastle.Asn1;

public class DBManager{

    // public static string conString=@"server=localhost;port=3306;user=root;password=Sujitpawar;database=projectdb";
    public static string conString=@"server=localhost;port=3306;user=root;password=root;database=test";

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
        string query = "Select * from users where username=@username and Password=@password";
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
    public static List<Product> getAllproducts()
    {
        List<Product> list = new List<Product>();
       MySqlConnection con=new MySqlConnection();
       con.ConnectionString=conString;
       con.Open();
       string query = "Select * from Product";
       try{
        MySqlCommand cmd =  new MySqlCommand(query,con);
        MySqlDataReader reader=cmd.ExecuteReader();
        while(reader.Read()){
            int id=int.Parse(reader[0].ToString());
            String name=reader[1].ToString();
            int qty=int.Parse(reader[2].ToString());
            double Price=double.Parse(reader[3].ToString());

            Product p = new Product{
                ProductId=id,
                ProductName=name,
                Price = Price,
                Qty=qty

            };
            list.Add(p);
        }

       }
       catch(Exception e){
            Console.WriteLine(e.Message);
       }
       finally{
        con.Close();
       }
       return list;
}

    public static bool UpdateProduct(int productId, string productName, double price, double qty)
    {
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "Update product set pname=@productName,qty=@qty,price=@price where pid=@id";
        
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
            Console.WriteLine(productId+" "+qty+productName+price);
            cmd.Parameters.AddWithValue("@productName",productName);
            cmd.Parameters.AddWithValue("@qty",qty);
            cmd.Parameters.AddWithValue("@price",price);
            cmd.Parameters.AddWithValue("@id",productId);
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

    public static bool DeleteById(int id)
    {
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "Delete from product where pid=@id";
        
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
             cmd.Parameters.AddWithValue("@id",id);
             int n=cmd.ExecuteNonQuery();
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

    public static bool insertProduct(int productId, string productName, double price, double qty)
    {
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString= conString;
        con.Open();
        string query = "INSERT INTO Product (pid,pname, qty,price) VALUES (@pid,@pname,@qty,@price)";
        try{
            MySqlCommand cmd = new MySqlCommand(query,con);
            cmd.Parameters.AddWithValue("@pid",productId);
            cmd.Parameters.AddWithValue("@pname",productName);
            cmd.Parameters.AddWithValue("@qty",qty); 
             cmd.Parameters.AddWithValue("@price",price);     
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

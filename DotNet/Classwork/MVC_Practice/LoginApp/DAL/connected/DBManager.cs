namespace DAL;
using MySql.Data.MySqlClient;
using BOL;
public class DBManager{

    public static string conString=@"server=localhost;port=3306;user=root;password=Sujitpawar;database=db2";
    public static bool validate(string email,string pwd){
         MySqlConnection conn = new MySqlConnection();
         conn.ConnectionString=conString;
            conn.Open();
         string query="select * from student where Email=@email and StudentPass=@pwd";
         try{
             MySqlCommand cmd=new MySqlCommand(query,conn);
             cmd.Parameters.AddWithValue("@email",email);
             cmd.Parameters.AddWithValue("@pwd",pwd);
             MySqlDataReader reader=cmd.ExecuteReader();
             if(reader.Read()){
                return true;
             }

         }
         catch(Exception e){
            Console.WriteLine(e.Message);
         }
         finally{
            conn.Close();
         }
         return false;
        
    }
   
    public static bool Register(int id,string name,string email,string pwd)
    {
        MySqlConnection conn = new MySqlConnection();
         conn.ConnectionString=conString;
            conn.Open();
         string query="insert into Student values (@id,@name,@email,@pwd)";
         try{
            MySqlCommand cmd=new MySqlCommand(query,conn);
            cmd.Parameters.AddWithValue("@id",id);
            cmd.Parameters.AddWithValue("@name",name);
            cmd.Parameters.AddWithValue("@email",email);
            cmd.Parameters.AddWithValue("@pwd",pwd);
            int n=cmd.ExecuteNonQuery();
            if(n>0){
                return true;
            }
         }
         catch(Exception e){
                Console.WriteLine(e.Message);
        }
        finally{
            conn.Close();
        }
        return false;
    }
    public static List<Student> getAllStudent(){
        List<Student> list =new List<Student>();
        MySqlConnection conn = new MySqlConnection();
         conn.ConnectionString=conString;
            conn.Open();
         string query="select * from student";
         try
        {
            MySqlCommand cmd = new MySqlCommand(query,conn);
            MySqlDataReader reader=cmd.ExecuteReader();
            while(reader.Read())
            {
                int id=int.Parse(reader[0].ToString());
                string name=reader[1].ToString();
                string email=reader[2].ToString();
                Student s = new Student{
                    StudentId=id,
                    StudentName=name,
                    Email=email

                };
                list.Add(s);

        }
        reader.Close();
        }

            catch(Exception ee)
            {
                Console.WriteLine(ee.Message);
            }
            finally{
                    conn.Close();
            }

            return list;

    }
    public static bool Update(int id,string name,string email)
    {
        MySqlConnection conn = new MySqlConnection();
         conn.ConnectionString=conString;
            conn.Open();
         string query="Update student Set StudentId=@id,StudentName=@name,Email=@email where StudentId=@id";
         try{
            MySqlCommand cmd=new MySqlCommand(query,conn);
            cmd.Parameters.AddWithValue("@id",id);
            cmd.Parameters.AddWithValue("@name",name);
            cmd.Parameters.AddWithValue("@email",email);
            // cmd.Parameters.AddWithValue("@pwd",pwd);
            int n=cmd.ExecuteNonQuery();
            if(n>0){
                return true;
            }
         }
         catch(Exception e){
                Console.WriteLine(e.Message);
        }
        finally{
            conn.Close();
        }
        return false;
    }
    public static bool Delete(int id){
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString=conString;
        string query="delete from student where StudentId=@id";
        try{
            conn.Open();
            MySqlCommand cmd= new MySqlCommand(query,conn);
            cmd.Parameters.AddWithValue("@id",id);
            int n=cmd.ExecuteNonQuery();
            if(n>0){
                return true;
            }
        }
        catch(Exception e){
            Console.WriteLine(e.Message);
        }
        finally{
            conn.Close();
        }
        return false;
    }
}

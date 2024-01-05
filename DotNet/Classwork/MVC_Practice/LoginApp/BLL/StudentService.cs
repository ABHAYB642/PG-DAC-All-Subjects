namespace BLL;
using DAL;
using BOL;
public class StudentService {

     
    public static bool validate(string email,string pwd){
        return DBManager.validate(email,pwd);
        
    }
    public static bool Register(int id,string name,string email,string pwd){
        return DBManager.Register(id,name,email,pwd);
        
    }
    public static List<Student> getAllStudent(){
        return DBManager.getAllStudent();
    }
    public static bool Update(int id,string name,string email){
        return DBManager.Update(id,name,email);
        
    }
     public static bool Delete(int id){
        return DBManager.Delete(id);
        
    }

}
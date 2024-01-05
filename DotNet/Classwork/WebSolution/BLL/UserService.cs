namespace BLL;

using System;
using System.Collections.Generic;
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

    public static List<Product> getAllproducts()
    {
       return DBManager.getAllproducts();
    }

    public static bool UpdateProduct(int productId, string productName, double price, double qty)
    {
        return DBManager.UpdateProduct( productId,productName ,price,qty);
    }

    public static bool DeleteById(int id)
    {
        return DBManager.DeleteById(id);
    }

    public static bool insertProduct(int productId, string productName, double price, double qty)
    {
        return DBManager.insertProduct(productId,productName ,price,qty);
    }
}
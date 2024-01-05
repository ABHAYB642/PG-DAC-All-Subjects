using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using LoginApp.Models;
using BOL;
using BLL;

namespace LoginApp.Controllers;

public class UserController : Controller
{
    private readonly ILogger<UserController> _logger;

    public UserController(ILogger<UserController> logger)
    {
        _logger = logger;
    }

    public IActionResult Login()
    {
        if(TempData["updatesuccess"]!=null){
            // string s= TempData["updatesuccess"] as String;
            //  ViewData["logindata"]=s;
            ViewData["logindata"]=TempData["updatesuccess"] as String;
             return View();
        }
        return View();
    }

    [HttpPost]
    public IActionResult Login(String username,String password)
    {
        //Console.WriteLine(username);
        bool status = Userservice.ValidateUser(username,password);
        if(status){
        //    ViewData["ValidUser"]=u1.ToString();
            return RedirectToAction("List");
        }
        else{
        return View();
        }  

    }

     public IActionResult List()
    {
        List<Product> list = new List<Product>();
        list=Userservice.getAllproducts();
        ViewData["productlist"]=list;
        return View();
    }
    public IActionResult Welcome()
    {
        return View();
    }

    public IActionResult Edit(int id)
    {
        List<Product> list = new List<Product>();
        list=Userservice.getAllproducts();
        Product p=list.Find((P)=>P.ProductId==id);
        ViewData["s"] = p;

        return View();
    }
    [HttpPost]
    public IActionResult Edit(int productId,String productName ,double price,double qty)
    {
       // Console.WriteLine(price+productId+productName+qty);
        bool n =Userservice.UpdateProduct(productId,productName ,price,qty);
        return RedirectToAction("List");
    }

    [HttpGet]
    public IActionResult ForgetPassword()
    {
        return View();
    }
    [HttpGet]
    public IActionResult Register()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Register(String name,String email,String password)
    {
        // Console.WriteLine(status);
        // Console.WriteLine("status");
        // Console.WriteLine(name);
        bool status=Userservice.RegisterUser(name,email,password);
        
        if(status){
            return this.RedirectToAction("Login");
        }
        else{
                return View();
        }  
    }

    [HttpPost]
    public IActionResult ForgetPassword(String usern,String pass)
    { 
        Console.WriteLine(usern);
        Console.WriteLine(pass);
        bool status=Userservice.updatepass(usern,pass);
        if(status){
            string s="Password updated succesfull";
            TempData["updatesuccess"]=s;
            return this.RedirectToAction("Login"); 
        }
        return View();
    }

<<<<<<< HEAD
    [HttpGet]
    public IActionResult Delete(int id)
    {
        bool status=Userservice.DeleteById(id);
       return RedirectToAction("List");
    }

    [HttpGet]
    public IActionResult Insert()
    {
        return View();
    }
      [HttpPost]
    public IActionResult Insert(int productId,String productName ,double price,double qty)
    {
        bool status=Userservice.insertProduct(productId,productName ,price,qty);
        return RedirectToAction("List");
    }


=======
>>>>>>> 5bb577ca63df728dd49b4bb08e14f9b89a38c782
    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}

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
            string s= TempData["updatesuccess"] as String;
             ViewData["logindata"]=s;
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
            return RedirectToAction("Welcome");
        }
        else{
        return View();
        }  
    }
    public IActionResult Welcome()
    {
        return View();
    }

[HttpGet]
    public IActionResult ForgetPassword()
    {
        return View();
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



    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}

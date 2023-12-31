using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using LoginApp.Models;
using BOL;

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
        return View();
    }

    [HttpPost]
    public IActionResult Login(String username,String password)
    {
        //Console.WriteLine(username);
        User u1 = UserService.ValidateUser(username,password);
        if(u1!=null){
           ViewData["ValidUser"]=u1.ToString();
            return RedirectToAction("Welcome");
        }
        else{
        return View();
        }  
        // return View();
    }
    public IActionResult Welcome()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}

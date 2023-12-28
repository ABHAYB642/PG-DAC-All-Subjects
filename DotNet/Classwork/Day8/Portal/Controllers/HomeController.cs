using System.Diagnostics;
using BLL;
using Microsoft.AspNetCore.Mvc;
using Portal.Models;

namespace Portal.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [HttpGet]
    public IActionResult Login(){
        return View();
    }

    [HttpPost]
    public IActionResult Login(String username,String password){
        
        Boolean status = Service.ValidateUser(username,password);
        Console.WriteLine(status);
        if(status){
            return RedirectToAction("welcome");
        }
        return View();
    }

     public IActionResult welcome(){
        return View();
    }

}

using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using HRPortal.Models;
using DAL;

namespace HRPortal.Controllers;

public class CompanyController : Controller
{
    private readonly ILogger<CompanyController> _logger;

    public CompanyController(ILogger<CompanyController> logger)
    {
        _logger = logger;
    }

    public IActionResult BasicForm(){
      
       return View();

    }

    [HttpGet]
    public IActionResult BasicForm(string CompanyName, string ContactName, int Employees){
      Console.WriteLine( "company name ="+ CompanyName);
      Console.WriteLine( "contact name ="+ ContactName);
      Console.WriteLine( "Employee count ="+ Employees);
       return View();
    }

    // [HttpGet]
    // public IActionResult ReadForm(){
    //     return View();

    // }

    [HttpGet]
    public IActionResult ReadForm()
{
    string? companyName = Request.Query["CompanyName"];
    string? contactName = Request.Query["ContactName"];
    // int? employeeCount = int.Parse(Request.Query["Employees"].ToString());
    Console.WriteLine("Company name = " + companyName);
    Console.WriteLine("Contact name = " + contactName);
    // Console.WriteLine("Employee count = " + employeeCount);
    return View();
}
}

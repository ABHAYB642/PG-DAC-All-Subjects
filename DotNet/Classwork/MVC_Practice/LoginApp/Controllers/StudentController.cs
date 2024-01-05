using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using LoginApp.Models;
using BLL;
using BOL;

namespace LoginApp.Controllers;

public class StudentController : Controller
{
    private readonly ILogger<StudentController> _logger;

    public StudentController(ILogger<StudentController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }
    [HttpGet]
    public IActionResult Login()
    {
        if(TempData["str"]!=null){
            ViewBag.str=TempData["str"] as string;
            return View();
        }
        
        
        return View();
    }
    [HttpPost]
    public IActionResult Login(string email,string pwd)
    {
        bool status = StudentService.validate(email,pwd);
        return RedirectToAction("Welcome");
    }
    [HttpGet]
    public IActionResult Register()
    {
        return View();
    }
    [HttpPost]
    public IActionResult Register(int id,string name,string email,string pwd)
    {
        bool status = StudentService.Register(id,name,email,pwd);
        if(status){
            string str="Registration Succesfull !";
            TempData["str"]=str;
        }
        return RedirectToAction("Login");
    }
     public IActionResult List()
    {
        List<Student> list = new List<Student>();
        list=StudentService.getAllStudent();
        if(TempData["str1"]!=null){
            ViewBag.str1=TempData["str1"] as string;
            return View(list);
        }
        //ViewData["list"]=list;
        return View(list);
    }
    [HttpGet]
       public IActionResult Edit(int id)
    {
        List<Student> list = new List<Student>();
        list=StudentService.getAllStudent();
        var s=list.Find((s)=>s.StudentId==id);
        return View(s);
    }
    [HttpPost]
       public IActionResult Edit(int id,string name,string email)
    {
       bool status = StudentService.Update(id,name,email);
        if(status){
            string str="Updation Succesfull !";
            TempData["str1"]=str;   
        }
        return RedirectToAction("List");
    }
    public IActionResult Delete(int id)
    {
        bool status = StudentService.Delete(id);

        return RedirectToAction("List");
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

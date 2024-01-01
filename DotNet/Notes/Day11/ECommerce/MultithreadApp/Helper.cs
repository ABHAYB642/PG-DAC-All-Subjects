namespace Util;
using System.Threading;
public static class Helper{
    //non blocking call
        public static  async  Task  StoreData(){
            // defining callback function and invoking callback function
            // using internal thread pool
               await Task.Run(()=>{
                    Console.WriteLine("storing data to JSON file");
                    Console.WriteLine("ABhay");
            });
        }

        public static  async  Task  GetRemoteData(){
              Task.Run(()=>{
                Console.WriteLine("getting  data from external world");
                 Console.WriteLine("sujit");
            });
        }


}
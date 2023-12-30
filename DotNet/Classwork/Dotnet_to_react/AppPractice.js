import SignUpForm from "./Form"
import CounterF from "./Counter"
import Tempearture from "./ChildTemp";
import Calculation from "./Calculation";
import { useState } from "react";
import Datafetch from "./dotnetfetch";
export default function AppPractice()
 { 
  
//   let a=function conversion(a,convert){
//     switch(convert){
//       case "cf":
//         value= a* (9/5) + 32;
//         setvalue(value);
//         break;
//       case "fc":
//         value=(a- 32) * 5/9;
//         setvalue(value);
//         break;
//     }    
//   }
//   let [value,setvalue]=useState(0);
  // <>
  // /* <CounterF></CounterF><br></br>
  // <Tempearture add={a}></Tempearture>
  // <p>{value}</p> */

  // </>

  return(
    // <Calculation></Calculation>
    <Datafetch></Datafetch>
  )
 
   

 }
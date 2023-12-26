import { useState } from "react"

export default function CounterF(){

    let [count,setCount]=useState(100);

    return(
<>

        <input type="button" value="INCREMENT" onClick={(event)=>{
            setCount(count + 1)

        }}/>
        <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{count}</p>
        <input type="button" value="DECREMENT" onClick={(event)=>{
            setCount(count - 1)

        }}/>


</>
    )

}
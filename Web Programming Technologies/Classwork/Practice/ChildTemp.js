export default function Tempearture(props){

    let a=0;
    let cf="cf";
    let fc="fc";
    return( 
        <>
        <input type="number" placeholder="Enter Temperature" onBlur={(e)=>{a=e.target.value}}/>
        <input type="button" value="Celcius To Farenheit " onClick={()=>{
            props.add(a,cf);
        }}/>
        <input type="button" value="Farenheit to Celcius" onClick={()=>{
            props.add(a,fc);}}/>
        </>
        )

}
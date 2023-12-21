export default function Form(){
    return(
        <form >
        Name:<input type="text" name="abhay"/>
        State:<input type="text" name="abhay"/>
        City:<input type="text" name="abhay"/>
        <input type ="submit" onClick={(event)=>{
            console.log("abhay");
            console.log(event.target.value);
        }}/>
        </form>

    )

}
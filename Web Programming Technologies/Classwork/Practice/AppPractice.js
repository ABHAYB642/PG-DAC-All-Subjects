import React, { useState } from 'react';

function SignUpForm() {
  let [username, setUsername] = useState(" ");
  let [email, setEmail] = useState(" ")
  let [password, setPassword] = useState(" ");
  var namechange="";
  var emailchnage="";
  var passwordchange="";
  return (
    <div>
      <h1>Sign Up</h1>
      <form>
        <label htmlFor="username">Username:</label>
        <input type="text" id="username" placeholder="Enter Username" onBlur={(event) => namechange=(event.target.value)} />
        <label htmlFor="email">Email:</label>
        <input type="email" id="email"  onBlur={(event) => emailchnage=event.target.value} />
        <label htmlFor="password">Password:</label>
        <input type="password" id="password"  onBlur={(e) => passwordchange=e.target.value} />
      </form>
      <button type="submit" onClick={()=>{
          setUsername(namechange);
           setEmail(emailchnage);
        setPassword(passwordchange)
}}>Submit</button>
      <p>{username}</p>
      <p>{email}</p>
      <p>{password}</p>
    </div>
  );
}

export default SignUpForm;
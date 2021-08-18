<%-- 
    Document   : loginPage
    Created on : 31 Mar, 2021, 6:00:06 PM
    Author     : Anmol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="contents/style1.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600,700,800&display=swap" rel="stylesheet">
</head>
<body>
    
  <div class="cont">
      <div class="form sign-in "><form action="validate" method="POST">
      <h2>Log In</h2>
            
      <label>
        <span>Email Address</span>
        <input type="email" name="eml"  required>
      </label>
      <label>
        <span>Password</span>
        <input type="password" name="pwd" required>
      </label>
        <label>
     <input type="radio" name="r1" value="admin"><span>ADMIN</span><br>       
    <input type="radio" name="r1" value="staff"><span>TEACHER</span><br>
   <input type="radio" name="r1" value="user"><span>STUDENT</span>
        </label>
      <input class="submit" type="submit" value="Log In" >
      <p class="forgot-pass">Forgot Password ?</p>
<div class="social-media">
    
</div></form>
    </div>

    <div class="sub-cont">
      <div class="img">
        <div class="img-text m-up">
          <h2>New here?</h2>
          <p>Register yourself and discover great amount of new E-learning opportunities!</p>
        </div>
        <div class="img-text m-in">
          <h2>One of us?</h2>
          <p>If you already has an account, just log in. We've missed you!</p>
        </div>
        <div class="img-btn">
          <span class="m-up">Registration </span>
          <span class="m-in">Log in</span>
        </div>
      </div>
        <div class="form sign-up"><form action="RegValidate" method="POST" >
        <h2> Registration </h2>
        <label>
          <span>Full Name</span>
          <input type="text" name="un" required>
        </label>
        <label>
          <span>Email</span>
          <input type="email" name="eml"   required >
        </label>
        <label>
          <span>Password</span>
          <input type="password"name="pwd" required></label>
           <label>
 	   <span>Contact</span>
           <input type ="Text" name="ctc" required> </label>
 	   <label>
	   <span>Admin</span> <input type="radio" name="r1" value="admin">
           <span>Teacher</span><input type="radio" name="r1" value="staff">
           <span>Student</span><input type="radio" name="r1" value="user">
           </label>
        <input type="submit" class="submit" value="Register">
  </form>
        </div>
<script>
    function myOnClickfn() {
     document.location.href="Validate";
}
    document.querySelector('.img-btn').addEventListener('click', function()
	{
		document.querySelector('.cont').classList.toggle('s-signup');
	}
);
    </script>
        </div>
  </div>
</body>
</html>

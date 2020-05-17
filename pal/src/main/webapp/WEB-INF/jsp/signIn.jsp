
<!DOCTYPE html>
<html lang="en">

<head>
 <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="css/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="css/js/jquery-3.5.0.js"> </script>
<script type="text/javascript" src="css/jsFile/login.js"> </script>
<script type="text/javascript" src="css/jsFile/signup201.js"> </script>
<title>Pal SignIn </title>
<style>
input[type=text], input[type=password], input[type=number],[type=date] {
  width: 100%;
  padding: 8px;
  margin: 5px 0 11px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}



input[type=text]:focus, input[type=password]:focus,input[type=number]:focus,[type=date]:focus {
  background-color: #4ddd;
  outline: none;
   transform:scale(1.1,1.1);
}

input[type="date"]::-webkit-calendar-picker-indicator {
    color: #2c3e50;
}

/* A few custom styles for date inputs */
input[type="date"] {
    appearance: none;
    -webkit-appearance: none;
    color: #95a5a6;
    font-family: "Helvetica", arial, sans-serif;
    font-size: 18px;
    border:1px solid #ecf0f1;
    background:#ecf0f1;
    padding:5px;
    display: inline-block !important;
    visibility: visible !important;
}

input[type="date"], focus {
    color: #95a5a6;
    box-shadow: none;
    -webkit-box-shadow: none;
    -moz-box-shadow: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 7px 10px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.modal-body {
  max-height: 800px; 
}

.modal{
  overflow-y: auto;
}


button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 10px;
  background-color: #f94336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: center;
  width: 50%;
}


/* Add padding to container elements */
.container {
  padding: 15px 15px;
  margin: 5px 0 22px 0;
  width:575px;
}

.container-fluid{
	background-color:powderblue;
}
	
/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
  padding: 20px 0px 10px 20px;
}

.clearfix {
  
  
  padding: 20px 0px 20px 20px;
}

/* Change styles for cancel button and signup button on extra small screens */
/*
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
    width: 100%;
  }*/
  
 .container-fluid{
  	width:100%;
    position: absolute;
    background-image: url("css/img/rover224.jpg");
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  display: flex;
  justify-content: center;
 }
 
 .container{
 margin:5px 0px 5px 0px;
 }
 
 .sdiv{
 background-color:rgb(210,255,255,0.4);
 opacity:0.9;
 height:100%;
 width:650px;
 margin: 50px 5px 5px 20px;
 border-radius: 25px;
  
  justify-content: center;
 }
 
 .forms{
 margin: 0px 18px 0px 0px;

 }
 
  
}
</style>

</head>

<body>
<div id="sf200" class="container-fluid img img-responsive" >


<div id="sf201" class="sdiv">

  
  <form class="forms" id="cpa-form" action="/pal/user/addUser" method="post">
    <div class="container">
      <h1 style="text-align:center; color:black;font-style: bold;"> Register </h1>
      
      <hr>
      <label for="uname11" ><b>Name</b></label>
      <input type="text" id="uname11" placeholder="Enter Name" name="uname11"  required onkeyup="nameFilter();">
      <p id="p201" style="color:red; display: none;" >Enter a valid username</p>
      
      <label for="email11"  ><b>Email</b></label>
      <input type="text" id="email11" placeholder="Enter Email" name="email11" required onkeyup="emailFilter();">
       <p id="p202" style="color:red; display: none;" >Enter a valid email</p>

      <label for="psw11"  ><b>Password</b></label>
      <input type="password" id="psw11" placeholder="Enter Password" name="psw11" required onkeyup="passwordCheck();">
       <p id="p203" style="color:red; display: none;">Your password length should be of 8 or more characters</p>
		<p id="p206" style="color:red; display: none;">Your password must contain at least one digit</p>
		<p id="p207" style="color:red; display: none;">Your password must contain at least one Lower case</p>
		<p id="p208" style="color:red; display: none;">Your password must contain at least one Upper case</p>
		<p id="p209" style="color:red; display: none;">Your password must contain at least one Special character</p>	
	
	
      <label for="psw-repeat11"  ><b>Confirm Password</b></label>
      <input type="password" id="psw-repeat11" placeholder="Confirm Password" name="psw-repeat11" required onkeyup="passwordReCheck();">
       <p id="p204" style="color:red; display: none;">Password not matched</p>
       
       <label for="dob">DOB:</label>
       <input type="date" id="dob" placeholder="Date of birth" min="1900-01-01" max="2099-01-01" required="required"/>
      
      <label for="mob11"  id="mob1" ><b>Mobile No. </b></label>
      <input type="number" id="mob11" maxlength="10"  placeholder="Enter Mobile Number" name="mob1" required onkeyup="mobileCheck();">
       <p id="p205" style="color:red; display: none;" >Enter a valid mobile No.</p>
      
  <!--    <label>
        <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
      </label>    --> 

      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

		 <button type="reset" style="font-size:24px; background-color:#4CAF50;padding: 0px; margin: 0px; width: 10%;"> <i class="fa fa-refresh"></i></button>
		 
		 

      <div class="clearfix">
   
     
     <!--     <input   ><i style="font-size:24px" class="fa">&#xf021;</i></input>   -->
        <button class="btn btn-primary" disabled="disabled" id="signbtn21" type="submit" class="signupbtn">Sign Up</button>
        <button class="btn btn-warning" type="button"  onclick="cancel212();">Cancel</button>
      </div>
    </div>
  </form>
  
</div>
</div>
</body>


</html>
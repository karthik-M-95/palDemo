<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="css/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/css/bootstrap.min.css" />
<script  src="css/js/jquery-3.5.0.js"> </script>
<script  src="css/jsFile/login.js"> </script>
<title>Pal App</title>
<style>
input[type=text], input[type=password], input[type=number] {
  

  border: none;
  background: #f1f1f1;
}



input[type=text]:focus, input[type=password]:focus {
  background-color: #4ddd;
  outline: none;
   transform:scale(1.1,1.1);
}


.logina1{
text-align:center;
display: table;
  margin-right: auto;
  margin-left: auto;
  margin-top: 200px;
  padding: 20px 20px 20px 20px;
  background-color: white;
  opacity:0.8;
  border-radius: 25px;

}

.modal-body{
height: 100%; 
overflow-y: auto;
 width: 400px;

}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 15px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}



.background{
 	 width: 100%;
   height: 100%;
    position: absolute;
    background-image: url("css/img/rover21.jpg");
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
 
 
}

</style>
</head>
<body>
<div class=" background">
<div class="logina1"> 
<form  action="/pal/LoginUser" method="post">
   
   	<div  >
	<h3 >Please Login</h3>
	</div>
	<div id="p101" style="color:red; display: none;"> Username or Password is not valid
	</div>
    <div >
      <label for="uname"></label>
      <input type="text" id="userId" placeholder="Enter Username" name="uname" required><br/>
     

      <label for="psw"><b></b></label>
      <input type="password" id="password"  placeholder="Enter Password" name="psw" required onkeyup="pass104();"><br/>
       <p id="p103" style="color:red; display: none;">password should be of 8 or more characters</p> 
       
      <button id="p102" class="btn btn-primary" disabled="disabled" type="submit">Login</button>
       <button class="btn btn-warning"  type="button" onclick="cancel112();" >Cancel</button>
     <!--  <label style="text-align:center">
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label> -->
    </div>

    <div class="container-fluid" style="background-color:#f1f1f1">
      <span class="">Forgot <a href="http://localhost:8080/pal/forgotPassword" >password?</a></span><br />
      </div>
      <div class="container-fluid" style="background-color:#f1f1f1">
      <span>Dont't have an account ?<a  href="http://localhost:8080/pal/signup">Sign In</a></span>
    </div>
  </form>

</div>
</div>

</body>
</html>
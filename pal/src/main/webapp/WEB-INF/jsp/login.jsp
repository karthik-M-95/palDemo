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
input[type=text], input[type=password], input[type=number],input[type=checkbox] {
  

  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: rgb(255 245 169);
  outline: none;
   transform:scale(1.1,1.1);
}


.form{
text-align:center;
display: table;
  margin-right: auto;
  margin-left: auto;
  margin-top: 100px;
  padding: 20px 20px 20px 20px;
  background-color: white;
  opacity:0.8;
  border-radius: 25px;

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

.row{
justify-content: center;
}


.checkboxes label {
  display: inline-block;
  padding-right: 10px;
  white-space: nowrap;
}

.checkboxes input {
  vertical-align: middle;
}

.checkboxes label span {
  vertical-align: middle;
}

</style>
</head>
<body>
<div class="container-fluid background ">


<div class="row">
            <div class="col-xs-offset-1 col-xs-10 col-sm-offset-2 col-sm-8 col-md-offset-2 col-md-8 whiteborder ">

<!-- action="/pal/LoginUser"   -->


<form class="form" id="form101" role="form" action="/pal/LoginUser"  method="post" >
   
   	<div >
	<h3 >Please Login</h3>
	</div>
	 <p id="p104" style="color:red; display: none;">email-Id or Password is not valid</p> 
       
	<div class="form-group">
      <label for="uname" ></label>
      <input type="text" id="uname" class="form-control" onkeyup="userId()" placeholder="Enter Email" name="uname" data-error="You must fill the email field"  required> <br/>
      <p id="p101" style="color:red; display: none;"> Email is not valid</p>
     </div>

	<div class="form-group">
      <label for="password"></label>
      <input type="password" id="password" class="form-control"  placeholder="Enter Password" name="password" required onkeyup="pass104();"><br/>
       <p id="p103" style="color:red; display: none;">password should be of 8 or more characters</p> 
      
      </div>
          
<!--  
 <div class="form-group">
 <input type="checkbox" style=" float: left;" id="togglePassword"><span style="padding: 1px;float: left;">Show password</span><br/>
 </div> -->
 
 <div class="form-group" > 
  <input style="float: left;" type="checkbox" class="form-control" id="togglePassword" onclick="togglePass();" > 
 <span style="float: left; padding: 0px 0px 0px 5px; float: left;" >Show password </span><br/>
 
 </div>
 
 <div class="form-group" style="padding:5px;" > 
  <input style="float: center;" type="checkbox" class="form-control" id="remember-me" name="remember-me" > 
 <span>Remember Me </span>
 </div>
 
 
  
        <div class="form-group">
         <button id="p102" class="btn btn-primary" class="form-control" disabled="disabled" type="submit">Login</button>
      
     
       <button class="btn btn-warning"  type="button" onclick="cancel112();" >Cancel</button>
     <!--  <label style="text-align:center">
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label> -->
    </div>
    

    <div class="form-group" style="background-color:#f1f1f1">
      <span class="">Forgot <a href="http://localhost:8080/pal/forgotPassword" >password?</a></span><br />
      </div>
      <div class="form-group" style="background-color:#f1f1f1">
      <span>Dont't have an account ?<a  href="http://localhost:8080/pal/signup">Sign In</a></span>
    </div>
  </form>



</div>
</div>
</div>

</body>
</html>
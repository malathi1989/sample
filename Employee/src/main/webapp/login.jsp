<html>

<head>

	<title> Admin Login </title>

	<link rel="stylesheet" type="text/css" href="css/sty.css"> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
</head>
<body style= "background-color:lightblue;" >

	<div>

		<h1> EMPLOYEE MANAGEMENT SYSTEM </h1>

	</div>


<div style= "background-image:url(img/bg.jpg);background-size: cover ;"> 
<br> <br><br> <br><br> <br><br>
<div style="color:red; margin-left:5%; font-size:20px;"><b>${msg}</b></div>  
<form method="post" action="LoginServelet">


<h2 style="margin-left: 13%;">Admin Login</h2>

<div style="margin-left: 7%;">

<span class="form_icon"><i class="fa fa-user-circle" aria-hidden="true"></i></span>

<input type="text" class="input_box" placeholder="Enter Userid" name="userid" value='1234' required>
<br><br>

<span class="form_icon"><i class="fa fa-key" aria-hidden="true"></i></span> 

                  
<input type="password" class="input_box" placeholder="Enter Password" name="password" value='1234' required>
</div>

<br> <br>
<div style="margin-left: 13%;">
<input class="log_in" type="submit" style="font-weight:bold" value='Log In'>

</div>
<br><br><br>
  
 
 <br><br> <br><br> <br> <br><br> <br><br> <br><br> 
</form>
</div>	 
  
 
</body>
</html>
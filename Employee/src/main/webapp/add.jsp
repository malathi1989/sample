<html>

<head>

	<title> Add Employee </title>

	<link rel="stylesheet" type="text/css" href="css/sty.css"> 
    
</head>
<body style= "background-color:lightblue;" >

<div class="head" style="background-color: skyblue;">
       <div style="display: inline-block;margin-left: 20%;">
		<h1> EMPLOYEE MANAGEMENT SYSTEM </h1>
	</div>

       <div style="display: inline-block;margin-left: 10%;">
       	<a href="home.jsp"><b>Home</b></a>
	</div>

     <div style="display: inline-block; margin-left: 10%;">
       <a href="login.jsp"><b>Log Out</b></a>
	</div>

</div>

<br>

<div style="color:red; margin-left:15%; font-size:20px;"><b>${success}</b></div>  
<div style="color:red; margin-left:15%; font-size:20px;"><b>${fail}</b></div> 
 <br><br>
<form method="post" action="AddServelet">

<label style="font-size: 22px; margin-left: 15%;"><b>Employee ID:</b></label>    
<input type="text" class="input_box" name="id" required>

<label style="font-size: 22px; margin-left: 10%;"><b>Name:</b></label>  
 <input type="text" class="input_box" name="name" required><br><br><br><br><br>

<label style="font-size: 22px; margin-left: 15%;"><b>Designation:</b></label>   
<input type="text"class="input_box" name="designation" required>

<label style="font-size: 22px; margin-left: 10%;"><b>Email ID:</b></label>  
 <input type="email" class="input_box" name="email" required><br><br><br><br><br>

<label style="font-size: 22px; margin-left: 15%;"><b>Phone Number:</b></label>  
 <input type="text" class="input_box" name="phone" required>

<label style="font-size: 22px; margin-left: 10%; text-align: center;"><b>Address:</b></label> 
  <textarea class="address"  name="address" required></textarea><br><br><br><br><br><br><br>


  <input class="log_in" style="margin-left: 45%; font-weight:bold" type="submit" value="Add">
</form>
<script type="text/javascript">
	function success(){
		alert("Added sucessfully");
	}
</script>
</body>
</html>
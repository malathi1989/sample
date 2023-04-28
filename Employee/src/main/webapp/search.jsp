<html>

<head>

	<title> Search Employee </title>

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
<form name="form1" method="post" action="SearchServelet" id="delete">
<div>
	<label style="font-size: 22px; margin-left: 20%;"><b>Enter Employee ID:</b></label>
	 <input class="input_box" type="text" name="id">
	<button type="submit" class="log_in" style="margin-left: 5%;" ><b>Edit</b></button>
	<button class="log_in" style="margin-left: 5%;" onclick="deletefn()"> <b>Delete</b></button>

</div>

<br><br>
<div style="color:red; margin-left:15%; font-size:20px;"><b>${fail}</b></div> 
<div style="color:red; margin-left:15%; font-size:20px;"><b>${delete}</b></div> 
<div style="color:red; margin-left:15%; font-size:20px;"><b>${deleteerr}</b></div> 
<div style="color:red; margin-left:15%; font-size:20px;"><b>${edit}</b></div> 
<div style="color:red; margin-left:15%; font-size:20px;"><b>${editerr}</b></div> 
<br><br>

<label style="font-size: 22px; margin-left: 15%;"><b>Employee ID:</b></label>    
<input type="text" readonly class="input_box" name="employeeID"  value=${empList.get(0)}  >

<label style="font-size: 22px; margin-left: 10%;"><b>Name:</b></label>  
 <input type="text" class="input_box" name="name" value=${empList.get(1)}> <br><br><br><br><br>

<label style="font-size: 22px; margin-left: 15%;"><b>Designation:</b></label>   
<input type="text"class="input_box" name="designation" value=${empList.get(2)}>

<label style="font-size: 22px; margin-left: 10%;"><b>Email ID:</b></label>  
 <input type="email" class="input_box" name="email" value=${empList.get(3)}><br><br><br><br><br>

<label style="font-size: 22px; margin-left: 15%;"><b>Phone Number:</b></label>  
 <input type="text" class="input_box" name="phone" value=${empList.get(4)}>

<label style="font-size: 22px; margin-left: 10%; "><b>Address:</b></label>
 <textarea  name="address" class="address" >${empList.get(5)}</textarea>
  <br><br><br><br>
<button class="log_in" style="margin-left: 45%;" onclick="savefn()" ><b>Save</b></button>
</form>

<script type="text/javascript">
	
	function deletefn(){
		alert("Are you sure, want to delete?");
		document.form1.action="DeleteServelet";
		
	}
	
	function savefn(){
		document.form1.action="EditServelet";
		
	}
	
</script>

</body>
</html>
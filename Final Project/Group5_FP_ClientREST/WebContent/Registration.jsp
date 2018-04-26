<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="StylesheetIntro.css">
</head>
<body>

          <ul>
			<li><a href="index.html">Home</a></li>
            <li><a href="about.html">About Us</a></li>
            <li><a href="contact.html">Contact Us</a></li>
          </ul>

	<div class="main">
	<h1>Car Services Company</h1>
        
       <script>
		
		function Verify() {
			  var emailpattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			  var emailObj = document.getElementById("email");
			  if (emailObj.value === null || emailObj.value === "") {
			   alert("Enter email Id");
			   emailObj.focus();
			   return false;
			  } else if (!emailpattern.test(emailObj.value)) {
			   alert("please enter valid e-mail address")
			   emailObj.focus();
			   return false;
			  } else {
			   return true;
			  }
		}
		
		</script>
        
        <div class="container">
        <form name = "Register" action="Register" method="post" >
	
                <h3>Personal</h3><br>
		First Name <input type="text" name ="fn" pattern= "{A-Za-z]" class = "form-control" required/><br>
		Last Name <input type="text" name ="ln" pattern= "{A-Za-z]" class = "form-control" required/><br>
		
		<h3>Billing Address</h3><br> 
		Street Address <input type="text" name ="stadd" class = "form-control" required/><br>
		City <input type="text" name ="city" class = "form-control" required/><br>
		State <input type="text" name ="state" class = "form-control" required/><br>
		Zip <input type="text" name ="zip" size="5" pattern ="[0-9]{5}" class = "form-control" required/><br>
		Country <input type="text" name ="country" class = "form-control" required/><br>
		
		<h3>Contact Info</h3><br> 
		Residence <input type="text" name="res" size="10" pattern ="[0-9]{10}" class = "form-control" /><br>
		Cell <input type="text" name="cell" size="10" pattern ="[0-9]{10}" class = "form-control" required/><br>
		Fax <input type="text" name="fax" size="10" pattern ="[0-9]{10}" class = "form-control" ><br>
		
		<h3>Profile Authentication</h3><br> 
		Email <input type="text" name="email" class = "form-control" required/><br>
		Password <input type="password" name="password" class = "form-control" required/><br>
		
		<h3>Company</h3><br> 
		Company name <input type="text" name="company" class = "form-control" required/><br>
                Type<br> <input type="radio" name="type" value="employee">Employee<br>
                     <input type="radio" name="type" value="owner">Owner<br>
		
		<h3>Alternate Contact</h3><br> 
		Name <input type="text" name="acname" class = "form-control" required/><br>
		Phone Number <input type="text" name="acph" class = "form-control" required/><br>
		<br>
		
		<input type="Submit" name="Submit" id="Submit" value = "Register" onclick="Verify()" />
	</form>
        </div>
        </div>
</body>
</html>
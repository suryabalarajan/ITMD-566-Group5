<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
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
	<h1>Car Services</h1>
        
        		<script>
		
		function Verify() {
			  var emailpattern = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			  var emailObj = document.getElementById("cus_email");
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
            
        	<form name = "Login" action="Login" method="post">
                    
                <label for ="email">Email</label>    
                <input type ="email" id = "email" name ="email" class = "form-control" required/><br>
                
                <label for ="password">Password</label> 
                <input type ="password" id = "password" name ="password" class = "form-control" required/><br>
				
                <input type="Submit" name="Submit" id="Submit" value ="Login" onclick="Verify()"/><br>
		
                <p class="message"><strong>OR</strong></p>
                <a class = "button" href="Registration.jsp">Register</a>
		
                </form>
        </div>
       	</div>
</body>
</html>
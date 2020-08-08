<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

    <h1 style ="color:red;text-align:center">StudentDetails</h1>
    
    <form action="save" method="POST">
    	<pre>
    		 StudentId  ::<input type="text" name="sno"/>	
    	 	 StudentName::<input type="text" name="sName"/>		
    	     Age ::       <input type="text" name="age"/>	
    		 Gender ::    
    		 <input type="radio" name="gender" value="male">Male
    		 <input type="radio" name="gender" value="female">Female
    				   	 
    		Cource:: <select name="course">
    					<option value="JAVA">JAVA</option>
    					<option value="SPRING">SPRING</option>
    					<option value="WS">WS</option>
    					<option value="HB">HB</option>
    				 </select>	
    				  <input type="submit" value="register"/>
    				 	   	  
    	</pre>
    	
    
    </form>
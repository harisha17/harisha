<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/task" method="get">
Name:<input type = "text" name="name" id="name" pattern="[A-Za-z0-9 ]{1,15}"><br><br>
<label>Description </label>
<input id="description" name="description" rows="4" cols="50"></textarea><br><br>
Status:<select name="status" value="status" id="status" required><option>
<option value=1 selected="true">SelectOne
<option value="Close">Close
<option value="In Progress">In Progress
<option value="Cancelled">Cancelled
<option value="On Hold">On Hold
</select><br><br>
Priority<select name="priority" value="priority" id="priority" required><option>
<option value=1 selected="true">Select One
<option value="1-High">1-High
<option value="2-Medium">2-Medium
<option value="3-Low">3-Low
Notes</select><br><br><label>Notes &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</label>
<textarea id="notes" name="notes" rows="4" cols="50"></textarea><br><br><label>Book Mark &nbsp&nbsp&nbsp&nbsp:</label>
<textarea id="bookmark" name="bookmark" rows="4" cols="50"></textarea><br><br>
<INPUT TYPE="SUBMIT">

</body>
</html>
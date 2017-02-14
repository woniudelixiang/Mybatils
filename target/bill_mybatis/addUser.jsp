<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title>My JSP 'addUser.jsp' starting page</title>
</head>

<body>
<form action="<%=path %>/UerInfoController/addUser" method="POST">
<table>
	<tr>
		<td>userName:</td>
		<td><input type="text" name="userName"></td>
	</tr>
	<tr>
		<td>password:</td>
		<td><input type="text" name="password"></td>
	</tr>
	<tr>
		<td><input type="submit" value="Save"></td>
		<td><input type="reset" value="Reset"></td>
	</tr>
</table>
</form>
</body>
</html>
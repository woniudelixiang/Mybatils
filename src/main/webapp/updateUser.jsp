<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title>My JSP 'updateUser.jsp' starting page</title>
</head>

<body>
<form action="<%=path %>/UerInfoController/updateUser" method="POST">
<input type="hidden" name="id" value="${user.id }">
<table>
	<tr>
		<td>userName:</td>
		<td><input type="text" name="userName" value="${user.userName }">
		</td>
	</tr>
	<tr>
		<td>password:</td>
		<td><input type="text" name="password" value="${user.password }"></td>
	</tr>
	<tr>
		<td><input type="submit" value="Update"></td>
		<td><input type="reset" value="Reset"></td>
	</tr>
</table>
</form>
</body>
</html>
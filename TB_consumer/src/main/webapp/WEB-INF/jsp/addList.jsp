<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<form action="/addTopic" method="post">
	   	 标题:<input type="text" name="title" id="title"/><br />
	   	 发帖人:<input type="text" name="author" id="author"/><br />
	   	 内容:<textarea rows="10" cols="20" name="content" id="content"></textarea><br />
	   	<input type="submit" value="发贴"/>
   	 </form>
   	 <span style="color: red">${error}</span>
  </body>
</html>

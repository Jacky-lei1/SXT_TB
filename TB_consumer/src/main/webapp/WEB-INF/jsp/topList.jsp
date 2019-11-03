<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	
	</script>

  </head>
  
  <body>
  	<center>
  		<div>
  			<a href="/addList">我要发帖</a>
  		</div>
  		<table border="1px" width="1000px" height="10px" style="text-align: center">
  			<tr>
  				<th>标题</th>
  				<th>发帖人</th>
  				<th>发帖时间</th>
  				<th>浏览量</th>
  			</tr>
  			<c:forEach items="${topList}" var="tp">
	  		  <tr>
  				 <td><a href="/findById?topic_id=${tp.topic_id}&click_amount=${tp.click_amount}" >${tp.title}</a></td>
			     <td>${tp.author}</td>
			     <td>
			     	<fmt:formatDate value="${tp.create_date}" type="both" dateStyle="medium" timeStyle="medium"/>
			     </td>
			     <td>${tp.click_amount}</td>
			  </tr>
  			</c:forEach>
  			
  		</table>
  	</center>
    
  </body>
</html>

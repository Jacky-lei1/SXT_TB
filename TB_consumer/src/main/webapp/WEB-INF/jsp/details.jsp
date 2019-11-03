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
    
    <title>My JSP 'details.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#but").click(function(){
				//获取表单的值
				var name = $("#name").val();
				var message = $("#message").val();
				var topic_id = $("#topic_id").val();
				//发起一个ajax请求，完成添加评论的操作
				/* alert(name+"--"+message+"--"+topic_id); */
				$.ajax({
					url:"/addReply",
	 				type:"post",
	 				data:{name:name,message:message,topic_id:topic_id},
	 				dataType:"text",
	 				success:function(data){
	 					if(data=="success"){
	 						//刷新父窗口
							window.location.reload();//刷新当前窗口
							//window.opener.location.reload();
							//关闭当前窗口
							//window.close();
						}
	 				}
				});
			});
		});
	
	
	
	
	</script>

  </head>

  <body>
  	<center>
     <div>
	    	<h1>
	    		${topic.title}&nbsp;
	    		${topic.author}&nbsp;
<%-- 	    		${topic.create_date}&nbsp; --%>
	    		<fmt:formatDate value="${topic.create_date}" pattern="yyyy-MM-dd HH:mm:ss" />&nbsp;
	    		共被浏览过${topic.click_amount}次
	    	</h1>
	    	
	    	<h2>正文：${topic.content}</h2>
    </div>
    </center>
    <hr />
    
    <center>
     
     	<p style="color: red">以下是评论区</p>
	     	<div>
		     	<c:forEach items="${topic.reply}" var="reply" >
		     		<c:choose>
		     			<c:when test="${reply.getReply_id()!=0}">
				     		<h3>
				     			昵称：${reply.getAuthor()}&nbsp;
				     			时间：<fmt:formatDate value="${reply.getCreate_date()}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;
				     		</h3><br />
				     		<h3>评论内容：${reply.getContent()}</h3><br />
				     		<span>--------------------------------------------</span><br />	
			     		</c:when>
			     		<c:when test="${reply.getReply_id()==0}">
			     			<h2>暂无评论，快抢沙发！</h2>
			     		</c:when>
		     		</c:choose>
		     	</c:forEach>
	   		</div>
    </center>
    <hr />
    
 
    <div>
     <center>
     	<input type="hidden" name="topic_id" id="topic_id" value="${topic.topic_id}"/>
   	   	<label>昵称：</label>
    	 <input type="text" name="name" id="name" /><br /><br />
    	 <label>评论：</label>
        <textarea rows="" cols="" name="message" id="message"></textarea><br />
        <input type="button" name="but" id="but" value="发表评论"/>
     </center>
    </div>
    
  </body>
</html>

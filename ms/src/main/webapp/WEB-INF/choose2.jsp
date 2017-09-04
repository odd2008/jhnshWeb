<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>医生登录</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
</head>
<body>
 <%@ include file="head.jsp" %>
 <div style="width:100%;height:200px">
 <div class="hz">医生登录</div>
 <hr style="border:1px solid #808080;margin-top:0px;clear:both">
<div><span class="ts">--温馨提示：选择您需要的服务 </span><span style="float:right;color:blue">欢迎您，${docInfo.name}</span></div>
 </div>
 <div style="height:350px;;">
 <div class="yygh"><p>设置预约</p> <img class="gh"src="/ms/static/picture/gh.jpg"/></div>
 <div class="zxwz"><p>患者信息</p> <img class="gh"src="/ms/static/picture/wz.jpg"/></div>
 </div>
 <%@ include file="end.jsp" %>
<script>
$(".yygh").on("click",function(){
	window.location.href = "setup";
})
$(".zxwz").on("click",function(){
	window.location.href = "record2";
})
</script>
</body>
</html>
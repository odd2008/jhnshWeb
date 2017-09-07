<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>患者信息</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<style>
table{
border:1px solid blue;
margin:0px auto;
}
table tr td {
border:1px solid blue;
text-align:center;
width:100px;
height:50px;
}
</style>
</head>
<body>
<%@ include file="head.jsp" %>
<div class="hz">患者信息</div>
<hr style="border:1px solid #808080;margin-top:0px;clear:both">
<div><span class="ts">--温馨提示：请 查看患者信息 </span><span style="float:right;color:blue">欢迎您，${name.name }</span></div>
<div style="height:350px;overflow:auto">

<c:choose>
	<c:when test="${empty infobean }">
		<p style="margin:10px 40%;font-size:30px;">无记录</p>
	</c:when>
	<c:otherwise>
		<table>
			<tr>
				<td>日期</td>
				<td>医生</td>
				<td>患者</td>
				<td>序号</td>
			</tr>
		<c:forEach items="${infobean }" var="one">
			<tr>
				<td>
					<c:if test="${one.date eq 0}">5月8日</c:if>
					<c:if test="${one.date eq 1}">5月9日</c:if>
					<c:if test="${one.date eq 2}">5月10日</c:if>
					<c:if test="${one.date eq 3}">5月11日</c:if>
					<c:if test="${one.date eq 4}">5月12日</c:if>
					<c:if test="${one.date eq 5}">5月13日</c:if>
					<c:if test="${one.date eq 6}">5月14日</c:if>
				</td>
				<td>${one.name }</td>
				<td>${one.patName }</td>
				<td>${one.num }</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
	
</c:choose>
</div>
<%@ include file="end.jsp" %>
</body>
</html>

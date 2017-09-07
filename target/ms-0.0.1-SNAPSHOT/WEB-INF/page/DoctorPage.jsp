<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<mata name="viewport" content="width=device=width, initial=scale=1.0">
<title>分页的测试</title>
<link rel="stylesheet" type="text/css" href="/ms/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<script src="/ms/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>
<style>
</style>
</head>
<body>
	这是一个医生分页的测试。
	<table>
		<tr>
			<td>姓名</td>
			<td>部门id</td>
			<td>性别</td>
			<td>信息</td>
		</tr>
		<c:forEach items="" var="one">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

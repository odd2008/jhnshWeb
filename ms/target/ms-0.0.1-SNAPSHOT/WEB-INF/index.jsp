<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<mata name="viewport" content="width=device=width, initial=scale=1.0">
<title>花旗医院</title>
<link rel="stylesheet" type="text/css" href="/ms/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<script src="/ms/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>
<style>
</style>
</head>
<body>

<c:import url="head.jsp"></c:import>

<!-- 图片的轮播 -->
	<div id="myCarousel" class="carousel slide" data-interval="2000" style="width: 80%; height: 300px; margin: 0px auto">
		<!-- 轮播（Carousel）指标 -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- 轮播（Carousel）项目 -->
		<div class="carousel-inner"  style="width:90%; height: 300px; margin: 0px auto">
			<div class="item active">
				<img src="../static/picture/lunbo1.jpg" alt="First slide" width="100%" height="100%" >
				
			</div>
			<div class="item">
				<img src="../static/picture/lunbo2.jpg" alt="Second slide" width="100%" height="100%">
				
			</div>
			<div class="item">
				<img src="../static/picture/lunbo3.jpg" alt="Third slide" width="100%" height="100%">
			</div>
		</div>
		<!-- 轮播（Carousel）导航 -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo; </a> <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo; </a>
	</div>
	<!-- 启动轮播 -->
	<script type="text/javascript">
	$('.carousel').carousel();
	</script>
	
	<div class="mainbody">
	<table style="width: 80%; height:300px; margin: 0px auto">
	<tr>
	<td>
	<span class="aa">医院动态</span>   <span class="ee">更多>></span>
	<hr/>
	<ul>
	<li><a><span>我院消化科张国新教授论文入...</span><span class="ee">2017-02-11</span></a></li>
	<li><a><span>新年贺词</span><span class="ee">2017-02-08</span></a></li>
	<li><a><span>医院领导慰问春节在岗职工</span><span class="ee">2017-02-08</span></a></li>
	<li><a><span>慰问传真情 新年送吉祥</span><span class="ee">2017-02-03</span></a></li>
	<li><a><span>欢迎王可鹏医生加入我院</span><span class="ee">2017-02-02</span></a></li>
	<li><a><span>全省幼妇健康联合体业务在我院召开</span><span class="ee">2017-02-01</span></a></li>
	</ul>
	</td>
	<td>
	<span class="aa">医院通告</span>   <span class="ee">更多>></span>
	<hr/>
    <ul>
	<li><a><span>2017年2月专家门诊排班表</span> <span class="ee">2017-02-07</span></a></li>
	<li><a><span>关于我院一部电梯的采购通知</span> <span class="ee">2017-02-07</span></a></li>
	<li><a><span>2017年春节期间门诊工排</span> <span class="ee">2017-02-07</span></a></li>
	<li><a><span>我院肝脏外科一匹手术器械采购项目</span> <span class="ee">2017-02-07</span></a></li>
	<li><a><span>关于医院官网手机版上线的通知</span> <span class="ee">2017-02-07</span></a></li>
	<li><a><span>我院产科婴儿帽采购公告</span> <span class="ee">2017-02-07</span></a></li>
	</ul>
	</td>
	<td>
	<input type="button" value="患者通道" class="hztd"/><br/>
	<input type="button" value="医生登录" class="ysdl"/><br/>
	<input type="button" value="邮箱留言" class="yxly"/><br/>
	</td>
	</tr>
	</table>
	<div><input type="file" name="files[]" multiple=""/></div>
	</div>
	<c:import url="end.jsp"></c:import>
	
	<script type="text/javascript">
	$(".hztd").click(function(){
		window.open("/ms/home/login1");
	});
	$(".ysdl").click(function(){
		window.open("/ms/home/login2");
	});	
	
	
	</script>
	
</body>
</html>













<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>预约挂号</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<link rel="stylesheet" type="text/css" href="/ms/static/ztree-v3/css/zTreeStyle/zTreeStyle.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<script type="text/javascript" src="/ms/static/ztree-v3/js/jquery.ztree.all-3.5.js"></script>
<script src="/ms/static/js/tree.js" type="text/javascript"></script>
</head>
<body>
<%@ include file="head.jsp" %>
<div class="hz">预约挂号</div>
<hr style="border:1px solid #808080;margin-top:0px;clear:both">
<div class="ts"><p>--温馨提示：请展开点击选择您需要挂号的医生</p></div>
<div id="tree" class="peopleOrgTree ztree" style="height:300px;width:300px;overflow:auto;margin:0px auto;">

</div>

<%@ include file="end.jsp" %>
</body>
</html>
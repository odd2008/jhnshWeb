<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<style>
html{    
    width: 100%;    
    height: 100%;    
    overflow: hidden;    
    font-style: sans-serif;    
}    
body{    
    width: 100%;    
   height: 100%;    
    font-family: 'Open Sans',sans-serif;    
    margin: 0;    
    background-color: #4A374A;    
} 
h1{    
    font-size: 2em;    
    margin: 0.67em 0;    
}    
input{    
    width: 278px;    
    height: 18px;    
    margin-bottom: 10px;    
    outline: none;    
    padding: 10px;    
    font-size: 13px;    
    color: #fff;    
    text-shadow:1px 1px 1px;    
    border-top: 1px solid #312E3D;    
    border-left: 1px solid #312E3D;    
    border-right: 1px solid #312E3D;    
    border-bottom: 1px solid #56536A;    
    border-radius: 4px;    
    background-color: #2D2D3F;    
}    
</style>

</head>
<body>
	<div id="login">
		<h1>医生登录</h1>
		<form method="post">
			<input type="text" required="required" placeholder="用户名" class="u"></input>
		    <input type="password" required="required" placeholder="密码" class="p"></input>
			<input class="but" type="button" value="登陆"  style="width:300px;height:40px;cursor:pointer"/>
		</form>
	</div>
<script>
$('.but').click(function(){
	var id = $('.u').val().trim();
	var password = $('.p').val().trim();
	$.post("/ms/home/check2",{'id':id,'password':password},function(data){
		if (data.state=="1") {
			window.location.href = "choose2?id="+id+"&password="+password;
		} else {
			alert("账号或者密码不正确！");
		}
	},"json");
})	
</script>
</body>
</html>
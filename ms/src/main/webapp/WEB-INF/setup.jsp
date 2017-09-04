<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>医生登录</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<style>
table{
border:1px solid blue;
margin:0px auto;
}
table tr td {
border:1px solid blue;
text-align:center;
width:80px;
height:50px;
}
</style>
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<script src="/ms/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>
</head>
<body>
 <%@ include file="head.jsp" %>
 <div style="width:100%;height:200px">
 <div class="hz">设置预约</div>
 <hr style="border:1px solid #808080;margin-top:0px;clear:both">
<div><span class="ts">--温馨提示：请设置本周的预约安排表 </span><span style="float:right;color:blue">欢迎您，${docInfo.name }</span></div>
 </div>
 	<form id="form">
 		<table>
		<thead>
			<tr>
				<td>日期</td>
				<td>5月8日</td>
				<td>5月9日</td>
				<td>5月10日</td>
				<td>5月11日</td>
				<td>5月12日</td>
				<td>5月13日</td>
				<td>5月14日</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>预约</td>
				<td><label><input type="checkbox" name="mon" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="tue" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="wed" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="thu" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="fri" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="sat" value="1">开启预约</label></td>
				<td><label><input type="checkbox" name="sun" value="1">开启预约</label></td>
			</tr>
		</tbody>
		</table>
 	</form>
 	<div> <input type="button" value="保存" id="save"/></div>
 	
 	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">设置结果</h4>
            </div>
            <div class="modal-body">保存成功</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
 </div>
 <%@ include file="end.jsp" %>
 <script>
 $('#save').on('click',function(){
	 $.post( "savetime",$("#form").serialize(), function(){
			
	},'json').done(function(r){
		if(r.state == "1"){
			$('#myModal').modal('show')
		}
	})
 })
	 
 
 
 </script>
 </body>
</html>
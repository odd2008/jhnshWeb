<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>预约挂号</title>
<link rel="stylesheet" type="text/css" href="/ms/static/css/style.css">
<link rel="stylesheet" type="text/css" href="/ms/static/bootstrap/css/bootstrap.min.css">
<script src="/ms/static/jquery/jquery.js" type="text/javascript"></script>
<script src="/ms/static/bootstrap/js/bootstrap.js" type="text/javascript"></script>
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
</head>
<body>
<%@ include file="head.jsp" %>
<div class="hz">预约挂号</div>
<hr style="border:1px solid #808080;margin-top:0px;clear:both">
<div><span class="ts">--温馨提示： 选择日期挂号 </span><span style="float:right;color:blue">欢迎您，${name }</span></div>
<input id="id" type="hidden" value="${docInfo.id }"/>
<p>姓名 ${docInfo.name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：${docInfo.sex }</p>
<p>简介：${docInfo.info }</p>
<div style="height:300px;padding-top:50px;">
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
			<td>
				<c:choose>
					<c:when test="${time.mon eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.tue eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.wed eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.thu eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.fri eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.sat eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<c:choose>
					<c:when test="${time.sun eq 1}">
					<input type="button" value="预约"/>
					</c:when>
					<c:otherwise>
					<input type="button" value="不可预约" disabled="disabled"/>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</tbody>
</table>
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">预约结果</h4>
            </div>
            <div class="modal-body"></div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">确定</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%@ include file="end.jsp" %>
<script>
$(function(){
	$('td input').each(function(index){
		$(this).on('click',function(){
			var doctorId = $('#id').val();
			$.post("guahao",{"docId":doctorId,"index":index
							}).done(function(r){
								if(r.state == "1"){
									$('.modal-body').text("预约成功!您是第"+r.data+"位。");
								} else {
									$('.modal-body').text("预约失败!"+r.data);
								}
								$('#myModal').modal('show')
							})
		})
	})
})
</script>
</body>
</html>
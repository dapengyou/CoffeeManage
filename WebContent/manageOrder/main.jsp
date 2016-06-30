<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OrderMain</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br /> <br />
			<h1>食材列表</h1>
				<h2><a href="toadd.action">增加</a></h2>
			<table border="1" width="90%">
				<thead>
					<tr bgcolor="#99FFFF">
						<td>编号</td>
						<td>订单日期</td>
						<td>订单数量</td>
						<td>食材名称</td>
						<td>处理方式</td>
						<td>食材处理度</td>
					</tr>
				</thead>

				<tbody>
					<s:iterator var="ov" value="orderList" status="st">
						<tr>
							<td><s:property value="orderid" /></td>
							<td><s:date name="#ov.orderdate" format="yyyy/MM/dd" /></td>
							<td><s:property value="quantity" /></td>
							<td><s:property value="bean.beanname" /></td>
							<td><s:property value="handle.handlestyle" /></td>
							<td><s:property value="handle.bakingdegree" /></td>
							<td><a href="toupdate.action?id=${orderid }">修改</a></td>
							<td><a href="todelete.action?id=${orderid }">删除</a></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			${pageIndex } / ${pageNum } <a
				href="tomain.action?pageIndex=${pageIndex-1 }">上页</a> <a
				href="tomain.action?pageIndex=1">首页</a> <a
				href="tomain.action?pageIndex=${pageIndex+1 }">下页</a>
		</div>
	</div>
</body>
</html>
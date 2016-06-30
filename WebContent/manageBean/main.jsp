<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BeanMain</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br /> <br />
			<h1>食材列表</h1>
			<h2><a href="toadd.action">增加</a></h2>
			<table border="1" width="80%">
				<thead>
					<tr bgcolor="#99FFFF">
						<td>编号</td>
						<td>食材名</td>
						<td>食材产地</td>
						<td>生产日期</td>
						<td>原品价格</td>
						<td>处理后价格</td>
						<td>处理方式</td>
					</tr>
				</thead>

				<tbody>
					<s:iterator var="bv" value="beanList" status="st">
						<tr>
							<td><s:property value="beanid" /></td>
							<td><s:property value="beanname" /></td>
							<td><s:property value="producthome" /></td>
							<td><s:date name="#bv.productiondate" format="yyyy/MM/dd" /></td>
							<td><s:property value="greenprice" />元／斤</td>
							<td><s:property value="cookedprice" />元／斤</td>
							<td><s:iterator value="handles">
									<s:property value="handlestyle" />
								</s:iterator></td>
							<td><a href="toupdate.action?id=${beanid }">修改</a></td>
							<td><a href="todelete.action?id=${beanid }">删除</a></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>
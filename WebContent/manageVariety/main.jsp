<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VarietyMain</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br /> <br />
			<h1>食材列表</h1>
			<h2><a href="toadd.action">增加</a></h2>
			<table border="1" width="90%" class="table">
				<thead>
					<tr bgcolor="#99FFFF">

						<td>编号</td>
						<td>食材种类</td>
						<td>英文名</td>
						<td>食材成份</td>
						<td>图片</td>
					</tr>
				</thead>

				<tbody>
					<s:iterator var="vv" value="varietyList" status="st">
						<tr>
							<td><s:property value="varietyid" /></td>
							<td><s:property value="varietyname" /></td>
							<td><s:property value="engname" /></td>
							<td><s:property value="element" /></td>
							<td><img src="showphoto?id=${varietyid }" /></td>
							<td><a href="toupdate.action?id=${varietyid }">修改</a></td>
							<td><a href="todelete.action?id=${varietyid }">删除</a></td>
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
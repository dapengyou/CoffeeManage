<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HandleMain</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br /> <br />
			<h1>食材列表</h1>
			<h2><a href="toadd.action"><s:text name="add"></s:text></a></h2>
			<table border="1" width="90%">
				<thead>
					<tr bgcolor="#99FFFF">

						<td><s:text name="handle.id"></s:text></td>
						<td><s:text name="handle.handlestyle"></s:text></td>
						<td><s:text name="handle.bakingdegree"></s:text></td>
					</tr>
				</thead>

				<tbody>
					<s:iterator var="hv" value="handleList" status="st">
						<tr>
							<td><s:property value="handleid" /></td>
							<td><s:property value="handlestyle" /></td>
							<td><s:property value="bakingdegree" /></td>
							<td><a href="toupdate.action?id=${handleid }"><s:text
										name="update"></s:text></a></td>
							<td><a href="todelete.action?id=${handleid }"><s:text
										name="delete"></s:text></a></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
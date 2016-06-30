<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br /> <br />
			<s:form action="register" namespace="/index" method="post">
				<s:textfield name="uv.id" label="ID"></s:textfield>
				<s:textfield name="uv.name" label="用户名"></s:textfield>
				<s:password name="uv.pwd" label="密码"></s:password>
				<s:textfield name="uv.email" label="email"></s:textfield>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
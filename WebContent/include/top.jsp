<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/menu.js"></script>
</head>
<body>
<div class="top"></div>
<div id="header">
	<div class="logo">
		<s:text name="project.name"></s:text>
	</div>
	<div class="navigation">
		<ul>
		 	<li><s:text name="welcome"></s:text></li>
			<li><a herf="">${username }</a></li>
			<li><a href="${pageContext.request.contextPath }/index/logout.action"><s:text name="logout"></s:text></a></li>
			<li><a href="${pageContext.request.contextPath}/index/toregister.action" ><s:text name="register"></s:text></a></li>
		</ul>
	</div>
</div>
</body>
</html>
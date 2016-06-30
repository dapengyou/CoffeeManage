<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HandleUpdate</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br/><br/>
			<s:form action="update" namespace="/manageHandle" method="post">
				<s:hidden name="hv.handleid" value="%{hv.handleid}"></s:hidden>
				<s:textfield name="hv.handlestyle" key="handle.handlestyle"
					value="%{hv.handlestyle }"></s:textfield>
				<s:textfield name="hv.bakingdegree" key="handle.bakingdegree"
					value="%{hv.bakingdegree }"></s:textfield>
				<s:submit key="submit"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
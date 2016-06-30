<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VarietyUpdate</title>
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br/><br/>
			<s:form action="update" namespace="/manageVariety" method="post"
				enctype="multipart/form-data">
				<s:hidden name="vv.varietyid" value="%{vv.varietyid }"></s:hidden>
				<s:textfield name="vv.varietyname" label="种类名"
					value="%{vv.varietyname}"></s:textfield>
				<s:textfield name="vv.engname" label="英文名" value="%{vv.engname}"></s:textfield>
				<s:textfield name="vv.element" label="成份" value="%{vv.element}"></s:textfield>
				<s:file name="photo" label="图片"></s:file>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
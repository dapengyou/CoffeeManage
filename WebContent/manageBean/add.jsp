<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
<sx:head />
</head>
<body>
	<div class="m-right">
		<div class="main">
			<br/><br/>
			<s:form action="add" namespace="/manageBean" method="post"
				enctype="multipart/form-data" validate="true">
				<s:textfield name="bv.beanname" label="食材名"></s:textfield>
				<s:textfield name="bv.producthome" label="食材产地"></s:textfield>
				<s:textfield name="bv.greenprice" label="原品价格"></s:textfield>
				<s:textfield name="bv.cookedprice" label="处理后价格"></s:textfield>
				<sx:datetimepicker name="bv.productiondate" label="生产日期"
					displayFormat="yyyy-MM-dd"></sx:datetimepicker>
				<s:checkboxlist name="handles" list="handleList" label="处理方式"
					listKey="handleid" listValue="handlestyle"></s:checkboxlist>
				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
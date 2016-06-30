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
	<script>
		function submitBeanID(obj) {
			window.location.href = 'toadd.action?beanid=' + obj;
		}
	</script>
	<div class="m-right">
		<div class="main">
			<br />
			<br />
			<s:form action="add" namespace="/manageOrder" method="post"
				enctype="multipart/form-data">
				<sx:datetimepicker name="ov.orderdate" label="订单日期"
					displayFormat="yyyy-MM-dd"></sx:datetimepicker>
				<s:textfield name="ov.quantity" label="数量"></s:textfield>

				<s:select name="beanid" list="beanList" listValue="beanname"
					listKey="beanid" label="食材类型" headerKey="" headerValue="请选择类型"
					onchange="submitBeanID(this.value)"></s:select>

				<s:radio name="handleid" list="handleList" label="处理方式"
					listValue="handlestyle" listKey="handleid"></s:radio>

				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
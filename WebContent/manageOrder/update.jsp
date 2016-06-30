<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OrderUpdate</title>
<sx:head />
</head>
<body>
	<script>
		function submitBeanID(obj) {
			window.location.href = 'toupdate.action?beanid=' + obj + '&id=' + ${ov.orderid };
		}
	</script>
	<div class="m-right">
		<div class="main">
			<br />
			<br />
			<s:form action="update" namespace="/manageOrder" method="post"
				enctype="multipart/form-data">
				<s:hidden name="ov.orderid" value="%{ov.orderid}"></s:hidden>
				<sx:datetimepicker name="ov.orderdate" label="订单日期"
					displayFormat="yyyy-MM-dd" value="ov.orderdate"></sx:datetimepicker>
				<s:textfield name="ov.quantity" label="数量" value="%{ov.quantity}"></s:textfield>

				<s:select name="beanid" list="beanList" listValue="beanname"
					listKey="beanid" label="豆子类型" headerKey="" headerValue="请选择咖啡豆"
					onchange="submitBeanID(this.value)"></s:select>

				<s:radio name="handleid" list="handleList" label="处理方式"
					listValue="handlestyle" listKey="handleid"></s:radio>

				<s:submit value="提交"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>
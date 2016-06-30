<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<META content="IE=11.0000" http-equiv="X-UA-Compatible">

<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<TITLE>Login</TITLE>
<SCRIPT src="../js/jquery-1.9.1.min.js" type="text/javascript"></SCRIPT>
<link rel="stylesheet" href="../css/login.css" media="all">
<script type="text/javascript" src="../js/login.js"></script>

</HEAD>
<BODY>
	<DIV class="top_div">
		<div id="a">
			<s:i18n name="com.decks.coffeemanage.action.package">
				<s:text name="project.name"></s:text>
			</s:i18n>
		</div>
	</DIV>
	<DIV
		style="background: rgb(300, 100, 100); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 200px; text-align: center;">
		<DIV style="width: 165px; height: 96px; position: absolute;">

		</DIV>
		<s:form action="login" namespace="/index" method="post"
			enctype="multopart/form-data">
			<P style="padding: 30px 0px 10px; position: relative;">
				 <s:textfield class="ipt" key="username" name="uv.name" value="1"></s:textfield> 

			</P>
			<P style="position: relative;">
				&nbsp;&nbsp;
				<s:password class="ipt" key="pwd" name="uv.pwd" id="password" value="1"></s:password>
			</P>
			<s:submit key="login" class="btn btn-primary btn-block btn-large"></s:submit>
		</s:form>
	</DIV>
</BODY>
</HTML>
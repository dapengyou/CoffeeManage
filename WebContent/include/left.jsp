<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>left.jsp</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/menu.js"></script>
</head>

<body>

	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>
						<s:text name="com.decks.left.coffeebean"></s:text>
					</h4>
					<div class="list-item none">
						<a
							href='${pageContext.request.contextPath}/manageBean/tomain.action'><s:text
								name="com.decks.left.coffeebean.list"></s:text></a>
					</div>
				</li>
				<li>
					<h4 class="M2">
						<span></span>
						<s:text name="com.decks.left.coffeevariety"></s:text>
					</h4>
					<div class="list-item none">
						<a
							href='${pageContext.request.contextPath}/manageVariety/tomain.action'><s:text
								name="com.decks.left.coffeevariety.list"></s:text></a>
					</div>
				</li>
				<li>
					<h4 class="M3">
						<span></span>
						<s:text name="com.decks.left.coffeeorder"></s:text>
					</h4>
					<div class="list-item none">
						<a
							href='${pageContext.request.contextPath}/manageOrder/tomain.action'><s:text
								name="com.decks.left.coffeeorder.list"></s:text></a>
					</div>
				</li>
				<li>
					<h4 class="M5">
						<span></span>
						<s:text name="com.decks.left.coffeehandle"></s:text>
					</h4>
					<div class="list-item none">
						<a
							href='${pageContext.request.contextPath}/manageHandle/tomain.action'><s:text
								name="com.decks.left.coffeehandle.list"></s:text></a>
					</div>
				</li>

			</ul>
		</div>

	</div>

	<script>navList(12);</script>
</body>
</html>
﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>电商平台</title>
  </head>
  
  <frameset rows="20%,*">
  	<frame src="${pageContext.request.contextPath }/client/head.jsp" name="head">
  	<frame src="${pageContext.request.contextPath }/client/IndexServlet?method=getAll" name="body">
  </frameset>

</html>

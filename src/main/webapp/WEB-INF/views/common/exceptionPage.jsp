<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>Exception Page</title>
</head>
<body>
  <%
    String exceptionType = exception.getClass().getName();
    String exceptionMessage = exception.getMessage();
  %>

  <h1>EXCEPTION 페이지 입니다!</h1>
  <h2>exception type: <%= exceptionType %></h2>
  <h3>exception message: <%= exceptionMessage %></h3>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="/WEB-INF/views/common/exceptionPage.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>category member list</title>
</head>
<body>
<h1>장르 별 전체 조회</h1>
<table>
    <tr>
        <th>장르이름</th>
        <th>회원번호</th>
        <th>회원이름</th>
        <th>생년월일</th>
        <th>자기소개</th>
        <th>전화번호</th>
        <th>가입날짜</th>
        <th>활동여부</th>
    </tr>
    <c:forEach items="${ requestScope.memberList }" var="member">
    <tr>
        <td>${ member.categoryName }</td>
        <td>${ member.memberCode }</td>
        <td>${ member.memberName }</td>
        <td>${ member.birthDate }</td>
        <td>${ member.introduce }</td>
        <td>${ member.contact }</td>
        <td>${ member.startDate }</td>
        <td>${ member.activeStatus }</td>
    </tr>
    </c:forEach>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/member/main'">메인화면으로 돌아가기</button>
</body>
</html>

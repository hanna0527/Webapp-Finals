<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>member list</title>
</head>
<body>
<h1>직원 목록 전체 조회</h1>
<table>
    <tr>
        <th>회원번호</th>
        <th>회원이름</th>
        <th>생년월일</th>
        <th>장르코드</th>
        <th>자기소개</th>
        <th>전화번호</th>
        <th>가입날짜</th>
        <th>활동여부</th>
    </tr>
    <c:forEach items="${ requestScope.memberList }" var="member">
    <tr>
        <td>${ member.memberCode }</td>
        <td>${ member.memberName }</td>
        <td>${ member.birthDate }</td>
        <td>${ member.categoryCode }</td>
        <td>${ member.introduce }</td>
        <td>${ member.contact }</td>
        <td>${ member.startDate }</td>
        <td>${ member.activeStatus }</td>
    </tr>
    </c:forEach>
</body>
</html>

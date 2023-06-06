<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>show member info</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>

    회원 번호 : ${requestScope.selectedMember.memberCode}<br>
    회원 이름 : ${requestScope.selectedMember.memberName}<br>
    생년월일 : ${requestScope.selectedMember.birthDate}<br>
    장르 코드 : ${requestScope.selectedMember.categoryCode}<br>
    자기 소개 : ${requestScope.selectedMember.introduce}<br>
    전화 번호 : ${requestScope.selectedMember.contact}<br>
    가입 날짜 : ${requestScope.selectedMember.startDate}<br>
    활동 여부 : ${requestScope.selectedMember.activeStatus}<br>
</body>
</html>

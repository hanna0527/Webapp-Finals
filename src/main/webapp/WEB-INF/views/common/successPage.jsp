<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="/WEB-INF/views/common/exceptionPage.jsp"%>
<html>
<head>
    <title>success page</title>
</head>
<body>
<script>
    (function() {
        const successCode = '${ requestScope.successCode }';

        let successMessage = '';
        let movePath = '${pageContext.servletContext.contextPath}/member/list';

        switch(successCode) {
            case 'insert' :
                successMessage = '신규 회원 등록 성공!';
                break;
            case 'update' :
                successMessage = '회원 정보 수정 성공!';
                break;
            case 'delete' :
                successMessage = '회원 정보 삭제 성공!';
                break;
        }

        alert(successMessage);
        location.href = movePath;

    })();
</script>
</body>
</html>

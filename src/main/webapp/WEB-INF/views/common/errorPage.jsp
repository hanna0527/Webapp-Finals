<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="/WEB-INF/views/common/exceptionPage.jsp"%>
<html>
<head>
    <title>error</title>
</head>
<body>
    <script>
        (function() {
            const errorCode = '${ requestScope.errorCode }';

            let errorMessage = '';

            switch(errorCode) {
                case 'selectAll':
                    errorMessage = '불러올 회원이 없습니다!';
                    break;
                case 'selectedMember':
                    errorMessage = '해당 회원은 존재하지 않습니다!';
                    break;
                case 'insert' :
                    errorMessage = '신규 회원 등록 실패!';
                    break;
                case 'update' :
                    errorMessage = '회원 정보 수정 실패!';
                    break;
                case 'delete' :
                    errorMessage = '회원 정보 삭제 실패!';
                    break;
            }

            alert(errorMessage);
            location.href = '${pageContext.servletContext.contextPath}/member/main';
        })();
    </script>
</body>
</html>

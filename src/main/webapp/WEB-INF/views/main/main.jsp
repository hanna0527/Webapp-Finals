<%@ page contentType="text/html;  charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>main</title>
</head>
<body>
  <div><%@ include file="/WEB-INF/views/common/header.jsp"%></div>
  <h3>블로그 회원 전체 조회</h3>
  <button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">전체 조회하기</button>

  <h3>블로그 회원 회원 코드로 조회</h3>
  <form action="${pageContext.servletContext.contextPath}/member/select" method="post">
    회원 코드 : <input type="number" min="1" name="memberId"><br>
    <button type="submit">회원 조회</button>
  </form>
  <br>

  <h3>신규 회원 정보 추가</h3>
  <form action="${ pageContext.servletContext.contextPath }/member/insert" method="post">
      이름 : <input type="text" name="memberName" maxlength="50" required><br>
      생년월일 : <input type="date" name="birthDate" required><br>
      장르코드 :
      <select name="categoryCode">
          <option value="1">개인</option>
          <option value="2">전문가</option>
          <option value="3">기업</option>
          <option value="4">리뷰</option>
          <option value="5">여행</option>
          <option value="6">레시피</option>
          <option value="7">패션</option>
          <option value="8">IT/기술</option>
          <option value="9">금융 /투자</option>
      </select><br>
      자기 소개 :<br> <textarea name="introduce" cols="50" rows="10" maxlength="500"></textarea><br>
      전화 번호 (xxx-xxxx-xxxx) : <input type="tel" name="contact" maxlength="50"><br>
      <button type="submit">회원 등록</button>
  </form>


  <h3>해당 회원 코드의 회원 정보 수정 </h3>
  <form action="${ pageContext.servletContext.contextPath }/member/update" method="post" id="update">
      수정할 회원 코드 : <input type="number" min=1 name="memberId" id="memberId" required><br>
      회원 이름 : <input type="text" name="memberName" maxlength="50"><br>
      생년 월일 : <input type="date" name="birthDate"><br>
      장르 코드 :
      <select name="categoryCode">
        <option value="">수정하지 않음</option>
        <option value="1">개인</option>
        <option value="2">전문가</option>
        <option value="3">기업</option>
        <option value="4">리뷰</option>
        <option value="5">여행</option>
        <option value="6">레시피</option>
        <option value="7">패션</option>
        <option value="8">IT/기술</option>
        <option value="9">금융 /투자</option>
      </select><br>
      자기 소개 : <br>
      <textarea name="introduce" cols="30" rows="10" maxlength="500"></textarea> <br>
      전화번호 : <input type="tel" name="contact" maxlength="50"><br>
      가입 날짜 : <input type="date" name="startDate"><br>
      활동 여부 :
      <select name="activeStatus">
          <option value="">수정하지 않음</option>
          <option value="Y">Y</option>
          <option value="N">N</option>
      </select>
      <br>
      <button type="submit"> 수정</button>
      <br>
  </form>

  <!-- 수정할 회원번호만 적고 나머지 수정 input들은 하나도 적지 않은 경우 -->
  <script>
      document.getElementById("update").addEventListener('submit', function(event) {
          let form = document.getElementById("update");
          let inputs = form.querySelectorAll('input:not(#memberId), select, textarea');

          for(var i = 0; i<inputs.length; i++) {
              var input = inputs[i];
              if (input.value.trim() !== '') {
                  form.submit();
                  return
              } else {
                  event.preventDefault();
              }

          }
          alert("수정될 데이터가 없습니다!")
      });
  </script>
<h3>해당하는 회원 코드의 회원 삭제하기</h3>
  <form action="${ pageContext.servletContext.contextPath }/member/delete" method="post">
      회원 코드 : <input type="number" min="1" name="memberId"><br>
      <button type="submit">회원 삭제</button>
  </form>
</body>
</html>

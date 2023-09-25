<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 토글  -->
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>My JSP Project</h1>
<c:if test="${ses.id eq null }">
	<form action="/mem/login" method="post">
	아이디 : <input type="text" name="id">
	비밀번호 : <input type="text" name="pwd">
	<button type="submit">로그인</button>
	</form>
	</c:if>
	<br>
	<br>
	<br>
	<c:if test="${ses.id ne null }"> <!-- 널이 아니면 (ne), 널이 맞으면 (eq)  -->
	${ses.id } 로그인 하였습니다.<br>
	계정생성일 : ${ses.regdate }<br>
	마지막접속 : ${ses.lastlogin }<br>
	
	<a href="/board/register.jsp"><button>게시판 글쓰기로 이동</button></a>
	</c:if>
	<a href="/mem/logout"><button>로그아웃</button></a>
	<br>
	<a href="/mem/list"><button>회원 리스트</button></a>
	<br>
	<a href="/mem/modify"><button>회원정보 수정</button></a>
	<br>
	<a href="/mem/join"><button>회원가입</button></a>
	<br>
	<a href="/brd/register">게시판 글쓰기로 이동...</a>
	<br>
	<a href="/brd/pageList">게시판 리스트로 이동...</a>


	<script type="text/javascript">
	// JSP 표현식을 사용하여 "msg_login"이라는 변수의 값을 출력합니다. 이 값은 서버 측에서 설정되는 로그인 메시지를 나타냅니다.
		const msg_login = `<c:out value="${msg_login}" />`;
	// "msg_login"이라는 상수를 선언하고, JSP 표현식을 사용하여 "msg_login"의 값을 할당합니다. 이렇게 함으로써 JavaScript에서 "msg_login" 변수를 사용할 수 있습니다.

		console.log(msg_login);
	//  "msg_login" 변수의 값을 콘솔에 출력합니다. 이는 디버깅 및 확인을 위한 용도로 사용됩니다.


		if (msg_login === '0') {
			// "msg_login" 변수의 값이 '0'과 일치하는지 확인하는 조건문을 시작합니다.

			alert("로그인 정보가 일치하지 않습니다.");
			// 조건문이 참인 경우, 즉 "msg_login" 값이 '0'인 경우에 실행되는 코드로, 경고창을 통해 "로그인 정보가 일치하지 않습니다."라는 메시지를 표시합니다.
		}
	</script>
	
</body>
</html>
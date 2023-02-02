<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - out</title>
</head>
<body>
<%
//버퍼 내용 삭제하기
out.print("출력되지 않는 텍스트"); //버퍼에 저장함
out.clearBuffer(); // 버퍼를 비움(위 줄의 출력 결과 사라짐 그래 다음 출력 내용이 나오게됨)

out.print("<h2>out 내장 객체</h2>");

//버퍼 크리 정보 확인
out.print("출력 버퍼의 크기 : " + out.getBufferSize() + "<br/>");
out.print("남은 버퍼의 크기 : " + out.getRemaining() + "<br/>");

out.flush();  //버퍼 내용 출력
out.print("flush 후 버퍼의 크기 : " + out.getRemaining() + "<br/>");

//다양한 타입의 값 출력
out.print(1+"<br>");
out.print(false+"<br>");
out.print('가'+"<br>");
%>
</body>
</html>
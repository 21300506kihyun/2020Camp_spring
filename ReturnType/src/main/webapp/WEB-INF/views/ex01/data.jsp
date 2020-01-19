<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>data.jsp</title>
</head>
<body>
<h1>
    Hello world!  
</h1>
 
<P>  data.jsp 실행.... </P>
 
    <h4>MemberVO 아이디 : ${member.userid }</h4>
    <h4>MemberVO 비밀번호 : ${member.userpw }</h4>
 
    <h4>==========================================</h4>
 
    <h4>Map 아이디 : ${map.userid }</h4>
    <h4>Map 비밀번호 : ${map.userpw }</h4>
</body>
</html>

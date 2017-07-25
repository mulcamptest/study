<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../favicon-32x32.png" />
</head>
<body>
	<h1>summary list</h1>
	<table>
		<c:forEach var="userlist" items="${auList }">
			<tr>
				<td>${userlist.teamid}</td>
				<td>${userlist.name}</td>
				<td>${userlist.gradeid}</td>
				<td>${userlist.gender}</td>
				<td>${userlist.genre1}</td>
				<td>${userlist.genre2}</td>
				<td>${userlist.genre3}</td>
			</tr>
		</c:forEach>
	</table>
	<h2>TEST TEST TEST TEST</h2>
	<table>
        <c:forEach var="alist" items="${Alllist }">
            <tr>
                <td>${alist.teamid}</td>
                <td>${alist.name}</td>
                <td>${alist.gradeid}</td>
                <td>${alist.gender}</td>
                <td>${alist.genre1}</td>
                <td>${alist.genre2}</td>
                <td>${alist.genre3}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
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
	<h1>${msg }</h1>
	
	<h2>${auV1.gradename}|${auV1.rank }</h2>
	
	<table>
		<c:forEach var="auv2" items="${auV5 }">
			<tr>
				<td>${auv2.count}</td>
				<td>${auv2.rank}</td>
				<td>${auv2.userid}</td>
				<td>${auv2.username}</td>
				<td>${auv2.gradeid}</td>
				<td>${auv2.gradename}</td>
				<td>${auv2.gender}</td>
				<td>${auv2.teamid}</td>
				<td>${auv2.teamname}</td>
			</tr>
		</c:forEach>
	</table>
	<h2>TEST TEST TEST TEST</h2>
	<table>
        <c:forEach var="atv1" items="${atV2 }">
            <tr>
                <td>${atv1.rank}</td>
                <td>${atv1.count}</td>
                <td>${atv1.genreid}</td>
                <td>${atv1.genrename}</td>
                <td>${atv1.genreurl}</td>
                <td>${atv1.teamid}</td>
                <td>${atv1.teamname}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
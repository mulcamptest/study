<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Danceple - Template</title>

    <!-- Bootstrap core CSS -->
    <link href="${context}/resources/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${context}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${context}/resources/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="${context}/resources/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${context}/resources/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="${context}/resources/css/style.css" rel="stylesheet">
    <link href="${context}/resources/css/style-responsive.css" rel="stylesheet">

</head>

<body>
    <section id="container">
        <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
        <!--header start-->

        <header class="header black-bg">
            <div class="sidebar-toggle-box">
                  <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
             </div>
            <!--logo start-->
            <a href="${context}/index.jsp" class="logo"><b>DANCEPEL</b></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">

                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="${context}/logout">Logout</a></li>
                    </ul>
                </div>
        </header>

        <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
        <!--sidebar start-->
        <aside>
            <div id="sidebar" class="nav-collapse ">
                <!-- sidebar menu start-->
                <ul class="sidebar-menu" id="nav-accordion">

                    <p class="centered">
                        <a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a>
                    </p>
                    <h5 class="centered">Marcel Newman</h5>

                    <li class="mt"><a href="${context}/info/menu"> <i
                            class="fa fa-desktop"></i> <span>신청현황</span>
                    </a></li>
                    
                    <li class="sub-menu"><a href="javascript:;"> 
                        <i class="fa fa-cogs"></i> <span>일반 관리</span> </a>
                        <ul class="sub">
                            <li><a href="${context}/admin/team">팀 관리</a></li>
                            <li><a href="${context}/admin/genre">장르 관리</a></li>
                        </ul>
                    </li>
                    
                    <li class="sub-menu"><a href="javascript:;"> 
                        <i class="fa fa-cogs"></i> <span>시즌 관리</span> </a>
                        <ul class="sub">
                            <li><a href="${context}/admin/season">시즌 관리</a></li>
                            <li><a href="${context}/admin/project">프로젝트 관리</a></li>
                            <li><a href="${context}/admin/duescheck">회비 관리</a></li>
                        </ul>
                    </li>
                    
                    <li class="sub-menu"><a href="javascript:;"> 
                        <i class="fa fa-cogs"></i> <span>회원 관리</span> </a>
                        <ul class="sub">
                            <li><a href="${context}/admin/user">회원 등급 관리</a></li>
                            <li><a href="${context}/admin/grade">등급 관리</a></li>
                        </ul>
                    </li>

                </ul>
                <!-- sidebar menu end-->
            </div>
        </aside>
        <!--sidebar end-->
    </section>

	<section id="main-content">
		<section class="wrapper site-min-heigth">
			<div class="row">

				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							신청 현황 <small>페이지 입니다.</small>
						</h1>
					</div>
				</div>
				<div class="col-md-12">
					<div class="content-panel">
						<h4 class="panel-title">
							<i class="glyphicon glyphicon-list"></i> 신청 목록
						</h4>
						<div class="panel-body">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>팀이름</th>
										<th>기존인원</th>
										<th>신규인원</th>
										<th>총원</th>
										<!-- <th>등급</th> -->
									</tr>
								</thead>

								<tbody>
									<c:forEach items="${tsv}" var="uv">
										<tr>
											<td><a href="userteamInfo?teamid=${uv.teamid}">${uv.teamname }</a></td>
											<%-- <td>${uv.teamname}</td> --%>
											<td>남 : ${uv.oldman}/ 여 : ${uv.oldwoman }</td>
											<td>남 : ${uv.newman}/ 여 : ${uv.newwoman }</td>
											<td>${uv.total }</td>
											<%-- <td>${user.gender}</td>
                                                    <td>${user.gradeId}</td> --%>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section id="genreRank" class="col-md-6">
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="glyphicon glyphicon-list"></i> 장르 랭크
						</h3>
					</div>
					<div class="panel-body">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>순위</th>
									<th>장르 이름</th>
									<th>득표수</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach var="genre" items="${atv1}">
									<tr>
										<td>${genre.rank}</td>
										<td>${genre.genrename}</td>
										<td>${genre.count}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</section>

		<section id="userCnt" class="col-md-6">
			<div class="row">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="glyphicon glyphicon-list"></i> 타팀 정보
						</h3>
					</div>

					<div class="panel-body">
						<div class="list-group">
							<c:forEach var="team" items="${allteaminfo}">
								<div class="list-group-item">
									<td><a href="userteamInfo?teamid=${team.teamid}">${team.teamname }</a></td>
									<%-- <td>${team.teamname}</td> --%>
									<td>남 : ${team.oldman}/ 여 : ${team.oldwoman }</td>
									<td>남 : ${team.newman}/ 여 : ${team.newwoman }</td>
									<td>${team.total }</td>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</section>
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
    <script src="${context}/resources/js/jquery.js"></script>
    <script src="${context}/resources/js/jquery-3.2.1.js"></script>
    <script src="${context}/resources/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="${context}/resources/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="${context}/resources/js/jquery.scrollTo.min.js"></script>
    <script src="${context}/resources/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="${context}/resources/js/jquery.sparkline.js"></script>

    <!--common script for all pages-->
    <script src="${context}/resources/js/common-scripts.js"></script>

    <script type="text/javascript" src="${context}/resources/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="${context}/resources/js/gritter-conf.js"></script>
    
</body>

</html>

<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danceple - User</title>
<link rel="shortcut icon" href="../favicon-32x32.png" />
</head>
<body>
<h1>TEST TEST TEST TEST</h1>
    <table>
        <thead>나의 팀</thead>
        <tr>
            <td>팀명</td>
            <td>기존 인원</td>
            <td>신규 인원</td>
            <td>나의 순번</td>
        </tr>
        <tr>
            <%-- <td><a href="teamInfo?teamid=${tsv.teamid}">${tsv.teamname }</a></td> --%>
            <c:forEach var="tv" items="${tsv }">
                <td>${tv.teamname }</td>
                <td>남 : ${tv.oldman } / 여 : ${tv.oldwoman }</td>
                <td>남 : ${tv.newman } / 여 : ${tv.newwoman }</td>
            </c:forEach>
            <td>${auv1.gradename}${auv1.rank }</td>
        </tr>
    </table>
    <br/>
    -->

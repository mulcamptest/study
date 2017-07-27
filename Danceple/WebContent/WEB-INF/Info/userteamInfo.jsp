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

<title>Danceple</title>

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
    <script type="text/javascript">
    function refreshpage(teamid){
        //alert(teamid);
        location.href="adminteamInfo?teamid="+teamid;
    }
    </script>
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
                    <h5 class="centered">CRUWD</h5>

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
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <i class="glyphicon glyphicon-list"></i> 현재 신청 회원
                    </h3>
                </div>
                
                <div class="col-md-6">
                    <div class="content-body">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <h3>기존 인원</h3>
                                </tr>
                                <tr>
                                    <th colspan="2">남자</th>
                                    <th></th>
                                    <th colspan="2">여자</th>
                                </tr>
                                <tr>
                                    <th>순위</th>
                                    <th>이름</th>
                                    <th></th>
                                    <th>순위</th>
                                    <th>이름</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="tul" items="${tul}">
                                    <tr>
                                        <c:if test="${tul.gradeid == '2' }">
                                            <c:choose>
                                                <c:when test="${tul.manrank != 0 }">
                                                    <td>${tul.manrank }</td>
                                                    <td>${tul.manname }</td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td></td>
                                                    <td></td>
                                                </c:otherwise>
                                            </c:choose>
                                            <td></td>
                                            <c:choose>
                                                <c:when test="${tul.womrank != 0 }">
                                                    <td>${tul.womrank }</td>
                                                    <td>${tul.womname }</td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td></td>
                                                    <td></td>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                
                <div class="col-md-6">
                    <div class="content-body">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <h3>신규 인원</h3>
                                </tr>
                                <tr>
                                    <th colspan="2">남자</th>
                                    <th></th>
                                    <th colspan="2">여자</th>
                                </tr>
                                <tr>
                                    <th>순위</th>
                                    <th>이름</th>
                                    <th></th>
                                    <th>순위</th>
                                    <th>이름</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="tul" items="${tul}">
                                    <tr>
                                        <c:if test="${tul.gradeid != '2' }">
                                            <c:choose>
                                                <c:when test="${tul.manrank != 0 }">
                                                    <td>${tul.manrank }</td>
                                                    <td>${tul.manname }</td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td></td>
                                                    <td></td>
                                                </c:otherwise>
                                            </c:choose>
                                            <td></td>
                                            <c:choose>
                                                <c:when test="${tul.womrank != 0 }">
                                                    <td>${tul.womrank }</td>
                                                    <td>${tul.womname }</td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td></td>
                                                    <td></td>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
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

<%-- 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Detail</title>
<link rel="shortcut icon" href="../favicon-32x32.png" />
</head>
<body>
	<h1>TEST TEST TEST TEST TEST</h1>
	<table>
        <thead>기존 인원 리스트
        </thead>
        <tr><td>남</td><td></td><td>여</td></tr>
        <tr>
            <td>순위</td>
            <td>이름</td>
            <td></td>
            <td>순위</td>
            <td>이름</td>
        </tr>
        <c:forEach var="tul" items="${tul}">
            <tr>
                <c:if test="${tul.gradeid == '2' }">
                    <c:choose> 
                        <c:when test="${tul.manrank != 0 }">
                            <td>${tul.manrank }</td>
                            <td>${tul.manname }</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                            <td></td>
                        </c:otherwise>                        
                    </c:choose>
                        <td></td>
                    <c:choose>
                        <c:when test="${tul.womrank != 0 }">
                            <td>${tul.womrank }</td>
                            <td>${tul.womname }</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                            <td></td>
                        </c:otherwise>
                    </c:choose>
                </c:if>
            </tr>
        </c:forEach>
    </table>
	<table>
        <thead>신규 인원 리스트
        </thead>
        <tr>
            <td>순위</td>
            <td>이름</td>
            <td></td>
            <td>순위</td>
            <td>이름</td>
        </tr>
        <c:forEach var="tul" items="${tul}">
            <tr>
                <c:if test="${tul.gradeid != '2' }">
                    <c:choose> 
                        <c:when test="${tul.manrank != 0 }">
	                        <td>${tul.manrank }</td>
	                        <td>${tul.manname }</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                            <td></td>
                        </c:otherwise>                        
                    </c:choose>
                        <td></td>
                    <c:choose>
                        <c:when test="${tul.womrank != 0 }">
	                        <td>${tul.womrank }</td>
	                        <td>${tul.womname }</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                            <td></td>
                        </c:otherwise>
                    </c:choose>
                </c:if>
            </tr>
        </c:forEach>
    </table>
    
</body>
</html> --%>
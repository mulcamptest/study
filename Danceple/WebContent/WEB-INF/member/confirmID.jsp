<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.Connection, java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %> 
<%@ page import="java.sql.ResultSet" %>  
<%!
   Connection conn; // 디비 연결 변수
   PreparedStatement pstmt; // 쿼리 핸들 변수

   ResultSet rs;   // 결과를 받아올 변수

   public void init() //Call Back메소드, 드라이버 로딩
   {
     try {Class.forName("oracle.jdbc.OracleDriver");} // 드라이버 로딩
     catch (ClassNotFoundException e) {
    	 e.printStackTrace(); 
    	 } // 드라이버 클래스가 없는 예외 발생시 오류 출력
   } 
   public void setConnection() // 디비 입출력전 연결 메소드
   {
     try{conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");} // 디비 연결
     catch (SQLException e) {e.printStackTrace();} // 예외상황발생시 오류 출력
    }
%>
<%
    //1. 데이터 받아오기 (write.html의 자바스크립트에서 "check.jsp?id="+sid 라는 구문을 이용해 넘겨 주었습니다.)
    String id = request.getParameter("memberId");
    
    // 2. db-select
    try
    {
        this.setConnection();                                          // 접속
        String sql = "select * from tb_member where tb_memberId=?";      // 아이디로 검색하여 있으면 레코드를 가져 옵니다.
        pstmt = conn.prepareStatement(sql);                     // 핸들을 생성하고 쿼리문을 등록합니다
        pstmt.setString(1, id);                                          // 쿼리문의 ?의 형식을 지정합니다
        rs = pstmt.executeQuery();                                  // resultset에 내용을 담아 옵니다
    }
    catch(SQLException e){e.printStackTrace();}
%>

<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>ID중복확인</title>
<link rel= "Shortcut icon" href="/favicon.ico"/>
 <script>
            function checkIdClose(id)
            {
                opener.writeForm.id.value = id;    // 열려있는문서중(opener) writeForm의 이름을 가진 문서에 아이디값 전달
                window.close();                        // checkId.jsp 윈도우 닫기
                opener.writeForm.pwd.focus();   // 회원가입폼의 포커스를 패스워드입력 상자로 이동
            }
        </script>

</head>
<body>
 <form method="post" action="checkId.jsp">
            <%
                try
                {
                    if(rs.next() || (id==null))  // next()메소드는 값이 있는지 없는지를 체크하고 있을경우 0이 아닌 값을 갖습니다.
                    {                                  // 값이 없을 경우0 이므로 조건을 만족하지 못하여 실행하지 않습니다

                                                        // 등록된 아이디가 있거나 사용자가 아이디값을 넣지 않은 경우에 실행됩니다.


            %>
                        현재 <%=id %> 사용불가능<br></br>                   <!-- 메시지 출력-->
                        아이디 : <input type="text" name="id"></input>      <!-- 아이디 입력 텍스트박스 생성-->
                        <input type="submit" value="중복체크"></input>    <!-- 재 중복체크를 위한 버튼 생성 -->
                        
            <%
                    }
                    else        // 사용자가 입력한 아이디를 사용 가능한경우....
                    {
            %>
                        현재 <%=id %>사용가능                                                     <!-- 메시지 출력 -->
                        <a href="checkId.jsp">다른아이디 고르기</a><br></br>       <!-- 다른 아이디를 원할 경우 -->

                        <!-- 사용자가 입력한 아이디를 선택하면 checkIdClose 자바 스크립트가 실행됩니다. 이때 


                               아이디 값을 인자로 함께 넣어 줍니다. -->


                        <input type="button" value="현재 아이디 선택" onClick="javas-ript:checkIdClose('<%=id %>')">
            <% 
                    }
                }
                catch(SQLException e){e.printStackTrace();}

                // 사용한 변수 종료
                finally
                {        
                    try
                    {
                        if(pstmt!=null) pstmt.close();
                        if(conn!=null) conn.close();
                    }
                    catch(SQLException e2){    e2.printStackTrace();    }    
                }
            %>
        </form>

</body>
</html>
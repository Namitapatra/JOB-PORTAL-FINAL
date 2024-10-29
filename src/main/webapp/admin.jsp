<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="all_component/all_css.jsp" %>
<style type="text/css">
.back-img{
background: url("img/img.png");
height:92vh;
width:100%;
background-repeat: no-repeat;
background-size: cover;
}
</style>
</head>
<body>
   <%@include file="all_component/navbar.jsp" %>
   <div class="container-fluid back-img">
     <div class="text-center">
        <h1 class="text-white p-4">Welcome Admin</h1>
      </div>
   </div>
</body>
</html>
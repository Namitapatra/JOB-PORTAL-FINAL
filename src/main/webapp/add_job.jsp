<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin: post jobs</title>
<%@include file="all_component/all_css.jsp" %>
</head>
<body>
   <%@include file="all_component/navbar.jsp" %>
   <div class="container p-2">
       <div class="col-md-10 offset-md-1">
          <div class="card">
              <div class="card-body">
                  <div class="text-center text-success">
                  <i class="fas fa-user-friends fa-3x"></i>
                <%--   <c:if test="${not empty succMsg}">
                      <div class="alert alert-success" role="alert">${succMsg}</div> 
                      <c:remove ver="succMsg"/>
                  </c:if> --%>
                  
                  <h5>Add Jobs</h5>
              </div>
              <form action="addJob" method="post">
                  <div class="form-group">
                     <label>Enter Titel</label> <input type="text" name="totle" required class="form-control">
                  </div>
                  <div class="form-row">
                     <div class="form-group col-md-4">
                        <label>Location</label> <select name="Location" class="custom-select" id="inlineFormCustomSelectPref">
                             <option selectrd>Choose...</option>
                             <option value="Odisha">Odisha</option>
                             <option value="Jharkhand">Jharkhand</option>
                             <option value="Gujurat">Gujurat</option>
                             <option value="Bhubaneswar">Bhubaneswar</option>
                             <option value="Delhi">Delhi</option>
                             <option value="Bangalore">Bangalore</option>
                             <option value="Chennai">Chennai</option>
                             <option value="Hydrabad">Hydrabad</option>
                        </select>
                     </div>
                     <div class="form-group col-md-4">
                         <label>Category</label> <select class="custom-select" id="inlineFormCustomSelectPref" name="Category">
                                <option selectrd>Choose...</option>
                                <option value="IT">IT</option>    
                                <option value="Devloper">Devloper</option>
                                <option value="Banking">Banking</option>
                                <option value="Engineer">Engineer</option>
                                <option value="Teacher">Teacher</option>   
                         </select>
                     </div>
                     
                     <div class="form-group col-md-4">
                         <label>Status</label> <select class="form-control" name="ststus">
                              <option class="Active" value="Active">Active</option>
                               <option class="Inactive" value="Inactive">Inactive</option>
                         </select>
                     </div>
                  </div>
                  
                  <div class="form-group">
                  <label>Enter Description</label>
                  <textarea requierd rows="6" cols="" name="desc" class="form-control"></textarea>
                  </div>
                  
                  <button class="btn btn-success">Publish Job</button>
              </form>
          </div>
          </div>
       </div>
   </div>
</body>
</html>
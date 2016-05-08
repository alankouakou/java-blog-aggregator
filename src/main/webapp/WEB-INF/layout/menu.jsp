<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>  
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>

<tilesx:useAttribute name="current" />

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.html"><img src="../../resources/images/allianz-icon.png" /> </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="${current == 'index' ? 'active' : '' }"><a href="#">Home</a></li>
            <li class="${current == 'vehicules' ? 'active' : ''}"><a href="vehicules.html">Car fleet</a></li>
            <security:authorize access="hasRole('ROLE_ADMIN')">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Task <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="/register-user.html">Add User</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Update actions</li>
                <li><a href="#">Separated link</a></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
            </security:authorize>
            <security:authorize access="! isAuthenticated()">
             <li class="${current == 'login' ? 'active' : ''}" ><a href="login.html">Login</a></li>
            </security:authorize>
            <security:authorize access="isAuthenticated()">
                <li class="${current == 'logout' ? 'active' : ''}" ><a href="<spring:url value="/logout" />">Logout</a></li>
            </security:authorize>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
<br /><br /><br /><br />

<!DOCTYPE html>
<%@tag description="Template Site tag" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:url value="/index.html" var="index"/>
<c:url value="/about.html" var="about"/>
<c:url value="/contact.html" var="contact"/>
<c:url value="/reviews.html" var="reviews"/>
<c:url value="/tech.html" var="tech"/>


<!-- Navigation -->

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
            <ul class="nav navbar-nav">
            <li>
            <a href="${index}"><spring:message code="navMenu.home"/></a>
            </li>
            <li>
            <a href="${about}"><spring:message code="navMenu.about"/></a>
            </li>
            <li>
            <a href="${tech}"><spring:message code="navMenu.techsupport"/></a>
            </li>
            <li>
            <a href="${contact}"><spring:message code="navMenu.contact"/></a>
            </li>
            <li>
            <a href="${reviews}"><spring:message code="navMenu.reviews"/></a>
            </li>
            </ul>
        </div>
    </div>
</nav>

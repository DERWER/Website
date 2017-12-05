<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>

	<jsp:body>

		<header id="myCarousel" class="carousel slide">
		<!-- Indicators -->
		<div class="container">
		<h3>Reviews List</h3>
		<c:if test="${!empty listOfReviews}">
			<table class="tg">
				<tr>
					<th width="80">Id</th>
					<th width="120">Username</th>
					<th width="120">Email</th>
					<th width="120">Subject</th>
					<th width="240">Message</th>
				</tr>
				<c:forEach items="${listOfReviews}" var="review">
					<tr>
						<td>${review.id}</td>
						<td>${review.username}</td>
						<td>${review.email}</td>
						<td>${review.subject}</td>
						<td>${review.message}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		</div>
	</jsp:body>

</page:template>
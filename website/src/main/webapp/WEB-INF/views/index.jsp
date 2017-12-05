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
    	<h1 itemprop="name">Poduct</h1>
    	</div>

    <!-- Script to Activate the Carousel -->
    <script>
      $('.carousel').carousel({
        interval: 5000 //changes the speed
      })
    </script>
  </jsp:body>

</page:template>

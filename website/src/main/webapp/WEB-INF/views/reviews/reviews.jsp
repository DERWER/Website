<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<page:template>

  <jsp:body>

    <header id="myCarousel" class="carousel slide">
      <!-- Indicators -->
    	<div class="container clearfix">
        		<h1 class="mt">Ask a Question</h1>
        			<div class="ask-question-container">
        				<form:form action="/reviews" commandName="review" method="post" class="ask-qustion">
                                					<div class="row clearfix">
                                						<div class="form-input">
                                							<form:label path="username">Your name:<span class="red">*</span></form:label>
                                							<form:input path="username" id="username"  required="required"/>
															<form:errors path="username" />
															<span class="err-message"></span>
                                						</div>
                                						<div class="form-input">
                                							<form:label path="email">E-mail:<span class="red">*</span></form:label>
                                							<form:input id="email" path="email" required="required"/>
															<form:errors path="email" />
															<span class="err-message"></span>
                                						</div>
                                					</div>
                                					<div class="row">
                                						<div class="form-input">
                                							<form:label path="subject">Subject:<span class="red">*</span></form:label>
                                							<form:input id="subject" path="subject" required="required" />
															<form:errors path="subject" />
															<span class="err-message"></span>
                                						</div>
                                					</div>
                                					<div class="row">
                                						<div class="form-input">
                                							<form:label path="message">Message:<span class="red">*</span></form:label>
                                							<form:textarea path="message" id="message" username="message"></form:textarea>
															<form:errors path="message" />
															<span class="err-message"></span>
                                						</div>
                                					</div>
                                					<div class="row clearfix">
                                						<div class="form-input sbm-btn">
                                							<form:button id="submit" class="btn btn-default" type="submit">Send</form:button>
                                						</div>
                                					</div>
                                				</form:form>
        			    <div class="success" id="success">
        				<p id="success-message"></p>
        			</div>
        		</div>
    	</div>

  </jsp:body>

</page:template>
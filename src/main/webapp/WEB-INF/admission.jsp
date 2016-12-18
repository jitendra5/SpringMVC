<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>Student page</title>
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
</head>
<body>
<a href="/springmvcproject/studentform.html?siteTheme=green">Green</a>|<a href="/springmvcproject/studentform.html?siteTheme=red">Red</a>
<a href="/springmvcproject/studentform.html?siteLanguage=en">English</a>|<a href="/springmvcproject/studentform.html?siteLanguage=sw">Swedish</a>
<h2>${maMsg}</h2>
<form:errors path="student1.*"/>
	<form action="/springmvcproject/submit.html" method="post">
	<table>
	<tr>
		<td><label><spring:message code="label.studentName"/> </label></td><td><input type="text" name="studentName"></td>
	</tr><tr>	
		<td><label>	<spring:message code="label.studentNumber"/> </label></td><td><input type="text" name="studentNumber"></td>
	</tr><tr>	
		<td><label><spring:message code="label.studentHobby"/>	</label></td><td><input type="text" name="studentHobby"></td>
	</tr><tr>
		<td><label><spring:message code="label.dateOfBirth"/></label></td><td><input type="text" name="dateOfBirth"></td>
	</tr><tr>
		<td><label>	<spring:message code="label.studentSkill"/></label></td><td><select name="studentSkill" multiple>
												<option value="Java Core"> Javacore</option>
												<option value="Springcore"> Springcore</option>
												<option value="SpringMVC"> SpringMVC</option>
												</select></td></tr>
<tr><td><spring:message code="label.city"/></td><td><input type="text" name="studentAddress.city"></td></tr>
<tr><td><spring:message code="label.pin"/></td><td><input type="text" name="studentAddress.pin"></td></tr>
<tr><td><spring:message code="label.street"/></td><td><input type="text" name="studentAddress.street"></td></tr>
<tr><td><spring:message code="label.country"/></td><td><input type="text" name="studentAddress.country"></td></tr>

	<tr><td><input type="submit" value="submit"></td></tr>
	</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using POST Method to Read/Verify Data to Send Over an
	Email.</title>
</head>
<body bgcolor="#E6E6FA">
	<h1>Using POST Method to Read/Verify Data to Send Over an Email.</h1>
	<form:form action="verify" method="post" modelAttribute="mailMessage">
		<table>
			<tr>
				<td><form:label path="from">From: </form:label></td>
				<td><br/><form:input type="text" path="from" value="prashant.ayare@ness.com" style="padding-top: 5px;padding-bottom: 5px;
    border-top-width: 4px;border-right-width: 4px;" size="42"/><br/><br/><br/></td>
			</tr>
			<tr>
				<td><form:label path="to">To: </form:label></td>
				<td><form:input type="text" path="to" value="someone@ness.com" style="padding-top: 5px;padding-bottom: 5px;
    border-top-width: 4px;border-right-width: 4px;" size="42"/><br/><br/><br/></td>
			</tr>
			<tr>
				<td><form:label path="subject">Subject: </form:label></td>
				<td><form:input type="text" path="subject" style="padding-top: 5px;padding-bottom: 5px;
    border-top-width: 4px;border-right-width: 4px;" size="42"/><br/><br/><br/></td>
			</tr>
			<tr>
				<td><form:label path="emailBody">Email Body:</form:label></td>
				<td><form:textarea path="emailBody" rows="10" cols="40" style="padding-right: 5px;padding-top: 10px;
    border-top-width: 2px;border-right-width: 4px;border-bottom-width: 2px;padding-bottom: 10px;"/><br/><br/><br/></td>
			</tr>
			<tr>
				<td colspan="1" rowspan="5"><input type="submit" value="Submit" width="20" height="30" style="padding-right: 10px;
    padding-left: 10px;padding-top: 5px;padding-bottom: 5px;"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
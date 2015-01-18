<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Struts 2 XLS Download Example</title>
<s:head />
</head>

<body>
	<h2 style="color: green">
		<s:text name="label.welcome" />
	</h2>
	<s:form method="post" action="downloadXLSFileAction">
		<s:submit value="Download XLS" />
	</s:form>
</body>
</html>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>license</title>
</head>
<body>
	<%
		Locale locale = request.getLocale();
		String lang = locale.getLanguage();
		//out.println(lang);
		/*if (locale.getLanguage().equals("en")) {
			out.print("this is the the public GNU license for given by government");
		}
		if (locale.getLanguage().equals("hi"))
			out.print("यह सरकार द्वारा दिया जाने वाला सार्वजनिक GNU लाइसेंस है");
		if (locale.getLanguage().equals("te"))
			out.print("இது அரசாங்கத்தால் வழங்கப்பட்ட பொது குனு உரிமம்");*/
			try{
		if(locale.getLanguage().equals("hi")){
			Properties props=new Properties();
			props.load(new BufferedReader(new FileReader(this.getClass().getClassLoader().getResource("/messages.properties").getFile())));
			String message=props.getProperty("license-info-hi_IN");
			out.println(message);
		}else if(locale.getLanguage().equals("te")){
			Properties props=new Properties();
			props.load(new BufferedReader(new FileReader(this.getClass().getClassLoader().getResource("messages.properties").getFile())));
			String message=props.getProperty("license-info-te_IN");
    		out.println(message);
		}
		else if(locale.getLanguage().equals("en")){
			Properties props=new Properties();
			props.load(new BufferedReader(new FileReader(this.getClass().getClassLoader().getResource("messages.properties").getFile())));			String message=props.getProperty("license-info-en_IN");
			out.println(message);
		}
			}catch(Exception e){
				e.printStackTrace();
			}
		%>

</body>
</html>
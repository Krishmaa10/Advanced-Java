<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie List Management</title>
    <style>
        .cookie-table{border-collapse:collapse;width:60%;margin:20px 0;}
        .cookie-table th,.cookie-table td{border:1px solid #ddd;padding:8px;text-align:left;}
        .cookie-table th{background:#f2f2f2;}
        .auto-refresh{color:#666;font-size:.9em;margin-bottom:10px;}
    </style>
    <script>
        // Auto-refresh every second so expired cookies disappear
        setTimeout(function(){ window.location.reload(); },30000);
    </script>
</head>
<body>
<h2>Cookie List Management</h2>

<!-- Form to set a cookie -->
<form action="setCookie.jsp" method="post">
<h3>Set New Cookie</h3>
<table>
<tr><td>Cookie Name:</td><td><input type="text" name="cookieName" required></td></tr>
<tr><td>Domain:</td><td><input type="text" name="domain" required></td></tr>
<tr><td>Max Age (seconds):</td><td><input type="number" name="maxAge" value="10" required></td></tr>
</table>
<input type="submit" value="Add Cookie">
</form>

<hr>

<!-- Display active cookies -->
<h3>List of Active Cookies</h3>
<p class="auto-refresh">List updates automatically when cookies expire</p>
<table class="cookie-table">
<thead><tr><th>Cookie Name</th><th>Domain</th><th>Max Age (seconds)</th></tr></thead>
<tbody>
<%
@SuppressWarnings("unchecked")
List<Map<String,String>> cookieList = (List<Map<String,String>>) session.getAttribute("cookieList");
long now = System.currentTimeMillis()/1000; // current epoch seconds

if(cookieList!=null){
    // Remove expired cookies
    Iterator<Map<String,String>> it = cookieList.iterator();
    while(it.hasNext()){
        Map<String,String> c = it.next();
        long setTime = Long.parseLong(c.get("setTime"));
        int max = Integer.parseInt(c.get("maxAge"));
        if(now > setTime + max){ it.remove(); }
    }
    session.setAttribute("cookieList", cookieList);
}

if(cookieList!=null && !cookieList.isEmpty()){
    for(Map<String,String> c: cookieList){
%>
<tr>
    <td><%= c.get("name") %></td>
    <td><%= c.get("domain") %></td>
    <td><%= c.get("maxAge") %></td>
</tr>
<%
    }
}else{
%>
<tr><td colspan="3" style="text-align:center;">No active cookies</td></tr>
<%
}
%>
</tbody>
</table>
</body>
</html>

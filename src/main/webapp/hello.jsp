<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<div>
hello world
Текущее время
<%= new java.util.Date() %>
</div>
<%= new java.util.Date() %>
<div>
Имя вашего хоста: <%= request.getRemoteHost() %>
</div>
<div>
Получение значения параметров title
</div>
<div>
<%= request.getParameter  ("title") %> <!-- http://localhost:8081/hello.jsp?title=ioioioioioiui  -->
</div>
<div>
<%! private int accessCount = 0; %>  <!-- объявляем переменную или любой код -->
</div>
<div>
<%= ++ accessCount %>  - <!-- распечатает свойство класс  -  делает вывод  accessCount--> 
</div>
<% String queryData = request.getQueryString(); out.println("Данные запроса: "+ queryData); %>   <!-- вариант вставки кода как в сервлет - любой код -->


</body>


</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2018/5/4
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


 <form action="/findBookByCondiction">
     查询图书信息：<br>
     书名：<input type="text" name="bookname"></br>
     ISBN：<input type="text" name="isbn"></br>
     出版社：<input type="text" name="address"><br>
     作者：<input type="text" name="auto"><br>
     <input type="submit" value="查询图书信息">
 </form>


 <table>
     <tr>

         <td>id</td>
         <td>bookname</td>
         <td>address</td>
         <td>auto</td>
         <td>price</td>
     </tr>

     <c:forEach items="${books}" var="book">


             <td>${book.id}</td>
             <td>${book.bookname}</td>
             <td>${book.address}</td>
             <td>${book.auto}</td>
             <td>${book.price}</td>

     </c:forEach>
         <input type="submit" value="删除">

 </table>
  </body>
</html>

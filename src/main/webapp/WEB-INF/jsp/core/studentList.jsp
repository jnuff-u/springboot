<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table align="center" border="1" callspacing="0">
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>照片</td>
        <td>性别</td>
        <td>学校</td>
        <td>工作</td>
        <td>宣言</td>
    </tr>
    <c:forEach items="${students}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.stuName}</td>
            <td><img src="${c.stuPhoto}"></td>
            <td>
                <c:if test="${c.sex==1}">男</c:if>
                <c:if test="${c.sex==0}">女</c:if>
            </td>
            <td>${c.school}</td>
            <td>${c.office}</td>
            <td>${crecommend}</td>
        </tr>
    </c:forEach>
</table>
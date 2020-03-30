<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<p>Hello spring MVC</p>
<p>
    服务器时间 <fmt:formatDate value="${now}" pattern="yyyy-mm-dd HH:mm:ss"/>
</p>
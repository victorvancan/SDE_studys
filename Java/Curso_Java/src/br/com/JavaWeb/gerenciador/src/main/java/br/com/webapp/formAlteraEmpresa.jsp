<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovaEmpresa" var="linkServeletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkServeletNovaEmpresa }" method="post">
	
		Nome: <input type="text" name="nome" value="${empresa.nome}"/>
		Data Abertura: <input type="text" name="data" value="${empresa.dataAbertura}  pattern="dd/MM/yyyy"" />
		<input type="hidden" name="id" value="${empresa.id}" >
		<input type="submit" />
	</form>
</body>
</html>
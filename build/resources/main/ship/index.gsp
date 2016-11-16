<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Persons</title>
	</head>
	<body>
        <g:each in="${persons}" var="ships" status="i">
            <h3>${i+1}. ${ships.nombre}</h3>
            <p>
                Capacidad: ${person.capacidad}
            </p>
            <br/>
            <br/>
        </g:each>
	</body>
</html>
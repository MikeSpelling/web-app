<html>
	<head>
		<title>Awesome webapp!</title>
		<style type="text/css">
			body {
			      background: lightgrey;
			}
			#container {
			      text-align: justify;
			      position: relative;
			      top: 90px;
			      width: 770px;
			      left: 190px;
			      z-index: 1;
			      background: black;
			      color: white;
			      overflow: hidden;
		      	}
			
		</style>
	</head>
	<body>
		<div id="container">
			<div id="title">
				<h1><%=request.getAttribute("heading") %></h1>
				<hr/>
			</div>
			<p><%=request.getAttribute("paragraph") %></p>
		</div>
	</body>
</html>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
		<meta name="description" content="">
		<meta name="author" content="">
		<!--     <link rel="icon" href="../../favicon.ico"> -->
		
		<title>Login Service</title>
		
		<link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="../../resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
		<link href="../../resources/css/signin.css" rel="stylesheet">
		
		<script src="../../resources/js/ie-emulation-modes-warning.js"></script>
	</head>

	<body>
		<div class="container">
			<form class="form-signin">
				<h2 class="form-signin-heading">Login !</h2>
				
				<label for="inputEmail" class="sr-only">Email :</label>
				<input type="email" id="inputEmail" class="form-control" placeholder="e-mail" required autofocus>
				
				<label for="inputPassword" class="sr-only">Senha: </label>
				<input type="password" id="inputPassword" class="form-control" placeholder="senha" required>
				
				<div class="checkbox">
					<label>
						<input type="checkbox" value="remember-me"> Esqueci a senha!
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
			</form>
		</div>
		
		<script src="../../resources/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>
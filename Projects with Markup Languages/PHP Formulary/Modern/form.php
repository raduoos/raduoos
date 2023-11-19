<!DOCTYPE html>
<html lang="es">

	<head>
		<meta charset="utf-8">
		<title>Forms - The answers:</title>
	</head>

	<body>

		<?php
			$email_message = "Details of the formulary of contact:<br> <br>";
			$email_message .= "Name: " . $_POST['name'] . "<br>";
			$email_message .= "E-Mail Address: " . $_POST['email'] . "<br>";
			$email_message .= "Comments: " . $_POST['comments'] . "<br>";
			$email_message .= "Favorite Programming Language: " . $_POST['favoriteLanguage'] . "<br>";
			$email_message .= "Vehicle brand: " . $_POST['cars'] . "<br>";
			$email_message .= "Join newsletter: " . $_POST['email_notifications'] . "<br>";
			echo $email_message;
		?>

	</body>
</html>

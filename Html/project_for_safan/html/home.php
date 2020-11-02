<?php
session_start();
?>
<html>
<head>

<title>Leave Management Systemw</title>

<link href="../css/template.css" rel="stylesheet" type="text/css"/>
<script src="../js/background.js" type="text/javascript"></script>
<script type="text/javascript">
		change_background();
</script>
</head>
<body>

	<div class="container">
		<?php
		if(!empty($_SESSION['login'])){
		require('../php/phpcode/user_dashboard_nav_bar.php');
		}else{
		require('../php/phpcode/nav_bar_home.php');
		}
		?>
	</div>

</body>
</html>
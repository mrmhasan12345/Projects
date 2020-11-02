<?php ?>

<html>
<head>

	<title>Login Page</title>
	<link href="../css/template.css" rel="stylesheet" type="text/css"/>

	<script src="../js/background.js" type="text/javascript"></script>
	<script type="text/javascript">
		change_background();
	</script>


	<style type="text/css">
		
		.login_icon{

			height : 40px;
			width: 120px;
			margin:25px 0 0 140px;
			background-image: url(../pro_pic/pics/login_next.png);
			background-size: cover; 
			background-position: center center;

		}

		.pro_pic_logo{

			width: 180px;
			height: 180px;
			position: relative;
			left: 50%;
			transform: translateX(-50%);
			background-image: url(../pro_pic/pics/login_logo.jpg);
			background-size: cover;
			background-position: center center;
			border-radius:5px;
			filter:drop-shadow(7px 4px 6px rgba(250,190,80,1));
			font-size:15px;
			padding:0 4px;
			font-style:italic;
			border-radius: 50%;

		}

		.login_icon:hover{

			filter:drop-shadow(2px 2px 2px #000000);
			transform: scale(1.1,1.1);

		}

		.pro_pic_logo:hover{

			filter:drop-shadow(10px 8px 10px rgba(250,90,20,1));
			left: 50%;
			transform: translateX(-50%) scale(1.1,1.1);

		}


	</style>

	<script type="text/javascript">
		function frm_submit(){
			document.getElementById("frm_login_mail").submit();
		}
	</script>

</head>
<body>
<div class="hole">
		<?php require('../php/phpcode/nav_bar_home.php'); ?>
	<div  class="container">

		<div  class="cont">
			<h1>User Name</h1><br/>

			<form method="POST" action="../php/phpcode/login_check_mail.php" enctype="multipart/form-data" id="frm_login_mail">
				
				<div  class="clr"></div>
				<div  class="pro_pic_logo">
				</div>

				<div class="col2 flt_l" style="position: relative; width: 95%; margin: 40px 0 0 10px;">
					<input type="text" name="login_u_name" placeholder="Enter your User Name" style="background: transparent;text-align: center;">
				</div>
				
				<div  class="clr"></div>
				<div  style="height:10px;"></div>
					<div class="login_icon"  onclick="frm_submit();"></div>
				<div  class="clr"></div>
				<div  style="height:5px;"></div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
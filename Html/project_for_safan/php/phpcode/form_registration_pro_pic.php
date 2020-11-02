<?php

?>

<html>
<head>

	<title>Registration Page</title>
	<link href="../css/template.css" rel="stylesheet" type="text/css"/>
	<script src="../js/background.js" type="text/javascript"></script>
	<script type="text/javascript">
			change_background();
	</script>

	<style type="text/css">

		.btn_next_logo{

			height : 170px;
			width: 270px;
			margin-left: 65px;
			background-image: url(../pro_pic/pics/register_1.png);
			background-size: cover; 
			background-position: center center;

		}

		.btn_reset_logo{

			height : 40px;
			width: 100px;
			margin: 0 0 0 140px;
			background-image: url(../pro_pic/pics/reset.png);
			background-size: cover; 
			background-position: center center;

		}


	</style>

	<script type="text/javascript">

		function frm_reg_submit(){
			document.getElementById("frm_reg_pro_pic").submit();
		}

		function frm_reg_reset(){
			document.getElementById("frm_reg_pro_pic").reset();
		}
		
	</script>


</head>
<body>
<div class="hole">
		<?php require('../php/phpcode/nav_bar_home.php'); ?>
	<div  class="container">

		<div  class="cont">
			<h1>Registration Form</h1><br/>

			<form method="POST" action="../php/phpcode/update_pro_pic.php" enctype="multipart/form-data" id="frm_reg_pro_pic">
				
				<div class="col1 flt_l">
					Profile Picture
				</div>
				<div  class="clr"></div>
				<div  style="width: 90%;
								height: 30px;
								border-radius:5px;
								box-shadow:inset 0 0 8px #012345;
								font-size:15px;
								padding:0 4px;
								font-style:italic;">
					<input type="file" name="pro_pic" placeholder="Profile Picture">
				</div>
				<div  class="clr"></div>
				<div  style="height:10px;"></div>
				<div class="btn_next_logo" onclick="frm_reg_submit();"></div>
				<div class="btn_reset_logo" onclick="frm_reg_reset();">
				</div>
				<div  class="clr"></div>
				<div  style="height:5px;"></div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
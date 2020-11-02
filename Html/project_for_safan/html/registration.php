<?php ?>

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

			height : 40px;
			width: 100px;
			margin-left: 80px;
			float : left;
			background-image: url(../pro_pic/pics/next.png);
			background-size: cover; 
			background-position: center center;

		}

		.btn_reset_logo{

			height : 40px;
			width: 100px;
			margin-left: 210px;
			background-image: url(../pro_pic/pics/reset.png);
			background-size: cover; 
			background-position: center center;
	
		}

	</style>

	<script type="text/javascript">

		function frm_reg_submit(){
			document.getElementById("reg_Form").submit();
		}

		function frm_reg_reset(){
			document.getElementById("reg_Form").reset();
		}
		
	</script>

</head>
<body>
<div class="hole">
		<?php require('../php/phpcode/admin_dashboard_nav_bar.php'); ?>
	<div  class="container">

		<div  class="cont">
			<h1>Registration Form</h1><br/>

			<form method="POST" action="../php/phpcode/sign_up.php" id="reg_Form">
				
				<div class="col1 flt_l">
					First Name
				</div>
				<div  class="col2 flt_l">
					<input type="text" name="f_name" placeholder="First Name">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div  class="col1 flt_l">
					Last Name
				</div>
				<div class="col2 flt_l">
					<input type="text" name="l_name" placeholder="Last Name">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					E-mail
				</div>
				<div class="col2 flt_l">
					<input type="email" name="email" placeholder="something@something.com">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					NIC
				</div>
				<div class="col2 flt_l">
					<input type="text" name="nic" placeholder="NIC">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					User Name
				</div>
				<div class="col2 flt_l">
					<input type="text" name="u_name" placeholder="User name">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					Enter password
				</div>
				<div class="col2 flt_l">
					<input type="password" name="pass" placeholder="password">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					Conform password
				</div>
				<div class="col2 flt_l">
					<input type="password" name="con_pass" placeholder="conform password">
				</div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					Telephone number
				</div>
				<div class="col2 flt_l">
					<input type="text" name="mobile" placeholder="+94 XXX XXX XXX">
				</div>
				<div  class="clr"></div>
				<div  class="clr"></div>
				<div  class="spc"></div>
				<div class="col1 flt_l">
					User type
				</div>
				<div style="	width:210px;
									height:35px;
									padding-top:5px;
									float:left;">
						<div style="width:105px;
											height:35px;
											float:left;
											font-size:15px;
											font-style:italic;">
									<input type="radio" name="u_type" value="Admin">
									Admin
									</div>
									<div style="width:105px;
											height:35px;
											float:right;
											font-size:15px;
											font-style:italic;">
									<input type="radio" name="u_type" value="Employee">
									User
									</div>
				</div>
				<div  class="clr"></div>
				<div  style="height:10px;"></div>

				<div class="btn_next_logo" onclick="frm_reg_submit();"></div>
				<div class="btn_reset_logo" onclick="frm_reg_reset();"></div>

				<div  class="clr"></div>
				<div  style="height:5px;"></div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
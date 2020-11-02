<?php

session_start();

if(!empty($_POST['login_u_name'])){

	if($_POST['login_u_name'] == "admin"){
		$_SESSION['u_name'] = "admin";
		header("refresh:0;url=../../html/Login_pass.php");
	}else{

				require("../dbcon/dbvar.php");
				include("../dbcon/dbcon.php");

				$u_name = $_POST['login_u_name'];

				$has = "SELECT * FROM users";

				$out = mysqli_query($con,$has);

				while($check = mysqli_fetch_array($out)){
					if($u_name == $check['U_Name']){

						$_SESSION['u_name'] = $u_name;
						$_SESSION['pro_pic'] = $check['U_Profile'];

//			echo "__________".$_SESSION['login']."      _______________________    ".$_SESSION['pro_pic'];

						mysqli_close($con);

						header("refresh:0;url=../../html/Login_pass.php");
								}
				}
			}
}else{


	$msg = "Please enter your User Name, then click Next..";
	
	echo '<script type="text/javascript">alert("' . $msg . '")</script>';


	header("refresh:0;url=../../html/home.php");

}

?>
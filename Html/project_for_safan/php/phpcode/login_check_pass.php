<?php
session_start();


require("../dbcon/dbvar.php");
include("../dbcon/dbcon.php");

//echo "out______________".$_SESSION['u_name']."-______________---".$_POST['login_u_pass'];

if(!empty($_SESSION['u_name']) && !empty($_POST['login_u_pass'])){

	$u_pass = $_POST['login_u_pass'];

//echo "In______________\n";

	if($_SESSION['u_name'] == "admin" && $u_pass == "admin"){
		$_SESSION['login'] = "signin";
		header("refresh:0;url=../../html/user_dashboard.php");
	}else{
	
	$has = "SELECT * FROM users WHERE U_Name = '".$_SESSION['u_name']."'";

	$out = mysqli_query($con,$has);

	while($check = mysqli_fetch_array($out)){

		if(password_verify($u_pass,$check['U_Password'])){
			
			$u_type = $check['U_Type'];

			mysqli_close($con);
			unset($_SESSION['u_name']);

			$_SESSION['login'] = "signin";
			
			if($u_type == "Admin"){
					header("refresh:0;url=../../html/admin_dashboard.php");
			}else{
					header("refresh:0;url=../../html/user_dashboard.php");
			}

		}else{
			echo "<script>alert('Invalid password')</script>";
			header("refresh:0;url=../../html/Login_pass.php");
			}
		}	
	}
}else{
			echo "<script>alert('Please enter password')</script>";
			header("refresh:0;url=../../html/Login_pass.php");
}

?>
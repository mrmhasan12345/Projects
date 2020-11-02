<?php
session_start();

if(!empty($_SESSION['login'])){
	require("../php/phpcode/user_dashboard_code.php");
}else{
	echo "<script>alert('Please Login into your account')</script>";
	header("refresh:0;url=Login_mail.php");
}

?>
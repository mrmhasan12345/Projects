<?php

session_start();


if(!empty($_SESSION['u_id'])){

	require('../php/phpcode/form_registration_pro_pic.php');

}else{

	header("refresh:0;url=registration.php");
	
}
?>

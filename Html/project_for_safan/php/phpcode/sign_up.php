<?php
	session_start();

		$u_name = $_POST['u_name'];
		$u_pass = $_POST['pass'];
		$u_email = $_POST['email'];
		$u_cont_no = $_POST['mobile'];
		$u_first = $_POST['f_name'];
		$u_last = $_POST['l_name'];
		$u_nic = strtoupper($_POST['nic']);
		$u_type = $_POST['u_type'];

	if(!empty($u_name) && !empty($u_pass) && !empty($u_email) && !empty($u_cont_no) && !empty($u_first) && !empty($u_last) && !empty($u_nic)){

		if(strlen($u_nic) == 10){
			list($nic_no,$nic_v) = str_split($u_nic,9);
		}elseif($u_nic > 0){
			$nic_no = $u_nic;
		}

		$u_id = "EMP".$nic_no;

		$hash_u_pass = password_hash($u_pass,PASSWORD_BCRYPT);

		$_SESSION['u_id'] = $u_id;
		$_SESSION['u_name'] = $u_name;
		$_SESSION['u_pass'] = $hash_u_pass;
		$_SESSION['$u_email'] = $u_email;
		$_SESSION['u_cont_no'] = $u_cont_no;
		$_SESSION['u_first'] = $u_first;
		$_SESSION['u_last'] = $u_last;
		$_SESSION['u_nic'] = $u_nic;
		$_SESSION['u_type'] = $u_type;

		header("refresh:0;url=../../html/registration_pro_pic.php");

	}else{

		$msg = "Please fill registration form and then click Next.....";
	
		echo '<script type="text/javascript">alert("' . $msg . '")</script>';
		header("refresh:0;url=../../html/registration.php");
	}

//	echo $u_name."  ".password_hash($u_pass,PASSWORD_BCRYPT)."  ".$u_email."  ".$u_cont_no."  ".$u_first."  ".$u_last;


?>
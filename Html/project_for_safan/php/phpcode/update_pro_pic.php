<?php

session_start();

if(!empty($_SESSION['u_name']) && !empty($_SESSION['u_id']) && !empty($_SESSION['u_pass']) && !empty($_SESSION['$u_email']) && !empty($_SESSION['u_cont_no']) && !empty($_SESSION['u_first']) && !empty($_SESSION['u_last']) && !empty($_SESSION['u_nic'])){


		$u_id = $_SESSION['u_id'];
		$u_name = $_SESSION['u_name'];
		$hash_u_pass = $_SESSION['u_pass'];
		$u_email = $_SESSION['$u_email'];
		$u_cont_no = $_SESSION['u_cont_no'];
		$u_first = $_SESSION['u_first'];
		$u_last = $_SESSION['u_last'];
		$u_nic = $_SESSION['u_nic'];
	    $u_type = $_SESSION['u_type'];

	require("../dbcon/dbvar.php");
	include("../dbcon/dbcon.php");

		$allowed = array('jpg','jpeg','png');

		$fileName = $_FILES['pro_pic']['name'];
		$fileTmpName = $_FILES['pro_pic']['tmp_name'];
		$fileSize = $_FILES['pro_pic']['size'];
		$fileError = $_FILES['pro_pic']['error'];
		$fileType = $_FILES['pro_pic']['type'];

		$fileExt = explode('.', $fileName);
		$fileActualExt = strtolower(end($fileExt));

			if (in_array($fileActualExt, $allowed)) {
				if ($fileError === 0) {
					if ($fileSize < 100000000) {

						$fileNameNew = uniqid('',true).".".$fileActualExt;
						$fileDestination = "pro_pic/".$fileNameNew;
						$moveDest = "../../".$fileDestination;

						$has = "INSERT INTO users(U_Id, U_Nic, U_First_Name, U_Last_Name, U_Name, U_Password, U_Email, U_Contact_No, U_Profile,U_Type) VALUES ('$u_id','$u_nic','$u_first','$u_last','$u_name','$hash_u_pass','$u_email','$u_cont_no','$fileDestination','$u_type')";

						if(mysqli_query($con,$has)){
							move_uploaded_file($fileTmpName, $moveDest);

							unset($_SESSION['u_id']);
							unset($_SESSION['u_name']);
							unset($_SESSION['u_pass']);
							unset($_SESSION['$u_email']);
							unset($_SESSION['u_cont_no']);
							unset($_SESSION['u_first']);
							unset($_SESSION['u_last']);
							unset($_SESSION['u_nic']);
							unset($_SESSION['u_type']);

							session_destroy();
						}else{

							echo "Their is an error while uploading the data to DB";
							header("refresh:2;url=../../html/registration_pro_pic.php");

						}

//						echo "".$u_id." ___________ ".$u_nic." ___________ ".$u_name." ___________ ".$hash_u_pass." ___________ ".$u_email." ___________ ".$u_cont_no." ___________ ".$u_first." ___________ ".$u_last." ___________ ".$fileDestination;

						mysqli_close($con);
					}else{
						echo "Your file is too large";
						header("refresh:2;url=../../html/registration_pro_pic.php");
					}
				}else{
					echo "There was an error while uploading file";
					header("refresh:2;url=../../html/registration_pro_pic.php");
				}
			}else{
				echo "You cannot upload this type of files";
				header("refresh:2;url=../../html/registration_pro_pic.php");
			}
	//echo $u_name."  ".password_hash($u_pass,PASSWORD_BCRYPT)."  ".$u_email."  ".$u_cont_no."  ".$u_first."  ".$u_last;

	$msg = "Thank you for joining with us...\nHave a nice day... (:";
	
	echo '<script type="text/javascript">alert("' . $msg . '")</script>';


	header("refresh:0;url=../../html/home.php");

}

?>
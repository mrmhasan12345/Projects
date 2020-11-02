<?php


include("../dbcon/dbcon.php");

$u_name=$_POST['u_name'];
$u_pass=$_POST['pass'];
$u_email=$_POST['email'];
$u_cont_no=$_POST['mobile'];
$u_first=$_POST['f_name'];
$u_last=$_POST['l_name'];

if(!empty($u_name) &&!empty($u_pass) &&!empty($u_email) &&!empty($u_cont_no) &&!empty($u_first) &&!empty($u_last)){

$hash_u_pass=password_hash($u_pass,PASSWORD_BCRYPT);

$has="INSERT INTO login(U_Name,U_Password,U_Email,U_Contact_No,U_First_Name,U_Last_Name) VALUES('$u_name','$hash_u_pass','$u_email','$u_cont_no','$u_first','$u_last')";
mysqli_query($con,$has);

}

//echo $u_name."  ".password_hash($u_pass,PASSWORD_BCRYPT)."  ".$u_email."  ".$u_cont_no."  ".$u_first."  ".$u_last;

mysqli_close($con);

header("refresh:1;url=../../html/log_form.html");

?>
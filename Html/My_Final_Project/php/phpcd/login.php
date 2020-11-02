<?php
session_start();

include("../dbcon/dbcon.php");

$u_name=$_POST['user_name'];
$u_pass=$_POST['pass'];

if(isset($u_name) && isset($u_pass)){


$has="SELECT * FROM login";

$out=mysqli_query($con,$has);

while($check=mysqli_fetch_array($out)){
if($u_name==$check['U_Name'] && password_verify($u_pass,$check['U_Password'])){
$_SESSION['login']=$u_name;
header("refresh:0;url=../../html/home_page.php");
}
}
if(empty($_SESSION['login'])){
echo "<script>alert('invalid user name or password')</script>";
header("refresh:0;url=../../html/log_form.html");
}
}

?>
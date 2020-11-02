<?php

include("../dbcon/dbcon.php");

$gn=$_POST["gn_name"];
$tr=$_POST["tr_name"];
$sup_id=$_POST['sup_id'];
$gen_name=$_POST['gen_name_gen'];


if(!empty($sup_id)){

$has1="DELETE FROM supplier WHERE Supplier_Id='".$sup_id."'";
mysqli_query($con,$has1);

}

if(!empty($gen_name)){

$has1="DELETE FROM genetic WHERE Genetic_Id='".$gen_name."'";
mysqli_query($con,$has1);

}

if(!empty($gn) && !empty($tr)){

$has="DELETE FROM medicine WHERE Genetic_Id='".$gn."' AND Medicine_Id='".$tr."'";
mysqli_query($con,$has);

}

mysqli_close($con);
header("refresh:1;url=../../html/delete.php");
?>
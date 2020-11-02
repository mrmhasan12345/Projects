<?php


include("../dbcon/dbcon.php");

$supname=$_POST["sup_name"];
$supcont=$_POST["sup_cont"];
$supadd=$_POST["sup_add"];

if(!empty($supname) && !empty($supcont) && !empty($supadd)){

$input1="INSERT INTO supplier(Supplier_Name,Supplier_Address,Supplier_Contact) VALUES('$supname','$supadd','$supcont')";

mysqli_query($con,$input1);

mysqli_close($con);

header("refresh:1;url=../../html/supplier.php");
}
?>

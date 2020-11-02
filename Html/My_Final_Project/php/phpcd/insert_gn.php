<?php


include("../dbcon/dbcon.php");


$genname=$_POST["gn_name"];

if(!empty($genname)){

$input2="INSERT INTO genetic(Genetic_Name) VALUES('$genname')";

mysqli_query($con,$input2);

mysqli_close($con);

header("refresh:1;url=../../html/gen_name.php");
}

?>

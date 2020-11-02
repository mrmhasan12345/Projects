<?php

include("../phpcon/dbcon.php");

$item_id=$_POST["item_id"];
$item_name=$_POST["item_name"];
$item_desc=$_POST["item_desc"];
$r_date=$_POST["rec_dt"];


$shafna="UPDATE items SET ItemName='$item_name',ItemDescription='$item_desc',date='$r_date' WHERE ItemID='$item_id'";
mysqli_query($con,$shafna);

header("refresh:1;url=../../html/hm_page.html");

mysqli_close($con);

?>
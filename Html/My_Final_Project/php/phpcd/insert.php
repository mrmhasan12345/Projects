<?php


include("../dbcon/dbcon.php");


$receive=$_POST["receive"];
$genname=$_POST["gen_name"];
$trname=$_POST["tr_name"];
$strength=$_POST["str"];
$type=$_POST["rdi"];
$quantity=$_POST["qun"];
$reorder=$_POST["re_o"];
$UOM=$_POST["UOM"];
$expdt=$_POST["exp"];
$rprice=$_POST["r_pri"];
$sprice=$_POST["s_pri"];
$supname=$_POST["sup_name"];


if(!empty($genname) && !empty($supname) && !empty($trname) && !empty($strength) && !empty($type) && !empty($quantity) && !empty($reorder) && !empty($UOM) && !empty($expdt) && !empty($rprice) && !empty($sprice) && !empty($receive)){

$input2="INSERT INTO medicine(Drug_Type,Genetic_Id,Trade_Name,Strength,Expiry_Date,Received_Date,Unit_Of_Measurment,Selling_Price,Retail_Price,Quantity,Re_Order_Level,Supplier_Id) VALUES ('$type','$genname','$trname','$strength','$expdt','$receive','$UOM','$sprice','$rprice','$quantity','$reorder','$supname')";

mysqli_query($con,$input2);

//echo $receive." ".$genname." ".$trname." ".$strength." ".$type." ".$quantity." ".$reorder." ".$UOM." ".$expdt." ".$rprice." ".$sprice." ".$supname;

mysqli_close($con);

header("refresh:1;url=../../html/new.php");
}

?>

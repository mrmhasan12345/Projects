<?php

include("../dbcon/dbcon.php");


if(!empty($_POST['sup_name'])){


$sup_id=$_POST['sup_name'];
$sup_cont=$_POST['sup_no'];
$sup_add=$_POST['sup_add'];

$supp="SELECT * FROM supplier WHERE Supplier_Id='".$_POST['sup_name']."'";
$out=mysqli_query($con,$supp);
$supplier=mysqli_fetch_array($out,MYSQLI_ASSOC);

//var_dump($out);
//echo $supplier['Supplier_Address'];

if(empty($_POST['sup_no'])){
$sup_cont=$supplier['Supplier_Contact'];
}
if(empty($_POST['sup_add'])){
$sup_add=$supplier['Supplier_Address'];
}

$upd="UPDATE supplier SET Supplier_Contact='".$sup_cont."',Supplier_Address='".$sup_add."' WHERE Supplier_Id='".$sup_id."'";
mysqli_query($con,$upd);

}

if(!empty($_POST['gn_name'])&& !empty($_POST['med_id'])){

$gen_id=$_POST['gn_name'];
$med_id=$_POST['med_id'];
$strength=$_POST['str'];
$reorder=$_POST["re_o"];
$expdt=$_POST["exp"];
$receive=$_POST["receive"];
$r_price=$_POST["r_pri"];
$s_price=$_POST["s_pri"];

$gen="SELECT * FROM medicine WHERE Genetic_Id='".$_POST['gn_name']."' AND Medicine_Id='".$_POST['med_id']."'";
$output=mysqli_query($con,$gen);
$genetic=mysqli_fetch_array($output,MYSQLI_ASSOC);

if(isset($_POST['qun'])){
$quantity=$_POST['qun']+$genetic['Quantity'];
}

if(empty($_POST['str'])){
$strength=$genetic['Strength'];
}
if(empty($_POST['type'])){
$type=$genetic['Drug_Type'];
}
else{
$type=$_POST['type'];
}
if(empty($_POST['qun'])){
$quantity=$genetic['Quantity'];
}
if(empty($_POST["re_o"])){
$reorder=$genetic['Re_Order_Level'];
}
if(empty($_POST['unit'])){
$UOM=$genetic['Unit_Of_Measurment'];
}
else{
$UOM=$_POST['unit'];
}
if(empty($_POST["exp"])){
$expdt=$genetic['Expiry_Date'];
}
if(empty($_POST["receive"])){
$receive=$genetic['Received_Date'];
}
if(empty($_POST["r_pri"])){
$r_price=$genetic['Retail_Price'];
}
if(empty($_POST["s_pri"])){
$s_price=$genetic['Selling_Price'];
}


$upd="UPDATE medicine SET Strength='".$strength."',Drug_Type='".$type."',Selling_Price='".$s_price."',Retail_Price='".$r_price."',Received_Date='".$receive."',Expiry_Date='".$expdt."',Re_Order_Level='".$reorder."',Unit_Of_Measurment='".$UOM."',Quantity='".$quantity."' WHERE Genetic_Id='".$gen_id."' AND Medicine_Id='".$med_id."'";
mysqli_query($con,$upd);

//echo "	1)".$strength."	\n2)".$type."	\n3)".$s_price."	\n4)".$r_price."	\n5)".$receive."	\n6)".$expdt."	\n7)".$reorder."	\n8)".$UOM."	\n9)".$quantity."	\n10)".$gen_id."	\n11)".$med_id;

}


mysqli_close($con);

header("refresh:1;url=../../html/edit.php");

?>
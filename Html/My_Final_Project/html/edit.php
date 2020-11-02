<?php


function close(){
include("../php/dbcon/dbcon.php");
mysqli_close($con);
}


function sup_name(){

include("../php/dbcon/dbcon.php");

$has="SELECT * FROM supplier";
$out=mysqli_query($con,$has);
while($record1=mysqli_fetch_array($out)){
echo "<option value='".$record1["Supplier_Id"]."'>".$record1["Supplier_Name"]."  /  ".$record1["Supplier_Id"]."</option>";

	}
}

function gn_name(){

include("../php/dbcon/dbcon.php");

$has="SELECT * FROM genetic";
$out=mysqli_query($con,$has);
while($record=mysqli_fetch_array($out)){
echo "<option value='".$record["Genetic_Id"]."'>".$record["Genetic_Name"]."</option>";
	}
}

function tr_name(){

include("../php/dbcon/dbcon.php");

$has="SELECT * FROM medicine";
$out=mysqli_query($con,$has);
while($record=mysqli_fetch_array($out)){
echo "<option value='".$record["Medicine_Id"]."'>".$record["Trade_Name"]."</option>";

	}
}

?>




<html>
<head>

<link type="text/css" rel="stylesheet" href="../css/subframe.css"/>

</head>
<body>


<div class="area">

<div class="sub_top_top">

<div class="sub_top">
<div class="itms">
<div class="bar"></div>
	<div class="txt"><a href="new.php">New</a></div><div class="bar"></div>
	<div class="txt"><a href="edit.php">Update</a></div><div class="bar"></div>
	<div class="txt"><a href="delete.php">Delete</a></div><div class="bar"></div>
	<div class="txt"><a href="show_db.php">Show_DataBase</a></div><div class="bar"></div>
	<div class="txt"><a href="gn_name.php">Add Genetic_Name</a></div><div class="bar"></div>
	<div class="txt"><a href="supplier.php">Add Suppliers</a></div><div class="bar"></div>
</div>
</div>

</div>
<div style="width:100%;height:25px;"></div>

<form action="../php/phpcd/update.php" method="post">
<div class="midle">
<div style="width:100%;height:10px;"></div>
<div class="left">

<div class="col1 flt">Supplier Name</div><div class="col2 flt"><select name="sup_name"/><option></option><?php sup_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Supplier Contact Number</div><div class="col2 flt"><input type="text" name="sup_no"></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Supplier Adress</div><div class="col2 flt"><input type="text" name="sup_add"></div>
<div class="clr"></div>
<div class="spc"></div>

</div>


<div class="right">

<div class="col1 flt">Genatic Name</div><div class="col2 flt"><select name="gn_name"><option></option><?php gn_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Trade Name</div><div class="col2 flt"><select name="med_id"><option></option><?php tr_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Strength</div><div class="col2 flt"><input type="text" name="str"></div>
<div class="clr"></div>
<div class="spc"></div>

<div style="width:100%;height:130px;">

<div class="col1 flt">Type</div>
<div style="width:400px;height:100%;" class="flt">
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Syrup"></div><div class="col4">: Syrup</div></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Tablet"></div><div class="col4">: Tablet</div></div>
		<div class="clr"></div>
		<div class="spc"></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Intra-venous"></div><div class="col4">: Intra-venous</div></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Intra-mascular"></div><div class="col4">: Intra-mascular</div></div>
		<div class="clr"></div>
		<div class="spc"></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Subcutabious"></div><div class="col4">: Subcutabious</div></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Intra-dermal"></div><div class="col4">: Intra-dermal</div></div>
		<div class="clr"></div>
		<div class="spc"></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Suppocitory"></div><div class="col4">: Suppocitory</div></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="type" value="Inhaler"></div><div class="col4">: Inhaler</div></div>
		<div class="clr"></div>
		<div class="spc"></div>
</div>
		<div class="clr"></div>
		<div class="spc"></div>
</div>
	
<div class="col1 flt">Quantity </div><div class="col2 flt"> <input type="text" name="qun"></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Re-order level </div><div class="col2 flt"> <input type="text" name="re_o"></div>
<div class="clr"></div>
<div class="spc"></div>
<div style="width:100%;height:30px;">
<div class="col1 flt">Unit of Measurement</div>
<div style="width:400px;height:100%;" class="flt">
		<div class="col flt"><div class="col3 flt"><input type="radio" name="unit"></div><div class="col4">: Box</div></div>
		<div class="col flt"><div class="col3 flt"><input type="radio" name="unit"></div><div class="col4">: Bottles</div></div>
		<div class="clr"></div>
		<div class="spc"></div>
</div>
		<div class="clr"></div>
		<div class="spc"></div>
</div>

<div class="col1 flt">Expiry Date</div><div class="col2 flt"><input type="date" name="exp"></div>
		<div class="clr"></div>
		<div class="spc"></div>
<div class="col1 flt">Received Date</div><div class="col2 flt"><input type="date" name="receive"></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Retail price</div><div class="col2 flt"><input type="text" name="r_pri"></div>
		<div class="clr"></div>
		<div class="spc"></div>
<div class="col1 flt">Selling price</div><div class="col2 flt"><input type="text" name="s_pri"></div>
		<div class="clr"></div>
		<div class="spc"></div>

</div>
		<div class="clr"></div>
		<div class="spc"></div>
</div>

<div class="sub_bottem">

		<input type="submit" value="Update">
		<input type="reset" value="Clear">
</div>
</div>
</form>

</body>
</html>
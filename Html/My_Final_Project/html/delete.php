<?php

function genetic(){

include("../php/dbcon/dbcon.php");

$has="SELECT * FROM genetic";
$out=mysqli_query($con,$has);
while($record=mysqli_fetch_array($out)){
echo "<option value='".$record["Genetic_Id"]."'>".$record["Genetic_Name"]."</option>";
	}
}

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
<style>

</style>
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
<div class="midle">
<form action="../php/phpcd/delete_cont.php" method="post">
<div style="width:100%;height:10px;"></div>
<div class="flt" style="width:400px;height:400px">
<div style="width:400px;height:200px">
<div class="spc"></div>
<h2>Delete supplier</h2>
<div class="col1 flt">Supplier Id </div>
<div class="col2 flt"><select name="sup_id"><option></option><?php sup_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
</div>
<div style="width:400px;height:200px">
<div class="spc"></div>
<h2>Delete Genetic Name</h2>
<div class="spc"></div>
<div class="col1 flt">Genetic Name</div>
<div class="col2 flt"><select name="gen_name_gen"><option></option><?php genetic() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
</div>
</div>
<div class="right">

<div class="spc"></div>
<h2>Delete a medicin</h2>
<div class="spc"></div>
<div class="col1 flt">Genatic Name </div>
<div class="col2 flt"><select name="gn_name"><option></option><?php gn_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Trade Name </div>
<div class="col2 flt"><select name="tr_name"><option></option><?php tr_name() ?></select><?php close() ?></div>
<div class="clr"></div>
<div class="spc"></div>

</div>

<div class="sub_bottem">
<div class="clr"></div>
<div class="spc"></div>
<input type="submit" name="submit" value="Delete">
<div class="flt"></div><input type="reset" name="clear" value="Clear">
<div class="clr"></div>
<div class="spc"></div>
</div>
</form>
</div>
</div>


</body>
</html>
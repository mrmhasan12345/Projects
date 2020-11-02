<?php

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

<form action="../php/phpcd/insert_supplier.php" method="post">
<div class="midle">
<div style="width:100%;height:10px;"></div>
<div class="left">

<div class="col1 flt">Supplier Name</div><div class="col2 flt"><input type="text" name="sup_name"></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Supplier Contact Number</div><div class="col2 flt"><input type="text" name="sup_cont"></div>
<div class="clr"></div>
<div class="spc"></div>
<div class="col1 flt">Supplier Adress</div><div class="col2 flt"><input type="text" name="sup_add"></div>
<div class="clr"></div>
<div class="spc"></div>


</div>


<div class="right">

</div>

<div class="sub_bottem">
<div class="clr"></div>
<div class="spc"></div>

		<input type="submit" value="Enter">
		<input type="reset" value="Clear">
</div>
</div>
</form>

</body>
</html>
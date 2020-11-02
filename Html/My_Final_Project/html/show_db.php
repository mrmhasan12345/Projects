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
<div class="midle">
<div style="width:100%;height:10px;"></div>

<?php


include("../php/dbcon/dbcon.php");


$has="SELECT * FROM medicine";
$out=mysqli_query($con,$has);

echo "<table border=5>";


for($i=0;$i<mysqli_num_fields($out);$i++){
	
	echo "<th>".(mysqli_fetch_field_direct($out,$i)->name)."</th>";
	
	}
while($rows=mysqli_fetch_array($out,MYSQLI_ASSOC)){
	
	echo "<tr>\n";
	foreach($rows as $values){
	echo "<td>".$values."</td>\n";
	}
	echo "</tr>\n";
	
	}
echo "</table>";

mysqli_close($con);

?>

<div class="sub_bottem">

</div>
</div>


</body>
</html>
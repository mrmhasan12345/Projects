<?php


include("../dbcon/dbcon.php");


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
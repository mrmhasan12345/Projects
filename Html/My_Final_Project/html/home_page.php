<?php
session_start();

if(isset($_SESSION['login'])){
}
else{
echo "Sorry first you have to log into the system";
header("refresh:2;url=log_form.html");
return false;
}

?>

<html>
<head>
<title>Mohammed Hasan</title>

<script type="text/javascript">

function pg_load(){

document.getElementById("cont").innerHTML='<object type="text/html" data="iif_a.html" style="width:100%;height:100%;"></object>';

}

</script>

<link href="../css/frame_style.css" rel="stylesheet" type="text/css"/>
<link href="../css/new_menu.css" rel="stylesheet" type="text/css"/>
<link href="../css/animation_menu.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<a name="homepage"></a>

<div class="total">
<div class="backimg"></div>
<div class="container">

<div class="home_top">

<div class="gap"></div>
<div class="top_nav_bar">
<div class="top_nav">
<div class="col11"><a href="#">Home</a></div><div class="bar"></div>
<div class="col11"><a href="#">About Us</a></div><div class="bar"></div>
<div class="col11"><a href="#">Contact Us</a></div><div class="bar"></div>
<div class="col11"><a href="../php/phpcd/logout.php">Log Out</a></div>
<div style="clear:both;"></div>
</div>

</div>

<h1 style="text-align:center;font-size=50px;font-family:"Old English Text MT","Time New Roman",serif;margin:0;">Stock Managment for pharmercy</h1>
<div class="menu">
<ul>
<li><a href="#">Infaction and Inflammation</a>
	<ul class="submenu">
		<li><a href="#" onclick="pg_load();">Chemotherapy of infaction</a></li>
		<li><a href="#">Antibacterial drugs</a></li>
		<li><a href="#">Chemotherapy of bacterial infaction</a></li>
		<li><a href="#">Viral, fungal, protozoal, and helminthic infactions</a></li>
		<li><a href="#">Drugs for inflammation and joint disease</a></li>
		<li><a href="#">Drugs and the Skin</a></li>
	</ul>
</li>
<li><a href="#">Nervous system</a>
	<ul class="submenu">
		<li><a href="#">Pain and analgesics</a></li>
		<li><a href="#">Anaesthesia and neuromuscular block</a></li>
		<li><a href="#">Psychotropic drugs</a></li>
		<li><a href="#">Neurological disorders-epilepsy, Parkinson's diesease and Multiple sclerosis</a></li>
	</ul>
</li>
<li><a href="#">Cardirespiratory and renal systems</a>
	<ul class="submenu">
		<li><a href="#">Cholinergic and antimuscarinic (anticholinergic) mechanisms and drugs</a></li>
		<li><a href="#">Adrenergic mechanisms and drugs</a></li>
		<li><a href="#">Arterial hypertension, angina pectoris, myocardial infraction and heart failure</a></li>
		<li><a href="#">Cardiac arrhythmia</a></li>
		<li><a href="#">Hyperlipideamias</a></li>
		<li><a href="#">Kidney and genitourinary tract</a></li>
		<li><a href="#">Respiratory system</a></li>
	</ul>
</li>
<li><a href="#">Blood and Neoplastic disease</a>
	<ul class="submenu">
		<li><a href="#">Drugs and haemostasis</a></li>
		<li><a href="#">Neoplastic disease and immunosuppression</a></li>
		<li><a href="#">Red blood cell disorders</a></li>
	</ul>
</li>
<li><a href="#">Gastrointestinal system</a>
	<ul class="submenu">
		<li><a href="#">Oesophagus, stomach and duodenum</a></li>
		<li><a href="#">Intestines</a></li>
		<li><a href="#">Liver and biliary tract</a></li>
	</ul>
</li>
<li><a href="#">Endocrine system, Metabolic conditions</a>
	<ul class="submenu">
		<li><a href="#">Adrenal corticosteroids, antagonists, corticotropin</a></li>
		<li><a href="#">Diabetes mellitus, insulin, oral antidiabetes agents, obesity</a></li>
		<li><a href="#">Thyroid hormones, antithyroid drugs</a></li>
		<li><a href="#">Hypothalamic, pituitary and sex hormones</a></li>
		<li><a href="#">Vitamins, calcium, bone</a></li>
	</ul>
</li>
</ul>


</div>
</div>
<div class="center" id="cont">

</div>
</div>
</div>

</body>
</html>
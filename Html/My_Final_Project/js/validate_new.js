function newval(){
	
	//document.write("hasan");
		

	if(document.new.sup_name.value==""){
		alert("Enter Supplier Name");
		document.new.sup_name.focus();
		return false;
		}
	if(document.new.gen_name.value==""){
		alert("Enter Genetic Name");
		document.new.gen_name.focus();
		return false;
		}
	if(document.new.tr_name.value==""){
		alert("Enter Trade Name");
		document.new.tr_name.focus();
		return false;
		}
	if(document.new.str.value==""){
		alert("Enter Strength");
		document.new.str.focus();
		return false;
		}
	if(document.new.rdi.value==""){
		alert("Enter Drug type");
		document.new.rdi.focus();
		return false;
		}
	if(document.new.qun.value==""){
		alert("Enter Quantity");
		document.new.qun.focus();
		return false;
		}
	if(document.new.re_o.value==""){
		alert("Enter Re-order level");
		document.new.re_o.focus();
		return false;
		}
	if(document.new.UOM.value==""){
		alert("Enter Unit of measurement");
		document.new.UOM.focus();
		return false;
		}
	if(document.new.receive.value==""){
		alert("Enter Received date");
		document.new.receive.focus();
		return false;
		}
	if(document.new.exp.value==""){
		alert("Enter Expiry date");
		document.new.exp.focus();
		return false;
		}
	if(document.new.r_pri.value==""){
		alert("Enter Retail price");
		document.new.r_pri.focus();
		return false;
		}
	if(document.new.s_pri.value==""){
		alert("Enter Selling price");
		document.new.s_pri.focus();
		return false;
		}	
}

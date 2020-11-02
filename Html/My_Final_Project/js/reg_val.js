function regval(){
		
	if(document.reg.f_name.value==""){
		alert("Enter First Name");
		document.reg.f_name.focus();
		return false;
		}
	if(document.reg.l_name.value==""){
		alert("Enter Last Name");
		document.reg.l_name.focus();
		return false;
		}
	if(document.reg.email.value==""){
		alert("Enter email");
		document.reg.email.focus();
		return false;
		}
	if(document.reg.u_name.value==""){
		alert("Enter User Name");
		document.reg.u_name.focus();
		return false;
		}
	if(document.reg.pass.value==""){
		alert("Enter Password");
		document.reg.pass.focus();
		return false;
		}
	if(document.reg.con_pass.value==""){
		alert("Enter Conform password");
		document.reg.con_pass.focus();
		return false;
		}

	if(document.pass.value==document.reg.con_pass.value){
		alert("Password and Conform password doesn't match");
		document.reg.pass.focus();
		return false;
		}



}


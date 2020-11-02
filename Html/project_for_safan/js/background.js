function change_background(){
	//	document.body.style.backgroundImage = "url('../pro_pic/Wallpapers/bckgrnd_01.jpg')";
		try{

			var p = [ '../pro_pic/Wallpapers/bckgrnd_01.jpg',
						'../pro_pic/Wallpapers/bckgrnd_02.jpg',
						'../pro_pic/Wallpapers/bckgrnd_03.jpg',
						'../pro_pic/Wallpapers/bckgrnd_04.jpg'];

			var counter = 0;

				setInterval(function(){
					 document.body.style.backgroundImage = "url("+p[counter++]+")";
					 document.body.style.backgroundSize = "cover";
					//console.log(counter++);

					if(counter == 4){
						counter = 0;
					}
				},3000);
				
		}catch(err){
			alert(err.message);
		}
	}
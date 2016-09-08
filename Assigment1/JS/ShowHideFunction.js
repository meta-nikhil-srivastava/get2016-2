	function fnHide() {
	    document.getElementById("myspan").style.display = "none";
	}
	
	function fnShow() {
	    document.getElementById("myspan").style.display = "block";
	}
	
	function fnToggle() 
	{
	    var x = document.getElementById("myspan");
	    if (x.style.display == "none") 
	    {
	        x.style.display = "block";
	    } 
	    
	    else 
	    {
	        x.style.display = "none";
	    }
	}
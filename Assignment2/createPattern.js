
		function drawPattern()
		{
			
			for(var index=0;index<arguments.length;index++)
			{
				if(isNaN(arguments[index])||arguments[index]<=0)
				{
					alert("Enter natural Numbers");
					return false;
				}
			}
			var text="Generated pattern is: <br />";
			var max=Math.max.apply(null,arguments);
			
			for(var i=max;i>0;i--)
			{
				for(var index=0;index<4;index++)
				{
					if(arguments[index]>=i)
					{
						text+="*&nbsp;&emsp;";
					}
					else
					{
						text+="&nbsp;&nbsp;&nbsp;&emsp;";
					}
				}
				text+="<br />";
			}
			 var alpha=65;
			for(var index=0;index<arguments.length;index++)
			{
				text+=String.fromCharCode(alpha)+"&emsp;";
				alpha++;
			}
			document.getElementById("result").innerHTML =text;
			return true;
		}
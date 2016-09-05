

		function checkValidation(rows)
		{
			if(isNaN(rows)||rows<=0)
			{
				alert("Enter natural Numbers");
				return false;
			}
			else
			{
				return true;
			}
		}
		//Construct pyramid using for loop
		function PyramidUsingFor(rows)
		{
			if(checkValidation(rows)==true)
			{
				var text="Constructed pyramid using for loop <br />";
				for(var rowIndex=0;rowIndex<rows;rowIndex++)
				{
					for(var spaces=rows-rowIndex; spaces>0;spaces--)
					{
						text+="&nbsp;&nbsp;";	
					}
					for(var star=0; star<=2*rowIndex; star++)
					{
						text+="*";
					}
					text+="<br />";
				}
				
				document.getElementById("result").innerHTML =text;
				return true;
			}
			
		}
		
		//Construct pyramid using while loop
		function PyramidUsingWhile(rows)
		{
			if(checkValidation(rows)==true)
			{
				var text="Constructed pyramid using While loop <br />";
				var rowIndex=0;
				while(rowIndex<rows)
				{
					var spaces=rows-rowIndex;
					while(spaces>0)
					{
						text+="&nbsp;&nbsp;";
						spaces--;
					}
					
					var star=0;
					while(star<=2*rowIndex)
						{
							text+="*";
							star++;
						}
					text+="<br />";
					rowIndex++;
				}

				document.getElementById("result").innerHTML =text;
			}
			else 
			{
				return false;
			}
			
		}
		
		
		//Construct pyramid using do-while loop
		function PyramidUsingDOWhile(rows)
		{
			if(checkValidation(rows)==true)
			{
				var text="Constructed pyramid using Do-While loop <br />";
				var rowIndex=0;
				
				do{
					var spaces=rows-rowIndex;
					do
					{
						text+="&nbsp;&nbsp;";
						spaces--;
					}while(spaces>0);
					
					var star=0;
					do{
							text+="*";
							star++;
						}while(star<=2*rowIndex)
					text+="<br />";;
					rowIndex++;
				}while(rowIndex<rows);
				
				document.getElementById("result").innerHTML =text;
			}
			else
			{
				return false;
			}
		}
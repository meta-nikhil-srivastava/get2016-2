function findgreatest(val1, val2, val3) 
{
	if (isNaN(val1)|| isNaN(val2)|| isNaN(val3)) 
	{
		alert("Please Enter Numbers");
	} 
	else 
	{
		var result;
		if (val1>=val2 && val1>=val3) 
		{
			result=val1;
		} 
		else if(val2>=val3)
		{
			result=val2;
		}
		else
		{
			result=val3;
		}
		document.getElementById("result").innerHTML = "Largest number is: " + result;
	}
}
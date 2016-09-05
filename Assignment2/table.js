function printTable(table)
{
	if(isNaN(table))
	{
		alert("Enter natural Numbers");
		return false;
	}
	else
	{
		
		var text="";
		for(var num=1;num<=10;num++)
		{
			text+= table+"&nbsp;*&nbsp;"+num+"&nbsp;=&nbsp;"+(table*num)+"<br />";
		}
		document.getElementById("result").innerHTML =text;
		return true;
	}
}
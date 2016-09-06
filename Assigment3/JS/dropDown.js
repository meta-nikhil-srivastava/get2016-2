function SelectedItem()
{
	
	var course=document.getElementsByName("Country");
	
		if (course[0].checked) 
		{
			var radioSelectorValue = document.getElementById('IndianCity');
			var result ="Selected city is "+ radioSelectorValue.options[radioSelectorValue.selectedIndex].value+" of country "+course[0].value;
		} 
		
		else
		{
			var radioSelectorValue = document.getElementById('BritishCity');
			var result = "Selected city is "+ radioSelectorValue.options[radioSelectorValue.selectedIndex].value+" of country "+course[1].value;
		}
		alert(result);
		return true;
}
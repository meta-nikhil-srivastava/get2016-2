function SelectedCourse()
{
	var course=document.getElementsByName("Course");
	var type=document.getElementsByName("Type");
	
	var result = "";
	var i;
	for (i = 0; i < course.length; i++) {
		if (course[i].checked) {
			result = "Selectes Course : &nbsp;&nbsp;" + course[i].value;
			result += "<br />";
		}
	}
	for (i = 0; i < type.length; i++) {
		if (type[i].checked) {
			result += "Type of Course Selected: &nbsp;&nbsp;" + type[i].value;
		}
	}
	document.getElementById("result").innerHTML = result;
return true;
}
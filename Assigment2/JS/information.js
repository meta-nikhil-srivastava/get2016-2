$(document).ready(writeInfo);

function writeInfo()
{
	$("#name").keyup(displayName);
	$("#age").keyup(displayAge);
	$("#address").keyup(displayAddress);
}

function displayName()
{
	var value = document.getElementById('name').value;
	value="Name : "+value;
	$(".infoDiv").text(value);
	$("#name").css("background-color", "yellow");
	setTimeout(function(){ $("#name").css("background-color", "white"); },200);
}

function displayAge()
{
	var value = document.getElementById('age').value;
	if (!$.isNumeric(value) || value>=100)
	{
		alert("Invalid Age");
	}
	
	else
	{
		value="Age : "+value;
		$(".infoDiv").text(value);
		$("#age").css("background-color", "yellow");
		setTimeout(function(){ $("#age").css("background-color", "white"); },200);
	}
}

function displayAddress()
{
	var value = document.getElementById('address').value;
	value="Address : "+value;
	$(".infoDiv").text(value);
	$("#address").css("background-color", "yellow");
	setTimeout(function(){ $("#address").css("background-color", "white"); },200);
}
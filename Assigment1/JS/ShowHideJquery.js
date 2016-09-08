$(document).ready(display)

function display()
{
	$("#hide").click(function()
	{
	     $("p").hide();
	});
		   
	$("#show").click(function()
	{
	     $("p").show();
	});
		    
	$("#toggle").click(function()
	{
	   	$("p").toggle();
	});
}
$(document).ready(DoAction);
	
function DoAction()
{
    $('#setContent').click( function ()
    {
    	$('.hello').text('Hello World');
    });
 }
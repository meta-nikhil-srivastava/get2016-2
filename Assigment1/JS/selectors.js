$(document).ready(options);

function options() {
    $("#selSpanClassMsg").click(DoAction1);
    $("#selButton").click(DoAction2);
    $("#selImgAltHello").click(DoAction3);
    $("#selTextIdmyDiv").click(DoAction4);
    $("#selTextNametxt").click(DoAction5);
    $("#selparaNotbox").click(DoAction6);
    $("#seldivClassBox").click(DoAction7);
    $("#seldivEitherBoxOrError").click(DoAction8);
    $("#seldivBothBoxAndError").click(DoAction9);
    $("#selSpanInDivInfo").click(DoAction10);
}


function DoAction1() {
    $('span.message').css("background-color","yellow");
}


function DoAction2() {
    $('.buttondiv button').css("background-color","blue");
}


function DoAction3() {
    $('img[alt="hello"]').width(500);
}


function DoAction4() {
	 $( '#myDiv input[type=text]').val( "text box in div id is selected" );
}


function DoAction5() {
    $( "input[name^='txt']" ).val( "text box with id starting with txt is selected" );
}


function DoAction6() {
    $( ' :not(.box)p' ).css("background-color","gray");
}


function DoAction7() {
	$(".boxerror .box:first").css("background-color","blue");
}


function DoAction8() {
	$('.box, .error').css('background','yellow');
}


function DoAction9() {
	$('.box.error').css('background','blue');
}


function DoAction10() {
	$('#myDiv span.info').css('background','blue');
}
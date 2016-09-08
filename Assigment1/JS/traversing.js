$(document).ready(options);

function options() {
    $("#selparent").click(DoAction1);
    $("#selparents").click(DoAction2);
    $("#selparentsUntil").click(DoAction3);
    $("#selchild").click(DoAction4);
    $("#selchildren").click(DoAction5);
    $("#selsibling").click(DoAction6);
}

function DoAction1() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").parent().css({"color": "red", "border": "2px solid red"});
}

function DoAction2() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").parents().css({"color": "red", "border": "2px solid red"});
}

function DoAction3() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").parentsUntil('div').css({"color": "red", "border": "2px solid red"});
}

function DoAction4() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").children().css({"color": "red", "border": "2px solid red"});
}

function DoAction5() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").find("*").css({"color": "red", "border": "2px solid red"});
}

function DoAction6() {
	$(".ancestors *").css({"color": "lightgrey", "border": "2px solid lightgrey"});
	$("h4").siblings().css({"color": "red", "border": "2px solid red"});
}
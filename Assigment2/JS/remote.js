$(document).ready(control);

function control() {
    $("#start").click(start);
    $("#stop").click(stop);
    $("#back").click(back);
    $("#left").click(left);
    $("#right").click(right);
    $("#top").click(tops);
    $("#bottom").click(bottom);
}

function start(){
	$('.box').animate({left: "+=1000px"},3000);
}

function stop(){
	$('.box').stop();
}

function back(){
	$('.box').animate({left: "-=1000px"},3000);
}

function left(){
	$('.box').animate({left: "-=50px"});
}

function right(){
	$('.box').animate({left: "+=50px"});
}

function tops(){
	$('.box').animate({top: "-=50px"});
}

function bottom(){
	$('.box').animate({top: "+=50px"});
}


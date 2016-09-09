$(document).ready(action);


function action() {
    $('#employeeName').change(getDetails);
}

function getDetails() {
    $.getJSON('JSON/EmployeeDetails.json',display);
}

function display(data) {
	$('.infoDiv').css("display", "block");
    switch($('#employeeName').val()) {
        case "Ayushi" :
            $('#name').text(data.Ayushi.Name);
            $('#email').text(data.Ayushi.Email);
            $('#dob').text(data.Ayushi.DOB);
            $('#address').text(data.Ayushi.Address);
            break;
        case "Tripati" :
            $('#name').text(data.Tripati.Name);
            $('#email').text(data.Tripati.Email);
            $('#dob').text(data.Tripati.DOB);
            $('#address').text(data.Tripati.Address);
            break;
        case "Amita" :
            $('#name').text(data.Amita.Name);
            $('#email').text(data.Amita.Email);
            $('#dob').text(data.Amita.DOB);
            $('#address').text(data.Amita.Address);
            break;
        case "Riya" :
            $('#name').text(data.Riya.Name);
            $('#email').text(data.Riya.Email);
            $('#dob').text(data.Riya.DOB);
            $('#address').text(data.Riya.Address);
            break;
        default :
        	$('.infoDiv').css("display", "none");
    }
}
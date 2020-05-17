


function nameFilter(){
	$("#p201").hide();
	nameFilter1= /^([A-Za-z]*)+$/;
	name=$('#uname11').val();
	if((name.length>1 &&(nameFilter1).test(name))){
		
		$("#p201").hide();
		$('#signbtn21').removeAttr('disabled');
		return true;
	}
	else {
		$("#p201").show();
		$('#signbtn21').attr('disabled', 'disabled');
		
		return false
	}
}


function emailFilter(){
	$("#p202").hide();
	emailFilter2=/^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	emailFilter1 = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,6})+$/;
	
	if(!((emailFilter1).test($("#email11").val()) && (emailFilter2).test($("#email11").val()))){
		
		$("#p202").show();
		$('#signbtn21').attr('disabled', 'disabled');
		return false;
	}
	else{
		$("#p202").hide();
		$('#signbtn21').removeAttr('disabled');
		return true;
	} 
}


function passwordCheck(){
	
	var regularExpression = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
	var regDigit=/^(?=.*[0-9])$/ ;
	var regLower=/^ (?=.*[a-z])$/;
	var regUpper= /^(?=.*[A-Z])$/;
	var regSpec=/^(?=.*[!@#$%^&*])$/;
	$("#p203").hide();
	
//	if(!(((($("#psw11").val()).length)>=8) && regDigit.test($("#psw11").val()) && regLower.test($("#psw11").val()) && regUpper.test($("#psw11").val()) 
//			 && regSpec.test($("#psw11").val()) && regularExpression.test($("#psw11").val())  )){
		
//		console.log(regDigit.test($("#psw11").val()));
//		console.log(regLower.test($("#psw11").val()));
//		console.log(regSpec.test($("#psw11").val()));
//		console.log(regularExpression.test($("#psw11").val()));
//		console.log(regUpper.test($("#psw11").val()) );
		
		if(!((($("#psw11").val()).length)>=8)){
		$("#p203").show();
		$('#signbtn21').attr('disabled', 'disabled');
		return false;
		}
//		
//		else if(!(regDigit.test($("#psw11").val()))){
//			$("#p206").show();
//			$('#signbtn21').attr('disabled', 'disabled');
//			return false;
//		}
//		else if(!(regLower.test($("#psw11").val()))){
//			$("#p207").show();
//			$('#signbtn21').attr('disabled', 'disabled');
//			return false;
//		}
//		else if(!(regUpper.test($("#psw11").val()))){
//			$("#p208").show();
//			$('#signbtn21').attr('disabled', 'disabled');
//			return false;
//		}
//		else if(!(regSpec.test($("#psw11").val()))){
//			$("#p209").show();
//			$('#signbtn21').attr('disabled', 'disabled');
//			return false;
//		}
//		
		
		
		
//	}
	else{
		$("#p203").hide();
		$("#p206").hide();
		$("#p207").hide();
		$("#p208").hide();
		$("#p209").hide();
		$('#signbtn21').removeAttr('disabled');
		return true;
		
	/*	/^[^6-9]\d{9}$/" +
		"if(email.match(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/))
		
		var regularExpression = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
		 (/^
			        (?=.*\d)                //should contain at least one digit
			        (?=.*[a-z])             //should contain at least one lower case
			        (?=.*[A-Z])             //should contain at least one upper case
			        [a-zA-Z0-9]{8,} 

		function validatePassword() {
		    var p = document.getElementById('newPassword').value,
		        errors = [];
		    if (p.length < 8) {
		        errors.push("Your password must be at least 8 characters"); 
		    }
		    if (p.search(/[a-z]/i) < 0) {
		        errors.push("Your password must contain at least one letter.");
		    }
		    if (p.search(/[0-9]/) < 0) {
		        errors.push("Your password must contain at least one digit."); 
		    }
		    if (errors.length > 0) {
		        alert(errors.join("\n"));
		        return false;
		    }
		    return true;
		}*/
		
	}	
}

function passwordReCheck(){
	$("#p204").hide();
	if(($("#psw11").val()).length>=8){
	if(!(($("#psw11").val())===($("#psw-repeat11").val()))){
		console.log("not an matched")
		$("#p204").show();
		$('#signbtn21').attr('disabled', 'disabled');
		return false;
	}
	else{
		$("#p204").hide();
		$('#signbtn21').removeAttr('disabled');
		return true;
	}	
	}
	else{
		$("#p203").show();
		$('#signbtn21').attr('disabled', 'disabled');
		return false;}
}


function mobileCheck(){
	mobFilter= /^([0-9]{10})+$/;
	$("#p205").hide();
	if(!(($("#mob11").val()).length==10 )){
		$("#p205").show();
		$('#signbtn21').attr('disabled', 'disabled');
		return false;
	}else{
		$("#p205").hide();
		$('#signbtn21').removeAttr('disabled');
		return true;
	}
}





function form211(){
	
	console.log("form Submitted")

	console.log($('#uname11').val() );
	console.log($("#email11").val());
	console.log($("#psw11").val());
	console.log($("#psw-repeat11").val());
	console.log($("#mob11").val());
	console.log(nameFilter());	
	var name2=nameFilter();
	var email2=emailFilter();
	var pass=passwordCheck();
	var pass1=passwordReCheck();
	var mob2=mobileCheck();
	
	console.log("name2 "+ name2)
	console.log("email2 "+ email2)
	console.log("pass "+ pass)
	console.log("pass1 "+ pass1)
	console.log("mob2 "+ mob2)	
}



$("#cpa-form").submit(function(event) {
	
	
	    // stop the form from submitting the normal way and refreshing the page
	event.preventDefault();
	
	var name2=nameFilter();
	var email2=emailFilter();
	var pass=passwordCheck();
	var pass1=passwordReCheck();
	var mob2=mobileCheck();
	if(name2 && email2 && pass && pass1 && mob2)  {

    // get the form data
    // there are many ways to get this data using jQuery (you can use the class or id also)
    var formData = {
        'userName'              : $('#uname11').val(),
        'userEmail'             : $("#email11").val(),
        'password'    			: $("#psw11").val(),
        'passwordRecheck'		: $("#psw-repeat11").val(),
        'moblieNo'				: $("#mob11").val()
    };

    // process the form
    $.ajax({
        type        : 'POST', // define the type of HTTP verb we want to use (POST for our form)
        url         : 'http://localhost:8080/pal/user/addUser'+formData , // the url where we want to POST
        data        : formData, // our data object
        dataType    : 'json', // what type of data do we expect back from the server
                    encode          : true
    })
        // using the done promise callback
        .success(function(data) {

            // log data to the console so we can see
            console.log(data); 

            // here we will handle errors and validation messages
        });
   /* .error(function(data){
    	console.log(data)
    });*/
	}else{
		event.preventDefault();
	}
	
});




function cancel212(){
	history.back();
}
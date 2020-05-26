
function pass104(){
	
	if(($("#password").val()).length==0){
		$("#p103").hide();
		$('#p102').attr('disabled', 'disabled');
		return false;
	}
	
	else if(($("#password").val()).length>=3){
		
		
			$("#p103").hide();
			$('#p102').removeAttr('disabled');
			return true;
			
		}
		else{
			$("#p103").show();
			$('#p102').attr('disabled', 'disabled');
			return false
			}
}


function userId(){
	
	
	
	$("p101").hide();
	emailFilter2=/^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	emailFilter1 = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,6})+$/;
	//email-
	
	if(($("#uname").val()).length==0){
		$("#p101").hide();
		$('#p102').attr('disabled', 'disabled');
		return false;
	}
	
	else if(((emailFilter1).test($("#uname").val()) && (emailFilter2).test($("#uname").val()))){
		$("#p101").hide();
		$('#p102').removeAttr('disabled');
		return true
	}
	else{
			$("#p101").show();
			$('#p102').attr('disabled', 'disabled');
			return false;
		}	
}
	
	
	function togglePass(){
		  const password = document.getElementById('password');
		  if (password.type === 'password') {
		    password.type = 'text';
		  } else {
		    password.type = 'password';
		  }
		};
	



//$(function() {
//	$('#form101').bind('submit', function() {
////		 event.preventDefault();
//		uname1= $("#uname").val();
//		password=$("#password").val();
//		console.log(uname1+" "+password);
//		$.ajax({
//	        type        : 'POST', // define the type of HTTP verb we want to use (POST for our form)
//	        url         : 'http://localhost:8080/pal/LoginUser', // the url where we want to POST
//	        data        : "uname="+uname1+"&password="+password , // our data object
//	        dataType    : 'json', // what type of data do we expect back from the server
//	        contentType : "application/json; charset=utf-8",
////	        encode      : true,
//	        cache		: false,
//	        success : function(data) {
//	        	
//	        	console.log("User Logged in Successfully");
//	            
//	        },
//	        error : function(request, status, error) {
//	        	if(status==400){
//	        		setTimeout(() => {
//						$("#p104").show();
//					}, 5000);
//	        	}
//	        }
//	    })	
//		
//	})
//	
//	})

function cancel112(){
	history.back();
}

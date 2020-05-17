
function pass104(){
	
	if(($("#password").val()).length>=8){
		
			$("#p103").hide();
			$('#p102').removeAttr('disabled');
			return true;
			
		}
		else{
			$("#p103").show();
			$('#p102').attr('disabled', 'disabled');
			}
}

function cancel112(){
	history.back();
}

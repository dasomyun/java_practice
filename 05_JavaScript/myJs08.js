/**
 * 
 */		
	//유효성검사	
	function checkForm(createForm) {
		// 이름
		if(createForm.irum.value=="") {
			window.alert("이름을 입력하세요");
			createForm.irum.focus();
			return false;
		}
		// 사이트
		if(createForm.siteUrl.value==""){
			alert("이동할 사이트를 선택하세요");
			createForm.siteUrl.focus();
			return false;
		}
		// 과일
		var test = false;
		for(var i=0; i<createForm.fruit.length; i++) {
			if(createForm.fruit[i].checked == true) {
				test = true;
			}
		}
		if(test == false) {
			window.alert("좋아하는 과일을 반드시 선택하세요");
			createForm.fruit[0].focus();
			return false;
		}
		//관심사
		var count = 0;
		var str = "";
		for(var i=0; i<createForm.interest.length; i++){
			if(createForm.interest[i].checked==true) {
				str += createForm.interest[i].value + "," ; 	// 경제,IT,미술
				++count;
			}
		}
	//	alert(str);
		createForm.realValue.value=str;
		
		if(count==0){
			alert("관심사를 하나 이상 선택하세요");
			createForm.interest[0].focus();
			return false;
		}
	}	
	
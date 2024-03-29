let index = {
		init:function(){
			$("#btn-save").on("click", ()=>{
				this.save();
			});
		},
		
		save: function(){
			//alert('user의 save 함수 호출됨');
			let data = {
				username : $("#username").val(),
				password : $("#password").val(),
				email : $("#email").val()
			};
			//console.log(data);
			
			$.ajax({
				type: "POST",
				url: "/blog/api/user",
				data: JSON.stringify(data),
				contentType: "application/json;charset=utf-8", 
				dataType: "json"
			}).done(function(resp){
				alert("회원가입이 완료되었습니다.");
				//console.log(resp);
				location.href="/blog";
			}).fail(function(){
				JSON.stringify(error);
			});
		}
}

index.init();


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background: #f8f8f8;
        padding: 60px 0;
    }
    
    #login-form > div {
        margin: 15px 0;
    }

</style>

<div class="container">
    <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-success">
            <div class="panel-heading">
                <div class="panel-title">환영합니다!</div>
            </div>
            <div class="panel-body">
                <form id="login-form">
                    <div>
                        <input type="text" class="form-control" id="username" placeholder="Id" autofocus required="required">
                    </div>
                    <div>
                        <input type="password" class="form-control" id="password" placeholder="Password" required="required">
                    </div>
                    <div>
                    	<input type="button" value="로그인" class="btn btn-primary" onclick="doLogin();">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
	function doLogin(){
		var id = $("#username").val();
		var pass = $("#password").val();
		
		console.log(id + ' / ' + pass);
		if(id == 'cksl0108' && pass == '0108'){
			location.href = '/';
		}else{
			alert("아이디 혹은 비밀번호가 맞지 않습니다.");
		}
	}
</script>
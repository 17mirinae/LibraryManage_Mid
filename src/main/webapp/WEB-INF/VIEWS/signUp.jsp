<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<hr>

	<div class="container text-center">
		<div>
			<h3>회원가입</h3>
			<hr>
			<form th:action="@{/signUpProcess}" method="POST"
				style="max-width: 800px; margin: 0 auto;" th:object="${user}">
				<div class="m-3">
					<div class="form-group row">
						<label class="col-form-label col-4">이메일</label>
						<div class="col-8">
							<input type="email" class="form-control" th:field="*{userEmail}"
								required />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-form-label col-4">비밀번호</label>
						<div class="col-8">
							<input type="password" class="form-control" th:field="*{userPwd}"
								required />
						</div>
					</div>
					<div class="form-group row">
						<label class="col-form-label col-4">이름</label>
						<div class="col-8">
							<input type="text" class="form-control" th:field="*{userName}"
								required />
						</div>
					</div>

					<div>
						<button type="submit" class="btn btn-primary">가입</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>
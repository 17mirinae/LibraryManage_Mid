<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>MINGW's Library</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" type="text/css" />
<!-- Google fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />
</head>

<body>

	<!-- Responsive navbar-->
	<nav class="navbar navbar-expand-lg bg-light static-top ">
		<div class="container px-5">
			<a class="navbar-brand" href="/">MINGW's Library</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<!--                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Home</a></li>-->
					<li class="nav-item"><a class="nav-link"
						href="/user_register">Register</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/user_login">Login</a></li>
					<li class="nav-item"><a class="nav-link" href="#user_myPage">MyPage</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Navigation-->
	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<div class="container">
			<a class="btn" style="background-color: #e3f2fd; color: dodgerblue;"
				href="#library_unifiedSearch">자료 검색</a> <a class="btn"
				style="background-color: #e3f2fd; color: dodgerblue;"
				href="#library_register">신청 / 참여</a> <a class="btn"
				style="background-color: #e3f2fd; color: dodgerblue;"
				href="#library_use">도서관 이용</a> <a class="btn"
				style="background-color: #e3f2fd; color: dodgerblue;"
				href="#library_info">도서관 정보</a>
		</div>
	</nav>



	<!--    검색 파트-->
	<!-- Masthead-->
	<header class="masthead">
		<div class="container position-relative">
			<div class="row justify-content-center">
				<div class="col-xl-6">
					<div class="text-center text-white">
						<!-- Page heading-->
						<h1 class="mb-5">Welcome to MinGW's Library</h1>
						<!-- Signup form-->
						<form>
							<div class="input-group input-group-lg">
								<input class="form-control" type="text"
									placeholder="제목을 입력해주세요..." aria-label="Enter Book Title..."
									aria-describedby="button-submit" />
								<button class="btn btn-primary" id="button-submit" type="button"
									onclick="location.href='#bookSearch' ">검색</button>
								<button class="btn btn-primary" id="button-detail-submit"
									type="button" onclick="location.href='#bookDetailSearch' ">상세
									검색</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- !!!!!!!!!!!!!!!!!!!!   자유게시판  !!!!!!!!!!!!!!!!!!!!-->
	<!-- Page Content-->
	<div class="container px-4 px-lg-5">
		<!-- Call to Action-->
		<div class="card text-white bg-primary my-5 py-10 text-center">
			<div class="card-body">
				<!--                    <p class="text-white m-0">자유 게시판</p>-->
				<a href="#freeBoard" class="btn btn-primary btn-lg">자유 게시판</a>
			</div>
		</div>
		<!-- Content Row-->
		<div class="row gx-4 gx-lg-5">
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card One</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Rem magni quas ex numquam, maxime minus quam
							molestias corporis quod, ea minima accusamus.</p>
					</div>
					<div class="card-footer">
						<a class="btn btn-primary btn-sm" href="#!">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card Two</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt
							pariatur voluptatem sunt quam eaque, vel, non in id dolore
							voluptates quos eligendi labore.</p>
					</div>
					<div class="card-footer">
						<a class="btn btn-primary btn-sm" href="#!">More Info</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card Three</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Rem magni quas ex numquam, maxime minus quam
							molestias corporis quod, ea minima accusamus.</p>
					</div>
					<div class="card-footer">
						<a class="btn btn-primary btn-sm" href="#!">More Info</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--    사서 추천 도서 / 신간 도서 / 컬렉션 모음집 섹션 -->
	<section class="bg-light py-5 border-bottom">
		<div class="container px-4 px-lg-5">
			<div class="card text-center">
				<div class="card-header">
					<ul class="nav nav-tabs card-header-tabs" id="tabs">
						<li class="nav-item"><a class="nav-link active"
							href="#librarianNominate" data-toggle="tab">사서 추천 도서</a></li>
						<li class="nav-item"><a class="nav-link" href="#newBook"
							data-toggle="tab">신간 도서</a></li>
						<li class="nav-item"><a class="nav-link" href="#collection"
							data-toggle="tab">컬렉션</a></li>
					</ul>
				</div>
				<div class="card-body">
					<div class="tab-content">
						<div class="tab-pane active" id="librarianNominate">
							<!--                        사서 추천 도서-->
							<div class="card-group">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-1.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">사서 추천 대충 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											content is a little bit longer.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-1.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">사서 추천 대충 Card title</h5>
										<p class="card-text">This card has supporting text below
											as a natural lead-in to additional content.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-1.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">사서 추천 대충 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											card has even longer content than the first to show that
											equal height action.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
							</div>
							<div class="card text-white bg-primary my-5 py-10 text-center">
								<div class="card-body">
									<a href="#libralianFreeBoard" class="btn btn-primary btn-lg">사서
										추천 도서 게시판</a>
								</div>
							</div>
						</div>
						<div class="tab-pane" id="newBook">
							<!--                        신간 도서-->
							<div class="card-group">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-2.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">신간 도서 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											content is a little bit longer.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-2.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">신간 도서 Card title</h5>
										<p class="card-text">This card has supporting text below
											as a natural lead-in to additional content.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-2.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">신간 도서 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											card has even longer content than the first to show that
											equal height action.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
							</div>
							<div class="card text-white bg-primary my-5 py-10 text-center">
								<div class="card-body">
									<a href="#newBookFreeBoard" class="btn btn-primary btn-lg">신간
										도서 게시판</a>
								</div>
							</div>
						</div>
						<div class="tab-pane" id="collection">
							<!--                        컬렉션컬렉션컬렉션컬렉션-->
							<div class="card-group">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-3.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">컬렉션 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											content is a little bit longer.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-3.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">컬렉션 Card title</h5>
										<p class="card-text">This card has supporting text below
											as a natural lead-in to additional content.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="assets/img/testimonials-3.jpg"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">컬렉션 Card title</h5>
										<p class="card-text">This is a wider card with supporting
											text below as a natural lead-in to additional content. This
											card has even longer content than the first to show that
											equal height action.</p>
										<a href="#" class="btn btn-primary">Go somewhere</a>
									</div>
									<div class="card-footer">
										<small class="text-muted">Last updated 3 mins ago</small>
									</div>
								</div>
							</div>
							<div class="card text-white bg-primary my-5 py-10 text-center">
								<div class="card-body">
									<a href="#collectionFreeBoard" class="btn btn-primary btn-lg">컬렉션
										게시판</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<section class="py-5 border-bottom">
		<div class="container px-5 my-5">


			<!--
            <div class="text-center mb-5">
                <h2 class="fw-bolder">Pay as you grow</h2>
                <p class="lead mb-0">With our no hassle pricing plans</p>
            </div>
-->


			<div class="row gx-5 justify-content-center">
				<!-- Pricing card free-->
				<div class="col-lg-6 col-xl-6">
					<div class="card mb-5 mb-xl-0">
						<div class="card-body p-10">

							<div class="mb-3">
								<span class="display-4 fw-bold"> <i
									class="bi bi-star-fill text-warning"></i> 공지 사항
								</span>

							</div>
							<ul class="list-unstyled mb-4">
								<li class="mb-2"><i class="bi bi-check text-primary"></i> <strong>1
										users</strong></li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									5GB storage</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Unlimited public projects</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Community access</li>
								<li class="mb-2 text-muted"><i class="bi bi-x"></i>
									Unlimited private projects</li>
								<li class="mb-2 text-muted"><i class="bi bi-x"></i>
									Dedicated support</li>
								<li class="mb-2 text-muted"><i class="bi bi-x"></i> Free
									linked domain</li>
								<li class="text-muted"><i class="bi bi-x"></i> Monthly
									status reports</li>
							</ul>
							<div class="d-grid">
								<a class="btn btn-outline-primary" href="#!">Choose plan</a>
							</div>
						</div>
					</div>
				</div>
				<!-- Pricing card pro-->
				<div class="col-lg-6 col-xl-6">
					<div class="card mb-5 mb-xl-0">
						<div class="card-body p-10">
							<div class="mb-3">
								<span class="display-4 fw-bold"> <i
									class="bi bi-star-fill text-warning"></i> 발간 자료
								</span>
							</div>
							<ul class="list-unstyled mb-4">
								<li class="mb-2"><i class="bi bi-check text-primary"></i> <strong>
										<a class="bi text-primary" href="#!"> 이제 대충 여따가 링크 박는 것 처럼
											제목 뙇! </a>
								</strong></li>
								<li class="mb-2"><i class="text-primary"></i> 체크 없애는 거 테스트
								</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Unlimited public projects</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Community access</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Unlimited private projects</li>
								<li class="mb-2"><i class="bi bi-check text-primary"></i>
									Dedicated support</li>
								<li class="mb-2"><a class="text-primary" href="#!"> 체크
										없이 링크 </a></li>
								<li class="text-muted"><i class="bi bi-x"></i> Monthly
									status reports</li>
							</ul>
							<div class="d-grid">
								<a class="btn btn-outline-primary" href="#!">Choose plan</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Icons Grid-->
	<section class="features-icons bg-light text-center">
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					<div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
						<div class="features-icons-icon d-flex">
							<i class="bi-window m-auto text-primary"></i>
						</div>
						<h3>Fully Responsive</h3>
						<p class="lead mb-0">This theme will look great on any device,
							no matter the size!</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
						<div class="features-icons-icon d-flex">
							<i class="bi-layers m-auto text-primary"></i>
						</div>
						<h3>Bootstrap 5 Ready</h3>
						<p class="lead mb-0">Featuring the latest build of the new
							Bootstrap 5 framework!</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="features-icons-item mx-auto mb-0 mb-lg-3">
						<div class="features-icons-icon d-flex">
							<i class="bi-terminal m-auto text-primary"></i>
						</div>
						<h3>Easy to Use</h3>
						<p class="lead mb-0">Ready to use with your own content, or
							customize the source files!</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Image Showcases-->
	<section class="showcase">
		<div class="container-fluid p-0">
			<div class="row g-0">
				<div class="col-lg-6 order-lg-2 text-white showcase-img"
					style="background-image: url('assets/img/bg-showcase-1.jpg')"></div>
				<div class="col-lg-6 order-lg-1 my-auto showcase-text">
					<h2>Fully Responsive Design</h2>
					<p class="lead mb-0">When you use a theme created by Start
						Bootstrap, you know that the theme will look great on any device,
						whether it's a phone, tablet, or desktop the page will behave
						responsively!</p>
				</div>
			</div>
			<div class="row g-0">
				<div class="col-lg-6 text-white showcase-img"
					style="background-image: url('assets/img/bg-showcase-2.jpg')"></div>
				<div class="col-lg-6 my-auto showcase-text">
					<h2>Updated For Bootstrap 5</h2>
					<p class="lead mb-0">Newly improved, and full of great utility
						classes, Bootstrap 5 is leading the way in mobile responsive web
						development! All of the themes on Start Bootstrap are now using
						Bootstrap 5!</p>
				</div>
			</div>
			<div class="row g-0">
				<div class="col-lg-6 order-lg-2 text-white showcase-img"
					style="background-image: url('assets/img/bg-showcase-3.jpg')"></div>
				<div class="col-lg-6 order-lg-1 my-auto showcase-text">
					<h2>Easy to Use & Customize</h2>
					<p class="lead mb-0">Landing Page is just HTML and CSS with a
						splash of SCSS for users who demand some deeper customization
						options. Out of the box, just add your content and images, and
						your new landing page will be ready to go!</p>
				</div>
			</div>
		</div>
	</section>
	<!-- Testimonials-->
	<section class="testimonials text-center bg-light">
		<div class="container">
			<h2 class="mb-5">What people are saying...</h2>
			<div class="row">
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="assets/img/testimonials-1.jpg" alt="..." />
						<h5>Margaret E.</h5>
						<p class="font-weight-light mb-0">"This is fantastic! Thanks
							so much guys!"</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="assets/img/testimonials-2.jpg" alt="..." />
						<h5>Fred S.</h5>
						<p class="font-weight-light mb-0">"Bootstrap is amazing. I've
							been using it to create lots of super nice landing pages."</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="testimonial-item mx-auto mb-5 mb-lg-0">
						<img class="img-fluid rounded-circle mb-3"
							src="assets/img/testimonials-3.jpg" alt="..." />
						<h5>Sarah W.</h5>
						<p class="font-weight-light mb-0">"Thanks so much for making
							these free resources available to us!"</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Call to Action-->
	<section class="call-to-action text-white text-center" id="signup">
		<div class="container position-relative">
			<div class="row justify-content-center">
				<div class="col-xl-6">
					<h2 class="mb-4">Ready to get started? Sign up now!</h2>
					<!-- Signup form-->
					<form>
						<div class="input-group input-group-lg">
							<input class="form-control" type="text"
								placeholder="Enter your email..."
								aria-label="Enter your email..."
								aria-describedby="button-submit" />
							<button class="btn btn-primary" id="button-submit" type="button">Sign
								up!</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<footer class="footer bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 h-100 text-center text-lg-start my-auto">
					<ul class="list-inline mb-2">
						<li class="list-inline-item"><a href="#!">About</a></li>
						<li class="list-inline-item">⋅</li>
						<li class="list-inline-item"><a href="#!">Contact</a></li>
						<li class="list-inline-item">⋅</li>
						<li class="list-inline-item"><a href="#!">Terms of Use</a></li>
						<li class="list-inline-item">⋅</li>
						<li class="list-inline-item"><a href="#!">Privacy Policy</a></li>
					</ul>
					<p class="text-muted small mb-4 mb-lg-0">&copy; Your Website
						2021. All Rights Reserved.</p>
				</div>
				<div class="col-lg-6 h-100 text-center text-lg-end my-auto">
					<ul class="list-inline mb-0">
						<li class="list-inline-item me-4"><a href="#!"><i
								class="bi-facebook fs-3"></i></a></li>
						<li class="list-inline-item me-4"><a href="#!"><i
								class="bi-twitter fs-3"></i></a></li>
						<li class="list-inline-item"><a href="#!"><i
								class="bi-instagram fs-3"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script type="text/javascript" src="js/scripts.js"></script>
	<!--    사용자 정의 추가용-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha/js/bootstrap.min.js"></script>
	<!--    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha/css/bootstrap.min.css" rel="stylesheet" />-->

	<!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
</body>

</html>
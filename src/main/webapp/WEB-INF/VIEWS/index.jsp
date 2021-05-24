<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/css/main_header.css" />
<title>도서관</title>
<style>
body {
	width: 1000px;
	margin: 0 auto;
	display: block;
}

#content {
	width: 1000px;
	margin: 0 auto;
	display: block;
}

#content>section {
	width: 1000px;
	height: 200px;
	display: block;
	margin: 0 auto;
}

#content>section>ul {
	width: 1000px;
	overflow: hidden;
}

#content>section>ul>li {
	list-style: none;
	float: left;
	display: block;
	padding: 10px 20px;
	border: 1px solid black;
}
</style>
</head>
<body>
	<header>
		<nav id="left_navi">
			<ul>
				<li><a href="/">도서관</a></li>
			</ul>
		</nav>
		<!-- if (session.getAttribute() != null)
			<a href="/signIn">로그인</a>
		else
			<a href="/signOut">로그아웃</a> -->
		<nav id="right_navi">
			<ul>
				<li><a href="/signIn">로그인</a></li>
				<li><a href="/signUp">회원가입</a></li>
				<li><a href="/userPage">내 서재</a></li>
			</ul>
		</nav>
	</header>
	<div id="content">
		<section id="choice_sec">
			<ul>
				<li>자료 검색</li>
				<li>신청 / 참여</li>
				<li>도서관 이용</li>
				<li>도서관 정보</li>
			</ul>
		</section>

		<section id="search_sec">
			<ul>
				<li><input type="text" /></li>
				<li><input type="submit" value="검색" /></li>
				<li><input type="button" value="상세" /></li>
			</ul>
		</section>

		<section id="board_sec">
			<h1>자유(후기) 게시판</h1>
		</section>
		<section id="book_sec">
			<h1>book_sec</h1>
		</section>
		<section id="notice_sec">
			<h1>notice_sec</h1>
		</section>
	</div>
	<footer>
		<a href="/site_map">사이트맵</a>
	</footer>
</body>
</html>
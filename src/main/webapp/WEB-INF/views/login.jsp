<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/nav.jsp"%>
<div class="container col-md-4">
	<form action="#" class="bg-light p-5 contact-form">
		<h3>로그인</h3>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="ID">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="PASSWORD">
		</div>
		<div class="form-group form-check">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox"> 아이디 기억하기
			</label> <a class="float-right" href="/">비밀번호 찾기</a>
		</div>
		<br />
		<div class="form-group">
			<input type="submit" value="로그인"
				class="btn btn-outline-primary col-12 py-3 px-5">
		</div>
		<input value="회원가입" class="btn btn-outline-warning col-12 py-3 px-5">
	</form>
</div>
<br />
<br />
<%@ include file="../include/footer.jsp"%>
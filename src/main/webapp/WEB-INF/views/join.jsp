<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/nav.jsp"%>
<div class="container col-md-6">
	<form action="#" class="bg-light p-5 contact-form">
		<h3>로그인</h3>
		<div class="form-group ">
			<div class="input-group ">
				<input type="text" class="form-control" placeholder="이메일 입력">
				<div class="input-group-append">
					<button onclick="useridCheck()" type="button"
						class="btn btn-primary float-right">중복확인</button>
				</div>
			</div>
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="이름">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="비밀번호">
		</div>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="비밀번호 확인">
		</div>

		<div class="form-group">
			<input type="number" class="form-control"
				placeholder="핸드폰번호 - 제외하여 입력하세요." name="tel" required="required">
		</div>
		<div class="form-group">
			<label for="type">구분</label> <select id="type" size="1"
				class="form-control" name="type">
				<option>세입자</option>
				<option>방 주인</option>
				<option>공인중개사</option>
			</select>
		</div>
		<div id="new"></div>
		<br />
		<div class="form-group">
			<input type="submit" value="회원가입"
				class="btn btn-outline-warning col-12 py-3 px-5">
		</div>
	</form>
</div>
<br />
<br />
<script src="js/jquery.min.js"></script>
<script src="js/jquery-migrate-3.0.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/jquery.animateNumber.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>

<script>
	$('select#type').change(function(e) {
		var type = e.target.value;

		if (type == '공인중개사') {
			alert('공인중개사 자격증을 업로드 해주세요.');
			var item = "<input type='file' class='form-control' id='file'>";
			$('#new').after(item);
		} else {
			$('#file').remove();
		}
	});
</script>



<%@ include file="../include/footer.jsp"%>
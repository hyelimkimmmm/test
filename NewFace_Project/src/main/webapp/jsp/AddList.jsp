<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/Addlist.css" type="text/css">
<script src="./resources/js/jquery-3.3.1.js"></script>
<script src="./resources/js/Addlist.js"></script>
<title>회원추가정보</title>
</head>
<body>
	<form id="wrap" action="./Add_List_ok.nf" method="post"
		onsubmit="return check2()" enctype="multipart/form-data">
		
		<div class="main">
			<h2 class="text1">회원추가정보등록</h2>
			<hr class="line">

			<div class="img_pro">
				<%-- 	<c:set var ="c" items="${prof_img}"> --%>
				<div class="pro_1">image</div>
				<div class="pro_2">image</div>
				<div class="pro_3">image</div>
				<div class="pro_4">image</div>
				<%-- </c:set> --%>
			</div>

			<div class="btn">
				<input type="file" id="btn_file1" name="btn_file1" onclick="uploadfile();">
				<input type="file" id="btn_file2" name="btn_file2" onclick="uploadfile();">
				<input type="file" id="btn_file3" name="btn_file3" onclick="uploadfile();">
				<input type="file" id="btn_file4" name="btn_file4" onclick="uploadfile();">
			</div>
			<div class="location_total">
				<div class="location1">
					<h3 class="text2">지역선택</h3>
						<select onchange="si(this)" style="margin-top:24px; margin-left:20px; float:left; width:181px; height:30px;" class="si2">
							<option value="0">지역을 선택하세요</option>
							<option value="a">강원도</option>
							<option value="b">경기도</option>
							<option value="c">경상북도</option>
							<option value="d">경상남도</option>
							<option value="e">광주광역시</option>
							<option value="f">대구광역시</option>
							<option value="g">대전광역시</option>
							<option value="h">부산광역시</option>
							<option value="i">서울특별시</option>
							<option value="j">세종특별자치시</option>
							<option value="k">울산광역시</option>
							<option value="l">인천광역시</option>
							<option value="n">전라북도</option>
							<option value="m">전라남도</option>
							<option value="o">제주특별자치시</option>
							<option value="p">충청남도</option>
							<option value="q">충청북도</option>
						</select>
						</div>
				<div class="location2">
					<select id="sigungu" style="margin-top:24px; margin-left:20px; width:181px; height:30px;">
						<option>시/군/구를 선택하세요</option>
					</select>
				</div>
			</div>


			<div class="hobby"id="hobby"  >
				<h3 class="text3">관심사 선택</h3>
					<input type="checkbox" class="check1" value="sport">스포츠 <input
						type="checkbox" class="check1" value="movie">영화 <input
						type="checkbox" class="check1" value="cook">요리 <input
						type="checkbox" class="check1" value="musical">뮤지컬 <input
						type="checkbox" class="check1" value="music">음악 <input
						type="checkbox" class="check1" value="trip">여행 <input
						type="checkbox" class="check1" value="beauty">뷰티 <input
						type="checkbox" class="check1" value="game">게임 <input
						type="checkbox" class="check1" value="book">독서 <input
						type="checkbox" class="check1" value="intro">자기계발 <br>
			</div>

			<div class="friend_matching" id="friend_matching">
				<h3 class="text4">친구매칭여부</h3>
				<input type="radio" id="gender_yes" name="gender_yes" checked><span>YES</span>
				<input type="radio" id="gender_no" name="gender_no"><span>NO</span>
				<span id="genderHelper"></span>

				

			</div>

			<div class="introduce">
				<h3 class="text5">자기소개</h3>
				<textarea name="intro" id="intro" rows="7" cols="30"
					class="input_box">자기 소개를 입력하세요.</textarea>

			</div>

			<div class="Add_menu">
				<input type="submit" value="등록하기" class="input_button">
				<input type="reset" value="취소하기" class="input_button" onclick="$('#btn_file').focus();">
			</div>
		</div>
		<!-- main end -->
	</form>
</body>
</html>
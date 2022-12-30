<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/login.css">
    <script src="./js/jquery-3.6.1.js"></script>
</head>
<body>
    <div id="login_page" class="login_page">
        <header class="login_header">
            <div class="header_inner">
                <a href="./main" class="logo">
                    <span class="logo_hidden">로고</span>
                </a>
            </div>
        </header>
        <!-- id,pwd 입력부분 로그인 버튼까지 포함 naver container-->
        <div class="login_container">
            <div class="login_wrap">
                <h3 class="login_text">LOGIN</h3>
                <form id="" action="./login.do" method="post">
                    <div class="input_row">
                        <input type="text" id="id" name="id" placeholder="아이디" class="input_text">
                    </div>
                    <div class="input_row">
                         <input type="password" id="pwd" name="pwd" placeholder="비밀번호" class="input_text">
                    </div>
                    <div class="save_id_wrap"> <!--login_keep_wrap-->
                        <div class="save_id">
                            <input type="checkbox" id="save" name="save" class="saveid">
                            <label for="save" class="save_text">아이디 저장</label>
                        </div>
                    </div>
                    <!-- 오류창부분 나타내는 코드 -->
                    <!-- <div class="login_error_wrap" id="err_capslock" style="display: none;">
                        <div class="error_message">
                            <strong>CapsLock</strong>
                            이 켜져 있습니다.
                        </div>
                    </div>
                    <div class="login_error_wrap" id="err_empty_id" style="display: none;">
                        <div class="error_message">
                            <strong>아이디</strong>
                            를 입력해 주세요.
                        </div>
                    </div>
                    <div class="login_error_wrap" id="err_empty_pwd" style="display: none;">
                        <div class="error_message">
                            <strong>비밀번호</strong>
                            를 입력해 주세요.
                        </div>
                    </div> -->
                    <div class="btn_login_wrap">
                        <button type="submit" class="btn_login">
                            <span class="btn_text">로그인</span>
                        </button>
                        <button type="button" class="btn_join" onclick="location.href='${pageContext.request.contextPath }/join';"> 
                            <span class="btn_text">회원가입</span>
                        </button>
                        <!-- <button type="button" class="btn_join">
                            <a href="./join.jsp"class="btn_text">회원가입</a>
                        </button> -->
                    </div>
                </form>
            </div>
        </div>
        <div class="side_image"></div>
    </div>
</body>
</html>
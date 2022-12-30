<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
        <div class="header_wrap">
            <!-- 헤더바 부분 -->
            <div class="header_bar">
                <div class="bar">
                    <div class="bar_inner">
                        <!-- 시간 되면 오른쪽 스크롤 홈 버튼 작성 -->
                        <div class="bar_right">
                            <ul class="bar_item">
                                <!-- 로그인전 join login 보임 로그인 후 logout my alarm like mypage 보임 -->
                            <c:choose>
                            	<c:when test="${empty member}">
                            	<li class="bar_link">
                                    <a class="link_text" href="${pageContext.request.contextPath }/login">LOGIN</a>
                                </li>
                                <li class="bar_link">
                                    <a class="link_text" href="${pageContext.request.contextPath }/join">JOIN US</a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_my" href="${pageContext.request.contextPath }/login"></a>
                                </li>
                            	</c:when>
                            	<c:otherwise>      	
                            	<li class="bar_link">
                                    <a class="link_text" href="${pageContext.request.contextPath }/logout">LOGOUT</a>
                                </li>
                            	<li class="bar_link">
                                    <a class="link_text">MY PAGE</a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_like"></a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_alarm"></a>
                                </li>
                                 <li class="bar_icon">
                                    <a class="link_my"></a>
                                </li>
                                <li class="bar_link">
                            		<span class="span_text">${member.name}</span>
                            	</li>
                            	</c:otherwise> 
                            </c:choose>	  
                                <!-- <li class="bar_link">
                                    <a class="link_text" href="">LOGIN</a>
                                </li>
                                <li class="bar_link">
                                    <a class="link_text">JOIN US</a>
                                </li>
                                <li class="bar_link">
                                    <a class="link_text">MY PAGE</a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_like"></a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_alarm"></a>
                                </li>
                                <li class="bar_icon">
                                    <a class="link_my"></a>
                                </li> -->
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 헤더 로고 부분 -->
            <div class="header_logo">
                <div class="main_logo_inner">
                    <div class="logo_wrap">
                        <a href="" class="logo_link">
                            <span class="logo_img">로고이미지</span>
                        </a>
                    </div>
                    <!-- 검색창 수정해야함--> 
                    <div class="search_box_wrap">
                        <form id="search_form" action="" method="get">
                            <fieldset class="search_box" >
                                <legend>검색</legend>
                                <input  type="text" id="keyword" name="keyword" placeholder="검색어를 입력해주세요">
                                <a  href="#none" onclick="SEARCH_BANNER.submitSearchBanner(this); return false" class="search_box_btn">
                                <!-- <span class="search_img">검색이미지</span> -->
                                </a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- 카테고리바 영역 -->
        <div class="category_bar">  
            <div class="category_wrap">
                <div class="category_inner">
                    <div class="category_icon">
                        <div class="category_btn">
                            <span class="btn_line btn_line_1"></span>
                            <span class="btn_line btn_line_2"></span>
                            <span class="btn_line btn_line_3"></span>
                        </div>
                        <div class="category_down">
                            <div class="all_wrap">
                                <div class="one_part">
                                    <div class="all all_project">
                                        <div class="all_icon" style="background-image: url(./img/menu.png);"></div>
                                        <div class="all_text category_text">전체</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/dice.png);"></div>
                                        <div class="category_text">보드게임 · TRPG</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/game-controller.png);"></div>
                                        <div class="category_text">디지털 게임</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style="background-image: url(./img/comic.png);"></div>
                                        <div class="category_text">웹툰 · 만화</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style="background-image: url(./img/brush.png);"></div>
                                        <div class="category_text">웹툰 리소스</div>
                                    </div>
                                </div>
                                <div class="one_part">
                                    <div class="all">
                                        <div class="all_icon" style="background-image: url(./img/notebook.png);"></div>
                                        <div class="category_text">디자인 문구</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style="background-image: url(./img/character.png);"></div>
                                        <div class="category_text">캐릭터 · 굿즈</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/living-room.png);"></div>
                                        <div class="category_text">홈 · 리빙</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/electronics.png);"></div>
                                        <div class="category_text">테크 · 가전</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon"  style=" background-image: url(./img/pet.png);"></div>
                                        <div class="category_text">반려동물</div>
                                    </div>
                                </div>
                                <div class="one_part">
                                    <div class="all">
                                        <div class="all_icon" style=" background-image: url(./img/food.png);"></div>
                                        <div class="category_text">푸드</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/cosmetics.png);"></div>
                                        <div class="category_text">향수 · 뷰티</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/fashion.png);"></div>
                                        <div class="category_text">의류</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/acessories.png);"></div>
                                        <div class="category_text">잡화</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/jewelry.png);"></div>
                                        <div class="category_text">주얼리</div>
                                    </div>
                                </div>
                                <div class="one_part">
                                    <div class="all">
                                        <div class="all_icon" style=" background-image: url(./img/publishing.png);"></div>
                                        <div class="category_text">출판</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/design.png);"></div>
                                        <div class="category_text">디자인</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/art.png);"></div>
                                        <div class="category_text">예술</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/photography.png);"></div>
                                        <div class="category_text">사진</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/music.png);"></div>
                                        <div class="category_text">음악</div>
                                    </div>
                                </div>
                               
                                <div class="one_part">
                                    <div class="all">
                                        <div class="all_icon" style=" background-image: url(./img/film.png);"></div>
                                        <div class="category_text">영화 · 비디오</div>
                                    </div>
                                    <div class="line_one">
                                        <div class="all_icon" style=" background-image: url(./img/performing.png);"></div>
                                        <div class="category_text">공연</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- 카테고리 메뉴 -->
                    <div class="category_menu">
                        <div class="menu_wrap">
                            <ul class="menu_inner">
                                <li class="inner_item">
                                    <a class="item" href="">홈</a>
                                </li>
                                <li class="inner_item">
                                    <a class="item" href="">인기</a>
                                </li>
                                <li class="inner_item">
                                    <a class="item" href="">신규</a>
                                </li>
                                <li class="inner_item">
                                    <a class="item" href="">마감임박</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
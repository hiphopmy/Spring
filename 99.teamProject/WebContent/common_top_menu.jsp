<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="hd-wrapper" style="">
	<div class="container-fluid">
		<div class="row">

			<div class="header_logo">
				<a href="https://www.wiselyshave.com/"> <svg
						xmlns="http://www.w3.org/2000/svg" id="wisely-logo-svg"
						viewBox="0 0 123 47" width="100%" height="100%">
<g>
									<path
							d="M.213 15.352h5.236l5.235 11.484 5.7-13.299 5.7 13.299 5.194-11.484h5.192L21.957 36.968l-5.573-12.96-5.657 12.96L.213 15.352zM40.875 4.923c2.027 1.688.465 5.277-2.068 5.151a3.029 3.029 0 0 1-3.041-3.041c-.127-2.532 3.42-4.053 5.109-2.11zm-4.434 10.429h4.644V35.45h-4.644V15.352zM55.652 20.84c-.59-1.224-1.351-1.858-2.238-1.858-.844 0-1.562.675-1.562 1.521 0 .675.887 1.435 2.703 2.279l1.773.845c3.336 1.562 4.434 2.998 4.434 5.657 0 1.941-.676 3.547-2.069 4.856-1.393 1.265-3.082 1.899-5.067 1.899-3.419 0-5.783-1.647-7.177-4.94l3.969-1.815c1.14 2.026 1.858 2.619 3.251 2.619 1.562 0 2.364-.719 2.364-2.154 0-.972-.591-1.731-1.815-2.322l-2.575-1.225c-3.04-1.478-4.138-2.702-4.138-5.362 0-1.731.592-3.166 1.816-4.307 1.225-1.14 2.702-1.731 4.433-1.731 2.575 0 4.476 1.309 5.742 3.969l-3.844 2.069zM84.11 26.498H69.713c.296 3.251 2.238 5.405 5.236 5.405 1.14 0 2.11-.254 2.829-.804.759-.548 1.604-1.562 2.575-3.082l3.926 2.154c-2.364 4.094-5.277 5.868-9.499 5.868-2.999 0-5.405-.972-7.22-2.914-1.815-1.941-2.702-4.517-2.702-7.684 0-3.208.887-5.785 2.617-7.726 1.772-1.943 4.138-2.914 7.052-2.914 5.952 0 9.583 4.137 9.583 10.598v1.099zm-4.77-3.8c-.634-2.491-2.196-3.716-4.688-3.716-2.236 0-4.095 1.478-4.644 3.716h9.332zM89.518.616h4.645v26.009c0 1.941.295 3.293.844 4.095.55.761 1.52 1.141 2.913 1.141l-1.267 4.18c-2.321 0-4.137-.718-5.447-2.195-1.14-1.226-1.688-3.293-1.688-6.123V.616zM101.508 46.384l7.811-14.651-9.035-16.381h5.404l6.122 11.569 5.742-11.569h5.235l-16.002 31.032h-5.277z"></path></g></svg>
					<span> 와이즐리 :: Wisely </span>
				</a>
			</div>

			<div class="seese-mainmenu hidden-xs">
				<ul id="seese-menu" class="main-navigation">
					<li id="menu-item-28"
						class="menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-18 current_page_item menu-item-28 seese-dropdown-menu"><a
						href="product_list.jsp">상품 리스트</a></li>
					<li id="menu-item-27"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-27 seese-dropdown-menu"><a
						href="https://www.wiselyshave.com/subscription/">고객문의게시판</a></li>
					<li id="menu-item-26"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-26 seese-dropdown-menu"><a
						href="https://www.wiselyshave.com/brand-story/">브랜드 스토리</a></li>
				</ul>
			</div>

			<div class="seese-topright" id="seese-topright">
				<ul>
					<li class="hidden-xs"><a
						href="https://www.wiselyshave.com/help/">고객센터</a></li>
					<li class="hidden-xs"><a
						href="member_login.jsp">로그인</a></li>
					<li><a href="https://www.wiselyshave.com/cart/"
						id="seese-cart-trigger"> <img src="./res/cart_icon.png"
							alt="장바구니" width="30" class="hidden-xs"> <img
							src="./res/cart_icon_grey.png" alt="장바구니" width="30"
							class="hidden-sm hidden-md hidden-lg">
					</a></li>
				</ul>
			</div>
			<div class="hd-bar"></div>

		</div>
	</div>

	<style>
#seese-mobilemenu .mobileSide {
	margin-left: -100%;
}
</style>

	<script>
		jQuery(document).ready(function($) {
			$("#btn-mobile-menu").click(function(e) {
				e.preventDefault();
				$("#seese-mobilemenu .lightBoxBg").show();
				$("#seese-mobilemenu .mobileSide").show();
				$("#seese-mobilemenu .mobileSide").animate({
					'margin-left' : '0'
				}, 500);
			});
			$("#btn-mobile-close").click(function(e) {
				e.preventDefault();
				$("#seese-mobilemenu .mobileSide").animate({
					'margin-left' : '-100%'
				}, 500, function() {
					$(this).hide();
					$("#seese-mobilemenu .lightBoxBg").hide();
				});
			});
			$("#seese-mobilemenu .lightBoxBg").click(function(e) {
				e.preventDefault();
				if ($(this).css("display") != "none") {
					$("#btn-mobile-close").click();
				}
			});

			// mobile navigation links
			$("#seese-mobilemenu ul li.m_store").click(function(e) {
				e.preventDefault();
				location.href = "/store/";
			});
			$("#seese-mobilemenu ul li.m_subscription").click(function(e) {
				e.preventDefault();
				location.href = "/subscription/";
			});
		});
	</script>

	<div class="container" id="seese-mobilemenu">
		<div class="slicknav_menu">
			<a id="btn-mobile-menu" aria-haspopup="true" tabindex="0"
				class="slicknav_btn slicknav_collapsed"> <span
				class="slicknav_menutxt"></span> <span
				class="slicknav_icon slicknav_no-text"> <span
					class="slicknav_icon-bar"></span> <span class="slicknav_icon-bar"></span>
					<span class="slicknav_icon-bar"></span>
			</span>
			</a>
		</div>
		<ul class="mobileSide hidden-sm hidden-md hidden-lg"
			style="display: none;">
			<a href="https://www.wiselyshave.com/store/#" id="btn-mobile-close"
				class="btn-close taphover" style="left: 22px;"></a>
			<li
				style="padding: 80px 20px 10px 20px; font-size: 20px; font-family: &amp; amp; #39;notokr-medium&amp;amp;#39;;">

				<div style="line-height: 56px;">
					<div style="margin-left: 10px;">
						<a class="taphover" href="https://www.wiselyshave.com/store/">상품
							리스트</a>
					</div>
					<div style="margin-left: 10px;">
						<a class="taphover"
							href="https://www.wiselyshave.com/subscription/">정기구매 신청</a>
					</div>
					<div style="margin-left: 10px;">
						<a class="taphover"
							href="https://www.wiselyshave.com/brand-story/">브랜드 스토리</a>
					</div>
					<div style="margin-left: 10px;">
						<a class="taphover" href="https://www.wiselyshave.com/help/">고객센터</a>
					</div>
				</div>

				<div style="height: 35px;"></div>

				<div style="line-height: 46px;">
					<div
						style="border: 1px solid #dddddd; border-radius: 3px; text-align: center;">
						<a class="taphover" href="https://www.wiselyshave.com/login/""="">로그인</a>
					</div>
				</div>
			</li>
			<style>
a.taphover:hover, a.taphover.hover {
	color: #0096ff;
}
</style>
			<!--
		<script>
		jQuery('a.taphover').on('touchstart', function (e) {
			'use strict'; //satisfy code inspectors
			var link = jQuery(this); //preselect the link
			if (link.hasClass('hover')) {
				return true;
			} else {
				link.addClass('hover');
				jQuery('a.taphover').not(this).removeClass('hover');
				e.preventDefault();
				return false;
			}
		});
		</script>
		-->

			<!--
		<li class="m_logo"><a href="https://www.wiselyshave.com/"><svg xmlns="http://www.w3.org/2000/svg" id="wisely-logo-svg" viewBox="0 0 123 47" id="logo" width="100%" height="100%">
<g><path d="M.213 15.352h5.236l5.235 11.484 5.7-13.299 5.7 13.299 5.194-11.484h5.192L21.957 36.968l-5.573-12.96-5.657 12.96L.213 15.352zM40.875 4.923c2.027 1.688.465 5.277-2.068 5.151a3.029 3.029 0 0 1-3.041-3.041c-.127-2.532 3.42-4.053 5.109-2.11zm-4.434 10.429h4.644V35.45h-4.644V15.352zM55.652 20.84c-.59-1.224-1.351-1.858-2.238-1.858-.844 0-1.562.675-1.562 1.521 0 .675.887 1.435 2.703 2.279l1.773.845c3.336 1.562 4.434 2.998 4.434 5.657 0 1.941-.676 3.547-2.069 4.856-1.393 1.265-3.082 1.899-5.067 1.899-3.419 0-5.783-1.647-7.177-4.94l3.969-1.815c1.14 2.026 1.858 2.619 3.251 2.619 1.562 0 2.364-.719 2.364-2.154 0-.972-.591-1.731-1.815-2.322l-2.575-1.225c-3.04-1.478-4.138-2.702-4.138-5.362 0-1.731.592-3.166 1.816-4.307 1.225-1.14 2.702-1.731 4.433-1.731 2.575 0 4.476 1.309 5.742 3.969l-3.844 2.069zM84.11 26.498H69.713c.296 3.251 2.238 5.405 5.236 5.405 1.14 0 2.11-.254 2.829-.804.759-.548 1.604-1.562 2.575-3.082l3.926 2.154c-2.364 4.094-5.277 5.868-9.499 5.868-2.999 0-5.405-.972-7.22-2.914-1.815-1.941-2.702-4.517-2.702-7.684 0-3.208.887-5.785 2.617-7.726 1.772-1.943 4.138-2.914 7.052-2.914 5.952 0 9.583 4.137 9.583 10.598v1.099zm-4.77-3.8c-.634-2.491-2.196-3.716-4.688-3.716-2.236 0-4.095 1.478-4.644 3.716h9.332zM89.518.616h4.645v26.009c0 1.941.295 3.293.844 4.095.55.761 1.52 1.141 2.913 1.141l-1.267 4.18c-2.321 0-4.137-.718-5.447-2.195-1.14-1.226-1.688-3.293-1.688-6.123V.616zM101.508 46.384l7.811-14.651-9.035-16.381h5.404l6.122 11.569 5.742-11.569h5.235l-16.002 31.032h-5.277z"/></g></svg></a></li>
		<li class="m_store"><a href="/store/">스토어</a></li>
		<li class="m_subscription"><a href="/subscription/">정기구매</a></li>
		<li class="m_brandstory"><a href="/brand-story/">브랜드 스토리</a></li>
		<li class="m_help"><a href="/help/">고객센터</a></li>
		<li class="m_login" style="border-top:1px solid #dddddd; padding-top:35px;">
					<div style="border:1px solid #cccccc; margin:0px 10px 10px 10px; padding:10px; border-radius:5px;">
				<a style="border:0px !important;" href="/login/">로그인</a>
			</div>
				</li>
		-->
		</ul>
		<div class="lightBoxBg hidden-sm hidden-md hidden-lg"></div>
	</div>

</div>
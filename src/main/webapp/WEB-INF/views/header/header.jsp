<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<body>
	<%-- <div id="header_log">
		<h1><a>Free Read</a></h1>
	</div>
	<c:forEach items="${allNovelClass}" var="classes">
		<span><label>${classes.novelClassName}</label></span>
	</c:forEach> --%>

	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Free Read</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<c:forEach items="${allNovelClass}" var="classes">
						<li><a href="#">${classes.novelClassName}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</nav>
</body>
<div class="panel panel-primary">
	<div class="panel-heading">
		<h3 class="panel-title">排行榜</h3>
	</div>
	<div class="panel-body">
		<ul class="list-group">
			<c:forEach items="${leftPopularityNovels }" var="novelHeads">
				<li class="list-group-item">${novelHeads.novelName}</li>
			</c:forEach>
		</ul>
	</div>
</div>
//总页数，当前页数
var pageCount = 1;
var currentPage = 1;
var viewCount = 5;// 每页的数据行数
var cacheId = 1; // 默认第1页
var cacheSelect = "全部"; // 查询条件
var cacheContent = "";

function search() {
	pageCount = 1;
	currentPage = 1;
	cacheContent = $("#searchContent").val();
	cacheSelect = $("#selectBus").val();

	updatePageList();
}
function updatePageList() {
	var params = {};
	params.id = viewCount;
	params.str = cacheSelect;
	params.str1 = cacheContent;
	alert(viewCount);
	alert(cacheSelect);
	console.log(cacheSelect);
	console.log(cacheContent);

	PostGetJson("getBusListPageNum.do", params, dataPageNumHandle);
}

function dataPageNumHandle(data) {
	pageCount = data['pageCount'];
	getBusList(1);
}

function getBusList(id) {
	currentPage = id;
	var params = {};
	params.str = cacheSelect;
	params.str1 = cacheContent;
	params.id2 = viewCount;
	params.id3 = currentPage;
	PostGetJson("getBusList.do", params, dataAuthListHandle);
}
function dataAuthListHandle(data) {
	var map = DecodeMap(data);
	document.getElementById("showBody").innerHTML = "";
	if (data.error) {
		// alert("no result");
		return;
	}
	var html = "";
	for ( var i = 0; i < map.keyList.length; i++) {
		html += "<tr>";
		html += "	<td>" + map.valueList[i]['busNo'] + "</td>";
		html += "	<td>" + map.valueList[i]['busType'] + "</td>";
		html += "	<td>" + map.valueList[i]['capacity'] + "</td>";
		html += "	<td>" + map.valueList[i]['state'] + "</td>";
		html += "	<td>..</td>";
		html += "</tr>";
	}
	document.getElementById("showBody").innerHTML = html;
	showPage();
}
// 显示页数
function showPage() {
	var html = "";
	html = "<li><a href='javascript:void(0)' onclick='getBusList(" + 1
			+ ")'>首页</a></li>";
	if (currentPage > 1)
		html += "<li><a href='javascript:void(0)' onclick='getBusList("
				+ (currentPage - 1) + ")'>上一页</a></li>";
	else
		html += "<li><a href='javascript:void(0)' onclick='getBusList(" + 1
				+ ")'>上一页</a></li>";
	var startNum = 0;
	var endNum = 0;
	if (currentPage > 2)
		startNum = currentPage - 2;
	else
		startNum = 1;
	if (pageCount - currentPage >= 2)
		endNum = currentPage + 2;
	else
		endNum = pageCount;
	for ( var i = startNum; i <= endNum; i++) {
		if (i == currentPage)
			html += "<li class='active' onclick='getBusList(" + i
					+ ")'><a href='javascript:void(0)'>" + i + "</a></li>";
		else
			html += "<li><a href='javascript:void(0)' onclick='getBusList(" + i
					+ ")'>" + i + "</a></li>";
	}
	if (currentPage + 1 < pageCount)
		html += "<li><a href='javascript:void(0)' onclick='getBusList("
				+ (currentPage + 1) + ")'>下一页</a></li>";
	else
		html += "<li><a href='javascript:void(0)' onclick='getBusList("
				+ pageCount + ")'>下一页</a></li>";
	html += "<li><a href='javascript:void(0)' onclick='getBusList(" + pageCount
			+ ")'>尾页</a></li>";
	document.getElementById("pageShow1").innerHTML = html;
}

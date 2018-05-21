var curl = "http://localhost:8080/test8/";
function DecodeMap(data)
{
	 var keyList=new Array();
	 var valueList=new Array();
	 var length=0;
	 for(var key in data){  //得到数据data，遍历
         keyList[length]=key;
		 valueList[length]=data[key];
		 length++;
	 }
     var contentBox = {};
     contentBox.keyList=keyList;
     contentBox.valueList=valueList;
     return contentBox;
 }
function PostGetJson(url,params,handle) {
     $.ajax({
			  type: "post",
			  url: curl+url,
			  cache: false,
			  async: true,
			  dataType:"json",
			  data:JSON.stringify(params),
			  contentType: "application/json; charset=utf-8",//此处不能省略
			  success: function(data){
			  //alert("json得到的信息为：" + data);
			  handle(data);
			   //return data;
			},
			 error: function(error){
			    alert("系统异常！");
			 }
	   });
}
 function StringObjectDecode(data)//StringStringMapDecode
 {
		   return DecodeMap(data);
 }
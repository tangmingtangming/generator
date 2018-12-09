function tranformStr3(str){
    var strArr=str.split('_');
    for(var i=1;i<strArr.length;i++){
        strArr[i]=strArr[i].charAt(0).toUpperCase()+strArr[i].substring(1);
    }
    return strArr.join('');
}
var urlObj = {
    baseUrl: "/base/generator",
    tableId: "urlTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItems: {}
};
urlObj.columns = function () {
    return [{
    	field : "checked", 
        checkbox : true, 
      //直接绑定js函数 
        formatter : stateFormatter 
    }, {
        field: 'fileName',
        title: '文件名'
    }, {
        field: 'vmFile',
        title: '模板文件'
    }, {
        field: 'fileUrl',
        title: '文件路径'
    }];
};
urlObj.queryParams = function (params) {
    if (!params)
        return {
            name: $("#name").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        tableName: $("#name").val()
    };
    return temp;
};

urlObj.init = function (tableName) {
	debugger;
    urlObj.table = $('#' + urlObj.tableId).bootstrapTable({
        url: urlObj.baseUrl + '/columnpage?tableName='+tableName, //请求后台的URL（*）
        method: 'get', //请求方式（*）
        toolbar: '#' + urlObj.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: false, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: urlObj.order, //排序方式
        queryParams: urlObj.queryParams,//传递参数（*）
        sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, //初始化加载第一页，默认第一页
        pageSize: 10, //每页的记录行数（*）
        pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
        search: false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: false, //是否显示所有的列
        showRefresh: false, //是否显示刷新按钮
        minimumCountColumns: 2, //最少允许的列数
        clickToSelect: true, //是否启用点击选中行
        uniqueId: urlObj.unique, //每一行的唯一标识，一般为主键列
        showToggle: false, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: urlObj.columns(),
        height:400,
        responseHandler: function(res) {
        	
    	    tableNameB= tranformStr3(tableName);
    	    console.log(tableNameB);
        	var file=[tableNameB+".java",tableNameB+"Controller.java",tableNameB+"Service.java",tableNameB+"ServiceImpl.java",tableNameB+"Mapper.java",tableNameB+"Mapper.xml",tableNameB+"List.html"];
        	var vms=["template/Model.java.vm","template/Controller.java.vm","template/Service.java.vm","template/ServiceImpl.java.vm","template/Mapper.java.vm","template/Mapper.xml.vm","template/list.html.vm"];
        	var pak=["/model","/controller","/service","/service/impl","/repository","/repository",""];
        	
        	res.data.rows=[];
        	var pre=datas["baseUrl"];
        	for(var i in file){
        		var o={};
        		if(datas["baseUrl"].indexOf("src/main/java")>=0&&file[i].indexOf(".html")>=0){
        			pre=datas["baseUrl"].substring(0,datas["baseUrl"].indexOf("src/main/java"))+"src/main/resources/templates/";
    				pre+=datas["baseUrl"].substring(datas["baseUrl"].lastIndexOf("/")+1,datas["baseUrl"].length);
				}
        		o.fileName=file[i];
        		o.vmFile=vms[i];
        		o.fileUrl=pre+pak[i]+"/"+file[i];
        		o.checked=true;
        		res.data.rows[i]=o;
        	}
            return {
                "total": file.length,//总页数
                "rows": res.data.rows   //数据
            };
        }
    });
    
};
urlObj.select = function (layerTips) {
    var rows = urlObj.table.bootstrapTable('getSelections');
    if (rows.length >0) {
    	debugger;
        urlObj.currentItems = rows;
        return true;
    } else {
        layerTips.msg("请至少选中一行");
        return false;
    }
};

//写在 中就可以直接调用 
function stateFormatter(value, row, index) { 
    if (row.state == true) 
        return { 
            disabled : true,//设置是否可用 
            checked : true//设置选中 
        }; 
    return value; 
}

function urlFormatter1(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true" checked="true" /><div>`;
    }
function urlFormatter2(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }
function urlFormatter3(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }

window.urlEvents1 = {
       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isShow||row.isShow==false){
        		row.isShow=true;
        	}else{
        		row.isShow=false;
        	}
        }
};
window.urlEvents2 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isDict||row.isDict==false){
        		row.isDict=true;
        	}else{
        		row.isDict=false;
        	}
        }
};
window.urlEvents3 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isCheck||row.isCheck==false){
        		row.isCheck=true;
        	}else{
        		row.isCheck=false;
        	}
        }
};

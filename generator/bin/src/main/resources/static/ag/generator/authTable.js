var authObj = {
    baseUrl: "/base/generator",
    tableId: "authTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItems: {}
};
authObj.columns = function () {
    return [{
    	radio: true
    }, {
        field: 'authName',
        title: '功能名称'
    }, {
        field: 'authKey',
        title: '功能key值'
    }, {
        field: 'authComment',
        title: '功能备注'
    }, {
        field: 'authType',
        title: '功能类型'
    }, {
        field: 'authIcon',
        title: '功能图标'
    },{
        field: 'auth1',
        title: '是否显示',
        align: 'center',
        width : 100,
        events: authEvents1,
        formatter: authFormatter1
    },{
	    field: 'auth2',
	    title: '是否配置权限',
	    align: 'center',
	    width : 100,
	    events: authEvents2,
	    formatter: authFormatter2
    },{
	    field: 'auth3',
	    title: '备用',
	    align: 'center',
	    width : 100,
	    events: authEvents3,
	    formatter: authFormatter3
    }];
};
authObj.queryParams = function (params) {
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

authObj.init = function (tableName) {
	debugger;
    authObj.table = $('#' + authObj.tableId).bootstrapTable({
        url: authObj.baseUrl + '/columnpage?tableName='+tableName, //请求后台的URL（*）
        method: 'get', //请求方式（*）
        toolbar: '#' + authObj.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: false, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: authObj.order, //排序方式
        queryParams: authObj.queryParams,//传递参数（*）
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
        uniqueId: authObj.unique, //每一行的唯一标识，一般为主键列
        showToggle: false, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: authObj.columns(),
        height:400,
        responseHandler: function(res) {
        	debugger;
        	var auth=[{
        		"authKey":"add",
        		"authName":"添加",
        		"authComment":"",
        		"authIcon":"plus",
        		"authType":""
        		},{
        		"authKey":"edit",
        		"authName":"修改",
        		"authIcon":"pencil",
        		"authComment":"",
        		"authType":""
        		},{
        		"authKey":"delete",
        		"authName":"删除",
        		"authIcon":"remove",
        		"authComment":"",
        		"authType":""
        		},{
        		"authKey":"import",
        		"authName":"导入",
        		"authIcon":"pencil",
        		"authComment":"",
        		"authType":""
        		},
        		{
        		"authKey":"export",
        		"authName":"导出",
        		"authIcon":"pencil",
        		"authComment":"",
        		"authType":""
        		},{
        		"authKey":"auth",
        		"authName":"授权",
        		"authIcon":"pencil",
        		"authComment":"",
        		"authType":""
        		},{
        		"authKey":"query",
        		"authName":"查询",
        		"authIcon":"pencil",
        		"authComment":"",
        		"authType":"控制人员查看的数据范围"
        		}];
        	
        	for(var i in auth){
        		auth[i].isShow=false;
        		auth[i].isAuth=true;
        		auth[i].isExtend=false;
        	}
            return {
                "total":auth.length,//总页数
                "rows": auth  //数据
            };
        },
        /**
         * @param {点击列的 field 名称} field
         * @param {点击列的 value 值} value
         * @param {点击列的整行数据} row
         * @param {td 元素} $element
         */
        onClickCell: function(field, value, row, $element) {
        	if($element.context.firstChild!=null&&$element.context.firstChild.nodeName=="DIV") return;
            $element.attr('contenteditable', true);
            $element.blur(function() {
                let index = $element.parent().data('index');
                let tdValue = $element.context.innerText;
                saveData(index, field, tdValue);
            })
        }
    });
};
authObj.select = function (layerTips) {
    var rows = authObj.table.bootstrapTable('getSelections');
    if (rows.length >0) {
    	debugger;
        authObj.currentItems = rows;
        return true;
    } else {
        layerTips.msg("请至少选中一行");
        return false;
    }
};
//保存编辑数据
function saveData(index, field, value) {
	debugger;
	$('#' + columnObj.tableId).bootstrapTable('updateCell', {
        index: index,       //行索引
        field: field,       //列名
        value: value        //cell值
    })
}


function authFormatter1(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  checked="true"/><div>`;
    }
function authFormatter2(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }
function authFormatter3(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }

window.authEvents1 = {
       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isShow||row.isShow==false){
        		row.isShow=true;
        	}else{
        		row.isShow=false;
        	}
        }
};
window.authEvents2 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isAuth||row.isAuth==false){
        		row.isAuth=true;
        	}else{
        		row.isAuth=false;
        	}
        }
};
window.authEvents3 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isExtend||row.isExtend==false){
        		row.isExtend=true;
        	}else{
        		row.isExtend=false;
        	}
        }
};

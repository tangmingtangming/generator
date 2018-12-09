var columnObj = {
    baseUrl: "/base/generator",
    tableId: "columnTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItems: {}
};
columnObj.columns = function () {
    return [ {
        field: 'columnName',
        title: '字段名'
    }, {
        field: 'columnKey',
        title: '字段键'
    }, {
        field: 'columnComment',
        editable:{type:"text"},
        title: '表备注'
    }, {
        field: 'dataType',
        title: '数据类型'
    }, {
        field: 'maxLength',
        title: '数据长度'
    }, {
        field: 'renderer',
        title: 'renderer函数'
    },{
        field: 'column1',
        title: '是否显示',
        align: 'center',
        width : 100,
        events: columnEvents1,
        formatter: columnFormatter1
    },{
        field: 'column4',
        title: '是否编辑',
        align: 'center',
        width : 100,
        events: columnEvents4,
        formatter: columnFormatter4
    },{
	    field: 'column2',
	    title: '是否业务字典',
	    align: 'center',
	    width : 100,
	    events: columnEvents2,
	    formatter: columnFormatter2
    },{
	    field: 'column3',
	    title: '是否为查询条件',
	    align: 'center',
	    width : 100,
	    events: columnEvents3,
	    formatter: columnFormatter3
    }];

};
columnObj.queryParams = function (params) {
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

columnObj.init = function (tableName) {
	debugger;
    columnObj.table = $('#' + columnObj.tableId).bootstrapTable({
        url: columnObj.baseUrl + '/columnpage?tableName='+tableName, //请求后台的URL（*）
        method: 'get', //请求方式（*）
        toolbar: '#' + columnObj.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: false, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: columnObj.order, //排序方式
        queryParams: columnObj.queryParams,//传递参数（*）
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
        uniqueId: columnObj.unique, //每一行的唯一标识，一般为主键列
        showToggle: false, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: columnObj.columns(),
        height:400,
        editable:true,
        responseHandler: function(res) {
        	debugger;
        	for(var i in res.data.rows){
        		res.data.rows[i].isQuery=false;
        		res.data.rows[i].isShow=true;
        		res.data.rows[i].isEdit=false;
        		res.data.rows[i].isDict=false;
        	}
            return {
                "total": res.data.total,//总页数
                "rows": res.data.rows   //数据
            };
        },
    /**
     * @param {点击列的 field 名称} field
     * @param {点击列的 value 值} value
     * @param {点击列的整行数据} row
     * @param {td 元素} $element
     */
    onClickCell: function(field, value, row, $element) {
    	debugger;
    	//if($element.context.firstChild!=null&&$element.context.firstChild.nodeName=="DIV") return;
        $element.attr('contenteditable', true);
        $element.blur(function() {
            let index = $element.parent().data('index');
            let tdValue = $element[0].innerText;
            //saveData(index, field, tdValue);
        })
    }
})
}
columnObj.select = function (layerTips) {
    var rows = columnObj.table.bootstrapTable('getSelections');
    if (rows.length >0) {
    	debugger;
        columnObj.currentItems = rows;
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



function columnFormatter1(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true" checked="true" /><div>`;
    }
function columnFormatter2(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }
function columnFormatter3(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }
function columnFormatter4(value, row, index) {
    return `<div class="ckeckDiv" style="width:100%;height:100%"><input type="checkbox" class="checkbox" value="true"  /><div>`;
    }

window.columnEvents1 = {
		
        'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	debugger;
        	if(!row.isShow||row.isShow==false){
        		row.isShow=true;
        	}else{
        		row.isShow=false;
        	}
        }
};
window.columnEvents2 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isDict||row.isDict==false){
        		row.isDict=true;
        	}else{
        		row.isDict=false;
        	}
        }
};
window.columnEvents3 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isQuery||row.isQuery==false){
        		row.isQuery=true;
        	}else{
        		row.isQuery=false;
        	}
        }
};
window.columnEvents4 = {
	       
		'click .ckeckDiv': function (e, value, row, index) {
    		e.currentTarget.children[0].checked=!e.currentTarget.children[0].checked;
        	if(!row.isEdit||row.isEdit==false){
        		row.isEdit=true;
        	}else{
        		row.isEdit=false;
        	}
        }
};

//全局变量记忆金额单位(投资概括页面)
var gnumberFlagInvest = "2";
//全局变量记忆金额单位(全局面)
var gnumberFlagMain = "2";
//全局变量记忆当前页面默认调用函数
var defaultFunc = "";
var defaultMainFunc = "";
//全局变量记录首页开始日期
var beginDateInvest;
//全局变量记录首页结束日期
var endDateInvest;
//全局变量第一张估值表的日期
var firstBeginDate;
//全局变量最后一张估值表的日期
var lastEndDate;
// 全局变量当前菜单参数
var pageObj = {};
//数字相除 num1:除数 num2:被除数


//金额开始的千分位。
function numDivide(num1, num2) {
	 var baseNum1 = 0, baseNum2 = 0;
	 var baseNum3, baseNum4;
	 try {
	  baseNum1 = num1.toString().split(".")[1].length;
	 } catch (e) {
	  baseNum1 = 0;
	 }
	 try {
	  baseNum2 = num2.toString().split(".")[1].length;
	 } catch (e) {
	  baseNum2 = 0;
	 }
	 with (Math) {
	  baseNum3 = Number(num1.toString().replace(".", ""));
	  baseNum4 = Number(num2.toString().replace(".", ""));
	  return (baseNum3 / baseNum4) * pow(10, baseNum2 - baseNum1);
	 }
};
/**
 * 数字千分位格式化
 * @public
 * @param mixed mVal 数值
 * @param int iAccuracy 小数位精度(默认为2)
 * @return string
 */
 function amountFormate(mVal) {
    if(isNaN(mVal)){
        return mVal;
    }
    mVal = (Math.round((mVal - 0) * 100)) / 100;
    mVal = (mVal == Math.floor(mVal)) ? mVal + ".00" : ((mVal * 10 == Math.floor(mVal * 10)) ? mVal  + "0" : mVal);
    mVal = String(mVal);
    var ps = mVal.split('.');
    var whole = ps[0];
    var sub = ps[1] ? '.' + ps[1] : '.00';
    var r = /(\d+)(\d{3})/;
    while (r.test(whole)) {
        whole = whole.replace(r, '$1' + ',' + '$2');
    }
    mVal = whole + sub;
    return mVal;
}
/**
 * 将千分位格式的数字字符串转换为浮点数
 * @public
 * @param string sVal 数值字符串
 * @return float
 */
function amountUnFormate(sVal){
    var fTmp = parseFloat(sVal.replace(/,/g, ''));
    return (isNaN(fTmp) ? 0 : fTmp);
}



//金额切换调用函数(投资概括使用)
function amountFormatInvest(){
  var flag = $("#amountFormatInvest").val();
  $(".table-content table tr").each(function (){
	  for(var i = 0; i< $(this).find("td").length; i++){
		  var valc = $(this).find("td:eq("+i+")[scale]").find("input").val();
		  if(valc != undefined && valc.length > 0){
			  $(this).find("td:eq("+i+")").find("i").text(amountFormat(flag, valc));
		  }
	  }
  });
  gnumberFlagInvest = flag;
  //每个写万元
  var numberFlagMoney = $('#amountFormatInvest').find("option:selected").text();
  $(".table-content table tr").each(function (){
	  for (var i=0;i< $(this).find("th").length;i++) {
		  $(this).find("th:eq("+i+")[money]").find("span").text(numberFlagMoney);
	  }

  });
}

//金额切换调用函数(全局用)
function amountFormatMain(node){
  if(node){
	  var flag = $("#" + node).val();
  }else{
	  var flag = $("#numberFlagMain").val();
  };

  gnumberFlagMain = flag;
  if(pageObj.pageType){
	loadJsp(pageObj.fileName, pageObj.flag, pageObj.defauFunc, pageObj.menuName, pageObj.pageType);
	return;
  }

  var nodes = $(".table-content table tr");
  var nodeLengths = nodes.length;
  for(var n = 0; n < nodeLengths; n++){
	  for(var i = 0; i< nodes.eq(n).find("td").length; i++){
		  var valc = nodes.eq(n).find("td:eq("+i+")[scale]").find("input").val();
		  if(valc != undefined && valc.length > 0){
			  nodes.eq(n).find("td:eq("+i+")").find("i").text(amountFormat(flag, valc));
		  }
	  }
  }
  //每个写万元
  if(node){
	  var numberFlagMoney = $('#' + node).find("option:selected").text();
  }else{
	  var numberFlagMoney = $('#numberFlagMain').find("option:selected").text();
  }
  $(".table-content table thead tr").each(function (){
	  for (var i=0;i< $(this).find("th").length;i++) {
		  $(this).find("th:eq("+i+")[money]").find("span").text(numberFlagMoney);
	  }
  });
}
//格式化金额 1:元  2:万元  3:亿元
function amountFormat(flag, value){
	if(isNull(flag)){
        flag="1";
	}
	if(isNull(value)){
		value=0;
	}
	value=""+value;
	var val = parseFloat(value.replace(/[^\d\.-]/g, ""));
	if(flag == '1'){
		return amountFormate(numDivide(val, 1));
	}else if(flag == '2'){
		return amountFormate(numDivide(val, 10000));
	}else if(flag == '3'){
		return amountFormate(numDivide(val, 100000000));
	}else{
		return amountFormate(numDivide(val, 1));
	}
}
//滚动条
function iscroll(iscroll){
	$("#"+iscroll).niceScroll({
        cursorcolor: "#ccc",//#CC0071 光标颜色
        cursoropacitymax: 1, //改变不透明度非常光标处于活动状态（scrollabar“可见”状态），范围从1到0
        touchbehavior: false, //使光标拖动滚动像在台式电脑触摸设备
        cursorwidth: "5px", //像素光标的宽度
        cursorborder: "0", // 	游标边框css定义
        cursorborderradius: "5px",//以像素为光标边界半径
        autohidemode: true //是否隐藏滚动条
    });
}


function DateAdd(interval, number, date) {
    switch (interval) {
        case "y": {
            date.setFullYear(date.getFullYear() + number);
            return date;
            break;
        }
        case "q": {
            date.setMonth(date.getMonth() + number * 3);
            return date;
            break;
        }
        case "m": {
            date.setMonth(date.getMonth() + number);
            return date;
            break;
        }
        case "w": {
            date.setDate(date.getDate() + number * 7);
            return date;
            break;
        }
        case "d": {
            date.setDate(date.getDate() + number);
            return date;
            break;
        }
        case "h": {
            date.setHours(date.getHours() + number);
            return date;
            break;
        }
        case "m": {
            date.setMinutes(date.getMinutes() + number);
            return date;
            break;
        }
        case "s": {
            date.setSeconds(date.getSeconds() + number);
            return date;
            break;
        }
        default: {
            date.setDate(date.getDate() + number);
            return date;
            break;
        }
    }

	/*  var now = new Date();
	 // 加五天.
	 var newDate = DateAdd("d ", 5, now);
	 alert(newDate.toLocaleDateString())
	 // 加两个月.
	 newDate = DateAdd("m ", 2, now);
	 alert(newDate.toLocaleDateString())
	 // 加一年
	 newDate = DateAdd("y ", 1, now);
	 alert(newDate.toLocaleDateString())*/
}


//用于实现页面 Map 对象，Key只能是String，对象随意
function defMapObj(){
  Map = function(){
    this._entrys = new Array();
    this.put = function(key, value){
        if (key == null || key == undefined) {
            return;
        }
        var index = this._getIndex(key);
        if (index == -1) {
            var entry = new Object();
            entry.key = key;
            entry.value = value;
            this._entrys[this._entrys.length] = entry;
        }else{
            this._entrys[index].value = value;
        }
    };
    this.get = function(key){
        var index = this._getIndex(key);
        return (index != -1) ? this._entrys[index].value : null;
    };
    this.remove = function(key){
        var index = this._getIndex(key);
        if (index != -1) {
            this._entrys.splice(index, 1);
        }
    };
    this.clear = function(){
        this._entrys.length = 0;;
    };
    this.contains = function(key){
        var index = this._getIndex(key);
        return (index != -1) ? true : false;
    };
    this.getCount = function(){
        return this._entrys.length;
    };
    this.getEntrys =  function(){
        return this._entrys;
    };
   this._getIndex = function(key){
        if (key == null || key == undefined) {
            return -1;
        }
        var _length = this._entrys.length;
        for (var i = 0; i < _length; i++) {
            var entry = this._entrys[i];
            if (entry == null || entry == undefined) {
                continue;
            }
            if (entry.key === key) {
                return i;
            }
        }
        return -1;
    };
  }
}
//格式化时间
Date.prototype.Format = function (fmt){ //参数为"yyyy-MM-dd"之类的
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

// 判断数据类型是否为null或undefined
function booleanIsStr(str){
	var newStr = str === null ? '' : str === undefined ? '' : str;
	return newStr;
}
//获取对象的值如果为空则返回空字符串或者设置的默认值
function getObjectValue(value, defaultValue) {
    if (isNull(value)) {
        if (isNull(defaultValue)) {
            return "";
        } else {
            return defaultValue;
        }
    }
    return value;
}
//判断是否为空
function isNull(value) {
    var type;
    if (value == null) { // 等同于 value === undefined || value === null
        return true;
    }
    type = Object.prototype.toString.call(value).slice(8, -1);
    switch (type) {
        case 'String':
            return !$.trim(value);
        case 'Array':
            return !value.length;
        case 'Object':
            return $.isEmptyObject(value); // 普通对象使用 for...in 判断，有 key 即为 false
        default:
            return false; // 其他对象均视作非空
    }
}

/**
 * 获取一个字符串值在指定字符串第n次出现的位置
 * @param str 源字符串
 * @param cha 要查找的字符串值
 * @param num 要查找第几个该字符串值
 * @returns
 */
function findIndex(str, cha, num) {
	var x = str.indexOf(cha);
	for (var i = 0; i < num; i++) {
		x = str.indexOf(cha, x + 1);
	}
	return x;
}


function getEchartDataURLByOption (option, type) {
/*    function getContainer() {
        container = document.createElement('div');
        container.id = "_chart";

        container.style.width = 500;

        container.style.height = 400;

        container.style.display = "none";
        return container
    }*/

    if(isNull(option)){

        var canvas = document.createElement('canvas');
        var body = document.body;
        canvas.style.height = 0;
        body.appendChild(canvas);
        var ctx = canvas.getContext("2d");
        ctx.fillStyle = "rgba(255, 255, 255, 1)";
        ctx.fillRect(255,255,255,255);
        ctx.fillStyle = "rgba( 255, 255, 255, 1)";
        ctx.fillRect(255, 255, 255, 255);
        ctx.fillStyle = "rgba( 255, 255, 255, 1)"; // black color
        ctx.fillText("Gloomyfish - Demo", 255, 255);
        return type ?  {img:canvas.toDataURL('image/png'),status: 1} : canvas.toDataURL('image/png')
    }

    var myChart_ = echarts.init(document.getElementById("test"))
    myChart_.setOption(option)
    myChart_.resize()
    return  type ? {img:myChart_.getConnectedDataURL({
        pixelRatio: 5
    })} : myChart_.getConnectedDataURL({
        pixelRatio: 5
    })
}



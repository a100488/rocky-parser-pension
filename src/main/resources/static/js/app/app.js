


















































var API_HOST_2=sessionStorage.getItem("API_HOST_2");
var TOKEN=sessionStorage.getItem("TOKEN");


/*


var data={"beginDate": "2017-01-01", "endDate": "2017-09-15"};
//  http://192.168.1.254:9002/#/totalAssetsPosition?v=24?beginDate=2017-01-01&endDate=2017-09-15&gnumber=2&token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJndWlnZSIsInN1YiI6IntcImlkXCI6XCIxMTJcIixcInVzZXJuYW1lXCI6XCJHR0RFTU8yXCJ9IiwiaWF0IjoxNTEwNTU4MjUyLCJleHAiOjE1MTA2NDQ2NTJ9.msw8se_um9ug2Sf8sf4hSYzEFQKe0IURzCEwZZTYN2M
$.ajax({

    url: API_HOST_2+"general/categoryRevenue.do",
    data: data,
    dataType: 'text',
    headers: {token: TOKEN},
    success: function(data) {
        console.log(data);
        if (!isNull(data)) {
            var jsonData = $.parseJSON(data);


        }
    },
    error: function(oData, oStatus, eErrorThrow) {
        console.log(oData);
    }
});


*/

$("#performanceDoc").click(function(){

    var data='{"code":0,"lastYear":"16","presentYear":"17","lastMonth":9,"list":[{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"海富通纯债","DDATE":"2014-11-13","VAL_NET":"492945376.06","YLD":"18125136.28","YLD_TDNH":"3.85%","YLD_ZBNH":"3.84%","VAL_PROD_YEAR":"1.1506","VAL_PROD_MONTH":"1.1826","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"汇添富纯债","DDATE":"2014-11-11","VAL_NET":"935019761.17","YLD":"41011404.77","YLD_TDNH":"5.54%","YLD_ZBNH":"5.55%","VAL_PROD_YEAR":"1.13","VAL_PROD_MONTH":"1.1764","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"交银纯债","DDATE":"2014-11-24","VAL_NET":"585674000.97","YLD":"20983762.43","YLD_TDNH":"4.54%","YLD_ZBNH":"4.54%","VAL_PROD_YEAR":"1.1479","VAL_PROD_MONTH":"1.1861","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"南方纯债","DDATE":"2014-11-05","VAL_NET":"820575125.91","YLD":"28511046.08","YLD_TDNH":"4.32%","YLD_ZBNH":"4.32%","VAL_PROD_YEAR":"1.1389","VAL_PROD_MONTH":"1.1758","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"申万菱信纯债","DDATE":"2015-07-27","VAL_NET":"564399874.84","YLD":"20573145.44","YLD_TDNH":"4.57%","YLD_ZBNH":"4.57%","VAL_PROD_YEAR":"1.0977","VAL_PROD_MONTH":"1.1359","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"兴业纯债","DDATE":"2015-08-19","VAL_NET":"457276112.56","YLD":"17636542.03","YLD_TDNH":"4%","YLD_ZBNH":"3.99%","VAL_PROD_YEAR":"1.0823","VAL_PROD_MONTH":"1.1138","TYPE":"1","NID":null},{"PROD_TYPE":"纯债交易","PROD_NM_ABB":"富国纯债","DDATE":"2014-11-18","VAL_NET":"1121924150.77","YLD":"12113412.97","YLD_TDNH":"1.32%","YLD_ZBNH":"1.32%","VAL_PROD_YEAR":"1.1261","VAL_PROD_MONTH":"1.1377","TYPE":"1","NID":null},{"PROD_TYPE":"纯债交易","PROD_NM_ABB":"华夏纯债","DDATE":"2014-11-10","VAL_NET":"329130026.89","YLD":"-14921876.06","YLD_TDNH":"-1.49%","YLD_ZBNH":"-2.44%","VAL_PROD_YEAR":"1.1099","VAL_PROD_MONTH":"1.0953","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"平安创赢","DDATE":"2016-03-30","VAL_NET":"7593364448.03","YLD":"305264146.91","YLD_TDNH":"4.94%","YLD_ZBNH":"4.88%","VAL_PROD_YEAR":"1.0373","VAL_PROD_MONTH":"1.0706","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达固收","DDATE":"2014-11-20","VAL_NET":"4031135638.61","YLD":"281931401.34","YLD_TDNH":"6.73%","YLD_ZBNH":"4.54%","VAL_PROD_YEAR":"1.3307","VAL_PROD_MONTH":"1.3878","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏FOF1号","DDATE":"2016-01-06","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"2","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略1号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略2号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略3号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略4号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达FOF1号","DDATE":"2017-05-10","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"2","NID":"1001"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达策略1号","DDATE":"2017-05-10","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1001"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达策略2号","DDATE":"2017-06-20","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1001"},{"PROD_TYPE":"总资产","PROD_NM_ABB":"--","DDATE":"--","VAL_NET":"31525485654.99","YLD":"1212114624.53","YLD_TDNH":"3.53%","YLD_ZBNH":"5.03%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"3","NID":null}]}';
    if (!isNull(data)) {
        var jsonData = $.parseJSON(data);
        editor.execCommand('insertHtml',   parseData2_1_1(jsonData));

    }
});
$("#terminalCategoryConfigure").click(function(){
    var data='{"code":0,"list":[{"ASSETS_TYPE":"投资资产","TP_F_DESC":"股票","VAL_NET":552174637.27,"YLD":"467708910.75","SYL_ZB":"48.65%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"债券","VAL_NET":2983701658.57,"YLD":"849053866.16","SYL_ZB":"3.23%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"现金","VAL_NET":5190795.85,"YLD":"30478199.09","SYL_ZB":"2.75%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"其它资产","VAL_NET":630007562.82,"YLD":"137487889.34","SYL_ZB":"3.71%"},{"ASSETS_TYPE":"投资负债","TP_F_DESC":"正回购","VAL_NET":-136000000,"YLD":"-103505713.8","SYL_ZB":"-2.56%"},{"ASSETS_TYPE":"投资负债","TP_F_DESC":"其它负债","VAL_NET":-5051524.87,"YLD":"-6723599.1","SYL_ZB":"-6.89%"},{"ASSETS_TYPE":"总资产","TP_F_DESC":"总资产","VAL_NET":4030023129.64,"YLD":"1374499552.45","SYL_ZB":"4.18%"}]}';
    if (!isNull(data)) {
        var jsonData = $.parseJSON(data);
        var terminalCategoryConfigure = getTerminalCategoryConfigure(jsonData.list)
      console.log(obj2string(terminalCategoryConfigure))
        var img = '<img width="400" height="320" src="' + getEchartDataURLByOption(terminalCategoryConfigure) + '" >';
        convertBase64ToImg(editor,getEchartDataURLByOption(terminalCategoryConfigure),function (responseObj) {
            console.log(responseObj)
            if (responseObj.state == "SUCCESS") {
                var imgObj = {},
                    url = editor.options.scrawlUrlPrefix + responseObj.url;
                imgObj.src = url;
                imgObj._src = url;
                imgObj.alt = responseObj.original || '';
                imgObj.title = responseObj.title || '';
                imgObj.width=500;
                imgObj.height=400;
                editor.execCommand("insertImage", imgObj);

            } else {
                alert(responseObj.state);
            }

        })

    }


});
function obj2string(o){
    var r=[];
    if(typeof o=="string"){
        return "\""+o.replace(/([\'\"\\])/g,"\\$1").replace(/(\n)/g,"\\n").replace(/(\r)/g,"\\r").replace(/(\t)/g,"\\t")+"\"";
    }
    if(typeof o=="object"){
        if(!o.sort){
            for(var i in o){
                r.push(i+":"+obj2string(o[i]));
            }
            if(!!document.all&&!/^\n?function\s*toString\(\)\s*\{\n?\s*\[native code\]\n?\s*\}\n?\s*$/.test(o.toString)){
                r.push("toString:"+o.toString.toString());
            }
            r="{"+r.join()+"}";
        }else{
            for(var i=0;i<o.length;i++){
                r.push(obj2string(o[i]))
            }
            r="["+r.join()+"]";
        }
        return r;
    }
    return o.toString();
}
function parseData2_1_1(performanceData){
    var szsum=0;
    var zgplzcblsum=0;
    var szzhzbsum=0;
    var tr=' <table class="MsoNormalTable" border="1" cellspacing="0" cellpadding="0" width="100%" style="border-collapse:collapse;border:none">';
    /*if(isNull(performanceDocStr)){
     performanceDocStr=$("#performanceDoc").html();
     }*/

    // console.log(    $("#performanceDoc").html());
    //$("#performanceDoc").html(performanceDocStr);
    var datalist = performanceData.list;
    var lastYear = performanceData.lastYear;
    var presentYear =performanceData.presentYear;
    var lastMonth =performanceData.lastMonth;
    var length=datalist.length;
    if(length>0){
        tr += '<tr style="height:13.5pt"><td  nowrap="" style="border:solid windowtext 1.0pt;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '账户类型</span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '组合名称</span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '投资日期 </span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '期末规模<span lang="EN-US">(</span>万元<span lang="EN-US">)</span></span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '期间收益<br><span lang="EN-US">(</span>万元<span lang="EN-US">)</span></span></b></p> </td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
            + lastYear + '</span><span style="font-size:10.0pt;font-family:宋体">年年<br>末净值</span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
            + presentYear + '</span><span style="font-size:10.0pt;font-family:宋体">年<span lang="EN-US">'+ lastMonth +'</span>月<br>末净值</span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '资金加权收<br>益率（年化）</span></b></p></td>';
        tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
            + '<p class="MsoNormal" align="center" style="text-align:center"><b><span style="font-size:9.0pt;font-family:宋体">'
            + '时间加权收<br>益率（年化）</span></b></p></td>';
        tr += '</tr>';
        var arr = ['富国纯债'];
        var brr = ['海富通纯债'];
        var crr = ['平安创赢'];
        var drr = ['华夏策略1号'];
        var err = ['易方达策略1号'];
        var frr = ['汇添富纯债','交银纯债','南方纯债','申万菱信纯债','兴业纯债','华夏纯债','易方达固收','易方达FOF1号'];
        var grr = ['华夏策略2号','华夏策略3号','华夏策略4号'];
        var lrr = ['易方达策略2号'];
        for(var i=0;i<length;i++){
            var line = datalist[i];
            if(line.PROD_NM_ABB == '华夏FOF1号'){
                continue;
            }
            if(line.PROD_NM_ABB == '易方达FOF1号'){
                continue;
            }
            //console.log($.inArray(line.PROD_CD, brr));
            if($.inArray(line.PROD_NM_ABB, brr)!= -1){
                tr += '<tr style="height:13.5pt"><td rowspan="6" nowrap="" style="border:solid windowtext 1.0pt;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_TYPE + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></b></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, arr)!= -1){
                tr += '<tr style="height:13.5pt"><td rowspan="2" nowrap="" style="border:solid windowtext 1.0pt;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_TYPE + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, crr)!= -1){
                tr += '<tr style="height:13.5pt"><td rowspan="8" nowrap="" style="border:solid windowtext 1.0pt;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_TYPE + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, drr)!= -1){
                tr += '<tr style="height:13.5pt">';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td rowspan="4" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td rowspan="4" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  rowspan="4" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td rowspan="4"  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  rowspan="4" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td rowspan="4"  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td rowspan="4"  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, err)!= -1){
                tr += '<tr style="height:13.5pt">';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td rowspan="2" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  rowspan="2" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  rowspan="2" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  rowspan="2" nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td rowspan="2"  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td rowspan="2"  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, frr)!= -1){
                tr += '<tr style="height:13.5pt">';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td   nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td   nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, grr)!= -1){
                tr += '<tr style="height:13.5pt">';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '</tr>';
            }else if($.inArray(line.PROD_NM_ABB, lrr)!= -1){
                tr += '<tr style="height:13.5pt">';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '</tr>';
            }else{
                tr += '<tr style="height:13.5pt"><td nowrap="" style="border:solid windowtext 1.0pt;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_TYPE + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.PROD_NM_ABB + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 5.4pt 0cm 5.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.DDATE + '</span></p></td>';
                tr += '<td nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.VAL_NET) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + amountFormat(2,line.YLD) + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_YEAR + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;padding:0cm 1.4pt 0cm 1.4pt;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span lang="EN-US" style="font-size:9.0pt;font-family:宋体">'
                    + line.VAL_PROD_MONTH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_ZBNH + '</span></p></td>';
                tr += '<td  nowrap="" style="border:solid windowtext 1.0pt;border-left:none;height:13.5pt">'
                    + '<p class="MsoNormal" align="center" style="text-align:center"><span style="font-size:9.0pt;font-family:宋体">'
                    + line.YLD_TDNH + '</span></b></p></td>';
                tr += '</tr>';
            }
        }

    }
    tr+='</table>';
    return tr;
}



/**
 * 2.总资产大类资产配置     图表
 */
function getTerminalCategoryConfigure(categoryRevenueData) {
    //处理 持仓市值
    if (!isNull(categoryRevenueData)) {
        var itemList = [];
        var scale = 0;
        for (var i = categoryRevenueData.length - 1; i >= 0; i--) {
            var item = categoryRevenueData[i];

            if (item.ASSETS_TYPE == "投资资产") {
                scale += item.VAL_NET;
                itemList.push(item);

            }
        }
        if (!isNull(itemList)) {
            for (var i = 0; i < itemList.length; i++) {
                if (!isNull(itemList[i].VAL_NET) && itemList[i].VAL_NET != 0) {
                    var temp = itemList[i].VAL_NET / scale*100;
                    itemList[i].VAL_NET = amountFormat(3,itemList[i].VAL_NET);
                    itemList[i].VAL_NET2 = temp.toFixed(2);

                } else {
                    itemList[i].VAL_NET = "0";
                    itemList[i].VAL_NET2 = "0";
                }
            }
            var showName = itemList.map(function (val) {
                return val.ENT_ISS
            });
            var showVal = itemList.map(function (val) {
                return {
                    value: parseFloat(val.VAL_NET),
                    value2:parseFloat(val.VAL_NET2),
                    name: val.TP_F_DESC
                }
            });
            option = {
                animation: false,
                color: ['rgb(73,169,238)', 'rgb(255,216,110)', 'rgb(243,133,123)', 'rgb(152,216,125)'],
                //  鼠标移入时显示的提示内容
                tooltip: {
                    trigger: 'item',
                    formatter: "{b}"
                },

                // 图例的显示
                legend: {
                    show: true,
                    orient: 'vertical',
                    top: 'center',
                    left: '55%',
                    itemWidth: 8,
                    itemHeight: 26,
                    padding: 2,
                    textStyle:{
                        fontSize:16,
                        lineHeight:26,
                        rich:{
                            a:{}
                        }
                    },
                    data: showName,
                    formatter: function (name) {
                        return name;
                    }
                },
                series: [
                    {
                        name: '大类资产配置',
                        type: 'pie',
                        // 半径 从20% 到 55 % 越窄差距越小
                        radius: ['40%', '55%'],
                        // 圆心位置
                        center: ['25%', '45%'],
                        avoidLabelOverlap: false,
                        label: {
                            normal: {
                                show: false
                            }
                        },
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        data: showVal// 这里是数据
                    }
                ]
            };
            // 这个是在图例后边添加数据值的
            option.series[0].data.map(function (obj, i) {
                var index = -1;
                switch (obj.name) {
                    case "债券":
                        index = 0;
                        break;
                    case "股票":
                        index = 1;
                        break;
                    case "现金":
                        index = 2;
                        break;

                    case "其它资产":
                        index = 3;
                        break;
                }
                if (index > -1) {
                    var txt = obj.name + '  ' + obj.value + '亿元' + ' ' + obj.value2 + '%';
                    obj.name = txt;
                    option.legend.data[index] = txt;
                }

            });

            return option;
        }
    }
    return null;


}


//3.债券(总资产)平均到期收益率
function getAveMaturityRateReturn(datalist){

    var firstData = [];
    var secData = [];
    var xData = [];
    for(var i=0;i<datalist.length;i++){
        xData.push(datalist[i].DATA_DT);
        firstData.push(datalist[i].YLD_ZS_AVG);
        secData.push(datalist[i].YLD_TD_AVG);
    };
    var colors = ['#BD2010', '#808080'];
    return {
        color:colors,
        /*  title: {
         text: '债券(总资产)-平均到期收益率',
         x : 'center',
         top:'4%',
         textStyle: {
         fontFamily: 'Microsoft YaHei',
         fontSize:"14",
         color:"#000"

         },
         },*/
        legend: {
            data:['中债综合财富指数平均到期收益率','平均到期收益率'],
            x:'center',
            bottom:'3%',
            icon:'line'
        },

        grid: {
            x: 50,
            x2: 60
        },
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : xData,
            },

        ],
        yAxis : [
            {
                type : 'value',
                name : '收益率',
                axisLabel: {
                    show: true,
                    interval: 'auto',
                    formatter: '{value}%'
                },

            }
        ],
        series : [
            {
                name:'中债综合财富指数平均到期收益率',
                type:'line',
                data:firstData,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true

            },
            {
                name:'平均到期收益率',
                type:'line',
                data:secData,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true

            }
        ]
    };
}


function getAverageDurationData(jsonData){

    var  listData = jsonData.dataListD;
    var  Mdata = jsonData.dataListM;
    var  xdata=[];
    var  Mvalue=[];
    var  Dvalue=[];
    var  xData=[];
    var Middendata =[];
    var MiddenD = [];
    for(var i=0;i<listData.length;i++){
        Dvalue.push(listData[i].DUA_PROD);
        xdata.push(listData[i].DATA_DT);
    }
    for(var i=0;i<Mdata.length;i++){
        MiddenD.push(Mdata[i].VAL_BLZ);
        Middendata.push(Mdata[i].DATA_DT);
        Mvalue.push(Mdata[i].DUA_PROD);
    }
    var colors = ['#BD2010', '#808080'];
    return {
        color: colors,
        /*  title: {
         text: '债券(总资产)-平均久期',
         top : '5%',
         x : 'center',
         textStyle: {
         fontFamily: 'Microsoft YaHei',
         fontSize:"14",
         color:"#000"

         },
         },*/

        legend: {
            x:'center',
            bottom:'4%',
            data:[
                {
                    name :'平均久期(日频)',
                    icon:'line',

                },
                {
                    name:'平均久期(月频)',
                    icon:'line',

                },],
            selectedMode:'single',
            selected:{
                '平均久期(月频)':false
            }
        },
        xAxis : [
            {
                type : 'category',
                data:  xdata, //日频
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                name:'平均久期',
                type : 'value',
                axisLabel: {
                    show: true,
                    interval: 'auto',
                    formatter: '{value}'
                },
                splitLine: {
                    show:false,
                },
            },
            {
                name: '区间涨跌幅',
                type: 'value',
                axisLabel: {
                    formatter: '{value}%'
                },
                splitLine: {
                    show:false,
                },
            },
        ],
        series : [
            {
                name:'中债综合财富指数区间涨跌幅',
                type:'bar',
                data:false,
                barMaxWidth:'40',
                yAxisIndex: 1,
            },
            {
                name:'平均久期(月频)',
                type:'line',
                data:Mvalue,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true

            },
            {
                name:'平均久期(日频)',
                type:'line',
                data:Dvalue,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true,
                itemStyle: {
                    normal: {
                        color:'#808080'
                    }
                },
            },
        ]

    };
    /*
     myChart2.on('legendselectchanged', function (params) {
     var name = params.name;
     var option2 = myChart2.getOption();
     if (name == "平均久期(月频)") {
     option2.xAxis[0].data = Middendata;
     option2.series[0].data = MiddenD;
     option2.series[1].data = Mvalue;
     option2.series[2].data = false
     option2.yAxis[1].axisLabel.show = true;
     }
     if(name=="平均久期(日频)"){
     option2.xAxis[0].data = xdata;
     option2.series[0].data = false;
     option2.series[1].data = false;
     option2.series[2].data = Dvalue;
     option2.yAxis[1].axisLabel.show = false;

     } ;
     myChart2.setOption(option2);
     });*/
}


function getTermDistributionChart(datalist){

    var newworth_rates = [];
    var categories = [];
    var dates = [];
    for(var i=0;i<datalist.length;i++){
        var line = datalist[i];
        categories.push(line.REMAT_CD);
        newworth_rates.push(line.VAL_ZB);
    }
    var piedatas = [];
    for(var i=0;i<categories.length;i++){
        var tmp = {};
        tmp.value = newworth_rates[i];
        tmp.name = categories[i];
        piedatas.push(tmp);
    }
    var colors = ['#BD2010', '#003873', '#E7BA10','#639629','#1580A8',"#CDC3C6","#CEDBE7",'#93AEA4',"#B7D2EC",'#A5A5A5','#D8E2E0'];

    return {
        animation: false,
        color: colors,
        /*title: {
         text: '债券(总资产)-期限分布',
         x : 'center',
         top:'4%',
         textStyle: {
         fontFamily: 'Microsoft YaHei',
         fontSize:"14",
         color:"#000"

         },
         },*/


        series: [
            {
                type:'pie',
                selectedMode: 'single',
                radius: [0, '30%'],
                label: {
                    normal: {
                        position: 'inner'
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                }
            },
            {

                type:'pie',
                radius: ['40%', '55%'],
                data:piedatas
            }
        ]
    };

}
//债券(总资产)杠杆比率

function getLeverageRatio(jsonData){


    var  listMonth = jsonData.dataListblM; //涨跌幅月份
    var  rate = jsonData.dataListbl;//净占比
    var  Mvalue=[];
    var  Mdata=[];
    var  Ddata=[];
    var  MvalueRate=[];
    var Dvalue=[];
    for(var i=0;i<listMonth.length;i++){ //涨跌幅+净占比月份
        Dvalue.push(listMonth[i].VAL_BLZ);
        Ddata.push(listMonth[i].DATA_DT);
        MvalueRate.push(listMonth[i].VAL_BL);
    }
    for(var i=0;i<rate.length;i++){//净占比日度
        Mvalue.push(rate[i].VAL_BL);
        Mdata.push(rate[i].DATA_DT)
    }

    var colors = ['#BD2010', '#003873'];
    return {
        color: colors,
        /*title: {
         text: '债券(总资产)-杠杆比率',
         x : 'center',
         top:'4%',
         textStyle: {
         fontFamily: 'Microsoft YaHei',
         fontSize:"14",
         color:"#000"
         },
         },*/
        legend: {
            data:[
                {
                    name:'杠杆比率(日频)',
                    icon:'line'
                },
                {
                    name:'杠杆比率(月频)',
                    icon:'line'
                }],
            x:'center',
            bottom:'2%',
            selectedMode:'single',
            selected:{
                '杠杆比率(月频)':false
            }
        },
        xAxis : [
            {
                type : 'category',
                data:Mdata, //日频
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                name: '杠杆比率',
                type: 'value',
                axisLabel: {
                    formatter: '{value}%'
                },
                splitLine: {
                    show:false,
                },
            },
            {
                type : 'value',
                name : '区间涨跌幅',
                axisLabel: {
                    show: true,
                    interval: 'auto',
                    formatter: '{value}%'
                },
                splitLine: {
                    show:false,
                },
            },
        ],
        series : [
            {
                name:'中债综合财富指数区间涨跌幅',
                type:'bar',
                barMaxWidth:'40',
                data:false,
                yAxisIndex: 1,
            },
            {
                name:'杠杆比率(月频)',
                type:'line',
                data:MvalueRate,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true

            },
            {
                name:'杠杆比率(日频)',
                type:'line',
                data:Mvalue,
                symbol:'circle',
                smooth:true,
                symbolSize:3,
                showAllSymbol :true,
                itemStyle: {
                    normal: {
                        color:'#003873'
                    }
                },
            },
        ]
    }


}
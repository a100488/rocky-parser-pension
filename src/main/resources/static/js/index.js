/**
 * Created by songaw on 2017/11/2.
 */

var TOKEN="";
var API_HOST_1="http://oim.guigeinvest.com/";
var API_HOST_2="http://oim.guigeinvest.com/v2/";
if(isNull(sessionStorage.getItem("API_HOST_2"))) {
    sessionStorage.setItem("API_HOST_2", API_HOST_2);
}
$.ajax({
    type: "get",
    url: API_HOST_2+"multilogin.do?_=1504660597737&username=xuxiaofang&password=111111",
    dataType: "json",
    success: function(data) {
        if(!isNull(data.token)){
            TOKEN=data.token;
        }
        sessionStorage.setItem("TOKEN",TOKEN);
        console.log(TOKEN)
    },
    error: function(oData, oStatus, eErrorThrow) {
        alert("error");
    }
});


var ue = UE.getEditor('docEditor',{
    toolbars: [['source','scrawl',
        'fullscreen', '|', 'undo', 'redo', '|',
        'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'removeformat', 'formatmatch', 'autotypeset', 'blockquote', 'pasteplain', '|', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|',
        'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',
        'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|',
        'directionalityltr', 'directionalityrtl', 'indent', '|',
        'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|', 'touppercase', 'tolowercase', '|',
        'link', 'unlink',  '|', 'imagenone', 'imageleft', 'imageright', 'imagecenter', '|',
        'simpleupload', 'insertimage','attachment', 'map',  'pagebreak', '|',
        'horizontal', 'date', 'time', '|',
        'inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols', 'charts', '|',
        'print', 'preview', 'searchreplace', 'drafts','template','app','table1','chart1'
    ]]
});

//execComman 按钮点击时候要处理的信息，

//queryCommandState 方法是指当编辑器获取焦点时要处理的事 return1让当前按钮可点击，return -1；表示将按钮置灰不可点击

ue.commands['table1'] = { execCommand: function() {
    var data={"beginDate": "2017-01-01", "endDate": "2017-09-15"};
  //  http://192.168.1.254:9002/#/totalAssetsPosition?v=24?beginDate=2017-01-01&endDate=2017-09-15&gnumber=2&token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJndWlnZSIsInN1YiI6IntcImlkXCI6XCIxMTJcIixcInVzZXJuYW1lXCI6XCJHR0RFTU8yXCJ9IiwiaWF0IjoxNTEwNTU4MjUyLCJleHAiOjE1MTA2NDQ2NTJ9.msw8se_um9ug2Sf8sf4hSYzEFQKe0IURzCEwZZTYN2M

            var data='{"code":0,"lastYear":"16","presentYear":"17","lastMonth":9,"list":[{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"海富通纯债","DDATE":"2014-11-13","VAL_NET":"492945376.06","YLD":"18125136.28","YLD_TDNH":"3.85%","YLD_ZBNH":"3.84%","VAL_PROD_YEAR":"1.1506","VAL_PROD_MONTH":"1.1826","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"汇添富纯债","DDATE":"2014-11-11","VAL_NET":"935019761.17","YLD":"41011404.77","YLD_TDNH":"5.54%","YLD_ZBNH":"5.55%","VAL_PROD_YEAR":"1.13","VAL_PROD_MONTH":"1.1764","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"交银纯债","DDATE":"2014-11-24","VAL_NET":"585674000.97","YLD":"20983762.43","YLD_TDNH":"4.54%","YLD_ZBNH":"4.54%","VAL_PROD_YEAR":"1.1479","VAL_PROD_MONTH":"1.1861","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"南方纯债","DDATE":"2014-11-05","VAL_NET":"820575125.91","YLD":"28511046.08","YLD_TDNH":"4.32%","YLD_ZBNH":"4.32%","VAL_PROD_YEAR":"1.1389","VAL_PROD_MONTH":"1.1758","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"申万菱信纯债","DDATE":"2015-07-27","VAL_NET":"564399874.84","YLD":"20573145.44","YLD_TDNH":"4.57%","YLD_ZBNH":"4.57%","VAL_PROD_YEAR":"1.0977","VAL_PROD_MONTH":"1.1359","TYPE":"1","NID":null},{"PROD_TYPE":"纯债配置","PROD_NM_ABB":"兴业纯债","DDATE":"2015-08-19","VAL_NET":"457276112.56","YLD":"17636542.03","YLD_TDNH":"4%","YLD_ZBNH":"3.99%","VAL_PROD_YEAR":"1.0823","VAL_PROD_MONTH":"1.1138","TYPE":"1","NID":null},{"PROD_TYPE":"纯债交易","PROD_NM_ABB":"富国纯债","DDATE":"2014-11-18","VAL_NET":"1121924150.77","YLD":"12113412.97","YLD_TDNH":"1.32%","YLD_ZBNH":"1.32%","VAL_PROD_YEAR":"1.1261","VAL_PROD_MONTH":"1.1377","TYPE":"1","NID":null},{"PROD_TYPE":"纯债交易","PROD_NM_ABB":"华夏纯债","DDATE":"2014-11-10","VAL_NET":"329130026.89","YLD":"-14921876.06","YLD_TDNH":"-1.49%","YLD_ZBNH":"-2.44%","VAL_PROD_YEAR":"1.1099","VAL_PROD_MONTH":"1.0953","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"平安创赢","DDATE":"2016-03-30","VAL_NET":"7593364448.03","YLD":"305264146.91","YLD_TDNH":"4.94%","YLD_ZBNH":"4.88%","VAL_PROD_YEAR":"1.0373","VAL_PROD_MONTH":"1.0706","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达固收","DDATE":"2014-11-20","VAL_NET":"4031135638.61","YLD":"281931401.34","YLD_TDNH":"6.73%","YLD_ZBNH":"4.54%","VAL_PROD_YEAR":"1.3307","VAL_PROD_MONTH":"1.3878","TYPE":"1","NID":null},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏FOF1号","DDATE":"2016-01-06","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"2","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略1号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略2号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略3号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"华夏策略4号","DDATE":"2015-12-28","VAL_NET":"7394913425.15","YLD":"325767154.97","YLD_TDNH":"3.06%","YLD_ZBNH":"5.29%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1000"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达FOF1号","DDATE":"2017-05-10","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"2","NID":"1001"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达策略1号","DDATE":"2017-05-10","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1001"},{"PROD_TYPE":"固收+","PROD_NM_ABB":"易方达策略2号","DDATE":"2017-06-20","VAL_NET":"7199127714.03","YLD":"155119347.37","YLD_TDNH":"4.32%","YLD_ZBNH":"5.4%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"1","NID":"1001"},{"PROD_TYPE":"总资产","PROD_NM_ABB":"--","DDATE":"--","VAL_NET":"31525485654.99","YLD":"1212114624.53","YLD_TDNH":"3.53%","YLD_ZBNH":"5.03%","VAL_PROD_YEAR":"--","VAL_PROD_MONTH":"--","TYPE":"3","NID":null}]}';
            if (!isNull(data)) {
                var jsonData = $.parseJSON(data);
                this.execCommand('insertHtml',   parseData2_1_1(jsonData));

            }
    return true;
    }, queryCommandState: function() { } };

/*ue.commands['chart1'] = { execCommand: function() {

        this.execCommand('insertHtml',   getCharts());


    return true;
}, queryCommandState: function() { } };*/
$(".docDownloadingBtn").click(function(){


 //   getContent();
   $("#docDownDiv").html(UE.getEditor('docEditor').getContent());
   //重新绘制img
    $("#docDownDiv").wordExport();
});

function parseData2_1_1(performanceData){
    var szsum=0;
    var zgplzcblsum=0;
    var szzhzbsum=0;
    var tr=' <table id="performanceDoc" class="MsoNormalTable" border="1" cellspacing="0" cellpadding="0" width="100%" style="border-collapse:collapse;border:none">';
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
function getCharts(){
    var data='{"code":0,"list":[{"ASSETS_TYPE":"投资资产","TP_F_DESC":"股票","VAL_NET":1631850838.59,"YLD":"492828690.91","SYL_ZB":"49.7%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"债券","VAL_NET":28891045418.6,"YLD":"924424013.46","SYL_ZB":"3.38%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"现金","VAL_NET":978806893.13,"YLD":"31466222.99","SYL_ZB":"2.99%"},{"ASSETS_TYPE":"投资资产","TP_F_DESC":"其它资产","VAL_NET":3533510733.61,"YLD":"137094799.6","SYL_ZB":"4.35%"},{"ASSETS_TYPE":"投资负债","TP_F_DESC":"正回购","VAL_NET":-3314130564.29,"YLD":"-131180476.81","SYL_ZB":"-3.26%"},{"ASSETS_TYPE":"投资负债","TP_F_DESC":"其它负债","VAL_NET":-256909909.95,"YLD":"-6128161.13","SYL_ZB":"-6.16%"},{"ASSETS_TYPE":"总资产","TP_F_DESC":"总资产","VAL_NET":31464173409.69,"YLD":"1448505089.02","SYL_ZB":"4.12%"}]}';
    if (!isNull(data)) {
        var jsonData = $.parseJSON(data);
        var src=getEchartDataURLByOption(getTerminalCategoryConfigure( jsonData.list));
        alert(src);
        return '<p><img width="400" height="320" src="'+src+'" /></p>';
    }
    return "";
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

/**
 * 导入Excel数据
 */
$("#fileUpload").click(function(){
    var $fileInput = $(this);
    $fileInput[0].onchange = function(){
        // 异步提交表单
        oFormData = new FormData();
        oFormData.append("uploadfile", $fileInput[0].files[0]);
        var oAjaxOption = {
            type: "post",
            url: "/v1/upload/xls",
            contentType: false,
            dataType: "json",
            data: oFormData,
            processData: false,
            success: function(data) {
                alert("ok");
            },
            error: function(oData, oStatus, eErrorThrow) {
                alert("error");
            }
        };
        $.ajax(oAjaxOption);
    };

    //把file input克隆并删除旧的，用这种hacker方式清空掉the files，以修正用户重新选择同一文件无法触发onchange。
    $fileInput.after($fileInput.clone(true).val(""));
    $fileInput.remove();
});


/*toolbars: [
 [
 'anchor', //锚点
 'undo', //撤销
 'redo', //重做
 'bold', //加粗
 'indent', //首行缩进
 'snapscreen', //截图
 'italic', //斜体
 'underline', //下划线
 'strikethrough', //删除线
 'subscript', //下标
 'fontborder', //字符边框
 'superscript', //上标
 'formatmatch', //格式刷
 'source', //源代码
 'blockquote', //引用
 'pasteplain', //纯文本粘贴模式
 'selectall', //全选
 'print', //打印
 'preview', //预览
 'horizontal', //分隔线
 'removeformat', //清除格式
 'time', //时间
 'date', //日期
 'unlink', //取消链接
 'insertrow', //前插入行
 'insertcol', //前插入列
 'mergeright', //右合并单元格
 'mergedown', //下合并单元格
 'deleterow', //删除行
 'deletecol', //删除列
 'splittorows', //拆分成行
 'splittocols', //拆分成列
 'splittocells', //完全拆分单元格
 'deletecaption', //删除表格标题
 'inserttitle', //插入标题
 'mergecells', //合并多个单元格
 'deletetable', //删除表格
 'cleardoc', //清空文档
 'insertparagraphbeforetable', //"表格前插入行"
 'insertcode', //代码语言
 'fontfamily', //字体
 'fontsize', //字号
 'paragraph', //段落格式
 'simpleupload', //单图上传
 'insertimage', //多图上传
 'edittable', //表格属性
 'edittd', //单元格属性
 'link', //超链接
 'emotion', //表情
 'spechars', //特殊字符
 'searchreplace', //查询替换
 'map', //Baidu地图
 'gmap', //Google地图
 'insertvideo', //视频
 'help', //帮助
 'justifyleft', //居左对齐
 'justifyright', //居右对齐
 'justifycenter', //居中对齐
 'justifyjustify', //两端对齐
 'forecolor', //字体颜色
 'backcolor', //背景色
 'insertorderedlist', //有序列表
 'insertunorderedlist', //无序列表
 'fullscreen', //全屏
 'directionalityltr', //从左向右输入
 'directionalityrtl', //从右向左输入
 'rowspacingtop', //段前距
 'rowspacingbottom', //段后距
 'pagebreak', //分页
 'insertframe', //插入Iframe
 'imagenone', //默认
 'imageleft', //左浮动
 'imageright', //右浮动
 'attachment', //附件
 'imagecenter', //居中
 'wordimage', //图片转存
 'lineheight', //行间距
 'edittip ', //编辑提示
 'customstyle', //自定义标题
 'autotypeset', //自动排版
 'webapp', //百度应用
 'touppercase', //字母大写
 'tolowercase', //字母小写
 'background', //背景
 'template', //模板
 'scrawl', //涂鸦
 'music', //音乐
 'inserttable', //插入表格
 'drafts', // 从草稿箱加载
 'charts', // 图表
 ]
 ]*/
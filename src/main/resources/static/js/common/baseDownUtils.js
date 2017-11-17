/**
 * Created by songaw on 2017/11/2.
 */

function getContentPath(){
    return window.location.href;
}

function convertBase64ToImg(editor,base64,callback){
    if(base64){
        base64=base64.replace("data:image/png;base64,","");
    }
    var actionUrl = editor.getActionUrl(editor.getOpt('scrawlActionName')),
        params = utils.serializeParam(editor.queryCommandValue('serverparam')) || '',
        url = utils.formatUrl(actionUrl + (actionUrl.indexOf('?') == -1 ? '?':'&') + params);

    var oAjaxOption = {
        type: "post",

        dataType: "json",
        data: {upfile:base64},

        success: function(data) {
            console.log(data)
            callback(data);
        },
        error: function(oData, oStatus, eErrorThrow) {
            alert("error");
        }
    };
$.ajax(url,oAjaxOption)


}
/**
 * Convert an image
 * to a base64 string
 * @param  {String}   url
 * @param  {Function} callback
 * @param  {String}   [outputFormat=image/png]
 */
function convertImgToBase64(url,thisimg, callback, outputFormat){
    //TODO
    //如果是跨域图片  则把图片上传到服务器 返回base
   var  img = new Image;
    if(thisimg.width){

        var w = thisimg.width;
    }
    if(thisimg.height){
        var h = thisimg.height;
    }
    if(url.indexOf(getContentPath())<0&&url.indexOf("http")>-1){
        //跨域图片 后台协助返回base64
       var obj=$.ajax({url:getContentPath()+"ued/uploadNetworksImg?url="+encodeURI(url),async:false});
        img.crossOrigin = 'Anonymous';
        img.src = "data:image/jpeg;base64,"+obj.responseText;
        img.onload = function(){
            $(thisimg).attr("width", w==null||w==0?this.width:w);
            $(thisimg).attr("height",h==null||h==0?this.height:h);
            callback.call(this, this.src);
        };
       // callback();
    }else{
        var canvas = document.createElement('CANVAS'),
            ctx = canvas.getContext('2d');


        img.crossOrigin = 'Anonymous';

        img.src = url;
        img.onload = function(){
            var dataURL;
            canvas.width = w==null||w==0?this.width:w;
            canvas.height = h==null||h==0?this.height:h;
            //ctx.drawImage(img, 0, 0);
            ctx.drawImage(img, 0, 0, w==null||w==0?this.width:w, h==null||h==0?this.height:h);
            dataURL = canvas.toDataURL(outputFormat);
            $(thisimg).attr("width", w==null||w==0?this.width:w);
            $(thisimg).attr("height",h==null||h==0?this.height:h);
            callback.call(this, dataURL);
            canvas = null;
        };
    }




}

function getFileInputOption() {
    var option = {
        language: "zh",
        maxFileSize: 20480,
        maxFileCount: 1,
        browseClass: "btn btn-primary",
        uploadClass: "btn btn-success",
        removeClass: "btn btn-white",
        allowedFileExtensions: ["jpg", "jpeg", "gif", "png", "pdf", "doc", "docx", "xls", "xlsx"],
        showUpload: false,
        previewFileType: "any"
    };
    return option;
}


$.fn.wordExport = function(fileName) {


    //  var REGEXP_DATA_URL_HEAD = /^data\:([^\;]+)\;base64,/;
    //  var REGEXP_DATA_URL_JPEG = /^data\:image\/jpeg.*;base64,/;


    fileName = typeof fileName !== 'undefined' ? fileName : "导出";
    var static = {
        mhtml: {
            top: "Mime-Version: 1.0\nContent-Base: " + location.href + "\nContent-Type: Multipart/related; boundary=\"NEXT.ITEM-BOUNDARY\";type=\"text/html\"\n\n--NEXT.ITEM-BOUNDARY\nContent-Type: text/html; charset=\"utf-8\"\nContent-Location: " + location.href + "\n\n<!DOCTYPE html>\n<html>\n_html_</html>",
            head: "<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n<style>\n+ '_styles_' + \n</style>\n</head>\n",
            body: "<body>_body_</body>"
        }
    };
    var options = {
        maxWidth: 624
    };
    // Clone selected element before manipulating it
    var markup = $(this).clone();

    // Remove hidden elements from the output
    /* markup.each(function() {
     var self = $(this);
     if (self.is(':hidden'))
     self.remove();
     });*/


    var images = Array();
    var imgs = markup.find('img');

        loadImg(imgs,0,images,function(data){
            console.log(fileContent)
            // Prepare bottom of mhtml file with image data
            var mhtmlBottom = "\n";
            for (var i = 0; i < data.length; i++) {
                mhtmlBottom += "--NEXT.ITEM-BOUNDARY\n";
                mhtmlBottom += "Content-Location: " + data[i].location + "\n";
                mhtmlBottom += "Content-Type: " + data[i].type + "\n";
                mhtmlBottom += "Content-Transfer-Encoding: " + data[i].encoding + "\n\n";
                mhtmlBottom += data[i].data + "\n\n";
            }
            mhtmlBottom += "--NEXT.ITEM-BOUNDARY--";

//			 TODO: load css from included stylesheet

            // Aggregate parts of the file together
            var fileContent = static.mhtml.top.replace("_html_",static.mhtml.head.replace("_styles_","")+static.mhtml.body.replace("_body_", markup.html())) + mhtmlBottom;
            console.log(fileContent)
            // Create a Blob with the file contents
            var blob = new Blob([fileContent], {
                type: "application/msword;charset=utf-8"
            });
            saveAs(blob, fileName + ".doc");
        });









}
var REGEXP_DATA_URL = /^data\:/;
function loadImg(imgs,index,images,callback){

    if(index==imgs.length){
        callback.call(this,images);
        return;
    }
    if(isNull($(imgs[index]).attr("src"))){
        loadImg(imgs,index+1,images,callback);
    }
    var uri=$(imgs[index]).attr("src");
    if (!REGEXP_DATA_URL.test($(imgs[index]).attr("src"))) {
       convertImgToBase64(uri,imgs[index],function(data){
           uri=data;
           $(imgs[index]).attr("src",uri);


           images[index] = {

               type: uri.substring(uri.indexOf(":") + 1, uri.indexOf(";")),
               encoding: uri.substring(uri.indexOf(";") + 1, uri.indexOf(",")),
               location: $(imgs[index]).attr("src"),
               data: uri.substring(uri.indexOf(",") + 1)
           };
           loadImg(imgs,index+1,images,callback);
       });

    }else{
        images[index] = {
            type: uri.substring(uri.indexOf(":") + 1, uri.indexOf(";")),
            encoding: uri.substring(uri.indexOf(";") + 1, uri.indexOf(",")),
            location: $(imgs[index]).attr("src"),
            data: uri.substring(uri.indexOf(",") + 1)
        };
        loadImg(imgs,index+1,images,callback);
    }

}



var saveAs = saveAs || (
        function saveAs(view) {
            "use strict";
            // IE <10 is explicitly unsupported
            if (typeof view === "undefined" || typeof navigator !== "undefined" && /MSIE [1-9]\./.test(navigator.userAgent)) {
                return;
            }
            var
                doc = view.document
                // only get URL when necessary in case Blob.js hasn't overridden it yet
                , get_URL = function() {
                    return view.URL || view.webkitURL || view;
                }
                , save_link = doc ? doc.createElementNS("http://www.w3.org/1999/xhtml", "a") : []
                , can_use_save_link = "download" in save_link
                , click = function(node) {
                    var event = new MouseEvent("click");
                    node.dispatchEvent(event);
                }
                , is_safari = /constructor/i.test(view.HTMLElement) || view.safari
                , is_chrome_ios =/CriOS\/[\d]+/.test(navigator.userAgent)
                , throw_outside = function(ex) {
                    (view.setImmediate || view.setTimeout)(function() {
                        throw ex;
                    }, 0);
                }
                , force_saveable_type = "application/octet-stream"
                // the Blob API is fundamentally broken as there is no "downloadfinished" event to subscribe to
                , arbitrary_revoke_timeout = 1000 * 40 // in ms
                , revoke = function(file) {
                    var revoker = function() {
                        if (typeof file === "string") { // file is an object URL
                            get_URL().revokeObjectURL(file);
                        } else { // file is a File
                            file.remove();
                        }
                    };
                    setTimeout(revoker, arbitrary_revoke_timeout);
                }
                , dispatch = function(filesaver, event_types, event) {
                    event_types = [].concat(event_types);
                    var i = event_types.length;
                    while (i--) {
                        var listener = filesaver["on" + event_types[i]];
                        if (typeof listener === "function") {
                            try {
                                listener.call(filesaver, event || filesaver);
                            } catch (ex) {
                                throw_outside(ex);
                            }
                        }
                    }
                }
                , auto_bom = function(blob) {
                    // prepend BOM for UTF-8 XML and text/* types (including HTML)
                    // note: your browser will automatically convert UTF-16 U+FEFF to EF BB BF
                    if (/^\s*(?:text\/\S*|application\/xml|\S*\/\S*\+xml)\s*;.*charset\s*=\s*utf-8/i.test(blob.type)) {
                        return new Blob([String.fromCharCode(0xFEFF), blob], {type: blob.type});
                    }
                    return blob;
                }
                , FileSaver = function(blob, name, no_auto_bom) {
                    if (!no_auto_bom) {
                        blob = auto_bom(blob);
                    }
                    // First try a.download, then web filesystem, then object URLs
                    var
                        filesaver = this
                        , type = blob.type
                        , force = type === force_saveable_type
                        , object_url
                        , dispatch_all = function() {
                            dispatch(filesaver, "writestart progress write writeend".split(" "));
                        }
                        // on any filesys errors revert to saving with object URLs
                        , fs_error = function() {
                            if ((is_chrome_ios || (force && is_safari)) && view.FileReader) {
                                // Safari doesn't allow downloading of blob urls
                                var reader = new FileReader();
                                reader.onloadend = function() {
                                    var url = is_chrome_ios ? reader.result : reader.result.replace(/^data:[^;]*;/, 'data:attachment/file;');
                                    var popup = view.open(url, '_blank');
                                    if(!popup) view.location.href = url;
                                    url=undefined; // release reference before dispatching
                                    filesaver.readyState = filesaver.DONE;
                                    dispatch_all();
                                };
                                reader.readAsDataURL(blob);
                                filesaver.readyState = filesaver.INIT;
                                return;
                            }
                            // don't create more object URLs than needed
                            if (!object_url) {
                                object_url = get_URL().createObjectURL(blob);
                            }
                            if (force) {
                                view.location.href = object_url;
                            } else {
                                var opened = view.open(object_url, "_blank");
                                if (!opened) {
                                    // Apple does not allow window.open, see https://developer.apple.com/library/safari/documentation/Tools/Conceptual/SafariExtensionGuide/WorkingwithWindowsandTabs/WorkingwithWindowsandTabs.html
                                    view.location.href = object_url;
                                }
                            }
                            filesaver.readyState = filesaver.DONE;
                            dispatch_all();
                            revoke(object_url);
                        }
                    ;
                    filesaver.readyState = filesaver.INIT;

                    if (can_use_save_link) {
                        object_url = get_URL().createObjectURL(blob);
                        setTimeout(function() {
                            save_link.href = object_url;
                            save_link.download = name;
                            click(save_link);
                            dispatch_all();
                            revoke(object_url);
                            filesaver.readyState = filesaver.DONE;
                        });
                        return;
                    }

                    fs_error();
                }
                , FS_proto = FileSaver.prototype
                , saveAs = function(blob, name, no_auto_bom) {
                    return new FileSaver(blob, name || blob.name || "download", no_auto_bom);
                }
            ;
            // IE 10+ (native saveAs)
            if (typeof navigator !== "undefined" && navigator.msSaveOrOpenBlob) {
                return function(blob, name, no_auto_bom) {
                    name = name || blob.name || "download";

                    if (!no_auto_bom) {
                        blob = auto_bom(blob);
                    }
                    return navigator.msSaveOrOpenBlob(blob, name);
                };
            }

            FS_proto.abort = function(){};
            FS_proto.readyState = FS_proto.INIT = 0;
            FS_proto.WRITING = 1;
            FS_proto.DONE = 2;

            FS_proto.error =
                FS_proto.onwritestart =
                    FS_proto.onprogress =
                        FS_proto.onwrite =
                            FS_proto.onabort =
                                FS_proto.onerror =
                                    FS_proto.onwriteend =
                                        null;

            return saveAs;
        }(
            typeof self !== "undefined" && self
            || typeof window !== "undefined" && window
            || this.content
        ));

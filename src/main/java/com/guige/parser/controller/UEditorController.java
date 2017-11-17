package com.guige.parser.controller;

import com.baidu.ueditor.ActionEnter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@Controller
@RequestMapping("/ued")
public class UEditorController{
    private static final Logger LOGGER = LoggerFactory.getLogger(UEditorController.class);

    @Value("${parser.uploadPath}")
    String uploadPath;

    @RequestMapping(value="/config")
    public void config(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("application/json");

        String rootPath = uploadPath;//  ClassUtils.getDefaultClassLoader().getResource("").getPath();
        //System.out.println(rootPath+"---"+uploadPath);
        //TODO 加用户名
        String action = request.getParameter("action");
        if(action.equals("config")){

        }
        try {
            //TODO 加用户名
            String result = new ActionEnter(request, rootPath).exec();
            if( action!=null &&
                    (action.equals("listfile") || action.equals("listimage") ) ){
               // rootPath = rootPath.substring(1,rootPath.length());
                result = result.replaceAll(rootPath, "/");
                result = result.replaceAll("//", "/");
            }
            PrintWriter writer = response.getWriter();
            writer.write(result);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value="/uploadNetworksImg")
    public void uploadNetworksImg(HttpServletRequest request, HttpServletResponse response) throws IOException{

        //TODO 加用户名
        String imgUrl  = request.getParameter("url");
        try{
            File file = new File(uploadPath+imgUrl);
            PrintWriter writer = response.getWriter();
            InputStream inputStream = new FileInputStream(file);
            String base64= Base64.encodeBase64String(IOUtils.toByteArray(inputStream));
            writer.write(base64);
            writer.flush();
            writer.close();
        }catch (Exception e){
            URL url = new URL(imgUrl);
            URLConnection conn = url.openConnection();
            String base64= Base64.encodeBase64String(IOUtils.toByteArray(conn.getInputStream()));
            PrintWriter writer = response.getWriter();
            writer.write(base64);
            writer.flush();
            writer.close();
        }

    }

}  
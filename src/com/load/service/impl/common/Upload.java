package com.load.service.impl.common;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import com.load.util.CommonVal;
@Service  
public class Upload {  
	 private  SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
    /* 
     * 上传图片并返回图片的相对地址 
     */   
    public String uploadImage(CommonsMultipartFile file,String realUploadPath) throws IOException  
    {  
    	   String date = df.format(new Date());
        //如果目录不存在则创建目录  
        File uploadFile=new File(realUploadPath);  
        if(!uploadFile.exists()){  
            uploadFile.mkdirs();  
        }         
          String [] tmp = file.getOriginalFilename().split("\\.");
        //创建输入流  
        InputStream inputStream=file.getInputStream();  
        //生成输出地址URL  
        String outputPath=realUploadPath+"/"+date+"."+tmp[tmp.length-1];  
        //创建输出流  
        OutputStream outputStream=new FileOutputStream(outputPath);       
        //设置缓冲区  
        byte[] buffer=new byte[1024];  
        //输入流读入缓冲区，输出流从缓冲区写出  
        while((inputStream.read(buffer))>0)  
        {  
          outputStream.write(buffer);  
        }  
        outputStream.close();  
        //返回原图上传后的相对地址  
         if(CommonVal.tomcatRealPath==null||CommonVal.tomcatRealPath.equals("")){
      		return CommonVal.defaultImgUri+"/"+date+"."+tmp[tmp.length-1];   
     	}else{
     		return CommonVal.imgUri+"/"+date+"."+tmp[tmp.length-1];
     	}
    }  
}  

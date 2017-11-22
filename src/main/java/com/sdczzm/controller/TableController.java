package com.sdczzm.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSON;
import com.sdczzm.service.utils.CVSUtils;


@RestController
public class TableController {
	
	@PostMapping("/upload")
	public String hello(@RequestParam("file") MultipartFile file){
		if (!file.isEmpty()) {
            try {           	
            	// 文件保存路径  
                String filePath ="/temporaryFiles/"+ file.getOriginalFilename();  
                // 转存文件  
                file.transferTo(new File(filePath));  
                File f = new File(filePath);   	
                List<Map<String,String>> dataList = CVSUtils.importCsv(f);
                //存表   
                JSON.toJSONString(dataList, true);	
            } catch (Exception e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的.";
        }
	}

}

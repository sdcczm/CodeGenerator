package com.sdczzm.template.common;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

/**
 * freeMarker模板用于生成文件
 * @author QiHuifang
 *
 */
public class FreeMarkerUtils {
	
	/**
	 * 
	 * @param root 数据模型
	 * @param dirName 模板所在文件夹位置
	 * @param templateName 模板文件名称
	 * @throws Exception
	 */
	public static String createFileByTemplate(Map root,String dirName,String templateName) throws Exception{
		//生成的模板写到文件中
		StringWriter out = new StringWriter();
//	    Writer out = new OutputStreamWriter(System.out); 
		try {
			//创建配置实例
	        Configuration cfg = new Configuration(new Version(2, 3, 23));
	        //模板所在文件夹位置
	        String rootPath=FreeMarkerUtils.class.getResource("/").getFile();
	        File dir = new File(rootPath+dirName);
	        cfg.setDirectoryForTemplateLoading(dir);        
	        //加载模板文件
	        Template template = cfg.getTemplate(templateName);       
	        template.process(root, out);
			out.flush();
			String temp = out.toString();
			System.out.println(temp);
			return "ok";
		} finally {
			if(out!=null){
				out.close();
			}
		}
	}

}

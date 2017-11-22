package com.sdczzm.service.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * 
 * CVS 操作
 * @author QiHuifang
 *
 */
public class CVSUtils {

	/**
     * 导入
     * 
     * @param file csv文件(路径+文件)
     * @return
     */
	public static List<Map<String,String>> importCsv(File file) {
		List<String> dataList = new ArrayList<String>();
		//第一列 ，抬头
		String[] headers = null ;
		//存放数据
		List<Map<String,String>>  bodyList = new ArrayList<Map<String,String>>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = br.readLine()) != null) {
				dataList.add(line);
			}
			if(CollectionUtils.isEmpty(dataList)){
				return null;
			}
			//获取抬头
			headers = dataList.get(0).split(","); 
			int num=dataList.size();
			for(int i=1 ; i<num ; i++){
				Map<String,String> bodyMap = new HashMap<String, String>();
				String[] datas = dataList.get(i).split(","); 
				if(datas.length!=headers.length){
					throw new RuntimeException("第"+(i+1)+"行CVS数据格式有误");
				}
				int j=0;
				for(String h : headers){
					if(!StringUtils.isEmpty(datas[j])){
						bodyMap.put(h,datas[j]);
					}
					j++ ;
				}
				bodyList.add(bodyMap);
			}
			String json = JSON.toJSONString(bodyList, true);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return bodyList;
	}
}

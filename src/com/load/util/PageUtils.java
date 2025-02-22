package com.load.util;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.formula.functions.T;
public class PageUtils {
	public static List getCurrentPageList(List list,Integer page,Integer rows){
		if(page==null){
			return list;
		}
		int size = list.size();
		int startNum = (page-1)*rows;
		int endNum = (page-1)*rows+rows;
		if(startNum>=size){
			return new ArrayList<Object>();
		}
		if(endNum>=size){
			return list.subList(startNum, size);
		}else{
			return list.subList(startNum, endNum);
		}
	}
}

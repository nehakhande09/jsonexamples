package com.jbk;

import java.io.FileReader;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class update {
	@Test
	public  void test01() throws Exception  
    { 
        // parsing file "JSONExample.json" 
		JSONParser pa = new JSONParser();
        //Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
		FileReader ff = new FileReader("jsonnn.json");
		
		Object obj = pa.parse(ff);
		
		JSONObject jsonobject=(JSONObject) obj;
		
	    System.out.println(jsonobject.get("firstName"));
	    
	    jsonobject.put("firstName","neha");
	    
	    PrintWriter p = new PrintWriter("jsonnn.json");
	    p.write(jsonobject.toString());
	    System.out.println("you did it");
		
	    p.flush();
	    p.close();
        
        System.out.println("updated");

}
}
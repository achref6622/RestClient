package com.achref.javalabs.client.builder;

import java.util.HashMap;
import java.util.Map;

public class Builder {
	
	
	private Map<String , Object> params = new HashMap<String , Object> () ;
	private String param1 ,param2 ; 
	private int param3 ; 
	private boolean param4 ; 
	
	public Builder param1(String param1) {
		this.param1 = param1 ;
		params.put("param1", param1);
		return this ;
	}
	public Builder param2(String param2) {
		this.param2 = param2 ;
		params.put("param2", param2);

		return this ;
	}
	public Builder param3(int param3) {
		this.param3 = param3 ;
		params.put("param3", param3);

		return this ;
	}
	public Builder param4(boolean param4) {
		
		this.param4 = param4 ;
		params.put("param4", param4);

		return this ;
	}
	public PersonParamBuilder build (){
		PersonParamBuilder parametres = new PersonParamBuildImp() ; 
		parametres.putAll(params);
		return parametres ;
		
	}

}

package com.kh.toy.common.code;

public enum Config {
	//DOMAIN("https://pclass.ga"),
	DOMAIN("http://localhost:9090/"),
	COMPANY_EMAIL("akhj123akhjK@gmail.com"),
	SMTP_AUTHENTICATION_ID("akhj123akhjK@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("dsc1406021_"),
	//UPLOAD_PATH("C:\\CODE\\before\\"), 
	UPLOAD_PATH("C:\\CODE\\before\\upload\\");


	public final String DESC;

	Config(String desc) {
		this.DESC = desc;
	}
}
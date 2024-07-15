package com.sdetadda.allure;

import j2html.tags.Tag;

public class J2HTMLBase {
	// TODO Auto-generated method stub
	public String htmlConvert(Tag<?> t1) {
		return t1.render().toString();
	}
}

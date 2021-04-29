package com.no_1;

import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

public class HelloApp {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		ctx.close();
	}
}

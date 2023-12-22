package com.xworkz.festival.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.app.ChhathPooja;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dusshera;
import com.xworkz.festival.app.Festival;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.MakarSankrant;
import com.xworkz.festival.app.Ugadi;
import com.xworkz.festival.config.FestivalConfig;

public class FestivalRunner {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(FestivalConfig.class);
		
		Festival fest = context.getBean(Dusshera.class);
		Festival fest1 = context.getBean(Holi.class);
		Festival fest2 = context.getBean(ChhathPooja.class);
		Festival fest3 = context.getBean(Ugadi.class);
		Festival fest4 = context.getBean(Diwali.class);
		Festival fest5 = context.getBean(MakarSankrant.class);
		
		fest.celebration();
		fest1.doWorship();
		fest2.celebration();
		fest3.doWorship();
		fest4.doWorship();
		fest5.celebration();
		
	}
	

}

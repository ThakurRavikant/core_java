package com.xworkz.festival.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.festival.app.ChhathPooja;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dusshera;
import com.xworkz.festival.app.GaneshChaturthi;
import com.xworkz.festival.app.HampiUtsav;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.MakarSankrant;
import com.xworkz.festival.app.PongalFestival;
import com.xworkz.festival.app.Ugadi;

@Configuration
public class FestivalConfig {

	@Bean
	public Dusshera getDusshera() {
		return new Dusshera();
	}
	
	@Bean
	public Diwali getDiwali() {
		return new Diwali();
	}

	@Bean
	public Holi getHoli() {
		return new Holi();
	}

	@Bean
	public ChhathPooja getChhathPooja() {
		return new ChhathPooja();
	}
	
	@Bean
	public HampiUtsav getHampiUtsav() {
		return new HampiUtsav();
	}
	
	@Bean
	public Ugadi getUgadi() {
		return new Ugadi();
	}
	@Bean
	public GaneshChaturthi getGaneshChaturthi() {
		return new GaneshChaturthi();
	}
	@Bean
	public MakarSankrant getMakarSankrant() {
		return new MakarSankrant();
	}
	@Bean
	public PongalFestival getPongalFestival() {
		return new PongalFestival();
	}
}

package com.xworkz.song.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SongDTO {
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String name;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String singer;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String composer;
	
	@Min(value=2, message="experience: positive number, min 2 is required")
	@Max(6)
	private int duration;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String album;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String langague;
	
	private String releaseDate;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String lyricist;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String producer;
	
	@NotNull
	@Size(max=20,min=3, message="Name should not be less than 3")
	private String director;

}

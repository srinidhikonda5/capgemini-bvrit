package com.capg.moviecatelog.model;

import java.util.List;

public class CatelogList {

	private List<MovieCatelog> listOfMovie;
	
	public CatelogList() {}

	public List<MovieCatelog> getListOfMovie() {
		return listOfMovie;
	}

	public void setListOfMovie(List<MovieCatelog> listOfMovie) {
		this.listOfMovie = listOfMovie;
	}

	public CatelogList(List<MovieCatelog> listOfMovie) {
		super();
		this.listOfMovie = listOfMovie;
	}
	
	
	
}

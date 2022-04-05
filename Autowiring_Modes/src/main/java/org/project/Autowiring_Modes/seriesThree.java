package org.project.Autowiring_Modes;

public class seriesThree implements hollywoodSeries{
seriesType series;
//class fields
private String movierating;
private String moviecast;

/*
 * public seriesThree(seriesType st) { this.series = st; }
 */	

public void setMoviecast(String moviecast) {
	this.moviecast = moviecast;
}
public void setMovierating(String movierating) {
	this.movierating = movierating;
}
public String getMovierating() {
	return movierating;
}
public String getMoviecast() {
	
	return moviecast;
}

@Override
	public String seriesName() {
		// TODO Auto-generated method stub
		return "6 UnderGround";
	}
//If we want to call Dependency Method then what we will do
	@Override
	public String giveSeriesDetails() {
		// TODO Auto-generated method stub
		return "Action + Humour + Sci Fi";
	}

	
}


package org.practice.simpleDependencyInjectiom;

public class seriesFirst implements hollywoodSeries {
public seriesType  series;
	
 public seriesFirst(seriesType st) { this.series = st; }

	
	/*
	 * public void setSeries(seriesType series) { this.series = series; }
	 */



	@Override
	public String seriesName() {
		// TODO Auto-generated method stub
		return "Extraction";
	}
	
	
	/*
	 * We will use This setter method in by name and in xml specify the name of class
	 * public void setSeries(seriesType series) { this.series = series; }
	 */
	@Override
	public String giveSeriesDetails() {
		// TODO Auto-generated method stub
		return series.seriesDetails();
	}

}

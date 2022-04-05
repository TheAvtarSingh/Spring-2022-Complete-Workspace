package org.practice.simpleDependencyInjectiom;

public class seriesTwo implements hollywoodSeries {
	public seriesType series;

	/*
	 * public seriesTwo(seriesType st) { this.series = st; }
	 */

	@Override
	public String seriesName() {
		// TODO Auto-generated method stub
		return "Red Notice";
	}

	public void setSeries(seriesType series) {
		this.series = series;
	}

	@Override
	public String giveSeriesDetails() {
		// TODO Auto-generated method stub
		return series.seriesDetails();
	}

}

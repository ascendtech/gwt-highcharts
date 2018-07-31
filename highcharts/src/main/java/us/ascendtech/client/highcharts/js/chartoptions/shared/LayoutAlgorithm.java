package us.ascendtech.client.highcharts.js.chartoptions.shared;

public enum LayoutAlgorithm {

	SLICE_AND_DICE("sliceAndDice"),
	STRIPES("stripes"),
	SQUARIFIED("squarified"),
	STRIP("strip");

	private String layoutAlgorithm;

	LayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
	}

	public String getLayoutAlgorithm() {
		return layoutAlgorithm;
	}
}

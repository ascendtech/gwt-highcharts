package us.ascendtech.highcharts.client.chartoptions.shared;

public enum LayoutAlgorithmEnum {

	SLICE_AND_DICE("sliceAndDice"),
	STRIPES("stripes"),
	SQUARIFIED("squarified"),
	STRIP("strip");

	private String layoutAlgorithm;

	LayoutAlgorithmEnum(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
	}

	public String getLayoutAlgorithm() {
		return layoutAlgorithm;
	}
}

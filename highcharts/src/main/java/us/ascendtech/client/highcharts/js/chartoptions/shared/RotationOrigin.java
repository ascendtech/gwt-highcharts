package us.ascendtech.client.highcharts.js.chartoptions.shared;

public enum RotationOrigin {

	START("start"),
	CENTER("center"),
	END("end");

	private String rotationOrigin;

	RotationOrigin(String rotationOrigin) {
		this.rotationOrigin = rotationOrigin;
	}

	public String getRotationOrigin() {
		return rotationOrigin;
	}
}

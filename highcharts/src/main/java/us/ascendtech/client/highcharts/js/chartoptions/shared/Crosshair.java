package us.ascendtech.client.highcharts.js.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Crosshair {

	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private String dashStyle;
	@JsProperty
	private Boolean snap;
	@JsProperty
	private double width;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Crosshair setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Crosshair setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final Crosshair setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final Boolean getSnap() {
		return snap;
	}

	@JsOverlay
	public final Crosshair setSnap(Boolean snap) {
		this.snap = snap;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final Crosshair setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final Crosshair setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}

package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Level {

	@JsProperty
	private String borderColor;
	@JsProperty
	private String borderDashStyle;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String color;
	@JsProperty
	private ColorVariation colorVariation;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private LevelSize levelSize;
	@JsProperty
	private double rotation;
	@JsProperty
	private String rotationMode;

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Level setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final String getBorderDashStyle() {
		return borderDashStyle;
	}

	@JsOverlay
	public final Level setBorderDashStyle(String borderDashStyle) {
		this.borderDashStyle = borderDashStyle;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Level setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Level setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final ColorVariation getColorVariation() {
		return colorVariation;
	}

	@JsOverlay
	public final Level setColorVariation(ColorVariation colorVariation) {
		this.colorVariation = colorVariation;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Level setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final LevelSize getLevelSize() {
		return levelSize;
	}

	@JsOverlay
	public final Level setLevelSize(LevelSize levelSize) {
		this.levelSize = levelSize;
		return this;
	}

	@JsOverlay
	public final double getRotation() {
		return rotation;
	}

	@JsOverlay
	public final Level setRotation(double rotation) {
		this.rotation = rotation;
		return this;
	}

	@JsOverlay
	public final String getRotationMode() {
		return rotationMode;
	}

	@JsOverlay
	public final Level setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		return this;
	}
}

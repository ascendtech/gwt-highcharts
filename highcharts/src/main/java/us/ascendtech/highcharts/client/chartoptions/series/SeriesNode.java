package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesNode {
	@JsProperty
	private Object color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private double column;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private String id;
	@JsProperty
	private double level;
	@JsProperty
	private String name;
	@JsProperty
	private double offset;
	@JsProperty
	private double offsetHorizontal;
	@JsProperty
	private double offsetVertical;

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesNode setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final SeriesNode setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final double getColumn() {
		return column;
	}

	@JsOverlay
	public final SeriesNode setColumn(double column) {
		this.column = column;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final SeriesNode setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final SeriesNode setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final double getLevel() {
		return level;
	}

	@JsOverlay
	public final SeriesNode setLevel(double level) {
		this.level = level;
		return this;
	}

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final SeriesNode setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final double getOffset() {
		return offset;
	}

	@JsOverlay
	public final SeriesNode setOffset(double offset) {
		this.offset = offset;
		return this;
	}

	@JsOverlay
	public final double getOffsetHorizontal() {
		return offsetHorizontal;
	}

	@JsOverlay
	public final SeriesNode setOffsetHorizontal(double offsetHorizontal) {
		this.offsetHorizontal = offsetHorizontal;
		return this;
	}

	@JsOverlay
	public final double getOffsetVertical() {
		return offsetVertical;
	}

	@JsOverlay
	public final SeriesNode setOffsetVertical(double offsetVertical) {
		this.offsetVertical = offsetVertical;
		return this;
	}
}

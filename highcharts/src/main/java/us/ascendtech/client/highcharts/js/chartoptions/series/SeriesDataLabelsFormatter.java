package us.ascendtech.client.highcharts.js.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesDataLabelsFormatter {

	@JsProperty
	private double percentage;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private Series series;
	@JsProperty
	private double total;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final double getPercentage() {
		return percentage;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setPercentage(double percentage) {
		this.percentage = percentage;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final Series getSeries() {
		return series;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setSeries(Series series) {
		this.series = series;
		return this;
	}

	@JsOverlay
	public final double getTotal() {
		return total;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setTotal(double total) {
		this.total = total;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final SeriesDataLabelsFormatter setY(double y) {
		this.y = y;
		return this;
	}
}

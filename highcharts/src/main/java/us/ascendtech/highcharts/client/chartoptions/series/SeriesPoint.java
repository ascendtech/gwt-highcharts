package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesPoint {

	@JsProperty
	private String category;
	@JsProperty
	private double clientX;
	@JsProperty
	private String color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private String display;
	@JsProperty
	private double dist;
	@JsProperty
	private double distX;
	@JsProperty
	private SeriesPointGraphic graphic;
	@JsProperty
	private Boolean hasImage;
	@JsProperty
	private double index;
	@JsProperty
	private Boolean isInside;
	@JsProperty
	private Boolean isNull;
	@JsProperty
	private String name;
	@JsProperty
	private Boolean negative;
	@JsProperty
	private JsPropertyMap<Object> options;
	@JsProperty
	private double plotX;
	@JsProperty
	private double plotY;
	@JsProperty
	private Series series;
	@JsProperty
	private String state;
	@JsProperty
	private double x;
	@JsProperty
	private double y;
	@JsProperty
	private double yBottom;
	@JsProperty
	private double zone;

	@JsOverlay
	public final String getCategory() {
		return category;
	}

	@JsOverlay
	public final SeriesPoint setCategory(String category) {
		this.category = category;
		return this;
	}

	@JsOverlay
	public final double getClientX() {
		return clientX;
	}

	@JsOverlay
	public final SeriesPoint setClientX(double clientX) {
		this.clientX = clientX;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesPoint setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final SeriesPoint setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getDisplay() {
		return display;
	}

	@JsOverlay
	public final void setDisplay(String display) {
		this.display = display;
	}

	@JsOverlay
	public final double getDist() {
		return dist;
	}

	@JsOverlay
	public final SeriesPoint setDist(double dist) {
		this.dist = dist;
		return this;
	}

	@JsOverlay
	public final double getDistX() {
		return distX;
	}

	@JsOverlay
	public final SeriesPoint setDistX(double distX) {
		this.distX = distX;
		return this;
	}

	@JsOverlay
	public final SeriesPointGraphic getGraphic() {
		return graphic;
	}

	@JsOverlay
	public final SeriesPoint setGraphic(SeriesPointGraphic graphic) {
		this.graphic = graphic;
		return this;
	}

	@JsOverlay
	public final Boolean getHasImage() {
		return hasImage;
	}

	@JsOverlay
	public final SeriesPoint setHasImage(Boolean hasImage) {
		this.hasImage = hasImage;
		return this;
	}

	@JsOverlay
	public final double getIndex() {
		return index;
	}

	@JsOverlay
	public final SeriesPoint setIndex(double index) {
		this.index = index;
		return this;
	}

	@JsOverlay
	public final Boolean getInside() {
		return isInside;
	}

	@JsOverlay
	public final SeriesPoint setInside(Boolean inside) {
		isInside = inside;
		return this;
	}

	@JsOverlay
	public final Boolean getNull() {
		return isNull;
	}

	@JsOverlay
	public final SeriesPoint setNull(Boolean aNull) {
		isNull = aNull;
		return this;
	}

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final SeriesPoint setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final Boolean getNegative() {
		return negative;
	}

	@JsOverlay
	public final SeriesPoint setNegative(Boolean negative) {
		this.negative = negative;
		return this;
	}

	@JsOverlay
	public final JsPropertyMap<Object> getOptions() {
		return options;
	}

	@JsOverlay
	public final SeriesPoint setOptions(JsPropertyMap<Object> options) {
		this.options = options;
		return this;
	}

	@JsOverlay
	public final double getPlotX() {
		return plotX;
	}

	@JsOverlay
	public final SeriesPoint setPlotX(double plotX) {
		this.plotX = plotX;
		return this;
	}

	@JsOverlay
	public final double getPlotY() {
		return plotY;
	}

	@JsOverlay
	public final SeriesPoint setPlotY(double plotY) {
		this.plotY = plotY;
		return this;
	}

	@JsOverlay
	public final Series getSeries() {
		return series;
	}

	@JsOverlay
	public final SeriesPoint setSeries(Series series) {
		this.series = series;
		return this;
	}

	@JsOverlay
	public final String getState() {
		return state;
	}

	@JsOverlay
	public final SeriesPoint setState(String state) {
		this.state = state;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final SeriesPoint setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final SeriesPoint setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final double getyBottom() {
		return yBottom;
	}

	@JsOverlay
	public final SeriesPoint setyBottom(double yBottom) {
		this.yBottom = yBottom;
		return this;
	}

	@JsOverlay
	public final double getZone() {
		return zone;
	}

	@JsOverlay
	public final SeriesPoint setZone(double zone) {
		this.zone = zone;
		return this;
	}

	public native void zoomTo();

	public native String getClassName();
}

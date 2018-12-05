package us.ascendtech.highcharts.client.chartoptions.shared;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Formatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisLabels {

	@JsProperty
	private String align;
	@JsProperty
	private JsArray<Double> autoRotation;
	@JsProperty
	private double autoRotationLimit;
	@JsProperty
	private double distance;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private String format;
	@JsProperty
	private Formatter formatter;
	@JsProperty
	private String overflow;
	@JsProperty
	private double padding;
	@JsProperty
	private String position3d;
	@JsProperty
	private Boolean reserveSpace;
	@JsProperty
	private double rotation;
	@JsProperty
	private Boolean skew3d;
	@JsProperty
	private double staggerLines;
	@JsProperty
	private double step;
	@JsProperty
	private Style style;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private double x;
	@JsProperty
	private double y;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final AxisLabels setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getAutoRotation() {
		return autoRotation;
	}

	@JsOverlay
	public final AxisLabels setAutoRotation(JsArray<Double> autoRotation) {
		this.autoRotation = autoRotation;
		return this;
	}

	@JsOverlay
	public final double getAutoRotationLimit() {
		return autoRotationLimit;
	}

	@JsOverlay
	public final AxisLabels setAutoRotationLimit(double autoRotationLimit) {
		this.autoRotationLimit = autoRotationLimit;
		return this;
	}

	@JsOverlay
	public final double getDistance() {
		return distance;
	}

	@JsOverlay
	public final AxisLabels setDistance(double distance) {
		this.distance = distance;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final AxisLabels setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final String getFormat() {
		return format;
	}

	@JsOverlay
	public final AxisLabels setFormat(String format) {
		this.format = format;
		return this;
	}

	@JsOverlay
	public final Formatter getFormatter() {
		return formatter;
	}

	@JsOverlay
	public final AxisLabels setFormatter(Formatter formatter) {
		this.formatter = formatter;
		return this;
	}

	@JsOverlay
	public final String getOverflow() {
		return overflow;
	}

	@JsOverlay
	public final AxisLabels setOverflow(String overflow) {
		this.overflow = overflow;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final AxisLabels setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getPosition3d() {
		return position3d;
	}

	@JsOverlay
	public final AxisLabels setPosition3d(String position3d) {
		this.position3d = position3d;
		return this;
	}

	@JsOverlay
	public final Boolean getReserveSpace() {
		return reserveSpace;
	}

	@JsOverlay
	public final AxisLabels setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		return this;
	}

	@JsOverlay
	public final double getRotation() {
		return rotation;
	}

	@JsOverlay
	public final AxisLabels setRotation(double rotation) {
		this.rotation = rotation;
		return this;
	}

	@JsOverlay
	public final Boolean getSkew3d() {
		return skew3d;
	}

	@JsOverlay
	public final AxisLabels setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		return this;
	}

	@JsOverlay
	public final double getStaggerLines() {
		return staggerLines;
	}

	@JsOverlay
	public final AxisLabels setStaggerLines(double staggerLines) {
		this.staggerLines = staggerLines;
		return this;
	}

	@JsOverlay
	public final double getStep() {
		return step;
	}

	@JsOverlay
	public final AxisLabels setStep(double step) {
		this.step = step;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final AxisLabels setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final AxisLabels setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final AxisLabels setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final AxisLabels setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final AxisLabels setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}

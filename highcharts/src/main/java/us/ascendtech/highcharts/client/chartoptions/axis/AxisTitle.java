package us.ascendtech.highcharts.client.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisTitle {

	@JsProperty
	private String align;
	@JsProperty
	private double margin;
	@JsProperty
	private double offset;
	@JsProperty
	private String position3d;
	@JsProperty
	private Boolean reserveSpace;
	@JsProperty
	private double rotation;
	@JsProperty
	private Boolean skew3d;
	@JsProperty
	private Style style;
	@JsProperty
	private String text;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final AxisTitle setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final double getMargin() {
		return margin;
	}

	@JsOverlay
	public final AxisTitle setMargin(double margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final double getOffset() {
		return offset;
	}

	@JsOverlay
	public final AxisTitle setOffset(double offset) {
		this.offset = offset;
		return this;
	}

	@JsOverlay
	public final String getPosition3d() {
		return position3d;
	}

	@JsOverlay
	public final AxisTitle setPosition3d(String position3d) {
		this.position3d = position3d;
		return this;
	}

	@JsOverlay
	public final Boolean getReserveSpace() {
		return reserveSpace;
	}

	@JsOverlay
	public final AxisTitle setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		return this;
	}

	@JsOverlay
	public final double getRotation() {
		return rotation;
	}

	@JsOverlay
	public final AxisTitle setRotation(double rotation) {
		this.rotation = rotation;
		return this;
	}

	@JsOverlay
	public final Boolean getSkew3d() {
		return skew3d;
	}

	@JsOverlay
	public final AxisTitle setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final AxisTitle setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final AxisTitle setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final AxisTitle setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final AxisTitle setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final AxisTitle setY(double y) {
		this.y = y;
		return this;
	}
}

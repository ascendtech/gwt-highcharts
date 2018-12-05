package us.ascendtech.highcharts.client.chartoptions.annotations;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnotationsShapeOptions {

	@JsProperty
	private String fill;
	@JsProperty
	private double height;
	@JsProperty
	private double r;
	@JsProperty
	private String stroke;
	@JsProperty
	private double strokeWidth;
	@JsProperty
	private String type;
	@JsProperty
	private double width;

	@JsOverlay
	public final String getFill() {
		return fill;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setFill(String fill) {
		this.fill = fill;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final double getR() {
		return r;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setR(double r) {
		this.r = r;
		return this;
	}

	@JsOverlay
	public final String getStroke() {
		return stroke;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setStroke(String stroke) {
		this.stroke = stroke;
		return this;
	}

	@JsOverlay
	public final double getStrokeWidth() {
		return strokeWidth;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setStrokeWidth(double strokeWidth) {
		this.strokeWidth = strokeWidth;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final AnnotationsShapeOptions setWidth(double width) {
		this.width = width;
		return this;
	}
}

package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.dragdrop;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Formatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DragHandle {

	@JsProperty
	private String className;
	@JsProperty
	private Object color;
	@JsProperty
	private String cursor;
	@JsProperty
	private Object lineColor;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private Formatter pathFormatter;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final DragHandle setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final DragHandle setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final DragHandle setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final Object getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final DragHandle setLineColor(Object lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final DragHandle setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final Formatter getPathFormatter() {
		return pathFormatter;
	}

	@JsOverlay
	public final DragHandle setPathFormatter(Formatter pathFormatter) {
		this.pathFormatter = pathFormatter;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final DragHandle setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}

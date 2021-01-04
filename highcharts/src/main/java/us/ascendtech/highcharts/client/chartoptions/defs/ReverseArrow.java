package us.ascendtech.highcharts.client.chartoptions.defs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ReverseArrow {

	@JsProperty
	private String id;
	@JsProperty
	private Double markerHeight;
	@JsProperty
	private Double markerWidth;
	@JsProperty
	private Double refX;
	@JsProperty
	private Double refY;
	@JsProperty
	private boolean render;
	@JsProperty
	private String tagName;

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final ReverseArrow setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final Double getMarkerHeight() {
		return markerHeight;
	}

	@JsOverlay
	public final ReverseArrow setMarkerHeight(Double markerHeight) {
		this.markerHeight = markerHeight;
		return this;
	}

	@JsOverlay
	public final Double getMarkerWidth() {
		return markerWidth;
	}

	@JsOverlay
	public final ReverseArrow setMarkerWidth(Double markerWidth) {
		this.markerWidth = markerWidth;
		return this;
	}

	@JsOverlay
	public final Double getRefX() {
		return refX;
	}

	@JsOverlay
	public final ReverseArrow setRefX(Double refX) {
		this.refX = refX;
		return this;
	}

	@JsOverlay
	public final Double getRefY() {
		return refY;
	}

	@JsOverlay
	public final ReverseArrow setRefY(Double refY) {
		this.refY = refY;
		return this;
	}

	@JsOverlay
	public final boolean isRender() {
		return render;
	}

	@JsOverlay
	public final ReverseArrow setRender(boolean render) {
		this.render = render;
		return this;
	}

	@JsOverlay
	public final String getTagName() {
		return tagName;
	}

	@JsOverlay
	public final ReverseArrow setTagName(String tagName) {
		this.tagName = tagName;
		return this;
	}
}

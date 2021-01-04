package us.ascendtech.highcharts.client.chartoptions.defs;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Arrow {

	@JsProperty
	private JsArray<Defs> children;
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
	public final JsArray<Defs> getChildren() {
		return children;
	}

	@JsOverlay
	public final Arrow setChildren(JsArray<Defs> children) {
		this.children = children;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final Arrow setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final Double getMarkerHeight() {
		return markerHeight;
	}

	@JsOverlay
	public final Arrow setMarkerHeight(Double markerHeight) {
		this.markerHeight = markerHeight;
		return this;
	}

	@JsOverlay
	public final Double getMarkerWidth() {
		return markerWidth;
	}

	@JsOverlay
	public final Arrow setMarkerWidth(Double markerWidth) {
		this.markerWidth = markerWidth;
		return this;
	}

	@JsOverlay
	public final Double getRefX() {
		return refX;
	}

	@JsOverlay
	public final Arrow setRefX(Double refX) {
		this.refX = refX;
		return this;
	}

	@JsOverlay
	public final Double getRefY() {
		return refY;
	}

	@JsOverlay
	public final Arrow setRefY(Double refY) {
		this.refY = refY;
		return this;
	}

	@JsOverlay
	public final boolean isRender() {
		return render;
	}

	@JsOverlay
	public final Arrow setRender(boolean render) {
		this.render = render;
		return this;
	}

	@JsOverlay
	public final String getTagName() {
		return tagName;
	}

	@JsOverlay
	public final Arrow setTagName(String tagName) {
		this.tagName = tagName;
		return this;
	}
}

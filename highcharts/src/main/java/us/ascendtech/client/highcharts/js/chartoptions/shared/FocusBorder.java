package us.ascendtech.client.highcharts.js.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class FocusBorder {

	@JsProperty
	private Boolean enabled;
	@JsProperty
	private Boolean hideBrowserFocusOutline;
	@JsProperty
	private Integer margin;
	@JsProperty
	private Style style;

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final FocusBorder setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final Boolean getHideBrowserFocusOutline() {
		return hideBrowserFocusOutline;
	}

	@JsOverlay
	public final FocusBorder setHideBrowserFocusOutline(Boolean hideBrowserFocusOutline) {
		this.hideBrowserFocusOutline = hideBrowserFocusOutline;
		return this;
	}

	@JsOverlay
	public final Integer getMargin() {
		return margin;
	}

	@JsOverlay
	public final FocusBorder setMargin(Integer margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final FocusBorder setStyle(Style style) {
		this.style = style;
		return this;
	}
}

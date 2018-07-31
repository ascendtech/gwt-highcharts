package us.ascendtech.client.highcharts.js.chartoptions.legend;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LegendNavigation {

	@JsProperty
	private String activeColor;
	@JsProperty
	private Boolean animation;
	@JsProperty
	private double arrowSize;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private String inactiveColor;
	@JsProperty
	private String style; //CSSObject

	@JsOverlay
	public final String getActiveColor() {
		return activeColor;
	}

	@JsOverlay
	public final LegendNavigation setActiveColor(String activeColor) {
		this.activeColor = activeColor;
		return this;
	}

	@JsOverlay
	public final Boolean getAnimation() {
		return animation;
	}

	@JsOverlay
	public final LegendNavigation setAnimation(Boolean animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getArrowSize() {
		return arrowSize;
	}

	@JsOverlay
	public final LegendNavigation setArrowSize(double arrowSize) {
		this.arrowSize = arrowSize;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final LegendNavigation setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final String getInactiveColor() {
		return inactiveColor;
	}

	@JsOverlay
	public final LegendNavigation setInactiveColor(String inactiveColor) {
		this.inactiveColor = inactiveColor;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final LegendNavigation setStyle(String style) {
		this.style = style;
		return this;
	}
}

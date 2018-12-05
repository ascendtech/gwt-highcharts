package us.ascendtech.highcharts.client.chartoptions.credits;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Position;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/credits
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Credits {

	@JsProperty
	private Boolean enabled;
	@JsProperty
	private String href;
	@JsProperty
	private Position position;
	@JsProperty
	private Style style;
	@JsProperty
	private String text;

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Credits setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final String getHref() {
		return href;
	}

	@JsOverlay
	public final Credits setHref(String href) {
		this.href = href;
		return this;
	}

	@JsOverlay
	public final Position getPosition() {
		return position;
	}

	@JsOverlay
	public final Credits setPosition(Position position) {
		this.position = position;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final Credits setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final Credits setText(String text) {
		this.text = text;
		return this;
	}
}

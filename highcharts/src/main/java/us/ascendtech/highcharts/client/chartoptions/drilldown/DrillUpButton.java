package us.ascendtech.highcharts.client.chartoptions.drilldown;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Position;
import us.ascendtech.highcharts.client.chartoptions.shared.Theme;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DrillUpButton {

	@JsProperty
	private Position position;
	@JsProperty
	private String relativeTo;
	@JsProperty
	private Theme theme;

	@JsOverlay
	public final Position getPosition() {
		return position;
	}

	@JsOverlay
	public final DrillUpButton setPosition(Position position) {
		this.position = position;
		return this;
	}

	@JsOverlay
	public final String getRelativeTo() {
		return relativeTo;
	}

	@JsOverlay
	public final DrillUpButton setRelativeTo(String relativeTo) {
		this.relativeTo = relativeTo;
		return this;
	}

	@JsOverlay
	public final Theme getTheme() {
		return theme;
	}

	@JsOverlay
	public final DrillUpButton setTheme(Theme theme) {
		this.theme = theme;
		return this;
	}
}

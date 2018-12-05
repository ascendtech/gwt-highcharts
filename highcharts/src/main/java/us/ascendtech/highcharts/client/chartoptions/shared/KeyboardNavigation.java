package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class KeyboardNavigation {

	@JsProperty
	private Boolean enabled;
	@JsProperty
	private FocusBorder focusBorder;
	@JsProperty
	private String mode;
	@JsProperty
	private Boolean skipNullPoints;

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final KeyboardNavigation setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final FocusBorder getFocusBorder() {
		return focusBorder;
	}

	@JsOverlay
	public final KeyboardNavigation setFocusBorder(FocusBorder focusBorder) {
		this.focusBorder = focusBorder;
		return this;
	}

	@JsOverlay
	public final String getMode() {
		return mode;
	}

	@JsOverlay
	public final KeyboardNavigation setMode(String mode) {
		this.mode = mode;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipNullPoints() {
		return skipNullPoints;
	}

	@JsOverlay
	public final KeyboardNavigation setSkipNullPoints(Boolean skipNullPoints) {
		this.skipNullPoints = skipNullPoints;
		return this;
	}
}

package us.ascendtech.highcharts.client.chartoptions.navigation;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/navigation
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Navigation {

	@JsProperty
	private NavigationButtonOptions buttonOptions;
	@JsProperty
	private Style menuItemHoverStyle;
	@JsProperty
	private Style menuItemStyle;
	@JsProperty
	private Style menuStyle;

	@JsOverlay
	public final NavigationButtonOptions getButtonOptions() {
		return buttonOptions;
	}

	@JsOverlay
	public final Navigation setButtonOptions(NavigationButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
		return this;
	}

	@JsOverlay
	public final Style getMenuItemHoverStyle() {
		return menuItemHoverStyle;
	}

	@JsOverlay
	public final Navigation setMenuItemHoverStyle(Style menuItemHoverStyle) {
		this.menuItemHoverStyle = menuItemHoverStyle;
		return this;
	}

	@JsOverlay
	public final Style getMenuItemStyle() {
		return menuItemStyle;
	}

	@JsOverlay
	public final Navigation setMenuItemStyle(Style menuItemStyle) {
		this.menuItemStyle = menuItemStyle;
		return this;
	}

	@JsOverlay
	public final Style getMenuStyle() {
		return menuStyle;
	}

	@JsOverlay
	public final Navigation setMenuStyle(Style menuStyle) {
		this.menuStyle = menuStyle;
		return this;
	}
}

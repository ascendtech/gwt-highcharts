package us.ascendtech.highcharts.client.chartoptions.navigation;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.annotations.Annotations;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/navigation
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Navigation {

	@JsProperty
	private Annotations annotationsOptions;
	@JsProperty
	private String bindingClassName;
	@JsProperty
	private NavigationButtonOptions buttonOptions;
	@JsProperty
	private NavigationButtonOptions buttons;
	@JsProperty
	private Boolean enableButtons;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private Boolean enableDoubleClickZoom;
	@JsProperty
	private boolean enableDoubleClickZoomTo;
	@JsProperty
	private Boolean enableMouseWheelZoom;
	@JsProperty
	private Boolean enableTouchZoom;
	@JsProperty
	private String iconsURL;
	@JsProperty
	private Style menuItemHoverStyle;
	@JsProperty
	private Style menuItemStyle;
	@JsProperty
	private Style menuStyle;
	@JsProperty
	private Double mouseWheelSensitivity;

	@JsOverlay
	public final Annotations getAnnotationsOptions() {
		return annotationsOptions;
	}

	@JsOverlay
	public final Navigation setAnnotationsOptions(Annotations annotationsOptions) {
		this.annotationsOptions = annotationsOptions;
		return this;
	}

	@JsOverlay
	public final String getBindingClassName() {
		return bindingClassName;
	}

	@JsOverlay
	public final Navigation setBindingClassName(String bindingClassName) {
		this.bindingClassName = bindingClassName;
		return this;
	}

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
	public final NavigationButtonOptions getButtons() {
		return buttons;
	}

	@JsOverlay
	public final Navigation setButtons(NavigationButtonOptions buttons) {
		this.buttons = buttons;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableButtons() {
		return enableButtons;
	}

	@JsOverlay
	public final Navigation setEnableButtons(Boolean enableButtons) {
		this.enableButtons = enableButtons;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Navigation setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableDoubleClickZoom() {
		return enableDoubleClickZoom;
	}

	@JsOverlay
	public final Navigation setEnableDoubleClickZoom(Boolean enableDoubleClickZoom) {
		this.enableDoubleClickZoom = enableDoubleClickZoom;
		return this;
	}

	@JsOverlay
	public final boolean isEnableDoubleClickZoomTo() {
		return enableDoubleClickZoomTo;
	}

	@JsOverlay
	public final Navigation setEnableDoubleClickZoomTo(boolean enableDoubleClickZoomTo) {
		this.enableDoubleClickZoomTo = enableDoubleClickZoomTo;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseWheelZoom() {
		return enableMouseWheelZoom;
	}

	@JsOverlay
	public final Navigation setEnableMouseWheelZoom(Boolean enableMouseWheelZoom) {
		this.enableMouseWheelZoom = enableMouseWheelZoom;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableTouchZoom() {
		return enableTouchZoom;
	}

	@JsOverlay
	public final Navigation setEnableTouchZoom(Boolean enableTouchZoom) {
		this.enableTouchZoom = enableTouchZoom;
		return this;
	}

	@JsOverlay
	public final String getIconsURL() {
		return iconsURL;
	}

	@JsOverlay
	public final Navigation setIconsURL(String iconsURL) {
		this.iconsURL = iconsURL;
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

	@JsOverlay
	public final Double getMouseWheelSensitivity() {
		return mouseWheelSensitivity;
	}

	@JsOverlay
	public final Navigation setMouseWheelSensitivity(Double mouseWheelSensitivity) {
		this.mouseWheelSensitivity = mouseWheelSensitivity;
		return this;
	}
}

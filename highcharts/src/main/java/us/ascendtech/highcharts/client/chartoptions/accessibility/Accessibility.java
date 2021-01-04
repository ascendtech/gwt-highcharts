package us.ascendtech.highcharts.client.chartoptions.accessibility;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.KeyboardNavigation;
import us.ascendtech.highcharts.client.chartoptions.shared.Point;
import us.ascendtech.highcharts.client.chartoptions.shared.ScreenReaderSection;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.OnTableAnchorClick;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/accessibility
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Accessibility {

	@JsProperty
	private AnnounceNewData announceNewData;
	@JsProperty
	private Accessibility customComponents;
	@JsProperty
	private String description;
	@JsProperty
	private Boolean describeSingleSeries;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private String highContrastTheme;
	@JsProperty
	private KeyboardNavigation keyboardNavigation;
	@JsProperty
	private String landmarkVerbosity;
	@JsProperty
	private String linkedDescription;
	@JsProperty
	private OnTableAnchorClick onTableAnchorClick;
	@JsProperty
	private Point point;
	@JsProperty
	private ScreenReaderSection screenReaderSection;
	@JsProperty
	private AccessibilitySeries series;
	@JsProperty
	private String typeDescription;

	@JsOverlay
	public final AnnounceNewData getAnnounceNewData() {
		return announceNewData;
	}

	@JsOverlay
	public final Accessibility setAnnounceNewData(AnnounceNewData announceNewData) {
		this.announceNewData = announceNewData;
		return this;
	}

	@JsOverlay
	public final Accessibility getCustomComponents() {
		return customComponents;
	}

	@JsOverlay
	public final Accessibility setCustomComponents(Accessibility customComponents) {
		this.customComponents = customComponents;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Accessibility setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getDescribeSingleSeries() {
		return describeSingleSeries;
	}

	@JsOverlay
	public final Accessibility setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Accessibility setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final String getHighContrastTheme() {
		return highContrastTheme;
	}

	@JsOverlay
	public final Accessibility setHighContrastTheme(String highContrastTheme) {
		this.highContrastTheme = highContrastTheme;
		return this;
	}

	@JsOverlay
	public final KeyboardNavigation getKeyboardNavigation() {
		return keyboardNavigation;
	}

	@JsOverlay
	public final Accessibility setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
		return this;
	}

	@JsOverlay
	public final String getLandmarkVerbosity() {
		return landmarkVerbosity;
	}

	@JsOverlay
	public final Accessibility setLandmarkVerbosity(String landmarkVerbosity) {
		this.landmarkVerbosity = landmarkVerbosity;
		return this;
	}

	@JsOverlay
	public final String getLinkedDescription() {
		return linkedDescription;
	}

	@JsOverlay
	public final Accessibility setLinkedDescription(String linkedDescription) {
		this.linkedDescription = linkedDescription;
		return this;
	}

	@JsOverlay
	public final OnTableAnchorClick getOnTableAnchorClick() {
		return onTableAnchorClick;
	}

	@JsOverlay
	public final Accessibility setOnTableAnchorClick(OnTableAnchorClick onTableAnchorClick) {
		this.onTableAnchorClick = onTableAnchorClick;
		return this;
	}

	@JsOverlay
	public final Point getPoint() {
		return point;
	}

	@JsOverlay
	public final Accessibility setPoint(Point point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final ScreenReaderSection getScreenReaderSection() {
		return screenReaderSection;
	}

	@JsOverlay
	public final Accessibility setScreenReaderSection(ScreenReaderSection screenReaderSection) {
		this.screenReaderSection = screenReaderSection;
		return this;
	}

	@JsOverlay
	public final AccessibilitySeries getSeries() {
		return series;
	}

	@JsOverlay
	public final Accessibility setSeries(AccessibilitySeries series) {
		this.series = series;
		return this;
	}

	@JsOverlay
	public final String getTypeDescription() {
		return typeDescription;
	}

	@JsOverlay
	public final Accessibility setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		return this;
	}
}

package us.ascendtech.highcharts.client.chartoptions.accessibility;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.KeyboardNavigation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.OnTableAnchorClick;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDateFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.ScreenReaderSectionFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.SeriesDescriptionFormatter;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/accessibility
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Accessibility {

	@JsProperty
	private Boolean describeSingleSeries;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private KeyboardNavigation keyboardNavigation;
	@JsProperty
	private OnTableAnchorClick onTableAnchorClick;
	@JsProperty
	private String pointDateFormat;
	@JsProperty
	private PointDateFormatter pointDateFormatter;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private Boolean pointDescriptionThreshold;
	@JsProperty
	private ScreenReaderSectionFormatter screenReaderSectionFormatter;
	@JsProperty
	private SeriesDescriptionFormatter seriesDescriptionFormatter;

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
	public final KeyboardNavigation getKeyboardNavigation() {
		return keyboardNavigation;
	}

	@JsOverlay
	public final Accessibility setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
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
	public final String getPointDateFormat() {
		return pointDateFormat;
	}

	@JsOverlay
	public final Accessibility setPointDateFormat(String pointDateFormat) {
		this.pointDateFormat = pointDateFormat;
		return this;
	}

	@JsOverlay
	public final PointDateFormatter getPointDateFormatter() {
		return pointDateFormatter;
	}

	@JsOverlay
	public final Accessibility setPointDateFormatter(PointDateFormatter pointDateFormatter) {
		this.pointDateFormatter = pointDateFormatter;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Accessibility setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final Boolean getPointDescriptionThreshold() {
		return pointDescriptionThreshold;
	}

	@JsOverlay
	public final Accessibility setPointDescriptionThreshold(Boolean pointDescriptionThreshold) {
		this.pointDescriptionThreshold = pointDescriptionThreshold;
		return this;
	}

	@JsOverlay
	public final ScreenReaderSectionFormatter getScreenReaderSectionFormatter() {
		return screenReaderSectionFormatter;
	}

	@JsOverlay
	public final Accessibility setScreenReaderSectionFormatter(ScreenReaderSectionFormatter screenReaderSectionFormatter) {
		this.screenReaderSectionFormatter = screenReaderSectionFormatter;
		return this;
	}

	@JsOverlay
	public final SeriesDescriptionFormatter getSeriesDescriptionFormatter() {
		return seriesDescriptionFormatter;
	}

	@JsOverlay
	public final Accessibility setSeriesDescriptionFormatter(SeriesDescriptionFormatter seriesDescriptionFormatter) {
		this.seriesDescriptionFormatter = seriesDescriptionFormatter;
		return this;
	}
}

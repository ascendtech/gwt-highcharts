package us.ascendtech.highcharts.client.chartoptions.accessibility;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.SeriesDescriptionFormatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AccessibilitySeries {

	@JsProperty
	private boolean describeSingleSeries;
	@JsProperty
	private SeriesDescriptionFormatter descriptionFormatter;
	@JsProperty
	private Double pointDescriptionEnabledThreshold;

	@JsOverlay
	public final boolean isDescribeSingleSeries() {
		return describeSingleSeries;
	}

	@JsOverlay
	public final AccessibilitySeries setDescribeSingleSeries(boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		return this;
	}

	@JsOverlay
	public final SeriesDescriptionFormatter getDescriptionFormatter() {
		return descriptionFormatter;
	}

	@JsOverlay
	public final AccessibilitySeries setDescriptionFormatter(SeriesDescriptionFormatter descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		return this;
	}

	@JsOverlay
	public final Double getPointDescriptionEnabledThreshold() {
		return pointDescriptionEnabledThreshold;
	}

	@JsOverlay
	public final AccessibilitySeries setPointDescriptionEnabledThreshold(Double pointDescriptionEnabledThreshold) {
		this.pointDescriptionEnabledThreshold = pointDescriptionEnabledThreshold;
		return this;
	}
}

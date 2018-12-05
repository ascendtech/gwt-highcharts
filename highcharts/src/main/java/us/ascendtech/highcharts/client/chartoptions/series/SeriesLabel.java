package us.ascendtech.highcharts.client.chartoptions.series;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesLabel {

	@JsProperty
	private JsArray<SeriesBox> boxesToAvoid;
	@JsProperty
	private Boolean connectorAllowed;
	@JsProperty
	private double connectorNeighbourDistance;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private double maxFontSize;
	@JsProperty
	private double minFontSize;
	@JsProperty
	private Boolean onArea;
	@JsProperty
	private Style style;

	@JsOverlay
	public final JsArray<SeriesBox> getBoxesToAvoid() {
		return boxesToAvoid;
	}

	@JsOverlay
	public final SeriesLabel setBoxesToAvoid(JsArray<SeriesBox> boxesToAvoid) {
		this.boxesToAvoid = boxesToAvoid;
		return this;
	}

	@JsOverlay
	public final Boolean getConnectorAllowed() {
		return connectorAllowed;
	}

	@JsOverlay
	public final SeriesLabel setConnectorAllowed(Boolean connectorAllowed) {
		this.connectorAllowed = connectorAllowed;
		return this;
	}

	@JsOverlay
	public final double getConnectorNeighbourDistance() {
		return connectorNeighbourDistance;
	}

	@JsOverlay
	public final SeriesLabel setConnectorNeighbourDistance(double connectorNeighbourDistance) {
		this.connectorNeighbourDistance = connectorNeighbourDistance;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesLabel setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getMaxFontSize() {
		return maxFontSize;
	}

	@JsOverlay
	public final SeriesLabel setMaxFontSize(double maxFontSize) {
		this.maxFontSize = maxFontSize;
		return this;
	}

	@JsOverlay
	public final double getMinFontSize() {
		return minFontSize;
	}

	@JsOverlay
	public final SeriesLabel setMinFontSize(double minFontSize) {
		this.minFontSize = minFontSize;
		return this;
	}

	@JsOverlay
	public final Boolean getOnArea() {
		return onArea;
	}

	@JsOverlay
	public final SeriesLabel setOnArea(Boolean onArea) {
		this.onArea = onArea;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final SeriesLabel setStyle(Style style) {
		this.style = style;
		return this;
	}
}

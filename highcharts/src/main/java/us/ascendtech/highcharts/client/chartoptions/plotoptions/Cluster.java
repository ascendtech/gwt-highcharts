package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesMarker;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesZones;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.LayoutAlgorithm;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Cluster {

	@JsProperty
	private boolean allowOverlap;
	@JsProperty
	private Animation animation;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private boolean drillToCluster;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private ClusterEvents events;
	@JsProperty
	private LayoutAlgorithm layoutAlgorithm;
	@JsProperty
	private SeriesMarker marker;
	@JsProperty
	private double minimumClusterSize;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private JsArray<SeriesZones> zones;

	@JsOverlay
	public final boolean isAllowOverlap() {
		return allowOverlap;
	}

	@JsOverlay
	public final Cluster setAllowOverlap(boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Cluster setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Cluster setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final boolean isDrillToCluster() {
		return drillToCluster;
	}

	@JsOverlay
	public final Cluster setDrillToCluster(boolean drillToCluster) {
		this.drillToCluster = drillToCluster;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Cluster setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final ClusterEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Cluster setEvents(ClusterEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final LayoutAlgorithm getLayoutAlgorithm() {
		return layoutAlgorithm;
	}

	@JsOverlay
	public final Cluster setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		return this;
	}

	@JsOverlay
	public final SeriesMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final Cluster setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final double getMinimumClusterSize() {
		return minimumClusterSize;
	}

	@JsOverlay
	public final Cluster setMinimumClusterSize(double minimumClusterSize) {
		this.minimumClusterSize = minimumClusterSize;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Cluster setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Cluster setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}

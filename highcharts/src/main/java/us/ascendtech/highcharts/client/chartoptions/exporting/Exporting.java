package us.ascendtech.highcharts.client.chartoptions.exporting;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.accessibility.Accessibility;
import us.ascendtech.highcharts.client.chartoptions.chart.Chart;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/exporting
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Exporting {

	@JsProperty
	private Accessibility accessibility;
	@JsProperty
	private Boolean allowHTML;
	@JsProperty
	private ExportingButtons buttons;
	@JsProperty
	private Chart chartOptions;
	@JsProperty
	private ExportingCSV csv;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private ExportingError error;
	@JsProperty
	private Boolean fallbackToExportServer;
	@JsProperty
	private String filename;
	@JsProperty
	private Object formAttributes;
	@JsProperty
	private String libUrl;
	@JsProperty
	private ExportingMenuItemDefinitions menuItemDefinitions;
	@JsProperty
	private double printMaxWidth;
	@JsProperty
	private double scale;
	@JsProperty
	private Boolean showTable;
	@JsProperty
	private double sourceHeight;
	@JsProperty
	private double sourceWidth;
	@JsProperty
	private String tableCaption;
	@JsProperty
	private String type;
	@JsProperty
	private String url;
	@JsProperty
	private Boolean useMultiLevelHeaders;
	@JsProperty
	private Boolean useRowspanHeaders;
	@JsProperty
	private double width;

	@JsFunction
	public interface ExportingError {
		void onError();
	}

	@JsOverlay
	public final Accessibility getAccessibility() {
		return accessibility;
	}

	@JsOverlay
	public final Exporting setAccessibility(Accessibility accessibility) {
		this.accessibility = accessibility;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowHTML() {
		return allowHTML;
	}

	@JsOverlay
	public final Exporting setAllowHTML(Boolean allowHTML) {
		this.allowHTML = allowHTML;
		return this;
	}

	@JsOverlay
	public final ExportingButtons getButtons() {
		return buttons;
	}

	@JsOverlay
	public final Exporting setButtons(ExportingButtons buttons) {
		this.buttons = buttons;
		return this;
	}

	@JsOverlay
	public final Chart getChartOptions() {
		return chartOptions;
	}

	@JsOverlay
	public final Exporting setChartOptions(Chart chartOptions) {
		this.chartOptions = chartOptions;
		return this;
	}

	@JsOverlay
	public final ExportingCSV getCsv() {
		return csv;
	}

	@JsOverlay
	public final Exporting setCsv(ExportingCSV csv) {
		this.csv = csv;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Exporting setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final ExportingError getError() {
		return error;
	}

	@JsOverlay
	public final Exporting setError(ExportingError error) {
		this.error = error;
		return this;
	}

	@JsOverlay
	public final Boolean getFallbackToExportServer() {
		return fallbackToExportServer;
	}

	@JsOverlay
	public final Exporting setFallbackToExportServer(Boolean fallbackToExportServer) {
		this.fallbackToExportServer = fallbackToExportServer;
		return this;
	}

	@JsOverlay
	public final String getFilename() {
		return filename;
	}

	@JsOverlay
	public final Exporting setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	@JsOverlay
	public final Object getFormAttributes() {
		return formAttributes;
	}

	@JsOverlay
	public final Exporting setFormAttributes(Object formAttributes) {
		this.formAttributes = formAttributes;
		return this;
	}

	@JsOverlay
	public final String getLibUrl() {
		return libUrl;
	}

	@JsOverlay
	public final Exporting setLibUrl(String libUrl) {
		this.libUrl = libUrl;
		return this;
	}

	@JsOverlay
	public final ExportingMenuItemDefinitions getMenuItemDefinitions() {
		return menuItemDefinitions;
	}

	@JsOverlay
	public final Exporting setMenuItemDefinitions(ExportingMenuItemDefinitions menuItemDefinitions) {
		this.menuItemDefinitions = menuItemDefinitions;
		return this;
	}

	@JsOverlay
	public final double getPrintMaxWidth() {
		return printMaxWidth;
	}

	@JsOverlay
	public final Exporting setPrintMaxWidth(double printMaxWidth) {
		this.printMaxWidth = printMaxWidth;
		return this;
	}

	@JsOverlay
	public final double getScale() {
		return scale;
	}

	@JsOverlay
	public final Exporting setScale(double scale) {
		this.scale = scale;
		return this;
	}

	@JsOverlay
	public final Boolean getShowTable() {
		return showTable;
	}

	@JsOverlay
	public final Exporting setShowTable(Boolean showTable) {
		this.showTable = showTable;
		return this;
	}

	@JsOverlay
	public final double getSourceHeight() {
		return sourceHeight;
	}

	@JsOverlay
	public final Exporting setSourceHeight(double sourceHeight) {
		this.sourceHeight = sourceHeight;
		return this;
	}

	@JsOverlay
	public final double getSourceWidth() {
		return sourceWidth;
	}

	@JsOverlay
	public final Exporting setSourceWidth(double sourceWidth) {
		this.sourceWidth = sourceWidth;
		return this;
	}

	@JsOverlay
	public final String getTableCaption() {
		return tableCaption;
	}

	@JsOverlay
	public final Exporting setTableCaption(String tableCaption) {
		this.tableCaption = tableCaption;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final Exporting setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final String getUrl() {
		return url;
	}

	@JsOverlay
	public final Exporting setUrl(String url) {
		this.url = url;
		return this;
	}

	@JsOverlay
	public final Boolean getUseMultiLevelHeaders() {
		return useMultiLevelHeaders;
	}

	@JsOverlay
	public final Exporting setUseMultiLevelHeaders(Boolean useMultiLevelHeaders) {
		this.useMultiLevelHeaders = useMultiLevelHeaders;
		return this;
	}

	@JsOverlay
	public final Boolean getUseRowspanHeaders() {
		return useRowspanHeaders;
	}

	@JsOverlay
	public final Exporting setUseRowspanHeaders(Boolean useRowspanHeaders) {
		this.useRowspanHeaders = useRowspanHeaders;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final Exporting setWidth(double width) {
		this.width = width;
		return this;
	}
}

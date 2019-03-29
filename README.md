A relatively comprehensive JSInterop wrapping of [Highcharts.js](https://www.highcharts.com/).

## Getting Started

### Gradle

Add AST Maven Repo
```gradle
  allprojects {
    repositories {
      ...
      maven { url 'https://maven.ascend-tech.us/repo' }
    }
  }
```

Add Dependency:
```gradle
  compile 'com.github.ascendtech:gwt-highcharts:1.1.0'
  compile 'com.github.ascendtech:gwt-highcharts:1.1.0:sources'
```

### Maven

Add JitPack
```xml
  <repositories>
    <repository>
      <id>AST Maven</id>
      <url>https://maven.ascend-tech.us/repo</url>
    </repository>
  </repositories>
```
Add Dependency
```xml
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-highcharts</artifactId>
    <version>1.1.0</version>
  </dependency>
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-highcharts</artifactId>
    <version>1.1.0</version>
    <classifier>sources</classifier>
  </dependency>
```

### Example in Java

Add dependency to gwt.xml:
```xml
<inherits name="us.ascendtech.Highcharts"/>
```

```java
// Column chart
JsArray<Object> seriesDataArray = new JsArray<>();
JsArray<String> categories = new JsArray<>();

for (String name : data.keySet()) {

  SeriesData seriesData = new SeriesData();
  seriesData.setName(name);
  seriesData.setY(data.get(name)); //double value
  seriesDataArray.push(seriesData);

  categories.push(name);
}

JsArray<String> colors = new JsArray<>(CUSTOM_COLORS); // array of colors or null to default to highcharts colors

ChartOptions options = new ChartOptions()
                        .setChart(new Chart()
                          .setHeight(320.0))
                          .setExporting(new Exporting().setUrl(customExportUrl))
                          .setTitle(new Title().setText("My Example Chart")));

YAxis yAxis = (YAxis) new YAxis()
                        .setMin(0.0)
                        .setAllowDecimals(false)
                        .setTitle(new AxisTitle()
                        .setText("Counts"));
options.setyAxis(yAxis);

XAxis xAxis = ((XAxis) new XAxis()
                        .setAllowDecimals(false)
                        .setCategories(categories));
options.setxAxis(xAxis);

PlotOptions plotOptions = new PlotOptions();
plotOptions.setColumn(new Column().setColors(colors));
plotOptions.setSeries(new Series().setCursor("pointer").setEvents(seriesEvents));
options.setPlotOptions(plotOptions);

SeriesEvents seriesEvents = new SeriesEvents();
Click click = (event) -> DomGlobal.console.log(event);
seriesEvents.setClick(click);

Series series = new Series()
                  .setType(SeriesTypes.COLUMN.getSeriesType())
                  .setData(seriesDataArray)
                  .setStacking("normal")
                  .setShowInLegend(true);
options.setSeries(new JsArray<>(series));

FlowPanel chartFlowPanel = new FlowPanel();
chartFlowPanel.getElement().setId("myChartId");
chartDiv.addAttachHandler(event -> {
  if (event.isAttached()) {
    new Highcharts("myChartId", options);
  }
});

```



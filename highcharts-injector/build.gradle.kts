plugins {
    id("us.ascendtech.gwt.lib")
}

gwt {
    isIncludeGwtUser = true
    libs.add("elemento-core")
}

dependencies {
    compile(project(":highcharts"))
}


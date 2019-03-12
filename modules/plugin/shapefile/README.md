# Modified Version of org.geotools.data.shapefile


 * some data providers provide gzipped shapefiles (not `*.shp/*.shx/*.dbf/*.prj` but `*.shp.gz/*.shx.gz/*.dbf.gz/*.prj.gz`) Example: TomTom street map data. Support reading of such data.
 * some data providers provide an additional `*.cpg`-file containing the character set name for string-fields in the `*.dbf`-file. Example: HERE/NavStreets street map data. Support reading of such data.
 * some data providers provide data without geometries, i.e. only  `*.dbf` without `*.shp`. Example: HERE/NavStreets street map data. Support reading of such data.
 * force usage of the SRID provided in the parameters when reading input

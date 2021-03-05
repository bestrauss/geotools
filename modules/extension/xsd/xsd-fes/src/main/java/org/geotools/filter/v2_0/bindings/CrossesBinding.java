/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.filter.v2_0.bindings;

import javax.xml.namespace.QName;
import org.geotools.filter.v1_0.OGCCrossesBinding;
import org.geotools.filter.v2_0.FES;
import org.locationtech.jts.geom.GeometryFactory;
import org.opengis.filter.FilterFactory2;

/**
 * Binding object for the element http://www.opengis.net/fes/2.0:Crosses.
 *
 * <p>
 *
 * <pre>
 *       <code>
 *  &lt;xsd:element name="Crosses" substitutionGroup="fes:spatialOps" type="fes:BinarySpatialOpType"/&gt;
 *
 *        </code>
 *       </pre>
 *
 * @generated
 */
public class CrossesBinding extends OGCCrossesBinding {
    public CrossesBinding(FilterFactory2 filterFactory, GeometryFactory geometryFactory) {
        super(filterFactory, geometryFactory);
    }

    @Override
    public QName getTarget() {
        return FES.Crosses;
    }
}

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
package org.geotools.filter.v1_0;

import java.util.Collections;
import javax.xml.namespace.QName;
import org.geotools.api.filter.BinaryComparisonOperator;
import org.geotools.api.filter.BinaryLogicOperator;
import org.geotools.api.filter.Filter;
import org.geotools.api.filter.FilterFactory;
import org.geotools.api.filter.Not;
import org.geotools.api.filter.PropertyIsNull;
import org.geotools.api.filter.identity.Identifier;
import org.geotools.api.filter.spatial.BinarySpatialOperator;
import org.geotools.filter.v1_1.OGC;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Binding object for the element http://www.opengis.net/ogc:Not.
 *
 * <p>
 *
 * <pre>
 *         <code>
 *  &lt;xsd:element name="Not" substitutionGroup="ogc:logicOps" type="ogc:UnaryLogicOpType"/&gt;
 *
 *          </code>
 *         </pre>
 *
 * @generated
 */
public class OGCNotBinding extends AbstractComplexBinding {
    FilterFactory filterfactory;

    public OGCNotBinding(FilterFactory filterfactory) {
        this.filterfactory = filterfactory;
    }

    /** @generated */
    @Override
    public QName getTarget() {
        return OGC.Not;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Class getType() {
        return Not.class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        Filter filter = node.getChildValue(Filter.class);
        if (filter == null) {
            // look for an Identifier, not in the spec but something we handle
            Identifier id = node.getChildValue(Identifier.class);
            if (id != null) {
                filter = filterfactory.id(Collections.singleton(id));
            }
        }

        return filterfactory.not(filter);
    }

    @Override
    public Object getProperty(Object object, QName name) throws Exception {
        Not not = (Not) object;

        if (OGC.spatialOps.equals(name) && not.getFilter() instanceof BinarySpatialOperator) {
            return not.getFilter();
        }

        if (OGC.logicOps.equals(name) && not.getFilter() instanceof BinaryLogicOperator) {
            return not.getFilter();
        }

        if (OGC.comparisonOps.equals(name) && not.getFilter() instanceof BinaryComparisonOperator) {
            return not.getFilter();
        }

        if (OGC.comparisonOps.equals(name) && not.getFilter() instanceof PropertyIsNull) {
            return not.getFilter();
        }
        return null;
    }
}

/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2019, Open Source Geospatial Foundation (OSGeo)
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
 *
 */

package org.geotools.wcs.bindings;

import javax.xml.namespace.QName;
import org.geotools.wcs.WCS;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Binding object for the type http://www.opengis.net/wcs:AxisDescriptionType.
 *
 * <p>
 *
 * <pre>
 *  <code>
 *  &lt;complexType name="AxisDescriptionType"&gt;
 *      &lt;annotation&gt;
 *          &lt;documentation&gt;Description of a measured or observed quantity, and list of the valid quantity values (values for which measurements are available or by which aggregate values are available). The semantic is the URI of the quantity (for example observable or mathematical variable). The refSys attribute is a URI to a reference system, and the refSysLabel is the label used by client to refer the reference system. &lt;/documentation&gt;
 *      &lt;/annotation&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="wcs:AbstractDescriptionType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="values"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;The type and value constraints for the values of this axis.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="AxisDescriptionType_values"&gt;
 *                          &lt;complexContent&gt;
 *                              &lt;extension base="wcs:valueEnumType"&gt;
 *                                  &lt;sequence&gt;
 *                                      &lt;element minOccurs="0"
 *                                      name="default" type="wcs:TypedLiteralType"&gt;
 *                                      &lt;annotation&gt;
 *                                      &lt;documentation&gt;Ordered sequence of the parameter value(s) that the server will use for GetCoverage requests which omit a constraint on this parameter axis. (GetCoverage requests against a coverage offering whose AxisDescription has no default must specify a valid constraint for this parameter.) &lt;/documentation&gt;
 *                                      &lt;/annotation&gt;
 *                                      &lt;/element&gt;
 *                                  &lt;/sequence&gt;
 *                              &lt;/extension&gt;
 *                          &lt;/complexContent&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *              &lt;/sequence&gt;
 *              &lt;attribute ref="wcs:semantic" use="optional"/&gt;
 *              &lt;attribute name="refSys" type="anyURI" use="optional"&gt;
 *                  &lt;annotation&gt;
 *                      &lt;documentation&gt;Pointer to the reference system in which values are expressed. This attribute shall be included either here or in RangeSetType. &lt;/documentation&gt;
 *                  &lt;/annotation&gt;
 *              &lt;/attribute&gt;
 *              &lt;attribute name="refSysLabel" type="string" use="optional"&gt;
 *                  &lt;annotation&gt;
 *                      &lt;documentation&gt;Short human-readable label denoting the reference system, for human interface display. This attribute shall be included either here or in RangeSetType. &lt;/documentation&gt;
 *                  &lt;/annotation&gt;
 *              &lt;/attribute&gt;
 *          &lt;/extension&gt;
 *      &lt;/complexContent&gt;
 *  &lt;/complexType&gt;
 *
 *   </code>
 * </pre>
 *
 * @generated
 */
public class AxisDescriptionTypeBinding extends AbstractComplexBinding {

    /** @generated */
    @Override
    public QName getTarget() {
        return WCS.AxisDescriptionType;
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
        return null;
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

        // TODO: implement and remove call to super
        return super.parse(instance, node, value);
    }
}

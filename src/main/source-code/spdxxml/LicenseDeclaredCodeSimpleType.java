
package spdxxml;

/** 
 * A data type for LicenseDeclared properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseDeclaredCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Noassertion"/>
 *     &lt;xs:enumeration value="None"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum LicenseDeclaredCodeSimpleType {
    /** 
     * Indicates that the preparer of the SPDX document is not making any assertion regarding the value of this field.
     */
    NOASSERTION("Noassertion"), /** 
                                 * When this value is used as the object of a property it indicates that the preparer of the SpdxDocument believes that there is no value for the property. This value
                                should only be used if there is sufficient evidence to support this assertion.
                                 */
    NONE("None");
    private final String value;

    private LicenseDeclaredCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static LicenseDeclaredCodeSimpleType convert(String value) {
        for (LicenseDeclaredCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}


package com.poc.jibx;

/** 
 * Types used to external reference identifiers.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceType">
 *   &lt;xs:all>
 *     &lt;xs:element type="xs:string" name="contextualExample"/>
 *     &lt;xs:element type="xs:string" name="externalReferenceSite"/>
 *     &lt;xs:element type="xs:string" name="documentation"/>
 *   &lt;/xs:all>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceType
{
    private String contextualExample;
    private String externalReferenceSite;
    private String documentation;

    /** 
     * Get the 'contextualExample' element value. Example for use of the external repository identifier
     * 
     * @return value
     */
    public String getContextualExample() {
        return contextualExample;
    }

    /** 
     * Set the 'contextualExample' element value. Example for use of the external repository identifier
     * 
     * @param contextualExample
     */
    public void setContextualExample(String contextualExample) {
        this.contextualExample = contextualExample;
    }

    /** 
     * Get the 'externalReferenceSite' element value. Website for the maintainers of the external reference site
     * 
     * @return value
     */
    public String getExternalReferenceSite() {
        return externalReferenceSite;
    }

    /** 
     * Set the 'externalReferenceSite' element value. Website for the maintainers of the external reference site
     * 
     * @param externalReferenceSite
     */
    public void setExternalReferenceSite(String externalReferenceSite) {
        this.externalReferenceSite = externalReferenceSite;
    }

    /** 
     * Get the 'documentation' element value. Website containing the documentation related to the repository identifier
     * 
     * @return value
     */
    public String getDocumentation() {
        return documentation;
    }

    /** 
     * Set the 'documentation' element value. Website containing the documentation related to the repository identifier
     * 
     * @param documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
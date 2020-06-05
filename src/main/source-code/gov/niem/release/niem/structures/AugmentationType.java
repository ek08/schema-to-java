
package gov.niem.release.niem.structures;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:structures="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AugmentationType">
 *   &lt;xs:attribute ref="structures:id">
 *     &lt;!-- Reference to inner class Id -->
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute ref="structures:ref">
 *     &lt;!-- Reference to inner class Ref -->
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute ref="structures:uri">
 *     &lt;!-- Reference to inner class Uri -->
 *   &lt;/xs:attribute>
 *   &lt;xs:attribute ref="structures:metadata">
 *     &lt;!-- Reference to inner class Metadata -->
 *   &lt;/xs:attribute>
 *   &lt;xs:anyAttribute processContents="lax" namespace="urn:us:gov:ic:ism urn:us:gov:ic:ntk"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AugmentationType
{
    private Id id;
    private Ref ref;
    private Uri uri;
    private Metadata metadata;

    /** 
     * Get the 'id' attribute value.
     * 
     * @return value
     */
    public Id getId() {
        return id;
    }

    /** 
     * Set the 'id' attribute value.
     * 
     * @param id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /** 
     * Get the 'ref' attribute value.
     * 
     * @return value
     */
    public Ref getRef() {
        return ref;
    }

    /** 
     * Set the 'ref' attribute value.
     * 
     * @param ref
     */
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    /** 
     * Get the 'uri' attribute value.
     * 
     * @return value
     */
    public Uri getUri() {
        return uri;
    }

    /** 
     * Set the 'uri' attribute value.
     * 
     * @param uri
     */
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    /** 
     * Get the 'metadata' attribute value.
     * 
     * @return value
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /** 
     * Set the 'metadata' attribute value.
     * 
     * @param metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" ref="ns:id"/>
     * 
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="id"/>
     * </pre>
     */
    public static class Id
    {
        private String id;

        /** 
         * Get the 'id' attribute value.
         * 
         * @return value
         */
        public String getId() {
            return id;
        }

        /** 
         * Set the 'id' attribute value.
         * 
         * @param id
         */
        public void setId(String id) {
            this.id = id;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" ref="ns:ref"/>
     * 
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="ref"/>
     * </pre>
     */
    public static class Ref
    {
        private String ref;

        /** 
         * Get the 'ref' attribute value.
         * 
         * @return value
         */
        public String getRef() {
            return ref;
        }

        /** 
         * Set the 'ref' attribute value.
         * 
         * @param ref
         */
        public void setRef(String ref) {
            this.ref = ref;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" ref="ns:uri"/>
     * 
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="uri"/>
     * </pre>
     */
    public static class Uri
    {
        private String uri;

        /** 
         * Get the 'uri' attribute value.
         * 
         * @return value
         */
        public String getUri() {
            return uri;
        }

        /** 
         * Set the 'uri' attribute value.
         * 
         * @param uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" ref="ns:metadata"/>
     * 
     * &lt;xs:attribute xmlns:ns="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="metadata"/>
     * </pre>
     */
    public static class Metadata
    {
        private String metadata;

        /** 
         * Get the 'metadata' attribute value.
         * 
         * @return value
         */
        public String getMetadata() {
            return metadata;
        }

        /** 
         * Set the 'metadata' attribute value.
         * 
         * @param metadata
         */
        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }
    }
}

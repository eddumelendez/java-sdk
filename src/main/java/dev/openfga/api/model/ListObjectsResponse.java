/*
 * OpenFGA
 * A high performance and flexible authorization/permission engine built for developers and inspired by Google Zanzibar.
 *
 * The version of the OpenAPI document: 0.1
 * Contact: community@openfga.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package dev.openfga.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * ListObjectsResponse
 */
@JsonPropertyOrder({ListObjectsResponse.JSON_PROPERTY_OBJECTS})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-16T16:59:21.258606Z[Etc/UTC]")
public class ListObjectsResponse {
    public static final String JSON_PROPERTY_OBJECTS = "objects";
    private List<String> objects = new ArrayList<>();

    public ListObjectsResponse() {}

    public ListObjectsResponse objects(List<String> objects) {
        this.objects = objects;
        return this;
    }

    public ListObjectsResponse addObjectsItem(String objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    /**
     * Get objects
     * @return objects
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OBJECTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getObjects() {
        return objects;
    }

    @JsonProperty(JSON_PROPERTY_OBJECTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setObjects(List<String> objects) {
        this.objects = objects;
    }

    /**
     * Return true if this ListObjectsResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListObjectsResponse listObjectsResponse = (ListObjectsResponse) o;
        return Objects.equals(this.objects, listObjectsResponse.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObjectsResponse {\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `objects` to the URL query string
        if (getObjects() != null) {
            for (int i = 0; i < getObjects().size(); i++) {
                joiner.add(String.format(
                        "%sobjects%s%s=%s",
                        prefix,
                        suffix,
                        "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                        URLEncoder.encode(String.valueOf(getObjects().get(i)), StandardCharsets.UTF_8)
                                .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}

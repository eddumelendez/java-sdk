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

package dev.openfga.sdk.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * CheckResponse
 */
@JsonPropertyOrder({CheckResponse.JSON_PROPERTY_ALLOWED, CheckResponse.JSON_PROPERTY_RESOLUTION})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-28T14:41:07.855252Z[Etc/UTC]")
public class CheckResponse {
    public static final String JSON_PROPERTY_ALLOWED = "allowed";
    private Boolean allowed;

    public static final String JSON_PROPERTY_RESOLUTION = "resolution";
    private String resolution;

    public CheckResponse() {}

    public CheckResponse allowed(Boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    /**
     * Get allowed
     * @return allowed
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ALLOWED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAllowed() {
        return allowed;
    }

    @JsonProperty(JSON_PROPERTY_ALLOWED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    public CheckResponse resolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * For internal use only.
     * @return resolution
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_RESOLUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResolution() {
        return resolution;
    }

    @JsonProperty(JSON_PROPERTY_RESOLUTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Return true if this CheckResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckResponse checkResponse = (CheckResponse) o;
        return Objects.equals(this.allowed, checkResponse.allowed)
                && Objects.equals(this.resolution, checkResponse.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowed, resolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResponse {\n");
        sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

        // add `allowed` to the URL query string
        if (getAllowed() != null) {
            joiner.add(String.format(
                    "%sallowed%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getAllowed()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `resolution` to the URL query string
        if (getResolution() != null) {
            joiner.add(String.format(
                    "%sresolution%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getResolution()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}

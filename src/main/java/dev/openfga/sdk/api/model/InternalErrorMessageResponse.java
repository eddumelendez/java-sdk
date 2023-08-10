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
 * InternalErrorMessageResponse
 */
@JsonPropertyOrder({InternalErrorMessageResponse.JSON_PROPERTY_CODE, InternalErrorMessageResponse.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-17T22:31:33.475227Z[Etc/UTC]")
public class InternalErrorMessageResponse {
    public static final String JSON_PROPERTY_CODE = "code";
    private InternalErrorCode code = InternalErrorCode.NO_INTERNAL_ERROR;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public InternalErrorMessageResponse() {}

    public InternalErrorMessageResponse code(InternalErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public InternalErrorCode getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(InternalErrorCode code) {
        this.code = code;
    }

    public InternalErrorMessageResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Return true if this InternalErrorMessageResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InternalErrorMessageResponse internalErrorMessageResponse = (InternalErrorMessageResponse) o;
        return Objects.equals(this.code, internalErrorMessageResponse.code)
                && Objects.equals(this.message, internalErrorMessageResponse.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InternalErrorMessageResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

        // add `code` to the URL query string
        if (getCode() != null) {
            joiner.add(String.format(
                    "%scode%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getCode()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `message` to the URL query string
        if (getMessage() != null) {
            joiner.add(String.format(
                    "%smessage%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getMessage()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}

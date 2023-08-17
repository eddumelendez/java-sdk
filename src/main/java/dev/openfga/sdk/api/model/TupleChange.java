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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * TupleChange
 */
@JsonPropertyOrder({
    TupleChange.JSON_PROPERTY_TUPLE_KEY,
    TupleChange.JSON_PROPERTY_OPERATION,
    TupleChange.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-17T22:34:59.729055Z[Etc/UTC]")
public class TupleChange {
    public static final String JSON_PROPERTY_TUPLE_KEY = "tuple_key";
    private TupleKey tupleKey;

    public static final String JSON_PROPERTY_OPERATION = "operation";
    private TupleOperation operation = TupleOperation.WRITE;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private OffsetDateTime timestamp;

    public TupleChange() {}

    public TupleChange tupleKey(TupleKey tupleKey) {
        this.tupleKey = tupleKey;
        return this;
    }

    /**
     * Get tupleKey
     * @return tupleKey
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TUPLE_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TupleKey getTupleKey() {
        return tupleKey;
    }

    @JsonProperty(JSON_PROPERTY_TUPLE_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTupleKey(TupleKey tupleKey) {
        this.tupleKey = tupleKey;
    }

    public TupleChange operation(TupleOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TupleOperation getOperation() {
        return operation;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOperation(TupleOperation operation) {
        this.operation = operation;
    }

    public TupleChange timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Return true if this TupleChange object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TupleChange tupleChange = (TupleChange) o;
        return Objects.equals(this.tupleKey, tupleChange.tupleKey)
                && Objects.equals(this.operation, tupleChange.operation)
                && Objects.equals(this.timestamp, tupleChange.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tupleKey, operation, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TupleChange {\n");
        sb.append("    tupleKey: ").append(toIndentedString(tupleKey)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

        // add `tuple_key` to the URL query string
        if (getTupleKey() != null) {
            joiner.add(getTupleKey().toUrlQueryString(prefix + "tuple_key" + suffix));
        }

        // add `operation` to the URL query string
        if (getOperation() != null) {
            joiner.add(String.format(
                    "%soperation%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getOperation()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `timestamp` to the URL query string
        if (getTimestamp() != null) {
            joiner.add(String.format(
                    "%stimestamp%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getTimestamp()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}

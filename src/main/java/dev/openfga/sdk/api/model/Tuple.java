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
 * Tuple
 */
@JsonPropertyOrder({Tuple.JSON_PROPERTY_KEY, Tuple.JSON_PROPERTY_TIMESTAMP})
public class Tuple {
    public static final String JSON_PROPERTY_KEY = "key";
    private TupleKey key;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private OffsetDateTime timestamp;

    public Tuple() {}

    public Tuple key(TupleKey key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TupleKey getKey() {
        return key;
    }

    @JsonProperty(JSON_PROPERTY_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKey(TupleKey key) {
        this.key = key;
    }

    public Tuple timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Return true if this Tuple object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tuple tuple = (Tuple) o;
        return Objects.equals(this.key, tuple.key) && Objects.equals(this.timestamp, tuple.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tuple {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

        // add `key` to the URL query string
        if (getKey() != null) {
            joiner.add(getKey().toUrlQueryString(prefix + "key" + suffix));
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

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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TypeName
 */
public enum TypeName {
    UNSPECIFIED("TYPE_NAME_UNSPECIFIED"),

    ANY("TYPE_NAME_ANY"),

    BOOL("TYPE_NAME_BOOL"),

    STRING("TYPE_NAME_STRING"),

    INT("TYPE_NAME_INT"),

    UINT("TYPE_NAME_UINT"),

    DOUBLE("TYPE_NAME_DOUBLE"),

    DURATION("TYPE_NAME_DURATION"),

    TIMESTAMP("TYPE_NAME_TIMESTAMP"),

    MAP("TYPE_NAME_MAP"),

    LIST("TYPE_NAME_LIST"),

    IPADDRESS("TYPE_NAME_IPADDRESS"),

    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeName(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeName fromValue(String value) {
        for (TypeName b : TypeName.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return UNKNOWN_DEFAULT_OPEN_API;
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        return String.format("%s=%s", prefix, this.toString());
    }
}

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Condition
 */
@JsonPropertyOrder({Condition.JSON_PROPERTY_NAME, Condition.JSON_PROPERTY_EXPRESSION, Condition.JSON_PROPERTY_PARAMETERS
})
public class Condition {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_EXPRESSION = "expression";
    private String expression;

    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    private Map<String, ConditionParamTypeRef> parameters = new HashMap<>();

    public Condition() {}

    public Condition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public Condition expression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * A Google CEL expression, expressed as a string.
     * @return expression
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EXPRESSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getExpression() {
        return expression;
    }

    @JsonProperty(JSON_PROPERTY_EXPRESSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Condition parameters(Map<String, ConditionParamTypeRef> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Condition putParametersItem(String key, ConditionParamTypeRef parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * A map of parameter names to the parameter&#39;s defined type reference.
     * @return parameters
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, ConditionParamTypeRef> getParameters() {
        return parameters;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameters(Map<String, ConditionParamTypeRef> parameters) {
        this.parameters = parameters;
    }

    /**
     * Return true if this Condition object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Condition condition = (Condition) o;
        return Objects.equals(this.name, condition.name)
                && Objects.equals(this.expression, condition.expression)
                && Objects.equals(this.parameters, condition.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, expression, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(String.format(
                    "%sname%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `expression` to the URL query string
        if (getExpression() != null) {
            joiner.add(String.format(
                    "%sexpression%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getExpression()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `parameters` to the URL query string
        if (getParameters() != null) {
            for (String _key : getParameters().keySet()) {
                if (getParameters().get(_key) != null) {
                    joiner.add(getParameters()
                            .get(_key)
                            .toUrlQueryString(String.format(
                                    "%sparameters%s%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}

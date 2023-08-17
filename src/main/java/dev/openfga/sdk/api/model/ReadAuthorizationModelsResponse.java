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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * ReadAuthorizationModelsResponse
 */
@JsonPropertyOrder({
    ReadAuthorizationModelsResponse.JSON_PROPERTY_AUTHORIZATION_MODELS,
    ReadAuthorizationModelsResponse.JSON_PROPERTY_CONTINUATION_TOKEN
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-17T22:34:59.729055Z[Etc/UTC]")
public class ReadAuthorizationModelsResponse {
    public static final String JSON_PROPERTY_AUTHORIZATION_MODELS = "authorization_models";
    private List<AuthorizationModel> authorizationModels = new ArrayList<>();

    public static final String JSON_PROPERTY_CONTINUATION_TOKEN = "continuation_token";
    private String continuationToken;

    public ReadAuthorizationModelsResponse() {}

    public ReadAuthorizationModelsResponse authorizationModels(List<AuthorizationModel> authorizationModels) {
        this.authorizationModels = authorizationModels;
        return this;
    }

    public ReadAuthorizationModelsResponse addAuthorizationModelsItem(AuthorizationModel authorizationModelsItem) {
        if (this.authorizationModels == null) {
            this.authorizationModels = new ArrayList<>();
        }
        this.authorizationModels.add(authorizationModelsItem);
        return this;
    }

    /**
     * Get authorizationModels
     * @return authorizationModels
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<AuthorizationModel> getAuthorizationModels() {
        return authorizationModels;
    }

    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAuthorizationModels(List<AuthorizationModel> authorizationModels) {
        this.authorizationModels = authorizationModels;
    }

    public ReadAuthorizationModelsResponse continuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * The continuation token will be empty if there are no more models.
     * @return continuationToken
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONTINUATION_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getContinuationToken() {
        return continuationToken;
    }

    @JsonProperty(JSON_PROPERTY_CONTINUATION_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * Return true if this ReadAuthorizationModelsResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadAuthorizationModelsResponse readAuthorizationModelsResponse = (ReadAuthorizationModelsResponse) o;
        return Objects.equals(this.authorizationModels, readAuthorizationModelsResponse.authorizationModels)
                && Objects.equals(this.continuationToken, readAuthorizationModelsResponse.continuationToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationModels, continuationToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadAuthorizationModelsResponse {\n");
        sb.append("    authorizationModels: ")
                .append(toIndentedString(authorizationModels))
                .append("\n");
        sb.append("    continuationToken: ")
                .append(toIndentedString(continuationToken))
                .append("\n");
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

        // add `authorization_models` to the URL query string
        if (getAuthorizationModels() != null) {
            for (int i = 0; i < getAuthorizationModels().size(); i++) {
                if (getAuthorizationModels().get(i) != null) {
                    joiner.add(getAuthorizationModels()
                            .get(i)
                            .toUrlQueryString(String.format(
                                    "%sauthorization_models%s%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        // add `continuation_token` to the URL query string
        if (getContinuationToken() != null) {
            joiner.add(String.format(
                    "%scontinuation_token%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getContinuationToken()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}

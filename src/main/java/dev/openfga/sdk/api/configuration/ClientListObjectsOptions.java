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

package dev.openfga.sdk.api.configuration;

import java.util.Map;

public class ClientListObjectsOptions implements AdditionalHeadersSupplier {
    private Map<String, String> additionalHeaders;
    private String authorizationModelId;

    public ClientListObjectsOptions additionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    @Override
    public Map<String, String> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public ClientListObjectsOptions authorizationModelId(String authorizationModelId) {
        this.authorizationModelId = authorizationModelId;
        return this;
    }

    public String getAuthorizationModelId() {
        return authorizationModelId;
    }
}

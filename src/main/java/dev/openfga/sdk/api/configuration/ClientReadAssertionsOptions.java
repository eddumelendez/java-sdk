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

import static dev.openfga.sdk.util.StringUtil.isNullOrWhitespace;

import dev.openfga.sdk.errors.FgaInvalidParameterException;
import java.util.Map;

public class ClientReadAssertionsOptions implements AdditionalHeadersSupplier {
    private Map<String, String> additionalHeaders;
    private String authorizationModelId;

    public ClientReadAssertionsOptions additionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    @Override
    public Map<String, String> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public boolean hasValidAuthorizationModelId() throws FgaInvalidParameterException {
        return !isNullOrWhitespace(authorizationModelId);
    }

    public void assertValidAuthorizationModelId() throws FgaInvalidParameterException {
        if (!hasValidAuthorizationModelId()) {
            throw new FgaInvalidParameterException("authorizationModelId", "ClientConfiguration");
        }
    }

    public ClientReadAssertionsOptions authorizationModelId(String authorizationModelId) {
        this.authorizationModelId = authorizationModelId;
        return this;
    }

    public String getAuthorizationModelId() {
        return authorizationModelId;
    }

    public String getAuthorizationModelIdChecked() throws FgaInvalidParameterException {
        assertValidAuthorizationModelId();
        return authorizationModelId;
    }
}

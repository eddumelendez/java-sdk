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

package dev.openfga.sdk.api.client;

import java.util.List;

public class ClientListObjectsRequest {
    private String user;
    private String relation;
    private String type;
    private List<ClientTupleKeyWithCondition> contextualTupleKeys;

    public ClientListObjectsRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     **/
    public String getUser() {
        return user;
    }

    public ClientListObjectsRequest relation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Get relation
     * @return relation
     **/
    public String getRelation() {
        return relation;
    }

    public ClientListObjectsRequest type(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public ClientListObjectsRequest contextualTupleKeys(List<ClientTupleKeyWithCondition> contextualTupleKeys) {
        this.contextualTupleKeys = contextualTupleKeys;
        return this;
    }

    public List<ClientTupleKeyWithCondition> getContextualTupleKeys() {
        return contextualTupleKeys;
    }
}

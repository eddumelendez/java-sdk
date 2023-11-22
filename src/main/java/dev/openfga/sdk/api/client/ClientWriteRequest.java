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

public class ClientWriteRequest {
    private List<ClientTupleKey> writes;
    private List<ClientTupleKey> deletes;

    public static ClientWriteRequest ofWrites(List<ClientTupleKey> writes) {
        return new ClientWriteRequest().writes(writes);
    }

    public ClientWriteRequest writes(List<ClientTupleKey> writes) {
        this.writes = writes;
        return this;
    }

    public List<ClientTupleKey> getWrites() {
        return writes;
    }

    public static ClientWriteRequest ofDeletes(List<ClientTupleKey> deletes) {
        return new ClientWriteRequest().deletes(deletes);
    }

    public ClientWriteRequest deletes(List<ClientTupleKey> deletes) {
        this.deletes = deletes;
        return this;
    }

    public List<ClientTupleKey> getDeletes() {
        return deletes;
    }
}

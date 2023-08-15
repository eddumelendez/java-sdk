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

package dev.openfga.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * A leaf node contains either - a set of users (which may be individual users, or usersets   referencing other relations) - a computed node, which is the result of a computed userset   value in the authorization model - a tupleToUserset nodes, containing the result of expanding   a tupleToUserset value in a authorization model.
 */
@JsonPropertyOrder({Leaf.JSON_PROPERTY_USERS, Leaf.JSON_PROPERTY_COMPUTED, Leaf.JSON_PROPERTY_TUPLE_TO_USERSET})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-08-16T16:59:21.258606Z[Etc/UTC]")
public class Leaf {
    public static final String JSON_PROPERTY_USERS = "users";
    private Users users;

    public static final String JSON_PROPERTY_COMPUTED = "computed";
    private Computed computed;

    public static final String JSON_PROPERTY_TUPLE_TO_USERSET = "tupleToUserset";
    private UsersetTreeTupleToUserset tupleToUserset;

    public Leaf() {}

    public Leaf users(Users users) {
        this.users = users;
        return this;
    }

    /**
     * Get users
     * @return users
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_USERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Users getUsers() {
        return users;
    }

    @JsonProperty(JSON_PROPERTY_USERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUsers(Users users) {
        this.users = users;
    }

    public Leaf computed(Computed computed) {
        this.computed = computed;
        return this;
    }

    /**
     * Get computed
     * @return computed
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_COMPUTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Computed getComputed() {
        return computed;
    }

    @JsonProperty(JSON_PROPERTY_COMPUTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComputed(Computed computed) {
        this.computed = computed;
    }

    public Leaf tupleToUserset(UsersetTreeTupleToUserset tupleToUserset) {
        this.tupleToUserset = tupleToUserset;
        return this;
    }

    /**
     * Get tupleToUserset
     * @return tupleToUserset
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TUPLE_TO_USERSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UsersetTreeTupleToUserset getTupleToUserset() {
        return tupleToUserset;
    }

    @JsonProperty(JSON_PROPERTY_TUPLE_TO_USERSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTupleToUserset(UsersetTreeTupleToUserset tupleToUserset) {
        this.tupleToUserset = tupleToUserset;
    }

    /**
     * Return true if this Leaf object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Leaf leaf = (Leaf) o;
        return Objects.equals(this.users, leaf.users)
                && Objects.equals(this.computed, leaf.computed)
                && Objects.equals(this.tupleToUserset, leaf.tupleToUserset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, computed, tupleToUserset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Leaf {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    computed: ").append(toIndentedString(computed)).append("\n");
        sb.append("    tupleToUserset: ")
                .append(toIndentedString(tupleToUserset))
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

        // add `users` to the URL query string
        if (getUsers() != null) {
            joiner.add(getUsers().toUrlQueryString(prefix + "users" + suffix));
        }

        // add `computed` to the URL query string
        if (getComputed() != null) {
            joiner.add(getComputed().toUrlQueryString(prefix + "computed" + suffix));
        }

        // add `tupleToUserset` to the URL query string
        if (getTupleToUserset() != null) {
            joiner.add(getTupleToUserset().toUrlQueryString(prefix + "tupleToUserset" + suffix));
        }

        return joiner.toString();
    }
}

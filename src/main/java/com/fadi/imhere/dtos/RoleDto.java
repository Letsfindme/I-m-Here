package com.fadi.imhere.dtos;

public class RoleDto {
    private static final int HASH_CODE_CONSTANT_1 = 31;
    private static final int HASH_CODE_CONSTANT_2 = 0;

    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RoleDto roleDto = (RoleDto) o;

        if (id != null ? !id.equals(roleDto.id) : (roleDto.id != null)) {
            return false;
        }
        return description != null ? description.equals(roleDto.description) : (roleDto.description == null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = HASH_CODE_CONSTANT_1 * result + (description != null ? description.hashCode() : HASH_CODE_CONSTANT_2);
        return result;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}

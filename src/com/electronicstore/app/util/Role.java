package com.electronicstore.app.util;

public enum Role {
    ADMIN (1), USER (2);

    private final int id;

    private Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Role getRole(int id) {
        for(Role role: Role.values()) {
            if (id == role.id)
                return role;
        }
        return null;
    }
}

package org.example;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACOUSTIC: return "akstyczna";
            case ELECTRIC: return "elektryczna";
            default: return "nieznany";
        }
    }
}

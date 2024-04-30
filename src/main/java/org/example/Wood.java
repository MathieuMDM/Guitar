package org.example;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, HEBAN, CEDAR, OAK, ALDER, SITKA;

    @Override
    public String toString() {
        switch (this){
            case INDIAN_ROSEWOOD: return "palisander indyjski";
            case BRAZILIAN_ROSEWOOD: return "palisander brazylijski";
            case MAHOGANY: return "mahon";
            case MAPLE: return "maple";
            case HEBAN: return "heban";
            case CEDAR: return "cedar";
            case OAK: return "oak";
            case ALDER: return "alder";
            case SITKA: return "sitka";
            default: return "nieznana";
        }
    }
}

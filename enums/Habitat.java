package enums;

public enum Habitat {
    DOMESTIC(1, "Domestic"),
    WILD_FOREST(2, "Wild Forest"),
    WILD_SAVANNA(3, "Wild Savanna"),
    WILD_OCEAN(4, "Wild Ocean"),
    URBAN(5, "Urban"),
    FARM(6, "Farm");


    private final int code;
    private final String displayname;

    Habitat(int code, String displayname) {
        this.code = code;
        this.displayname = displayname;
    }

    public int getCode() {
        return code;
    }
    
    public String getDisplayname() {
        return displayname;
    }

    public static Habitat fromCode(int code) {
        for (Habitat h : values()) {
            if (h.code == code) {
                return h;
            }
        }
        throw new IllegalArgumentException("Invalid code for Habitat: " + code);
    }
    
}

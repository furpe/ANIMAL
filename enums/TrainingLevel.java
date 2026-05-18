package enums;

public enum TrainingLevel {
    NONE(0, "None"),
    BASIC(1, "Basic"),
    INTERMEDIATE(2, "Intermediate"),
    ADVANCED(3, "Advanced"),
    PROFESSIONAL(4, "Professional");

    private final int code;
    private final String displayname;

    TrainingLevel(int code, String displayname) {
        this.code = code;
        this.displayname = displayname;
    }

    public int getCode() {
        return code;
    }
    
    public String getDisplayname() {
        return displayname;
    }

    public static TrainingLevel fromCode(int code) {
        for (TrainingLevel t : values()) {
            if (t.code == code) {
                return t;
            }
        }
        throw new IllegalArgumentException("Invalid code for TrainingLevel: " + code);
    }
    
}

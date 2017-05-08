package mx.santander.autocompara.models;

public enum TipoEnum {

    PICK_UP("PICK_UP"),
    AUTO("AUTO");

    private String value;

    TipoEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static TipoEnum fromValue(String text) {
        for (TipoEnum b : TipoEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
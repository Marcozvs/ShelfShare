package shelfshare.Models.Enums;

public enum TypeFavBookEnum {
    ROMANCE(1),
    TECHNICIAN(2),
    DRAMA(3);

    private final int value;

    TypeFavBookEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static TypeFavBookEnum fromValue(int value) {
        for (TypeFavBookEnum bookType : TypeFavBookEnum.values()) {
            if (bookType.getValue() == value) {
                return bookType;
            }
        }
        throw new IllegalArgumentException("Valor inválido para TypeFavBookEnum: " + value);
    }


}

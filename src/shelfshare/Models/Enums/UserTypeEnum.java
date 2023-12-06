package shelfshare.Models.Enums;

public enum UserTypeEnum {
    ADMIN(1),
    COMMON(2);

    private final int value;

    UserTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static UserTypeEnum fromValue(int value) {
        for (UserTypeEnum userType : UserTypeEnum.values()) {
            if (userType.getValue() == value) {
                return userType;
            }
        }
        throw new IllegalArgumentException("Valor inválido para UserTypeEnum: " + value);
    }

}


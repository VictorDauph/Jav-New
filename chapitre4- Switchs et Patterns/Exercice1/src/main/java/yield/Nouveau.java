package yield;

import enums.StatusEnum;

public class Nouveau {
	
    public static void main(String[] args) {
        int statut = 2;
        boolean bool = true;

        StatusEnum statusEnum = switch (statut) {
            case 1 -> StatusEnum.OK;
            case 0 -> StatusEnum.KO;
            case 2 -> {
                if (bool) {
                    yield StatusEnum.OK;
                } else {
                    yield StatusEnum.KO;
                }
            }
            default -> StatusEnum.UNDEFINED;
        };

        System.out.println("Status Enum: " + statusEnum);
    }
}

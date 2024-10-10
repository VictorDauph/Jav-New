package ancien;
import enums.*;

public class Ancien {
	   
	    public static void main(String[] args) {
	        int statut = 2;
	        boolean bool = true;
	        StatusEnum statusEnum = StatusEnum.UNDEFINED;  // Valeur par défaut

	        switch (statut) {
	            case 1:
	                statusEnum = StatusEnum.OK;
	                break;
	            case 0:
	                statusEnum = StatusEnum.KO;
	                break;
	            case 2:
	            	//on ne peut pas switch sur un bool
	                if (bool) {
	                    statusEnum = StatusEnum.OK;
	                } else {
	                    statusEnum = StatusEnum.KO;
	                }
	                break;
	            default:
	                statusEnum = StatusEnum.UNDEFINED;
	        }

	        System.out.println("Status Enum: " + statusEnum);
	    }
}

package SystemUtils;

/**
 * @author Tal Yamin
 *
 */


/*Enum which defines three kinds of client type*/

public enum ClientType {
	
	ADMIN
	{
		@Override
	    public String toString() {
	      return "Admin";
		}
	},
	COMPANY
	{
		@Override
	    public String toString() {
	      return "Company";
		}
	},
	CUSTOMER
	{
		@Override
	    public String toString() {
	      return "Customer";
		}
	};

}

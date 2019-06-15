
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonData {

    @SerializedName("NewCustomer")
    @Expose
    private NewCustomer newCustomer;

    public NewCustomer getNewCustomer() {
        return newCustomer;
    }
    
    
    @SerializedName("NewCustomerMessage")
    @Expose
    private NewCustomerMessage newCustomermessage;

    public NewCustomerMessage newCustomermessage() {
        return newCustomermessage;
    }

}

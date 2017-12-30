package SerializationTest;

import java.io.*;

public class Insurance {
	
	private String insurance;
	Insurance(){
   insurance="StatefarmInsurance";
    }
	
    String getinsurance() {
        return insurance;
    }
    
    
    void setinsurance(String insurancename) {
        this.insurance=insurancename;
}
    
    
}
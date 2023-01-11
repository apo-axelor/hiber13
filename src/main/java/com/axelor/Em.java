package com.axelor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Em {
	 @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	    private int eid;  
	    private String ename;  
	    public int geteid() {  
	        return eid;  
	    }  
	    public void seteid(int s_id) {  
	        this.eid = eid;  
	    }  
	    public String getename() {  
	        return ename;  
	    }  
	    public void setename(String s_name) {  
	        this.ename = ename;  
	    }

	

}

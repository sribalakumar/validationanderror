package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void form(){
    	
    /*	//case 1
     * String age=params.get("age");
    	String user=params.get("user");
     * validation.required(user);
    	 if(validation.hasErrors()) {
            for(play.data.validation.Error error : validation.errors()) {
                renderText("user name is "+error.message());
            }
             }
    	*/
    	
    	    	
    /*	//case 2
     * String age=params.get("age");
    	String user=params.get("user");
     * validation.required(user).message("valid user name is required");
    	
    	 if(validation.hasErrors()) {
            for(play.data.validation.Error error : validation.errors()) {
                renderText(error.message());
            }
             } */
    	
    /*	//case 3
     * String age=params.get("age");
    	String user=params.get("user");
     * validation.required(user).message("valid user name is required");
    	render(user); */
    	
    	//case 4
    	String age=params.get("age");
    	String user=params.get("user");
    	validation.required(user).message("valid user name is required");
    	validation.required(age).message("valid age is required");
    	validation.min(age,20).message("age should be greater then 20");
    	  
    	if(validation.hasErrors()) {
            params.flash(); // add http parameters to the flash scope
            validation.keep(); // keep the errors for the next request
            index();
        }
        render(user, age);
    	
    
}
}
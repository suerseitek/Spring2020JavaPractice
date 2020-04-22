package day25_MethodsRecap;

public class Driver {
    /*
    1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"},
				 then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
     */

    public static String getDriver1 (String str) {
        String result = "";
        str = str.toLowerCase();
        switch (str) {
            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
              result = "FireFox Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            default:
                result = "invalid";

        }

    return result;
    }

    public static String getDriver2 (String str) {
        String result = "";

        if(str.equalsIgnoreCase("opera")){result ="Opera Driver";}
        else if(str.equalsIgnoreCase("firefox")){result="FireFox Driver";}
        else if(str.equalsIgnoreCase("chrome")){result="Chrome Driver";}
        else if(str.equalsIgnoreCase("edge")){result="Edge Driver";}
        else{result="invalid";}



    return result;}

    public static String getDriver3 (String str){
        String result = "";

result = (str.equalsIgnoreCase("opera"))?"Opera Driver":(str.equalsIgnoreCase("firefox"))?
        "FireFox Driver":(str.equalsIgnoreCase("chrome"))?"Chrome Driver":(str.equalsIgnoreCase("safari"))?
        "Safari Driver":"Invalid";
        return result;
    }

    public static void main(String[] args) {

       String result1 = getDriver1("Opera");
       String result2 = getDriver2("Chrome");
       String result3 = getDriver3("firefox");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }







}

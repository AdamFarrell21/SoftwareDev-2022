package Main;


import java.util.Scanner;

public class Main {

    // 1. Add a tool to the toolbox (set)
    public static String[] add(String tool, String[] array) {
        // Get the size of the array passed
        int length = array.length;
        // Create a new array of size length+1
        String newArray[] = new String[length + 1];
        // Loop to add old array to new array
        for (int i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        // Add tool to new array
        newArray[length] = tool;
        // Return new array
        return newArray;
    }
//-----------------------------------------------------------------------------------------------------------     
    // 2. Print out elements in toolbox
    public static void print(String[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
//-----------------------------------------------------------------------------------------------------------     
   // 3. Check to see if tool is in toolbox
    public static boolean contains(String tool, String[] array) {
        for(int i = 0; i < array.length; i++){
            if(tool.equals(array[i])){
                return true;
            }
        }
        return false;
    }
//-----------------------------------------------------------------------------------------------------------     
    // 4. RemoveAll items in the tool box
    
//-----------------------------------------------------------------------------------------------------------    
    // 5. Print List in reverse order 
    		//code below
//----------------------------------------------------------------------------------------------------------- 
    // 6. Update existing tool
    public static String[] update(String newTool, String oldTool, String[] array) {
        for(int i = 0; i < array.length; i++){
            if(oldTool.equals(array[i])){
                array[i] = newTool;
            }
        }
        return array;
    }
    
//----------------------------------------------------------------------------------------------------------- 
    // print the menu
    public static void printMenu() {
        System.out.println("Toolbox using Array Data Type");
        System.out.println("-----------------------------------");
        System.out.println("1. Add a tool to the toolbox");
        System.out.println("2. Return the list of tools in the toolbox.");
        System.out.println("3. Check to see if a tool is already in the toolbox.");
        System.out.println("4. RemoveAll Items in the list. -- > not working ");
        System.out.println("5. print Items in reverse order .");
        System.out.println("6. update an existing item ");
        System.out.println("-1 to exit.");
        System.out.print("Enter a number: ");
    }
//-----------------------------------------------------------------------------------------------------------     
    public static void main(String[] args) {
        String[] toolbox = new String[0];
        Scanner sc = new Scanner(System.in);
        printMenu();
        boolean menu = true;
        while (menu) {
            int choice = sc.nextInt();
            
//-----------------------------------------------------------------------------------------------------------     
            if (choice == 1) 
       
            {
                // 1. Add a tool to toolbox
                sc.nextLine();
                System.out.print("Enter a tool: ");
                String tool = sc.nextLine();
                if(contains(tool, toolbox)){
                    System.out.println(tool + " is already in toolbox");
                 } 
            else
            	 {
                    toolbox = add(tool, toolbox);
                 }
                
                System.out.print("Press 0 for menu, -1 to exit: ");
            }
//------------------------------------------------------------------------------------------------------------            
            if (choice == 2) {
                // 2. Print out the toolbox 
                print(toolbox);
                System.out.println();
                System.out.print("Press 0 for menu, -1 to exit: ");
            }
            
//------------------------------------------------------------------------------------------------------------            
            if (choice == 3) 
           
            {
                // 3. Check to see if tool is in toolbox
                sc.nextLine();
                System.out.print("Enter a tool: ");
                String tool = sc.nextLine();
                if(contains(tool, toolbox))
                
                {
                    System.out.println(tool + " is in toolbox");
                } 
                
                else {
                    	System.out.println(tool + " is NOT in toolbox");
                	 }
                System.out.print("Press 0 for menu, -1 to exit: ");
            }
//-----------------------------------------------------------------------------------------------------------
           /* if (choice == 4) {
                // 4. Remove a tool to toolbox
                sc.nextLine();
                System.out.print("Enter a tool: ");
                String tool = sc.nextLine();
                if(!contains(tool, toolbox)){
                    System.out.println(tool + " is NOT in toolbox");
                } else{
                    toolbox = removeAll(tool, toolbox);
                }
                System.out.print("Press 0 for menu, -1 to exit: ");*/
//-----------------------------------------------------------------------------------------------------------
			if (choice == 5) {
				 
				       
				 for (int i = toolbox.length-1; i >= 0; i--) {  
			            System.out.print(toolbox[i] + " ");  
			        }  
			  System.out.print("Press 0 for menu, -1 to exit: ");
        }
		                    
            
//-----------------------------------------------------------------------------------------------------------                            
			if (choice == 6) {
                // 5. Remove a tool to update
                sc.nextLine();
                System.out.print("Enter a tool to update: ");
                String oldTool = sc.nextLine();
                if(!contains(oldTool, toolbox)){
                    System.out.println(oldTool + " is NOT in toolbox");
                }
                
                else
                	
                {
                 
                    System.out.print("Enter a new tool: ");
                    String newTool = sc.nextLine();
                    if(contains(newTool, toolbox)){
                        System.out.println(newTool + " is already in toolbox");
                    } 
                    
                    else
                    	
                    {
                        toolbox = update(newTool, oldTool, toolbox);
                    }
                }
                
                System.out.print("Press 0 for menu, -1 to exit: ");
            }
//-------------------------------------------------------------------------------------------------------------
			if (choice == 0) {
                printMenu();
            }
            
            if(choice == -1){
                menu = false;
            }
        }
    }
}
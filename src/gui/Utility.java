/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Yehia
 */
public class Utility {
    public static int[] toIntArray(String input) {

        String[] stringArray = input.split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
    public static void selectedAlgo(int[] requestArray, int initialHead, int selectedAlgoIndex) {
        switch (selectedAlgoIndex) {
            case 0:
                //FCFS Function Here;
                // code block
                break;
            case 1:
                //SSTF Function Here;
                // code block
                break;
            case 2:
                //SCAN Function Here;
                // code block
                break;
            case 3:
                //C-SCAN Function Here;
                // code block
                break;
            case 4:
                //LOOK Function Here;
                // code block
                break;
            case 5:
                //C-LOOK Function Here;
                // code block
                break;
            case 6:
                //New Algorithm Function Here;
                // code block
                break;
        }
    }
    public static void setOutputScreen(int[] output,int totalHead) {
        outputFrame frame=outputFrame.getInstance();
        String result="Requests sequance: ";
        for (int i = 0; i < output.length; i++) {
            result+=output[i];
            if(i!=(output.length-1))
                result+="---->";
        }
        
        String totalHeadMovement="the total head movement: "+totalHead;
        frame.sequance.setText(result);
        frame.TotalHead.setText(totalHeadMovement);
        
        
    }

    
}

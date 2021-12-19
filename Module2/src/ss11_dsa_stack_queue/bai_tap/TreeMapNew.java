package ss11_dsa_stack_queue.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an arrays: ");
        String string = scanner.nextLine();
        Character character;
        Map<Character, Integer> myMapCharacter = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (myMapCharacter.containsKey(character)){
                int index = myMapCharacter.get(character);
                myMapCharacter.put(character,index+1);
            }else {
                myMapCharacter.put(character,1);
            }
        }
        System.out.println(myMapCharacter);
    }

}

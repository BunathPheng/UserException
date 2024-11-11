package map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dictionary
{
    private Integer  id;
    private String  word;
    private String  classify;
    private String  description;
    public static void main(String[] args) {
        HashMap<String  , Dictionary> map = new HashMap<>();
        Dictionary dictionary = new Dictionary(1 ,"apple", "Noun" , "is a fruit");
        System.out.print("Insert for key:");
        String  word= new Scanner(System.in).nextLine();
        map.put("apple", dictionary);
        System.out.println("Result : " + map.get(word.toLowerCase()));


    }

}

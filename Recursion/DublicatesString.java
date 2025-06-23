package Recursion;

public class DublicatesString {
    public static void check(String str,int idx,StringBuilder newStr,boolean map[]){
        //base case 
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true){
            //dublicate
            check(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            check(str, idx+1, newStr.append(currChar), map);
        }
    

    }
     public static void main(String[] args) {
        String name = "appnnacollege";
        check(name, 0, new StringBuilder(""),new boolean[26]);
       
    }
}


// package Recursion;

// public class DuplicatesString {
//     public static void check(String name){
//         String name2 = "";  // Use empty string to store result

//         for (int i = 0; i < name.length(); i++) {
//             char currentChar = name.charAt(i);
//             // Add character only if it's not already in name2
//             if (name2.indexOf(currentChar) == -1) {
//                 name2 += currentChar;
//             }
//         }

//         System.out.println("Original String: " + name);
//         System.out.println("String after removing duplicates: " + name2);
//     }

//     public static void main(String[] args) {
//         String name = "appnnacollege";
//         check(name);
//     }
// }



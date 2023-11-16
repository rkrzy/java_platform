//package HW1;
//
//import java.util.HashMap;
//import java.util.Objects;
//import java.util.Scanner;
////한줄씩 쪼개서 스트링에 넣고 처리를 해보자
////한줄씩이 아니라 괄호를 기준으로 덩어리로 담는다
////이후에 깊이있게 덩어리를 다시 만날때까지 들어가서
////깊이있게 코딩을 한다고 생각하자
//public class MyJsonParser {
//
//    public static void main(String[] args) {
//
//        String json = readJSONStringFromKeyboard();
//
//        var map = parseJSONString(json);
//
//        var jsonString = convertHashMapToJsonString(map);
//
//        System.out.println(convertStringToPrettyJson(jsonString));
//
//    }
//
//    public static String readJSONStringFromKeyboard()
//    {
//        Scanner scanner = new Scanner();
//        StringBuilder sb =
//    }
//    private static HashMap<String, Objects> parseJSONString(String json)
//    {
//        HashMap<String,Objects> parseMap = new HashMap<>();
//
//        json = json.substring(1,json.length()-1);
//        for(String keyvalue : splitJson(json))
//        {
//            String[]tokens =
//        }
//
//    }
//    private static String splitJson(String json)
//    {
//
//    }
//
//    private static HashMap<String, Objects> convertHashMapToJsonString(HashMap<String,Objects> map)
//    {
//
//    }
//    private static String convertStringToPrettyJson(HashMap<String, Objects> jsonString)
//    {
//
//    }
//}
//

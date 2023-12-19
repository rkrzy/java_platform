package HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class MyJsonParser {

    private JsonEscapeCharacterHandler escapeHandler;

    public MyJsonParser() {

        this.escapeHandler = new JsonEscapeCharacterHandler();

    }
    public HashMap<String,Object> parse(String jsonString) throws Exception{
        return parseJSONString(escapeHandler.handleEscapedCharacters(jsonString));
    }

    private static HashMap<String,Object> parseJSONString(String json)
    {
        HashMap<String,Object> parsedMap = new HashMap<>();
        json = json.substring(1,json.length()-1);
        for(String keyValue : splitJson(json))
        {
            String[] tokens = keyValue.split(":",2);

            String key = tokens[0].trim();
            key = key.substring(1,key.length()-1);
            Object value = tokens[1];
            parsedMap.put(key,value);
        }
        return parsedMap;
    }

    private static  Object getValue(String token)
    {
        return token;
    }
    private static ArrayList<String> splitJson(String json)
    {
        json = json.trim();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int brackets =0;
        int braces = 0;
        boolean isString = false;

        for(int i =0;i<json.length();i++)
        {
            char c = json.charAt(i);
            sb.append(c);
            switch(c)
            {
                case '{' -> brackets++;
                case '}' -> brackets--;
                case '[' ->braces++;
                case ']' ->braces--;
                case '"' -> isString = !isString;
            }
            if(brackets ==0 & braces ==0 & !isString &&c == ',')
            {
                sb.deleteCharAt(sb.length()-1);
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        list.add(sb.toString());
        return list;
    }

}


package Weekend_3;

import java.beans.Encoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class JsonEscapeCharacterHandler {

    public String handleEscapedCharacters(String str) {

        StringBuilder result = new StringBuilder();

        boolean isEscaping = false;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '\\') {
                if (str.charAt(i + 1) == '"') {
                    result.append("\"");
                } else if (str.charAt(i + 1) == '/') {
                    result.append("/");
                } else if (str.charAt(i + 1) == 'b') {
                    result.append("\b");
                } else if (str.charAt(i + 1) == 'f') {
                    result.append("\f");
                } else if (str.charAt(i + 1) == 'n') {
                    result.append("\n");
                } else if (str.charAt(i + 1) == 'r') {
                    result.append("\r");
                } else if (str.charAt(i + 1) == 't') {
                    result.append("\t");
                } else if (str.charAt(i + 1) == 'u') {
                    String Str = str.substring(i + 2, i + 6);
                    int num = Integer.parseInt(Str, 16);
                    result.append((char) num);
                    i = i + 4;
                }
                i++;
            } else {
                result.append(c);
            }
        }
            return result.toString();

        }
    }


package Weekend_9.map_0803;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapTest {



        public static void main(String[] args) {

            List<Integer> array = new ArrayList<>();
            for(int i =0;i<18;i++)
            {
                array.add(i);
            }
            if(array.stream().noneMatch(i->i >100))
            {
                System.out.println( array.stream().dropWhile(i->i%2==0).collect(Collectors.toList()));
            }
    }
}


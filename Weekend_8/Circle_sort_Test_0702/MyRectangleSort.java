package Weekend_8.Circle_sort_Test_0702;

import Weekend_7.Nested_class.Player;

public class MyRectangleSort {
    public static void sort(MyComparable[] elements)
    {
        for(int i =0;i<elements.length;i++)
        {
            for(int j = i+1;j<elements.length;j++)
            {
                if(elements[i].compareTo(elements[j])<0)
                {
                    MyComparable temp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = temp;
                }
            }
        }
    }
}

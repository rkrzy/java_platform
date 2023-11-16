package HW4;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class MyValidator {

    public static Set<String> validate(Object obj) {
        Set<String> result = new HashSet<>();

            Class cl = obj.getClass();
            Field[] fi = cl.getDeclaredFields();
            for(Field field1 : fi)
            {
                if(field1.isAnnotationPresent(NotNull.class))
                {
                    NotNull notNull = field1.getAnnotation(NotNull.class);
                    field1.setAccessible(true);
                    try
                    {
                        if(field1.get(obj) == null)
                        {
                            result.add(notNull.message());
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                if(field1.isAnnotationPresent(Size.class))
                {
                    Size si = field1.getAnnotation(Size.class);
                    field1.setAccessible(true);

                   try
                   {
                        String str = (String)field1.get(obj);
                        if(str!=null&&(str.length()>si.max()|| str.length()<si.min()))
                        {
                            result.add(si.message());
                        }

                   }
                   catch (Exception e)
                   {
                       e.printStackTrace();
                   }
                }
                if(field1.isAnnotationPresent(Email.class))
                {
                    Email Em = field1.getAnnotation(Email.class);
                    field1.setAccessible(true);
                    try{
                        Field[] fi2 = cl.getDeclaredFields();
                        String name = "";
                        String email = "";
                        for(Field field2 : fi2)
                        {
                            if(field2.getName().equals("name"))
                            {
                                name = (String) field2.get(obj);
                            }
                            else if(field2.getName().equals("email"))
                            {
                                email = (String) field2.get(obj);
                            }
                        }


                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }



                }
            }



    return  result;

    }

}
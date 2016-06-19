package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class DeprecationChecker {
    public static boolean haveDeprecatedGeneric(Object object){
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            Type genericType = field.getGenericType();
            if (genericType != null) {
                Type[] typeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                for (Type typeArgument : typeArguments) {
                    if (((Class) typeArgument).isAnnotationPresent(Deprecated.class)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(haveDeprecatedGeneric(new BadService()));
    }
}

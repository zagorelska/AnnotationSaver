package sample;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer tc = new TextContainer();
        Class<?> cls = TextContainer.class;
        Method[] methods = cls.getDeclaredMethods();

        if (cls.isAnnotationPresent(SaveTo.class)) {
            SaveTo to = cls.getAnnotation(SaveTo.class);
            for (Method method : methods) {
                if (method.isAnnotationPresent(Saver.class)) {
                    method.invoke(tc,to.path());
                }
            }
        }

    }
}

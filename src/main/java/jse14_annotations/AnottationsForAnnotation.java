package jse14_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AnottationsForAnnotation {

    /**
     * Uma annotation pode ser anotada com outras annotations
     * 
     * @Retention: especifica como a annotation que esta sendo criada sera armarzenada
     * @Target: especifica em que tipo de elementos a annotation podera utilizada
     */

}

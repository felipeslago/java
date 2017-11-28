package jse09.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AnottationsForAnnotation {

    /**
     * Uma annotation pode ser anotada com outras annotations
     * @Retention: especifica como a annotation que está sendo criada será armarzenada
     * @Target: especifica em que tipo de elementos a annotation poderá utilizada
     */

}

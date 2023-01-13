package annotations2;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Target(ElementType.TYPE_USE)
@interface TypeAnno { }


@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}


@Target(ElementType.TYPE_USE)
@interface Unique { }


@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}


@Target(ElementType.TYPE_USE)
@interface What {
    String description();
}


@Target(ElementType.FIELD)
@interface EmptyOK { }


@Target(ElementType.METHOD)
@interface Recommended { }

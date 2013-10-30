package name.ruhkopf.newrelic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Can be used to ignore transactions
 * 
 * @author Patrick Ruhkopf (<a href="www.github.com/ruhkopf">www.github.com/ruhkopf</a>)
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NewRelicIgnoreTransaction {
}
package name.ruhkopf.newrelic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Can be used for custom instrumentation. To enable add the following code to your new relic configuration: 
 * <code>class_transformer: 
 *   trace_annotation_class_name: name.ruhkopf.newrelic.annotation.Trace</code>
 * @see <a href="https://docs.newrelic.com/docs/java/custom-instrumentation-with-the-java-agent">https://docs.newrelic.com/docs/java/custom-instrumentation-with-the-java-agent</a>
 * 
 * @author Patrick Ruhkopf (<a href="www.github.com/ruhkopf">www.github.com/ruhkopf</a>)
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Trace
{

	/** The Constant NULL. */
	public static final String NULL = "";

	/**
	 * Metric name.
	 * 
	 * @return the string
	 */
	String metricName() default NULL;

	/**
	 * Dispatcher.
	 * 
	 * @return true, if successful
	 */
	boolean dispatcher() default false;

	/**
	 * Tracer factory name.
	 * 
	 * @return the string
	 */
	String tracerFactoryName() default NULL;
}
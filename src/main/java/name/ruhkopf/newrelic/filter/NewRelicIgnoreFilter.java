package name.ruhkopf.newrelic.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * A filter that can be used to ignore certain URLs from NewRelic (for example Comet calls).
 *
 * @author Patrick Ruhkopf (<a href="www.github.com/ruhkopf">www.github.com/ruhkopf</a>)
 */
public class NewRelicIgnoreFilter implements Filter
{
	/**
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy()
	{
		// do nothing
	}

	/**
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
	 *      javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException
	{
		request.setAttribute("com.newrelic.agent.IGNORE", Boolean.TRUE);

		chain.doFilter(request, response);
	}

	/**
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(final FilterConfig filterConfig) throws ServletException
	{
		// nothing to do
	}

}

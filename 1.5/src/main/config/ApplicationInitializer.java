	package main.config;

	import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

	public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
//			return new Class[] {SecurityConfig.class};
			return null;
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] {WebConfiguration.class, DatabaseConfig.class};
		}

		@Override
		protected String[] getServletMappings() {
			return new String[] {"/"};
		}

	}


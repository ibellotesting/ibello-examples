package hu.ibello.api.workflow;

import hu.ibello.api.steps.GetBlogItemSteps;
import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;
import hu.ibello.transform.TransformerException;

import java.io.IOException;

@Name("Api")
public class ApiWorkflow extends StepLibrary {
	private GetBlogItemSteps getBlog;

	public void I_query_the_blog_articles() throws IOException, TransformerException {
		getBlog.call_endpoint_with_parameter_$(null);
	}

	public void The_queried_articles_are_displayed_correctly() {
		getBlog.check_if_response_is_correct();
	}

}